package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclEllipticalCurve extends js.Object {
  def fromBits(bits: BitArray_): SjclEllipticalPoint = js.native
}

object SjclEllipticalCurve {
  @scala.inline
  def apply(fromBits: BitArray_ => SjclEllipticalPoint): SjclEllipticalCurve = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits))
    __obj.asInstanceOf[SjclEllipticalCurve]
  }
  @scala.inline
  implicit class SjclEllipticalCurveOps[Self <: SjclEllipticalCurve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromBits(value: BitArray_ => SjclEllipticalPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBits")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

