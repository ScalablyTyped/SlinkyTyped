package typingsSlinky.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var date_format: String = js.native
  var default_category: Double = js.native
  var default_comment_status: OpenOrClosed = js.native
  var default_ping_status: OpenOrClosed = js.native
  var default_post_format: String = js.native
  var description: String = js.native
  var email: String = js.native
  var language: String = js.native
  var posts_per_page: Double = js.native
  var start_of_week: Double = js.native
  var time_format: String = js.native
  var timezone: String = js.native
  var title: String = js.native
  var url: String = js.native
  var use_smilies: Boolean = js.native
}

object Settings {
  @scala.inline
  def apply(
    date_format: String,
    default_category: Double,
    default_comment_status: OpenOrClosed,
    default_ping_status: OpenOrClosed,
    default_post_format: String,
    description: String,
    email: String,
    language: String,
    posts_per_page: Double,
    start_of_week: Double,
    time_format: String,
    timezone: String,
    title: String,
    url: String,
    use_smilies: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(date_format = date_format.asInstanceOf[js.Any], default_category = default_category.asInstanceOf[js.Any], default_comment_status = default_comment_status.asInstanceOf[js.Any], default_ping_status = default_ping_status.asInstanceOf[js.Any], default_post_format = default_post_format.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], posts_per_page = posts_per_page.asInstanceOf[js.Any], start_of_week = start_of_week.asInstanceOf[js.Any], time_format = time_format.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_smilies = use_smilies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_category(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_comment_status(value: OpenOrClosed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_comment_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_ping_status(value: OpenOrClosed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_ping_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_post_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_post_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosts_per_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posts_per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_of_week(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_of_week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse_smilies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_smilies")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

