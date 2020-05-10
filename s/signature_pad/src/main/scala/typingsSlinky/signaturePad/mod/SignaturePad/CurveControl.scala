package typingsSlinky.signaturePad.mod.SignaturePad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurveControl extends js.Object {
  var c1: Point = js.native
  var c2: Point = js.native
}

object CurveControl {
  @scala.inline
  def apply(c1: Point, c2: Point): CurveControl = {
    val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveControl]
  }
  @scala.inline
  implicit class CurveControlOps[Self <: CurveControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC1(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC2(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

