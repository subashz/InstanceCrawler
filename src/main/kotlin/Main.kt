import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

private val json = Json {
    ignoreUnknownKeys = true
}

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val jsonString = File("/Users/subash/Documents/GitHub/awesome-lemmy-instances/lemmy-stats-crawler/lemmy-stats-crawler.json").readText()

    // Deserialize the JSON into a Kotlin object
    val instance: InstanceModel4 = json.decodeFromString(jsonString)

    val file = File("stats.json")

    val server = LemmyStats(
        instance.totalUsers,
        instance.usersActiveDay,
        instance.usersActiveMonth,
        instance.usersActiveMonth,
        instance.usersActiveWeek,
        instance.instanceDetails.map {
            ServerModel(
                it.domain,
                it.siteInfo.siteView.site.name,
                it.siteInfo.siteView.site.actorId,
                it.siteInfo.siteView.site.banner ?: "",
                it.siteInfo.taglines.firstOrNull()?.content ?: "",
                it.siteInfo.siteView.site.description ?: "",
                it.siteInfo.siteView.site.sidebar ?: "",
                it.siteInfo.siteView.site.icon,
                it.siteInfo.version,
                it.nodeInfo.openRegistrations,
                it.siteInfo.siteView.counts.users,
                it.siteInfo.siteView.counts.communities,
                it.siteInfo.siteView.localSite.captchaEnabled
            )
        }
    )

    file.writeText(json.encodeToString(server))


    println(instance)


}