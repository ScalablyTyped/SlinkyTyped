package typingsSlinky.victory

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCornerRadius extends js.Object {
  var cornerRadius: js.UndefOr[Double] = js.native
  var flyoutStyle: js.UndefOr[CSSProperties] = js.native
  var pointerLength: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object AnonCornerRadius {
  @scala.inline
  def apply(): AnonCornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCornerRadius]
  }
  @scala.inline
  implicit class AnonCornerRadiusOps[Self <: AnonCornerRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyoutStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerLength")(js.undefined)
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

