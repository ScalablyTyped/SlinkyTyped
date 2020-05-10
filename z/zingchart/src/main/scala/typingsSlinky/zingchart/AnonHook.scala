package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHook extends js.Object {
  /**
    * Sets the arrow's end point to that of a charted value. The plot value refers to the set of values in a series, and the index refer
    * s to the specific value within that series. For example, node:plot=0,index=10 sets the end point of the arrow at the 11th value wi
    * thin the 1st set of values in the series. Note that 0 refers to the first value or set of values, with 1 being the second value or
    *  set of values, and so on. "node:index=4" | "node:plot=0,index=1" | ...
    */
  var hook: js.UndefOr[String] = js.native
  /**
    * Sets an x-offset for the arrow's end point. Can be used to make adjustments to an arrow's end x ordinate or hook point. 10 | 56 |
    * ...
    */
  var `offset-x`: js.UndefOr[Double] = js.native
  /**
    * Sets a y-offset for the arrow's end point. Can be used to make adjustments to an arrow's end y ordinate or hook point. 10 | 56 | .
    * ..
    */
  var `offset-y`: js.UndefOr[Double] = js.native
  /**
    * Sets the x ordinate for an arrow's end point. Ordinates are counted in pixels, starting from the top-left corner of the chart. 100
    *  | 450 | ...
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Sets the y ordinate for an arrow's end point. Ordinates are counted in pixels, starting from the top-left corner of the chart. 100
    *  | 450 | ...
    */
  var y: js.UndefOr[Double] = js.native
}

object AnonHook {
  @scala.inline
  def apply(): AnonHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHook]
  }
  @scala.inline
  implicit class AnonHookOps[Self <: AnonHook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHook(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-x`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-y`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-y")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

