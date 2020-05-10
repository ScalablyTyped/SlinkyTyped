package typingsSlinky.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimProps extends js.Object {
  var easing: easeType = js.native
  var fromStyle: CSSProperties | js.Array[CSSProperties] = js.native
  var onAnim: js.UndefOr[
    js.Function2[/* forwards */ js.UndefOr[Boolean], /* animIndex */ js.UndefOr[Double], Unit]
  ] = js.native
  var order: js.UndefOr[Double] = js.native
  var route: js.UndefOr[js.Object] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var toStyle: CSSProperties | js.Array[CSSProperties] = js.native
  var transitionDuration: Double = js.native
}

object AnimProps {
  @scala.inline
  def apply(
    easing: easeType,
    fromStyle: CSSProperties | js.Array[CSSProperties],
    toStyle: CSSProperties | js.Array[CSSProperties],
    transitionDuration: Double
  ): AnimProps = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any], fromStyle = fromStyle.asInstanceOf[js.Any], toStyle = toStyle.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimProps]
  }
  @scala.inline
  implicit class AnimPropsOps[Self <: AnimProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEasing(value: easeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromStyle(value: CSSProperties | js.Array[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToStyle(value: CSSProperties | js.Array[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAnim(value: (/* forwards */ js.UndefOr[Boolean], /* animIndex */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnim")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAnim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnim")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

