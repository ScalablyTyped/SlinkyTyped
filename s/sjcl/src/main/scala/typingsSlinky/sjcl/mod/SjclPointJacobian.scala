package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclPointJacobian extends js.Object {
  def add(T: SjclEllipticalPoint): SjclPointJacobian = js.native
  def doubl(): SjclPointJacobian = js.native
  def isValid(): Boolean = js.native
  def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian = js.native
  def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian = js.native
  def negate(): SjclPointJacobian = js.native
  def toAffine(): SjclEllipticalPoint = js.native
}

object SjclPointJacobian {
  @scala.inline
  def apply(
    add: SjclEllipticalPoint => SjclPointJacobian,
    doubl: () => SjclPointJacobian,
    isValid: () => Boolean,
    mult: (BigNumber, SjclEllipticalPoint) => SjclPointJacobian,
    mult2: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => SjclPointJacobian,
    negate: () => SjclPointJacobian,
    toAffine: () => SjclEllipticalPoint
  ): SjclPointJacobian = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), doubl = js.Any.fromFunction0(doubl), isValid = js.Any.fromFunction0(isValid), mult = js.Any.fromFunction2(mult), mult2 = js.Any.fromFunction4(mult2), negate = js.Any.fromFunction0(negate), toAffine = js.Any.fromFunction0(toAffine))
    __obj.asInstanceOf[SjclPointJacobian]
  }
  @scala.inline
  implicit class SjclPointJacobianOps[Self <: SjclPointJacobian] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: SjclEllipticalPoint => SjclPointJacobian): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDoubl(value: () => SjclPointJacobian): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMult(value: (BigNumber, SjclEllipticalPoint) => SjclPointJacobian): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mult")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMult2(value: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => SjclPointJacobian): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mult2")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withNegate(value: () => SjclPointJacobian): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToAffine(value: () => SjclEllipticalPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toAffine")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

