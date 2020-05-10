package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGradient
  extends BaseGradient
     with Gradient {
  /**
    * The type of gradient. Use `"radial"` for a radial gradient.
    */
  @JSName("gradient")
  var gradient_RadialGradient: radial = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * The radius length, in normalized [0, 1] coordinates, of the inner circle for the gradient.
    *
    * __Default value:__ `0`
    */
  var r1: js.UndefOr[Double] = js.native
  /**
    * The radius length, in normalized [0, 1] coordinates, of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var r2: js.UndefOr[Double] = js.native
  /**
    * An array of gradient stops defining the gradient color sequence.
    */
  var stops: js.Array[GradientStop] = js.native
  /**
    * The x-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var x1: js.UndefOr[Double] = js.native
  /**
    * The x-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var x2: js.UndefOr[Double] = js.native
  /**
    * The y-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var y1: js.UndefOr[Double] = js.native
  /**
    * The y-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var y2: js.UndefOr[Double] = js.native
}

object RadialGradient {
  @scala.inline
  def apply(gradient: radial, stops: js.Array[GradientStop]): RadialGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradient]
  }
  @scala.inline
  implicit class RadialGradientOps[Self <: RadialGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradient(value: radial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStops(value: js.Array[GradientStop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withR1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r1")(js.undefined)
        ret
    }
    @scala.inline
    def withR2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r2")(js.undefined)
        ret
    }
    @scala.inline
    def withX1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(js.undefined)
        ret
    }
    @scala.inline
    def withX2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(js.undefined)
        ret
    }
    @scala.inline
    def withY1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(js.undefined)
        ret
    }
    @scala.inline
    def withY2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(js.undefined)
        ret
    }
  }
  
}

