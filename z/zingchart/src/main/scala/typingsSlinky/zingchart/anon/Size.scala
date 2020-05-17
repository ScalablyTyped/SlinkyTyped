package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Size extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that the leading zero is required before the decimal. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666
    * 699', '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100
    * , 15, 15)' | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666699'
    * , '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15
    * , 15)' | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border width of the object. 1 | 3 | '6px' | ...
    */
  var `border-width`: js.UndefOr[Double] = js.native
  /**
    * Sets the size of the pivot point. 4 | "6px" | ...
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * Sets the shape of the pivot point. 'circle' | 'diamond' | 'star5' | 'gear9' | ...
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Sets the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the x-coordinate position of the pivot point. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Sets the y-coordinate position of the pivot point. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[Double] = js.native
}

object Size {
  @scala.inline
  def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
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
    def `withBackground-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

