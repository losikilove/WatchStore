'use client'

import Link from 'next/link'

import { AppBar, Container, Toolbar, Box, Button } from '@mui/material'

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
                    <Button color='inherit'>login</Button>
                </Toolbar>
            </Container>
        </AppBar>
    )
}

export default Header;