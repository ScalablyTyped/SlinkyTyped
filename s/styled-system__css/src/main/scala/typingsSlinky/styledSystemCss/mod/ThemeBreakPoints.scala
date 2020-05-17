package typingsSlinky.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeBreakPoints extends Theme {
  var breakpoints: js.Array[Double | String] = js.native
}

object ThemeBreakPoints {
  @scala.inline
  def apply(breakpoints: js.Array[Double | String]): ThemeBreakPoints = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeBreakPoints]
  }
  @scala.inline
  implicit class ThemeBreakPointsOps[Self <: ThemeBreakPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoints(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

