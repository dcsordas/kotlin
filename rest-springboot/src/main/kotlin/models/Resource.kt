package models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("RESOURCES")
data class Resource(@Id val id: Int, val value: String)