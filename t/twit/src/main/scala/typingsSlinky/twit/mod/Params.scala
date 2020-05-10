package typingsSlinky.twit.mod

import typingsSlinky.node.Buffer
import typingsSlinky.twit.AnonText
import typingsSlinky.twit.mod.Twitter.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var alt_text: js.UndefOr[AnonText] = js.native
  var count: js.UndefOr[Double] = js.native
  var cursor: js.UndefOr[Double | String] = js.native
  var exclude_replies: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  var geocode: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var in_reply_to_status_id: js.UndefOr[Double | String] = js.native
  var include_email: js.UndefOr[Boolean] = js.native
  var include_entities: js.UndefOr[Boolean] = js.native
  var include_rts: js.UndefOr[Boolean] = js.native
  var include_user_entities: js.UndefOr[Boolean] = js.native
  var lang: js.UndefOr[String] = js.native
  var lat: js.UndefOr[Double] = js.native
  var locale: js.UndefOr[String] = js.native
  var long: js.UndefOr[Double] = js.native
  var max_id: js.UndefOr[String] = js.native
  var media_data: js.UndefOr[Buffer | String] = js.native
  var media_id: js.UndefOr[String] = js.native
  var media_ids: js.UndefOr[js.Array[String]] = js.native
  var owner_screen_name: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  // search/tweets
  var q: js.UndefOr[String] = js.native
  var result_type: js.UndefOr[ResultType] = js.native
  var results_per_page: js.UndefOr[Double] = js.native
  var screen_name: js.UndefOr[String] = js.native
  var since_id: js.UndefOr[String] = js.native
  var skip_status: js.UndefOr[Boolean] = js.native
  var slug: js.UndefOr[String] = js.native
  var source_id: js.UndefOr[Double] = js.native
  var source_screen_name: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var stringify_ids: js.UndefOr[Boolean] = js.native
  var target_id: js.UndefOr[Double] = js.native
  var target_screen_name: js.UndefOr[String] = js.native
  // Other params from various endpoints
  var track: js.UndefOr[String | js.Array[String]] = js.native
  var trim_user: js.UndefOr[Boolean] = js.native
  var tweet_mode: js.UndefOr[String] = js.native
  var until: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var user_id: js.UndefOr[Double | String] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt_text(value: AnonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_text")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_replies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_replies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_replies")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: Boolean | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withGeocode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeocode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocode")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIn_reply_to_status_id(value: Double | String): Self = {
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
    def withInclude_email(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_email")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_entities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_entities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_entities")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_rts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_rts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_rts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_rts")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_user_entities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_user_entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_user_entities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_user_entities")(js.undefined)
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
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLong(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_id")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_data(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_data")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_id")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner_screen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner_screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner_screen_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner_screen_name")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withResult_type(value: ResultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_type")(js.undefined)
        ret
    }
    @scala.inline
    def withResults_per_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results_per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults_per_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results_per_page")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(js.undefined)
        ret
    }
    @scala.inline
    def withSince_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_status(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_status")(js.undefined)
        ret
    }
    @scala.inline
    def withSlug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_screen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_screen_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_screen_name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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
    def withStringify_ids(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringify_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_screen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_screen_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_screen_name")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim_user(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim_user: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim_user")(js.undefined)
        ret
    }
    @scala.inline
    def withTweet_mode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweet_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweet_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweet_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}

