package com.example.e_commerce_compose.data.model.categories

import com.google.gson.annotations.SerializedName

data class SubCategoryDto(

    @field:SerializedName("createdAt")
    val createdAt: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("_id")
    val id: String? = null,

    @field:SerializedName("slug")
    val slug: String? = null,

    @field:SerializedName("updatedAt")
    val updatedAt: String? = null,

    @field:SerializedName("category")
    val category: String? = null
)
