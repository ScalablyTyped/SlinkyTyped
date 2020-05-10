package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.all
import typingsSlinky.twitterForWeb.twitterForWebStrings.auto
import typingsSlinky.twitterForWeb.twitterForWebStrings.dark
import typingsSlinky.twitterForWeb.twitterForWebStrings.hidden
import typingsSlinky.twitterForWeb.twitterForWebStrings.light
import typingsSlinky.twitterForWeb.twitterForWebStrings.none
import typingsSlinky.twitterForWeb.twitterForWebStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional options for embedded Tweets.
  */
@js.native
trait TwitterTweetWidgetOptions extends TwitterWidgetOptions {
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  var align: js.UndefOr[String] = js.native
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[hidden | visible] = js.native
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[none | all] = js.native
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[String] = js.native
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[dark | light] = js.native
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[Double | auto] = js.native
}

object TwitterTweetWidgetOptions {
  @scala.inline
  def apply(): TwitterTweetWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterTweetWidgetOptions]
  }
  @scala.inline
  implicit class TwitterTweetWidgetOptionsOps[Self <: TwitterTweetWidgetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
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
    def withCards(value: hidden | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(js.undefined)
        ret
    }
    @scala.inline
    def withConversation(value: none | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversation")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: dark | light): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

