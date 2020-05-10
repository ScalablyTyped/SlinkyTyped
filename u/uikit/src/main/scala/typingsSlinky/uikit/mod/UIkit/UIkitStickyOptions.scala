package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitStickyOptions extends js.Object {
  var animation: js.UndefOr[String | Boolean] = js.native
  var bottom: js.UndefOr[Boolean | String] = js.native
  var `cls-active`: js.UndefOr[String] = js.native
  var `cls-inactive`: js.UndefOr[String] = js.native
  var media: js.UndefOr[Double | String | Boolean] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var `show-on-up`: js.UndefOr[Boolean] = js.native
  var `target-offset`: js.UndefOr[Boolean | Double] = js.native
  var top: js.UndefOr[Double | String] = js.native
  var `width-element`: js.UndefOr[String | Boolean] = js.native
}

object UIkitStickyOptions {
  @scala.inline
  def apply(): UIkitStickyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitStickyOptions]
  }
  @scala.inline
  implicit class UIkitStickyOptionsOps[Self <: UIkitStickyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: String | Boolean): Self = {
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
    def withBottom(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-active`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-active`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-active")(js.undefined)
        ret
    }
    @scala.inline
    def `withCls-inactive`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCls-inactive`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls-inactive")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: Double | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-on-up`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-on-up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-on-up`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-on-up")(js.undefined)
        ret
    }
    @scala.inline
    def `withTarget-offset`(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTarget-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-offset")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def `withWidth-element`(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width-element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWidth-element`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width-element")(js.undefined)
        ret
    }
  }
  
}

