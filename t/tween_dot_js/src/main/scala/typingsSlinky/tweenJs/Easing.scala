package typingsSlinky.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easing extends js.Object {
  var Back: AnonIn = js.native
  var Bounce: AnonIn = js.native
  var Circular: AnonIn = js.native
  var Cubic: AnonIn = js.native
  var Elastic: AnonIn = js.native
  var Exponential: AnonIn = js.native
  var Linear: AnonNone = js.native
  var Quadratic: AnonIn = js.native
  var Quartic: AnonIn = js.native
  var Quintic: AnonIn = js.native
  var Sinusoidal: AnonIn = js.native
}

object Easing {
  @scala.inline
  def apply(
    Back: AnonIn,
    Bounce: AnonIn,
    Circular: AnonIn,
    Cubic: AnonIn,
    Elastic: AnonIn,
    Exponential: AnonIn,
    Linear: AnonNone,
    Quadratic: AnonIn,
    Quartic: AnonIn,
    Quintic: AnonIn,
    Sinusoidal: AnonIn
  ): Easing = {
    val __obj = js.Dynamic.literal(Back = Back.asInstanceOf[js.Any], Bounce = Bounce.asInstanceOf[js.Any], Circular = Circular.asInstanceOf[js.Any], Cubic = Cubic.asInstanceOf[js.Any], Elastic = Elastic.asInstanceOf[js.Any], Exponential = Exponential.asInstanceOf[js.Any], Linear = Linear.asInstanceOf[js.Any], Quadratic = Quadratic.asInstanceOf[js.Any], Quartic = Quartic.asInstanceOf[js.Any], Quintic = Quintic.asInstanceOf[js.Any], Sinusoidal = Sinusoidal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  @scala.inline
  implicit class EasingOps[Self <: Easing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounce(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircular(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCubic(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cubic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElastic(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Elastic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponential(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exponential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinear(value: AnonNone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Linear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuadratic(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quadratic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuartic(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quartic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuintic(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quintic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSinusoidal(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sinusoidal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

