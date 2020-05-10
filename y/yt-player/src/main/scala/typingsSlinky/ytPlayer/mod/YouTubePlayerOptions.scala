package typingsSlinky.ytPlayer.mod

import typingsSlinky.ytPlayer.ytPlayerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YouTubePlayerOptions extends js.Object {
  /**
    * This parameter indicates whether the player will show video annotations.
    * The default value is true.
    */
  var annotations: js.UndefOr[Boolean] = js.native
  /**
    * This parameter indicates whether the initial video will automatically
    * start to play when the player loads. The default value is false.
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * This parameter indicates whether closed captions should be shown, even if
    * the user has turned captions off. The default behavior is based on user
    * preference.
    */
  var captions: js.UndefOr[`false` | String] = js.native
  /**
    * This parameter indicates whether the video player controls are displayed.
    * The default value is true.
    */
  var controls: js.UndefOr[Boolean] = js.native
  /**
    * This parameter indicates whether the player will show a fullscreen
    * button. The default value is true.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /** This parameter indicates the height of the player. */
  var height: js.UndefOr[Double] = js.native
  /**
    * This parameter indicates whether the player will respond to keyboard
    * shortcuts. The default value is true.
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * This parameter lets you use a YouTube player that does not show a
    * YouTube logo. Even when this option is enabled, a small YouTube text
    * label will still display in the upper-right corner of a paused video
    * when the user's mouse pointer hovers over the player.
    */
  var modestBranding: js.UndefOr[Boolean] = js.native
  /**
    * This parameter controls whether videos play inline or fullscreen in an
    * HTML5 player on iOS. The default value is true.
    */
  var playsInline: js.UndefOr[Boolean] = js.native
  /**
    * This parameter indicates whether the player should show related videos
    * from other channels
    */
  var related: js.UndefOr[Boolean] = js.native
  /**
    * The time between onTimeupdate callbacks, in milliseconds. Default is
    * 1000.
    */
  var timeupdateFrequency: js.UndefOr[Double] = js.native
  /**  This parameter indicates the width of the player. */
  var width: js.UndefOr[Double] = js.native
}

object YouTubePlayerOptions {
  @scala.inline
  def apply(): YouTubePlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubePlayerOptions]
  }
  @scala.inline
  implicit class YouTubePlayerOptionsOps[Self <: YouTubePlayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: Boolean): Self = {
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
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptions(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captions")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
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
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withModestBranding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modestBranding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModestBranding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modestBranding")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaysInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playsInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaysInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playsInline")(js.undefined)
        ret
    }
    @scala.inline
    def withRelated(value: Boolean): Self = {
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
    def withTimeupdateFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeupdateFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeupdateFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeupdateFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

