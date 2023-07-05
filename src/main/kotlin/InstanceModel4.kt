
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InstanceModel4(
    @SerialName("crawled_instances")
    var crawledInstances: Int = 11,
    @SerialName("instance_details")
    var instanceDetails: List<InstanceDetail> = listOf(),
    @SerialName("total_users")
    var totalUsers: Int = 31470,
    @SerialName("users_active_day")
    var usersActiveDay: Int = 878,
    @SerialName("users_active_halfyear")
    var usersActiveHalfyear: Int = 3803,
    @SerialName("users_active_month")
    var usersActiveMonth: Int = 3539,
    @SerialName("users_active_week")
    var usersActiveWeek: Int = 2122
) {
    @Serializable
    data class InstanceDetail(
        @SerialName("domain")
        var domain: String = """lemmy.blahaj.zone""",
        @SerialName("federated_instances")
        var federatedInstances: FederatedInstances = FederatedInstances(),
        @SerialName("node_info")
        var nodeInfo: NodeInfo = NodeInfo(),
        @SerialName("site_info")
        var siteInfo: SiteInfo = SiteInfo()
    ) {
        @Serializable
        data class FederatedInstances(
            @SerialName("federated_instances")
            var federatedInstances: FederatedInstances = FederatedInstances()
        ) {
            @Serializable
            data class FederatedInstances(
//                @SerialName("allowed")
//                var allowed: List<String> = listOf(),
                @SerialName("blocked")
                var blocked: List<Blocked> = listOf(),
                @SerialName("linked")
                var linked: List<Linked> = listOf()
            ) {
                @Serializable
                data class Blocked(
                    @SerialName("domain")
                    var domain: String = """noagendasocial.com""",
                    @SerialName("id")
                    var id: Int = 94,
                    @SerialName("published")
                    var published: String = """2023-02-03T08:30:22.290067""",
                    @SerialName("software")
                    var software: String? = "",
                    @SerialName("updated")
                    var updated: String = """2023-06-07T01:58:45.756276""",
                    @SerialName("version")
                    var version: String? = ""
                )

                @Serializable
                data class Linked(
                    @SerialName("domain")
                    var domain: String = """toot.thewalkingdeaf.net""",
                    @SerialName("id")
                    var id: Int = 3,
                    @SerialName("published")
                    var published: String = """2023-02-03T08:30:22.290067""",
                    @SerialName("software")
                    var software: String? = "",
                    @SerialName("updated")
                    var updated: String? = "",
                    @SerialName("version")
                    var version: String? = ""
                )
            }
        }

        @Serializable
        data class NodeInfo(
            @SerialName("openRegistrations")
            var openRegistrations: Boolean = true,
            @SerialName("protocols")
            var protocols: List<String> = listOf(),
            @SerialName("software")
            var software: Software = Software(),
            @SerialName("usage")
            var usage: Usage = Usage(),
            @SerialName("version")
            var version: String = """2.0"""
        ) {
            @Serializable
            data class Software(
                @SerialName("name")
                var name: String = """lemmy""",
                @SerialName("version")
                var version: String = """0.18.1-rc.4-48-gf5378d0b4-kt.1"""
            )

            @Serializable
            data class Usage(
                @SerialName("comments")
                var comments: Int = 11083,
                @SerialName("posts")
                var posts: Int = 2800,
                @SerialName("users")
                var users: Users = Users()
            ) {
                @Serializable
                data class Users(
                    @SerialName("activeHalfyear")
                    var activeHalfyear: Int = 931,
                    @SerialName("activeMonth")
                    var activeMonth: Int = 929,
                    @SerialName("total")
                    var total: Int = 5371
                )
            }
        }

        @Serializable
        data class SiteInfo(
            @SerialName("admins")
            var admins: List<Admin> = listOf(),
            @SerialName("all_languages")
            var allLanguages: List<AllLanguage> = listOf(),
            @SerialName("custom_emojis")
            var customEmojis: List<CustomEmoji> = listOf(),
            @SerialName("discussion_languages")
            var discussionLanguages: List<Int> = listOf(),
            @SerialName("site_view")
            var siteView: SiteView = SiteView(),
            @SerialName("taglines")
            var taglines: List<Tagline> = listOf(),
            @SerialName("version")
            var version: String = """0.18.1-rc.4-48-gf5378d0b4-kt.1"""
        ) {
            @Serializable
            data class Admin(
                @SerialName("counts")
                var counts: Counts = Counts(),
                @SerialName("person")
                var person: Person = Person()
            ) {
                @Serializable
                data class Counts(
                    @SerialName("comment_count")
                    var commentCount: Int = 2,
                    @SerialName("comment_score")
                    var commentScore: Int = 40,
                    @SerialName("id")
                    var id: Int = 1,
                    @SerialName("person_id")
                    var personId: Int = 2,
                    @SerialName("post_count")
                    var postCount: Int = 0,
                    @SerialName("post_score")
                    var postScore: Int = 0
                )

                @Serializable
                data class Person(
                    @SerialName("actor_id")
                    var actorId: String = """https://lemmy.blahaj.zone/u/blahaj""",
                    @SerialName("admin")
                    var admin: Boolean = true,
                    @SerialName("avatar")
                    var avatar: String? = "",
                    @SerialName("banned")
                    var banned: Boolean = false,
                    @SerialName("banner")
                    var banner: String? = "",
                    @SerialName("bio")
                    var bio: String? = "",
                    @SerialName("bot_account")
                    var botAccount: Boolean = false,
                    @SerialName("deleted")
                    var deleted: Boolean = false,
                    @SerialName("display_name")
                    var displayName: String? = "",
                    @SerialName("id")
                    var id: Int = 2,
                    @SerialName("instance_id")
                    var instanceId: Int = 171,
                    @SerialName("local")
                    var local: Boolean = true,
                    @SerialName("matrix_user_id")
                    var matrixUserId: String? = "",
                    @SerialName("name")
                    var name: String = """blahaj""",
                    @SerialName("published")
                    var published: String = """2023-01-02T14:23:30.501774""",
                    @SerialName("updated")
                    var updated: String? = ""
                )
            }

            @Serializable
            data class AllLanguage(
                @SerialName("code")
                var code: String = """und""",
                @SerialName("id")
                var id: Int = 0,
                @SerialName("name")
                var name: String = """Undetermined"""
            )

            @Serializable
            data class CustomEmoji(
                @SerialName("custom_emoji")
                var customEmoji: CustomEmoji = CustomEmoji(),
                @SerialName("keywords")
                var keywords: List<Keyword> = listOf()
            ) {
                @Serializable
                data class CustomEmoji(
                    @SerialName("alt_text")
                    var altText: String = """crabrave""",
                    @SerialName("category")
                    var category: String = "",
                    @SerialName("id")
                    var id: Int = 353,
                    @SerialName("image_url")
                    var imageUrl: String = """https://blahaj.zone/files/431442e0-bcac-4058-907c-983866239c9f""",
                    @SerialName("local_site_id")
                    var localSiteId: Int = 1,
                    @SerialName("published")
                    var published: String = """2023-07-02T19:03:38.583656""",
                    @SerialName("shortcode")
                    var shortcode: String = """crabrave"""
                )

                @Serializable
                data class Keyword(
                    @SerialName("custom_emoji_id")
                    var customEmojiId: Int = 3,
                    @SerialName("id")
                    var id: Int = 3,
                    @SerialName("keyword")
                    var keyword: String = """zone"""
                )
            }

            @Serializable
            data class SiteView(
                @SerialName("counts")
                var counts: Counts = Counts(),
                @SerialName("local_site")
                var localSite: LocalSite = LocalSite(),
                @SerialName("local_site_rate_limit")
                var localSiteRateLimit: LocalSiteRateLimit = LocalSiteRateLimit(),
                @SerialName("site")
                var site: Site = Site()
            ) {
                @Serializable
                data class Counts(
                    @SerialName("comments")
                    var comments: Int = 11083,
                    @SerialName("communities")
                    var communities: Int = 117,
                    @SerialName("id")
                    var id: Int = 1,
                    @SerialName("posts")
                    var posts: Int = 2800,
                    @SerialName("site_id")
                    var siteId: Int = 1,
                    @SerialName("users")
                    var users: Int = 5371,
                    @SerialName("users_active_day")
                    var usersActiveDay: Int = 224,
                    @SerialName("users_active_half_year")
                    var usersActiveHalfYear: Int = 931,
                    @SerialName("users_active_month")
                    var usersActiveMonth: Int = 929,
                    @SerialName("users_active_week")
                    var usersActiveWeek: Int = 452
                )

                @Serializable
                data class LocalSite(
                    @SerialName("actor_name_max_length")
                    var actorNameMaxLength: Int = 25,
                    @SerialName("application_email_admins")
                    var applicationEmailAdmins: Boolean = true,
                    @SerialName("application_question")
                    var applicationQuestion: String? = "",
                    @SerialName("captcha_difficulty")
                    var captchaDifficulty: String = """medium""",
                    @SerialName("captcha_enabled")
                    var captchaEnabled: Boolean = true,
                    @SerialName("community_creation_admin_only")
                    var communityCreationAdminOnly: Boolean = false,
                    @SerialName("default_post_listing_type")
                    var defaultPostListingType: String = """All""",
                    @SerialName("default_theme")
                    var defaultTheme: String = """litely-red""",
                    @SerialName("enable_downvotes")
                    var enableDownvotes: Boolean = false,
                    @SerialName("enable_nsfw")
                    var enableNsfw: Boolean = true,
                    @SerialName("federation_enabled")
                    var federationEnabled: Boolean = true,
                    @SerialName("hide_modlog_mod_names")
                    var hideModlogModNames: Boolean = false,
                    @SerialName("id")
                    var id: Int = 1,
                    @SerialName("legal_information")
                    var legalInformation: String? = "",
                    @SerialName("private_instance")
                    var privateInstance: Boolean = false,
                    @SerialName("published")
                    var published: String = """2023-01-02T14:23:34.924225""",
                    @SerialName("registration_mode")
                    var registrationMode: String = """Open""",
                    @SerialName("reports_email_admins")
                    var reportsEmailAdmins: Boolean = false,
                    @SerialName("require_email_verification")
                    var requireEmailVerification: Boolean = true,
                    @SerialName("site_id")
                    var siteId: Int = 1,
                    @SerialName("site_setup")
                    var siteSetup: Boolean = true,
                    @SerialName("slur_filter_regex")
                    var slurFilterRegex: String? = "",
                    @SerialName("updated")
                    var updated: String = """2023-07-04T04:29:20.804975"""
                )

                @Serializable
                data class LocalSiteRateLimit(
                    @SerialName("comment")
                    var comment: Int = 6,
                    @SerialName("comment_per_second")
                    var commentPerSecond: Int = 600,
                    @SerialName("id")
                    var id: Int = 1,
                    @SerialName("image")
                    var image: Int = 6,
                    @SerialName("image_per_second")
                    var imagePerSecond: Int = 3600,
                    @SerialName("local_site_id")
                    var localSiteId: Int = 1,
                    @SerialName("message")
                    var message: Int = 3600,
                    @SerialName("message_per_second")
                    var messagePerSecond: Int = 512,
                    @SerialName("post")
                    var post: Int = 12,
                    @SerialName("post_per_second")
                    var postPerSecond: Int = 600,
                    @SerialName("published")
                    var published: String = """2023-02-03T08:30:22.290067""",
                    @SerialName("register")
                    var register: Int = 3,
                    @SerialName("register_per_second")
                    var registerPerSecond: Int = 3600,
                    @SerialName("search")
                    var search: Int = 60,
                    @SerialName("search_per_second")
                    var searchPerSecond: Int = 600
                )

                @Serializable
                data class Site(
                    @SerialName("actor_id")
                    var actorId: String = """https://lemmy.blahaj.zone/""",
                    @SerialName("banner")
                    var banner: String? = "",
                    @SerialName("description")
                    var description: String? = "",
                    @SerialName("icon")
                    var icon: String = """https://lemmy.blahaj.zone/pictrs/image/62y14MBGKt.png""",
                    @SerialName("id")
                    var id: Int = 1,
                    @SerialName("inbox_url")
                    var inboxUrl: String = """https://lemmy.blahaj.zone/site_inbox""",
                    @SerialName("instance_id")
                    var instanceId: Int = 171,
                    @SerialName("last_refreshed_at")
                    var lastRefreshedAt: String = """2023-01-02T14:23:34.923239""",
                    @SerialName("name")
                    var name: String = """Blåhaj Lemmy""",
                    @SerialName("public_key")
                    var publicKey: String = """-----BEGIN PUBLIC KEY-----
                    MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoD7yDVLeGXDmGyB1yuie
                    3Wxr3droYP9z5osiliL1Mb3dJqAZzk8WOPl4rMdD6+8lyfg74Dd2XC3sDpSWHGGN
                    rQc0AkVh+lp5MEcywXbKOY/kOZqtZSZnPraHFMBJBRYCHXZD7sI15/12RyY+knqi
                    plq7kxv9oQ3swSaQ3EoNRfQj+NRacURQkZFnPKn/wG23OqmufbtlheC3yKI43AM+
                    l7Prr6g5H+3Lqj3KuHlqSJHPBqi2q/YNKlKktl7U9rk3jd+Aj9NPPanu1qSa2GPh
                    z/PIV/4o6SqTy4SSBJeMdIOJgM6ChhVOXgtNqLCNmr7NY3Kv2JXK1doMiSeUP6iV
                    ZQIDAQAB
                    -----END PUBLIC KEY-----
                    """,
                    @SerialName("published")
                    var published: String = """2023-01-02T14:23:34.924225""",
                    @SerialName("sidebar")
                    var sidebar: String? = "",
                    @SerialName("updated")
                    var updated: String = """2023-07-04T04:29:20.801451"""
                )
            }

            @Serializable
            data class Tagline(
                @SerialName("content")
                var content: String = """**Diverse opinions, discussion, and debate are welcome**""",
                @SerialName("id")
                var id: Int = 31,
                @SerialName("local_site_id")
                var localSiteId: Int = 1,
                @SerialName("published")
                var published: String = """2023-07-02T19:39:20.427367"""
            )
        }
    }
}