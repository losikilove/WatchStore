'use client'

import { useEffect, useState } from 'react';

import useProducts from '@/api/useProducts';
import Product from '../Product';
import { Grid } from '@mui/material';

const ProductList = () => {
    const { products, isLoading, isError } = useProducts();

    return (

        <Grid container>
            {products?.map((product: IProduct) =>
                <Grid item xs={6} md={2.3} key={product?.id}>
                    <Product product={product} />
                </Grid>
            )}
        </Grid>
    )
}

export default ProductList;