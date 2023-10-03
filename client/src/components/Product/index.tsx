import Card from 'react-bootstrap/Card';

interface Props {
    id: string;
    title: string;
    price: number;
    image: string;
}

const Product = (props: Props) => {
    return (
        <Card style={{ width: '18rem' }}>
            <Card.Img variant='top' src={props.image} />
            <Card.Body>
                <Card.Title>{props.title}</Card.Title>
                <Card.Text>
                    ${props.price}
                </Card.Text>
            </Card.Body>
        </Card>
    )
}

export default Product;