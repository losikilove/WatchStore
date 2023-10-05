import useSWR from "swr"

import Header from "@/components/Header"
import ProductList from "@/components/ProductList"

export default function Home() {


  return (
    <>
      <header><Header /></header>
      <main><ProductList /></main>
      <footer></footer>
    </>
  )
}
