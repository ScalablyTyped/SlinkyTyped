package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearGradient
  extends BaseGradient
     with Gradient {
  /**
    * The type of gradient. Use `"linear"` for a linear gradient.
    */
  @JSName("gradient")
  var gradient_LinearGradient: linear = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * An array of gradient stops defining the gradient color sequence.
    */
  var stops: js.Array[GradientStop] = js.native
  /**
    * The starting x-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var x1: js.UndefOr[Double] = js.native
  /**
    * The ending x-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `1`
    */
  var x2: js.UndefOr[Double] = js.native
  /**
    * The starting y-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var y1: js.UndefOr[Double] = js.native
  /**
    * The ending y-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var y2: js.UndefOr[Double] = js.native
}

object LinearGradient {
  @scala.inline
  def apply(gradient: linear, stops: js.Array[GradientStop]): LinearGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradient]
  }
  @scala.inline
  implicit class LinearGradientOps[Self <: LinearGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradient(value: linear): Self = {
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

