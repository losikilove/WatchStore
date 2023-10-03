'use client'

import { useEffect, useState } from 'react';
import env from "react-dotenv";

import useSWR from 'swr';

import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import useProducts from '@/api/useProducts';

import Product from '../Product';

const ProductList = () => {
    const { products, isLoading, isError } = useProducts();

    return (
        <ul>
            {products?.map((product: IProduct) =>
                <li key={product?.id}>
                    {product?.title}
                </li>
            )}
        </ul>
    )
}

export default ProductList;