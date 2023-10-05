'use client'

import { useEffect, useState } from 'react';

import useProducts from '@/api/useProducts';
import Product from '../Product';
import { Grid } from '@mui/material';

import { styleGridContainer } from '@/styles/ProductList';

const ProductList = () => {
    const { products, isLoading, isError } = useProducts();

    return (
        <Grid container sx={styleGridContainer}>
            {products?.map((product: IProduct) =>
                <Grid item xs={6} md={2.4} key={product?.id}>
                    <Product product={product} />
                </Grid>
            )}
        </Grid>
    )
}

export default ProductList;