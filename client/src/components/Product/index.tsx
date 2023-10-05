'use client'

import { Card, CardMedia, CardHeader, CardContent } from '@mui/material';

import { styleCard, styleCardMedia, styleCardHeader, styleCardContent } from '@/styles/Product'

interface IProps {
    product: IProduct
}

const Product = (props: IProps) => {
    const { product } = props;

    return (
        <Card
            sx={styleCard}
        >
            <CardMedia
                component="img"
                width="100%"
                height="200px"
                image={(product?.images?.at(0)) || '#'}
                alt={(product?.title + " image")}
                sx={styleCardMedia}
            />
            <CardHeader title={product?.title} sx={styleCardHeader} />
            <CardContent sx={styleCardContent}>
                ${product?.current_price}
            </CardContent>
        </Card>
    )
}

export default Product;