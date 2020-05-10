package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitLightboxOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var autoplay: js.UndefOr[Double] = js.native
  var `autoplay-interval`: js.UndefOr[Double] = js.native
  var index: js.UndefOr[String] = js.native
  var `pause-on-hover`: js.UndefOr[Boolean] = js.native
  var toggle: js.UndefOr[String] = js.native
  var `video-autoplay`: js.UndefOr[Boolean] = js.native
}

object UIkitLightboxOptions {
  @scala.inline
  def apply(): UIkitLightboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLightboxOptions]
  }
  @scala.inline
  implicit class UIkitLightboxOptionsOps[Self <: UIkitLightboxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Double): Self = {
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
    def `withAutoplay-interval`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay-interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAutoplay-interval`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay-interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def `withPause-on-hover`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause-on-hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPause-on-hover`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause-on-hover")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def `withVideo-autoplay`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video-autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutVideo-autoplay`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video-autoplay")(js.undefined)
        ret
    }
  }
  
}

