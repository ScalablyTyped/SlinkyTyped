package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.large
import typingsSlinky.twitterForWeb.twitterForWebStrings.left
import typingsSlinky.twitterForWeb.twitterForWebStrings.medium
import typingsSlinky.twitterForWeb.twitterForWebStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional configuration for button widgets.
  */
@js.native
trait TwitterButtonWidgetOptions extends TwitterWidgetOptions {
  /**
    * The alignment of the button within an iframe; use this to ensure flush layout when aligning buttons against opposite edges of your grid.
    */
  var align: js.UndefOr[left | right] = js.native
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.native
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.native
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.native
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.native
}

object TwitterButtonWidgetOptions {
  @scala.inline
  def apply(): TwitterButtonWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterButtonWidgetOptions]
  }
  @scala.inline
  implicit class TwitterButtonWidgetOptionsOps[Self <: TwitterButtonWidgetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: String): Self = {
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
    def withCounturl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counturl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounturl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counturl")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
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
  }
  
}

