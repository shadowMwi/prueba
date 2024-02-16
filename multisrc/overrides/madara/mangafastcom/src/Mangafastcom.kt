package eu.kanade.tachiyomi.revived.en.mangafastcom

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Mangafastcom : Madara(
    "Manga-fast.com",
    "https://manga-fast.com",
    "en",
    dateFormat = SimpleDateFormat("d MMMM'،' yyyy", Locale.US),
)
