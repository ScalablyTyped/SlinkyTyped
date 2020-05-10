package typingsSlinky.twit.mod.Twitter

import typingsSlinky.geojson.mod.Point
import typingsSlinky.twit.AnonId
import typingsSlinky.twit.twitStrings.low
import typingsSlinky.twit.twitStrings.medium
import typingsSlinky.twit.twitStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var annotations: js.UndefOr[js.Object] = js.native
  var contributors: js.UndefOr[js.Array[Contributors]] = js.native
  var coordinates: js.UndefOr[Point] = js.native
  var created_at: String = js.native
  var current_user_retweet: js.UndefOr[AnonId] = js.native
  var display_text_range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var entities: Entities = js.native
  var favorite_count: js.UndefOr[Double] = js.native
  var favorited: js.UndefOr[Boolean] = js.native
  var filter_level: none | low | medium = js.native
  var full_text: js.UndefOr[String] = js.native
  var geo: js.UndefOr[js.Object] = js.native
  var id: Double = js.native
  var id_str: String = js.native
  var in_reply_to_screen_name: js.UndefOr[String] = js.native
  var in_reply_to_status_id: js.UndefOr[Double] = js.native
  var in_reply_to_status_id_str: js.UndefOr[String] = js.native
  var in_reply_to_user_id: js.UndefOr[Double] = js.native
  var in_reply_to_user_id_str: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var place: js.UndefOr[Place] = js.native
  var possibly_sensitive: js.UndefOr[Boolean] = js.native
  var quoted_status: js.UndefOr[Status] = js.native
  var quoted_status_id: js.UndefOr[Double] = js.native
  var quoted_status_id_str: js.UndefOr[String] = js.native
  var retweet_count: Double = js.native
  var retweeted: Boolean = js.native
  var retweeted_status: js.UndefOr[Status] = js.native
  var scopes: js.UndefOr[js.Object] = js.native
  var source: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var truncated: Boolean = js.native
  var user: User = js.native
  var withheld_copyright: js.UndefOr[Boolean] = js.native
  var withheld_in_countries: js.UndefOr[js.Array[String]] = js.native
  var withheld_scope: js.UndefOr[String] = js.native
}

object Status {
  @scala.inline
  def apply(
    created_at: String,
    entities: Entities,
    filter_level: none | low | medium,
    id: Double,
    id_str: String,
    retweet_count: Double,
    retweeted: Boolean,
    truncated: Boolean,
    user: User
  ): Status = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], filter_level = filter_level.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], retweet_count = retweet_count.asInstanceOf[js.Any], retweeted = retweeted.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntities(value: Entities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_level(value: none | low | medium): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_level")(value.asInstanceOf[js.Any])
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
    def withRetweet_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retweet_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetweeted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retweeted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withContributors(value: js.Array[Contributors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributors")(js.undefined)
        ret
    }
    @scala.inline
    def withCoordinates(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent_user_retweet(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_retweet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent_user_retweet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_retweet")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_text_range(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_text_range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_text_range: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_text_range")(js.undefined)
        ret
    }
    @scala.inline
    def withFavorite_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavorite_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite_count")(js.undefined)
        ret
    }
    @scala.inline
    def withFavorited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavorited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorited")(js.undefined)
        ret
    }
    @scala.inline
    def withFull_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_text")(js.undefined)
        ret
    }
    @scala.inline
    def withGeo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(js.undefined)
        ret
    }
    @scala.inline
    def withIn_reply_to_screen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn_reply_to_screen_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_screen_name")(js.undefined)
        ret
    }
    @scala.inline
    def withIn_reply_to_status_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_status_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn_reply_to_status_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_status_id")(js.undefined)
        ret
    }
    @scala.inline
    def withIn_reply_to_status_id_str(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_status_id_str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn_reply_to_status_id_str: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_status_id_str")(js.undefined)
        ret
    }
    @scala.inline
    def withIn_reply_to_user_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn_reply_to_user_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_user_id")(js.undefined)
        ret
    }
    @scala.inline
    def withIn_reply_to_user_id_str(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_user_id_str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn_reply_to_user_id_str: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_user_id_str")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withPlace(value: Place): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(js.undefined)
        ret
    }
    @scala.inline
    def withPossibly_sensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibly_sensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPossibly_sensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibly_sensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoted_status(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoted_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_status")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoted_status_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_status_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoted_status_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_status_id")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoted_status_id_str(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_status_id_str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoted_status_id_str: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_status_id_str")(js.undefined)
        ret
    }
    @scala.inline
    def withRetweeted_status(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retweeted_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetweeted_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retweeted_status")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withWithheld_copyright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withheld_copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithheld_copyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withheld_copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withWithheld_in_countries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withheld_in_countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithheld_in_countries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withheld_in_countries")(js.undefined)
        ret
    }
    @scala.inline
    def withWithheld_scope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withheld_scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithheld_scope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withheld_scope")(js.undefined)
        ret
    }
  }
  
}

