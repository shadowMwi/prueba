package eu.kanade.tachiyomi.revived.all.mangadex.dto

import kotlinx.serialization.Serializable

@Serializable
abstract class EntityDto {
    val id: String = ""
    val relationships: List<EntityDto> = emptyList()
    abstract val attributes: AttributesDto?
}

@Serializable
abstract class AttributesDto

@Serializable
data class UnknownEntity(override val attributes: AttributesDto? = null) : EntityDto()
