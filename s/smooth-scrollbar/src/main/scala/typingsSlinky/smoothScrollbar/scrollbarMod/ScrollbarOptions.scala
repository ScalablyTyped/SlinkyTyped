package typingsSlinky.smoothScrollbar.scrollbarMod

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarOptions extends js.Object {
  var alwaysShowTracks: Boolean = js.native
  var continuousScrolling: Boolean = js.native
  var damping: Double = js.native
  var delegateTo: EventTarget | Null = js.native
  var plugins: js.Any = js.native
  var renderByPixels: Boolean = js.native
  var thumbMinSize: Double = js.native
  var wheelEventTarget: EventTarget | Null = js.native
}

object ScrollbarOptions {
  @scala.inline
  def apply(
    alwaysShowTracks: Boolean,
    continuousScrolling: Boolean,
    damping: Double,
    plugins: js.Any,
    renderByPixels: Boolean,
    thumbMinSize: Double
  ): ScrollbarOptions = {
    val __obj = js.Dynamic.literal(alwaysShowTracks = alwaysShowTracks.asInstanceOf[js.Any], continuousScrolling = continuousScrolling.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], renderByPixels = renderByPixels.asInstanceOf[js.Any], thumbMinSize = thumbMinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarOptions]
  }
  @scala.inline
  implicit class ScrollbarOptionsOps[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
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
    def withContinuousScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderByPixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderByPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelegateTo(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelegateToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateTo")(null)
        ret
    }
    @scala.inline
    def withWheelEventTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWheelEventTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelEventTarget")(null)
        ret
    }
  }
  
}

