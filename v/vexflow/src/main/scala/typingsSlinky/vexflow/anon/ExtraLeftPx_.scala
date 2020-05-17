package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraLeftPx_ extends js.Object {
  var extraLeftPx: Double = js.native
  var extraRightPx: Double = js.native
  var left_shift: Double = js.native
  var modLeftPx: Double = js.native
  var modRightPx: Double = js.native
  var noteWidth: Double = js.native
  var width: Double = js.native
}

object ExtraLeftPx_ {
  @scala.inline
  def apply(
    extraLeftPx: Double,
    extraRightPx: Double,
    left_shift: Double,
    modLeftPx: Double,
    modRightPx: Double,
    noteWidth: Double,
    width: Double
  ): ExtraLeftPx_ = {
    val __obj = js.Dynamic.literal(extraLeftPx = extraLeftPx.asInstanceOf[js.Any], extraRightPx = extraRightPx.asInstanceOf[js.Any], left_shift = left_shift.asInstanceOf[js.Any], modLeftPx = modLeftPx.asInstanceOf[js.Any], modRightPx = modRightPx.asInstanceOf[js.Any], noteWidth = noteWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraLeftPx_]
  }
  @scala.inline
  implicit class ExtraLeftPx_Ops[Self <: ExtraLeftPx_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraLeftPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLeftPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraRightPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraRightPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left_shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModLeftPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modLeftPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModRightPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modRightPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoteWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

