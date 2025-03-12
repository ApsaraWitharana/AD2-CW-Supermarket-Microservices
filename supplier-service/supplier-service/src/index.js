const app = require('./app');
const PORT = process.env.PORT || 3004;

app.listen(PORT, () => {
    console.log(`Supplier service running on port ${PORT}`);
});

console.log('Environment Variables:');
console.log('PORT:', process.env.PORT);
console.log('DB_USER:', process.env.DB_USER);
console.log('DB_NAME:', process.env.DB_NAME);
console.log('DB_HOST:', process.env.DB_HOST);



/**
 #* @author : sachini apsara
 #* @date : 2024-03-12
 #**/