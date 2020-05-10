package typingsSlinky.smoothScrollbar.overscrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverscrollOptions extends js.Object {
  var damping: Double = js.native
  var effect: js.UndefOr[OverscrollEffect] = js.native
  var glowColor: String = js.native
  var maxOverscroll: Double = js.native
  var onScroll: js.UndefOr[OnScrollCallback] = js.native
}

object OverscrollOptions {
  @scala.inline
  def apply(damping: Double, glowColor: String, maxOverscroll: Double): OverscrollOptions = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], glowColor = glowColor.asInstanceOf[js.Any], maxOverscroll = maxOverscroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscrollOptions]
  }
  @scala.inline
  implicit class OverscrollOptionsOps[Self <: OverscrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxOverscroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOverscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffect(value: OverscrollEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: OnScrollCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
  }
  
}

