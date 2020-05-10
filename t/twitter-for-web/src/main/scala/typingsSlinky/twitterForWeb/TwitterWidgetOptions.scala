package typingsSlinky.twitterForWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional configuration for all widgets.
  */
@js.native
trait TwitterWidgetOptions extends js.Object {
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[Boolean] = js.native
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[String] = js.native
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[String] = js.native
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[String] = js.native
}

object TwitterWidgetOptions {
  @scala.inline
  def apply(): TwitterWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterWidgetOptions]
  }
  @scala.inline
  implicit class TwitterWidgetOptionsOps[Self <: TwitterWidgetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnt")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtags")(js.undefined)
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
    def withRelated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(js.undefined)
        ret
    }
    @scala.inline
    def withVia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via")(js.undefined)
        ret
    }
  }
  
}

