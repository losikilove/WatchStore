import useSWR from 'swr';

function useProducts() {
    const serverURL: string = process.env.NEXT_PUBLIC_SERVER_URL + '/api/product/all';
    const fetcher = (url: string) => fetch(url).then((res) => res.json());
    const { data, error, isLoading } = useSWR(serverURL, fetcher);

    return {
        products: data,
        isLoading,
        isError: error
    }
}

export default useProducts;