package typingsSlinky.tweenJs

import typingsSlinky.tweenJs.anon.In
import typingsSlinky.tweenJs.anon.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easing extends js.Object {
  var Back: In = js.native
  var Bounce: In = js.native
  var Circular: In = js.native
  var Cubic: In = js.native
  var Elastic: In = js.native
  var Exponential: In = js.native
  var Linear: None = js.native
  var Quadratic: In = js.native
  var Quartic: In = js.native
  var Quintic: In = js.native
  var Sinusoidal: In = js.native
}

object Easing {
  @scala.inline
  def apply(
    Back: In,
    Bounce: In,
    Circular: In,
    Cubic: In,
    Elastic: In,
    Exponential: In,
    Linear: None,
    Quadratic: In,
    Quartic: In,
    Quintic: In,
    Sinusoidal: In
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
    def withBack(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounce(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircular(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCubic(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cubic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElastic(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Elastic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponential(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exponential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinear(value: None): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Linear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuadratic(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quadratic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuartic(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quartic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuintic(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quintic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSinusoidal(value: In): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sinusoidal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

