package com.myname
import com.lagradost.cloudstream3.*

class MyAnime : MainAPI() { 
    override var name = "My AnimePahe" 
    override var mainUrl = "https://animepahe.pw" 
    override val lang = "en"
    override val supportedTypes = setOf(TvType.Anime)

    override suspend fun search(query: String): List<SearchResponse> {
        return listOf() 
    }
}
