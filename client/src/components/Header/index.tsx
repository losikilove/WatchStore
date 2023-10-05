'use client'

import Link from 'next/link';

import { AppBar, Container, Toolbar, Box } from '@mui/material';
import { IconButton, Button, Badge } from '@mui/material';
import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';

import SearchBar from '../SearchBar';
import Logo from '../Logo';

import { styleAppbar, styleLinkLogo } from '@/styles/Header';

const Header = () => {
    return (
        <AppBar position='static' sx={styleAppbar}>
            <Container maxWidth="xl">
                <Toolbar disableGutters>
                    <Link style={styleLinkLogo} href={`/`}>
                        <Logo />
                    </Link>
                    <SearchBar />
                    <Box sx={{ flexGrow: 1 }} />
                    <Box>
                        <IconButton color='inherit'>
                            <Badge badgeContent={0} color="error">
                                <ShoppingCartIcon />
                            </Badge>
                        </IconButton>
                    </Box>
                    <Button color='inherit'>login</Button>
                </Toolbar>
            </Container>
        </AppBar>
    )
}

export default Header;