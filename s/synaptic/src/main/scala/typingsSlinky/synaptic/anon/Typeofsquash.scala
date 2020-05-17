package typingsSlinky.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsquash extends js.Object {
  def HLIM(x: Double, derivate: Boolean): Double = js.native
  def IDENTITY(x: Double, derivate: Boolean): Double = js.native
  def LOGISTIC(x: Double, derivate: Boolean): Double = js.native
  def ReLU(x: Double, derivate: Boolean): Double = js.native
  def TANH(x: Double, derivate: Boolean): Double = js.native
}

object Typeofsquash {
  @scala.inline
  def apply(
    HLIM: (Double, Boolean) => Double,
    IDENTITY: (Double, Boolean) => Double,
    LOGISTIC: (Double, Boolean) => Double,
    ReLU: (Double, Boolean) => Double,
    TANH: (Double, Boolean) => Double
  ): Typeofsquash = {
    val __obj = js.Dynamic.literal(HLIM = js.Any.fromFunction2(HLIM), IDENTITY = js.Any.fromFunction2(IDENTITY), LOGISTIC = js.Any.fromFunction2(LOGISTIC), ReLU = js.Any.fromFunction2(ReLU), TANH = js.Any.fromFunction2(TANH))
    __obj.asInstanceOf[Typeofsquash]
  }
  @scala.inline
  implicit class TypeofsquashOps[Self <: Typeofsquash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHLIM(value: (Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HLIM")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIDENTITY(value: (Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLOGISTIC(value: (Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOGISTIC")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReLU(value: (Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReLU")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTANH(value: (Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TANH")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

