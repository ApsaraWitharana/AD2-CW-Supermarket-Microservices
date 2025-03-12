const express = require('express');
const router = express.Router();
const controller = require('../controllers/supplier.controller');

router.post('/suppliers', controller.createSupplier);
router.get('/suppliers', controller.getAllSuppliers);
router.get('/suppliers/:id', controller.getSupplierById);
router.put('/suppliers/:id', controller.updateSupplier);
router.delete('/suppliers/:id', controller.deleteSupplier);

module.exports = router;



/**
 #* @author : sachini apsara
 #* @date : 2024-03-12
 #**/