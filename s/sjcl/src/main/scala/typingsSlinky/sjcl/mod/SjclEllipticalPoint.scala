package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclEllipticalPoint extends js.Object {
  def isValid(): Boolean = js.native
  def mult(k: BigNumber): SjclEllipticalPoint = js.native
  def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint = js.native
  def multiples(): js.Array[SjclEllipticalPoint] = js.native
  def negate(): SjclEllipticalPoint = js.native
  def toBits(): BitArray_ = js.native
  def toJac(): SjclPointJacobian = js.native
}

object SjclEllipticalPoint {
  @scala.inline
  def apply(
    isValid: () => Boolean,
    mult: BigNumber => SjclEllipticalPoint,
    mult2: (BigNumber, BigNumber, SjclEllipticalPoint) => SjclEllipticalPoint,
    multiples: () => js.Array[SjclEllipticalPoint],
    negate: () => SjclEllipticalPoint,
    toBits: () => BitArray_,
    toJac: () => SjclPointJacobian
  ): SjclEllipticalPoint = {
    val __obj = js.Dynamic.literal(isValid = js.Any.fromFunction0(isValid), mult = js.Any.fromFunction1(mult), mult2 = js.Any.fromFunction3(mult2), multiples = js.Any.fromFunction0(multiples), negate = js.Any.fromFunction0(negate), toBits = js.Any.fromFunction0(toBits), toJac = js.Any.fromFunction0(toJac))
    __obj.asInstanceOf[SjclEllipticalPoint]
  }
  @scala.inline
  implicit class SjclEllipticalPointOps[Self <: SjclEllipticalPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMult(value: BigNumber => SjclEllipticalPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMult2(value: (BigNumber, BigNumber, SjclEllipticalPoint) => SjclEllipticalPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mult2")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMultiples(value: () => js.Array[SjclEllipticalPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiples")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNegate(value: () => SjclEllipticalPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBits(value: () => BitArray_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJac(value: () => SjclPointJacobian): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJac")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

