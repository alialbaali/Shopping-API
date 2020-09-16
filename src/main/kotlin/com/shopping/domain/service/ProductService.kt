package com.shopping.domain.service

import com.shopping.domain.dto.product.request.ReviewRequest
import com.shopping.domain.dto.product.response.ProductDetailsResponse
import com.shopping.domain.dto.product.response.ProductResponse
import com.shopping.domain.dto.product.response.ReviewResponse

interface ProductService {

    suspend fun getProducts(limit: Long?, offset: Long?): List<ProductResponse>

    suspend fun getProductById(productId: String): ProductDetailsResponse

    suspend fun getReviewsByProductId(productId: String): List<ReviewResponse>

    suspend fun getReview(productId: String, customerId: String): ReviewResponse

    suspend fun createReview(productId: String, customerId: String, reviewRequest: ReviewRequest): ReviewResponse
}