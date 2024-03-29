package eu.kanade.tachiyomi.revived.id.ryukonesia

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import eu.kanade.tachiyomi.network.interceptor.rateLimit
import okhttp3.OkHttpClient

class Ryukonesia : MangaThemesia("Ryukonesia", "https://ryukonesia.net", "id") {

    override val client: OkHttpClient = super.client.newBuilder()
        .rateLimit(4)
        .build()
}
