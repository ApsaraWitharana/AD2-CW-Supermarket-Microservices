const { Sequelize } = require('sequelize');
const path = require('path');
require('dotenv').config({ path: path.resolve(__dirname, '../../.env') }); // Adjust path as needed

const sequelize = new Sequelize(
    process.env.DB_NAME,
    process.env.DB_USER,
    process.env.DB_PASSWORD,
    {
        host: process.env.DB_HOST,
        dialect: 'mysql',
        define: {
            timestamps: true
        },
        logging: false, // Disable SQL logging in console
        pool: {
            max: 5,
            min: 0,
            acquire: 30000,
            idle: 10000
        }
    }
);

// Test connection immediately
sequelize.authenticate()
    .then(() => console.log('Database connection successful'))
    .catch(err => console.error('Database connection failed:', err));

module.exports = sequelize;



/**
 #* @author : sachini apsara
 #* @date : 2024-03-12
 #**/