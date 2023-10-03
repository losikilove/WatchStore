'use client'

import Card from 'react-bootstrap/Card';

interface IProps {
    product: IProduct
}

const Product = (props: IProps) => {
    const { product } = props;

    return (
        <Card style={{ width: '18rem' }}>
            <Card.Img variant='top' src={(product?.images?.at(0)) || '#'} style={{ width: '200px', height: '100px' }} />
            <Card.Body>
                <Card.Title>{product?.title}</Card.Title>
                <Card.Text>
                    ${product?.current_price}
                </Card.Text>
            </Card.Body>
        </Card>
    )
}

export default Product;