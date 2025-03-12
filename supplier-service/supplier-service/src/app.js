const express = require('express');
const dotenv = require('dotenv');
const sequelize = require('./config/database');
const client = require('./eureka-client');
const app = express();

dotenv.config();

// Middleware
app.use(express.json());


// Database sync
sequelize.sync()
    .then(() => console.log('Database connected'))
    .catch(err => console.error('Database connection error:', err));

// Routes
app.use('/api', require('./routes/supplier.routes'));

// Health check endpoint for Eureka
app.get('/health', (req, res) => {
    res.status(200).json({ status: 'UP' });
});

// Start Eureka client
client.start(error => {
    console.log(error || 'Registered with Eureka');
});

// Handle shutdown
process.on('SIGINT', () => {
    client.stop();
    process.exit();
});

module.exports = app;


/**
 #* @author : sachini apsara
 #* @date : 2024-03-12
 #**/