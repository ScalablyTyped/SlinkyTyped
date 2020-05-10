package typingsSlinky.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interpolation extends js.Object {
  var Utils: AnonBernstein = js.native
  def Bezier(v: js.Array[Double], k: Double): Double = js.native
  def CatmullRom(v: js.Array[Double], k: Double): Double = js.native
  def Linear(v: js.Array[Double], k: Double): Double = js.native
}

object Interpolation {
  @scala.inline
  def apply(
    Bezier: (js.Array[Double], Double) => Double,
    CatmullRom: (js.Array[Double], Double) => Double,
    Linear: (js.Array[Double], Double) => Double,
    Utils: AnonBernstein
  ): Interpolation = {
    val __obj = js.Dynamic.literal(Bezier = js.Any.fromFunction2(Bezier), CatmullRom = js.Any.fromFunction2(CatmullRom), Linear = js.Any.fromFunction2(Linear), Utils = Utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  @scala.inline
  implicit class InterpolationOps[Self <: Interpolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBezier(value: (js.Array[Double], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bezier")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCatmullRom(value: (js.Array[Double], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatmullRom")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLinear(value: (js.Array[Double], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Linear")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUtils(value: AnonBernstein): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utils")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

