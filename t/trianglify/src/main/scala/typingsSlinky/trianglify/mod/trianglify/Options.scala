package typingsSlinky.trianglify.mod.trianglify

import typingsSlinky.trianglify.trianglifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Size of the cells used to generate a randomized grid */
  var cell_size: js.UndefOr[Double] = js.native
  /** Color function f(x, y) that returns a color specification that is consumable by chroma-js */
  var color_function: js.UndefOr[(js.Function2[/* x */ Double, /* y */ Double, String]) | Null] = js.native
  /** Color space used for gradient construction & interpolation */
  var color_space: js.UndefOr[String] = js.native
  /** Height of pattern */
  var height: js.UndefOr[Double] = js.native
  /** An array of [x,y] coordinates to trianglulate. Defaults to undefined, and points are generated. */
  var points: js.UndefOr[js.Array[Double]] = js.native
  /** Seed for the RNG */
  var seed: js.UndefOr[Double | String | Null] = js.native
  /** Width of stroke. Defaults to 1.51 to fix an issue with canvas antialiasing. */
  var stroke_width: js.UndefOr[Double] = js.native
  /** how much to randomize the grid */
  var variance: js.UndefOr[Double] = js.native
  /** Width of pattern */
  var width: js.UndefOr[Double] = js.native
  /** X color stops */
  var x_colors: js.UndefOr[`false` | String | js.Array[String]] = js.native
  /** Y color stops */
  var y_colors: js.UndefOr[`false` | String | js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell_size")(js.undefined)
        ret
    }
    @scala.inline
    def withColor_function(value: (/* x */ Double, /* y */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_function")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColor_function: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_function")(js.undefined)
        ret
    }
    @scala.inline
    def withColor_functionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_function")(null)
        ret
    }
    @scala.inline
    def withColor_space(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor_space: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_space")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withSeedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(null)
        ret
    }
    @scala.inline
    def withStroke_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke_width")(js.undefined)
        ret
    }
    @scala.inline
    def withVariance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX_colors(value: `false` | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_colors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_colors")(js.undefined)
        ret
    }
    @scala.inline
    def withY_colors(value: `false` | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_colors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_colors")(js.undefined)
        ret
    }
  }
  
}

