package eu.kanade.tachiyomi.revived.all.taddyink

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.SourceFactory

class TaddyInkFactory : SourceFactory {
    override fun createSources(): List<Source> = listOf(
        TaddyInk("all", ""),
    )
}
