import { Typography } from '@mui/material'
import WatchIcon from '@mui/icons-material/Watch';

import { styleText } from '@/styles/Logo';

const Logo = () => {
    return (
        <>
            <WatchIcon fontSize='large' />
            <Typography variant='h5' sx={styleText}>
                WATCHA
            </Typography>
        </>
    )
}

export default Logo;