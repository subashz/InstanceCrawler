import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class LemmyStats(
    @SerialName("total_users")
    var totalUsers: Int = 31470,
    @SerialName("users_active_day")
    var usersActiveDay: Int = 878,
    @SerialName("users_active_halfyear")
    var usersActiveHalfyear: Int = 3803,
    @SerialName("users_active_month")
    var usersActiveMonth: Int = 3539,
    @SerialName("users_active_week")
    var usersActiveWeek: Int = 2122,

    @SerialName("instance_details")
    var instanceDetails: List<ServerModel> = listOf(),

)

@Serializable
data class ServerModel(
    @SerialName("domain")
    val domain:String = "",
    @SerialName("name")
    val name:String,
    @SerialName("actorId")
    val actorId:String,
    @SerialName("banner")
    val banner:String,
    @SerialName("tagline")
    val tagLine:String,
    @SerialName("description")
    val description:String,
    @SerialName("sidebar")
    val sideBar:String,
    @SerialName("logo")
    val logo:String,
    @SerialName("version")
    val version:String,
    @SerialName("open_registration")
    val openRegistration:Boolean,
    @SerialName("total_user")
    val totalUser:Int,
    @SerialName("communities_count")
    val communitiesCount:Int,
    @SerialName("captcha_enabled")
    val captchaEnabled:Boolean
)