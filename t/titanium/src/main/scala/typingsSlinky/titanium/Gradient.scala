package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object defining a color gradient.
  */
@js.native
trait Gradient extends js.Object {
  /**
  	 * Set to `true` to continue filling with the final color beyond the `endPoint`.
  	 */
  var backfillEnd: js.UndefOr[Boolean] = js.native
  /**
  	 * Set to `true` to continue filling with the starting color beyond the `startPoint`.
  	 */
  var backfillStart: js.UndefOr[Boolean] = js.native
  /**
  	 * An array of colors, as a color name or hex triplet.
  	 */
  var colors: js.UndefOr[js.Array[GradientColorRef | java.lang.String]] = js.native
  /**
  	 * End point for the gradient.
  	 */
  var endPoint: js.UndefOr[Point] = js.native
  /**
  	 * For a radial gradient, the radius at the `endPoint`.
  	 */
  var endRadius: js.UndefOr[Double] = js.native
  /**
  	 * Start point for the gradient.
  	 */
  var startPoint: js.UndefOr[Point] = js.native
  /**
  	 * For a radial gradient, the radius at the `startPoint`.
  	 */
  var startRadius: js.UndefOr[Double] = js.native
  /**
  	 * Type of gradient, either 'linear' or 'radial'.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.native
}

object Gradient {
  @scala.inline
  def apply(): Gradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gradient]
  }
  @scala.inline
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackfillEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfillEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackfillEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfillEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBackfillStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfillStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackfillStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfillStart")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[GradientColorRef | java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withEndPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

