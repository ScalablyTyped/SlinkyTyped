package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.all
import typingsSlinky.twitterForWeb.twitterForWebStrings.assertive
import typingsSlinky.twitterForWeb.twitterForWebStrings.auto
import typingsSlinky.twitterForWeb.twitterForWebStrings.dark
import typingsSlinky.twitterForWeb.twitterForWebStrings.hidden
import typingsSlinky.twitterForWeb.twitterForWebStrings.large
import typingsSlinky.twitterForWeb.twitterForWebStrings.left
import typingsSlinky.twitterForWeb.twitterForWebStrings.light
import typingsSlinky.twitterForWeb.twitterForWebStrings.medium
import typingsSlinky.twitterForWeb.twitterForWebStrings.none
import typingsSlinky.twitterForWeb.twitterForWebStrings.polite
import typingsSlinky.twitterForWeb.twitterForWebStrings.right
import typingsSlinky.twitterForWeb.twitterForWebStrings.rude
import typingsSlinky.twitterForWeb.twitterForWebStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional options for embedded Timelines.
  */
/* Inlined twitter-for-web.TwitterTimelineWidgetBaseOptions & {  ariaPolite ? :'polite' | 'assertive' | 'rude',   height ? :number,   borderColor ? :string,   chrome ? :string,   tweetLimit ? :number,   showReplies ? :boolean} */
@js.native
trait TwitterTimelineWidgetOptions extends js.Object {
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  /**
    * The alignment of the button within an iframe; use this to ensure flush layout when aligning buttons against opposite edges of your grid.
    */
  var align: js.UndefOr[String with (left | right)] = js.native
  /**
    * Apply the specified aria-polite behavior to the rendered timeline.
    */
  var ariaPolite: js.UndefOr[polite | assertive | rude] = js.native
  /**
    * Adjust the color of borders inside the widget.
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[hidden | visible] = js.native
  /**
    * Toggle the display of design elements in the widget. This parameter is a space-separated list of values.
    */
  var chrome: js.UndefOr[String] = js.native
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[none | all] = js.native
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.native
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.native
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[Boolean] = js.native
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[String] = js.native
  /**
    * Fix the height of the embedded widget.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[String] = js.native
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[String] = js.native
  /**
    * Show Tweets in response to another Tweet or account
    */
  var showReplies: js.UndefOr[Boolean] = js.native
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.native
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[dark | light] = js.native
  /**
    * Render a timeline statically, displaying only n number of Tweets.
    */
  var tweetLimit: js.UndefOr[Double] = js.native
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[String] = js.native
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[Double | auto] = js.native
}

object TwitterTimelineWidgetOptions {
  @scala.inline
  def apply(): TwitterTimelineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterTimelineWidgetOptions]
  }
  @scala.inline
  implicit class TwitterTimelineWidgetOptionsOps[Self <: TwitterTimelineWidgetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String with (left | right)): Self = {
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
    def withAriaPolite(value: polite | assertive | rude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPolite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaPolite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPolite")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
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
    def withChrome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(js.undefined)
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withShowReplies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReplies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReplies")(js.undefined)
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
    def withTweetLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweetLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweetLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweetLimit")(js.undefined)
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

