package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinewidthVisible extends js.Object {
  /**
    * Sets the transparency of the scale-x / scale-y guide. See the red lines. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the line color of the scale-x / scale-y guide. See the red lines. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow
    * " | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Sets the style applied to lines and borders of the scale-x / scale-y guide. See the red lines. "solid" | "dotted" | "dashed" | "da
    * shdot"
    */
  var `line-style`: js.UndefOr[String] = js.native
  /**
    * Sets the line width of the object, applicable on non-closed shapes. For the scale-x / scale-y guide. See the red lines. 4 | "6px"
    * | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object LinewidthVisible {
  @scala.inline
  def apply(): LinewidthVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinewidthVisible]
  }
  @scala.inline
  implicit class LinewidthVisibleOps[Self <: LinewidthVisible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-style`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-width`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-width")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

