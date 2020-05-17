package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraRightPx extends js.Object {
  var extraLeftPx: Double = js.native
  var extraRightPx: Double = js.native
  var notePx: Double = js.native
  var width: Double = js.native
}

object ExtraRightPx {
  @scala.inline
  def apply(extraLeftPx: Double, extraRightPx: Double, notePx: Double, width: Double): ExtraRightPx = {
    val __obj = js.Dynamic.literal(extraLeftPx = extraLeftPx.asInstanceOf[js.Any], extraRightPx = extraRightPx.asInstanceOf[js.Any], notePx = notePx.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraRightPx]
  }
  @scala.inline
  implicit class ExtraRightPxOps[Self <: ExtraRightPx] (val x: Self) extends AnyVal {
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
    def withNotePx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notePx")(value.asInstanceOf[js.Any])
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

