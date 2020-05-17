package typingsSlinky.smoothScrollbar.anon

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
@js.native
trait PartialScrollbarOptions extends js.Object {
  var alwaysShowTracks: js.UndefOr[Boolean] = js.native
  var continuousScrolling: js.UndefOr[Boolean] = js.native
  var damping: js.UndefOr[Double] = js.native
  var delegateTo: js.UndefOr[EventTarget] = js.native
  var plugins: js.UndefOr[js.Any] = js.native
  var renderByPixels: js.UndefOr[Boolean] = js.native
  var thumbMinSize: js.UndefOr[Double] = js.native
  var wheelEventTarget: js.UndefOr[EventTarget] = js.native
}

object PartialScrollbarOptions {
  @scala.inline
  def apply(): PartialScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollbarOptions]
  }
  @scala.inline
  implicit class PartialScrollbarOptionsOps[Self <: PartialScrollbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysShowTracks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowTracks")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuousScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegateTo(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegateTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateTo")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderByPixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderByPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderByPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderByPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelEventTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelEventTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelEventTarget")(js.undefined)
        ret
    }
  }
  
}

