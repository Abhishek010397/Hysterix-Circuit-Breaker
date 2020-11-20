import { Component, OnInit } from '@angular/core';
import { HttpClientService, Product } from '../service/http-client.service';


@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products: Product[] = [];

  // Constructor Injection
  constructor(
    private httpClientService: HttpClientService
  ) {
  }

  ngOnInit(): void {
    this.httpClientService.getProducts().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }
  // Callback for successful response
  handleSuccessfulResponse(response: Product[]): void {
    this.products = response;
  }

}
