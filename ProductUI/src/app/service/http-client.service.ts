import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

export class Product {
  constructor(
    public  productId: string,
    public  name: string,
    public  code: string,
    public  title: string,
    public  description: string,
    public  location: string,
    public  price: string,
  ) {
  }
}

//this is service class
@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private httpClient: HttpClient) { }

  getProducts(){
    console.log('Test Call');
    return this.httpClient.get<Product[]>('http://localhost:8090/products');
  }
}

