package typingsSlinky.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var contributors_enabled: Boolean = js.native
  var created_at: String = js.native
  var default_profile: String = js.native
  var default_profile_image: String = js.native
  var description: String = js.native
  var entities: Entities = js.native
  var favourites_count: Double = js.native
  var follow_request_sent: js.UndefOr[Boolean] = js.native
  var followers_count: Double = js.native
  var following: js.UndefOr[Boolean] = js.native
  var friends_count: Double = js.native
  var geo_enabled: js.UndefOr[Boolean] = js.native
  var id: Double = js.native
  var id_str: String = js.native
  var is_translator: js.UndefOr[Boolean] = js.native
  var lang: String = js.native
  var listed_count: Double = js.native
  var location: String = js.native
  var name: String = js.native
  var notifications: js.UndefOr[Boolean] = js.native
  var profile_background_color: String = js.native
  var profile_background_image_url: String = js.native
  var profile_background_image_url_https: String = js.native
  var profile_background_tile: Boolean = js.native
  var profile_banner_url: String = js.native
  var profile_image_url: String = js.native
  var profile_image_url_https: String = js.native
  var profile_link_color: String = js.native
  var profile_sidebar_border_color: String = js.native
  var profile_sidebar_fill_color: String = js.native
  var profile_text_color: String = js.native
  var profile_use_background_image: Boolean = js.native
  var `protected`: Boolean = js.native
  var screen_name: String = js.native
  var show_all_inline_media: Boolean = js.native
  var status: js.UndefOr[Status] = js.native
  var statuses_count: Double = js.native
  var time_zone: js.UndefOr[String] = js.native
  var url: String = js.native
  var utc_offset: js.UndefOr[Double] = js.native
  var verified: Boolean = js.native
  var withheld_in_countries: String = js.native
  var withheld_scope: String = js.native
}

object User {
  @scala.inline
  def apply(
    contributors_enabled: Boolean,
    created_at: String,
    default_profile: String,
    default_profile_image: String,
    description: String,
    entities: Entities,
    favourites_count: Double,
    followers_count: Double,
    friends_count: Double,
    id: Double,
    id_str: String,
    lang: String,
    listed_count: Double,
    location: String,
    name: String,
    profile_background_color: String,
    profile_background_image_url: String,
    profile_background_image_url_https: String,
    profile_background_tile: Boolean,
    profile_banner_url: String,
    profile_image_url: String,
    profile_image_url_https: String,
    profile_link_color: String,
    profile_sidebar_border_color: String,
    profile_sidebar_fill_color: String,
    profile_text_color: String,
    profile_use_background_image: Boolean,
    `protected`: Boolean,
    screen_name: String,
    show_all_inline_media: Boolean,
    statuses_count: Double,
    url: String,
    verified: Boolean,
    withheld_in_countries: String,
    withheld_scope: String
  ): User = {
    val __obj = js.Dynamic.literal(contributors_enabled = contributors_enabled.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_profile = default_profile.asInstanceOf[js.Any], default_profile_image = default_profile_image.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], favourites_count = favourites_count.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], friends_count = friends_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], listed_count = listed_count.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile_background_color = profile_background_color.asInstanceOf[js.Any], profile_background_image_url = profile_background_image_url.asInstanceOf[js.Any], profile_background_image_url_https = profile_background_image_url_https.asInstanceOf[js.Any], profile_background_tile = profile_background_tile.asInstanceOf[js.Any], profile_banner_url = profile_banner_url.asInstanceOf[js.Any], profile_image_url = profile_image_url.asInstanceOf[js.Any], profile_image_url_https = profile_image_url_https.asInstanceOf[js.Any], profile_link_color = profile_link_color.asInstanceOf[js.Any], profile_sidebar_border_color = profile_sidebar_border_color.asInstanceOf[js.Any], profile_sidebar_fill_color = profile_sidebar_fill_color.asInstanceOf[js.Any], profile_text_color = profile_text_color.asInstanceOf[js.Any], profile_use_background_image = profile_use_background_image.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any], show_all_inline_media = show_all_inline_media.asInstanceOf[js.Any], statuses_count = statuses_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], withheld_in_countries = withheld_in_countries.asInstanceOf[js.Any], withheld_scope = withheld_scope.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContributors_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributors_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_profile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_profile_image(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_profile_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntities(value: Entities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFavourites_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favourites_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriends_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friends_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId_str(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListed_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listed_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_background_image_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_background_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_background_image_url_https(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_background_image_url_https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_background_tile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_background_tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_banner_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_banner_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_image_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_image_url_https(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image_url_https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_link_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_link_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_sidebar_border_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_sidebar_border_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_sidebar_fill_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_sidebar_fill_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_text_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_text_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_use_background_image(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_use_background_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow_all_inline_media(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_all_inline_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithheld_in_countries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withheld_in_countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithheld_scope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withheld_scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollow_request_sent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_request_sent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow_request_sent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_request_sent")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following")(js.undefined)
        ret
    }
    @scala.inline
    def withGeo_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeo_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_translator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_translator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_translator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_translator")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTime_zone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime_zone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_zone")(js.undefined)
        ret
    }
    @scala.inline
    def withUtc_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtc_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc_offset")(js.undefined)
        ret
    }
  }
  
}

