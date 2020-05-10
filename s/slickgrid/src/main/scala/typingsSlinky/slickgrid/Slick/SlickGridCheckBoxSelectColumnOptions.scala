package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlickGridCheckBoxSelectColumnOptions extends PluginOptions {
  /**
    * Column to add the checkbox to
    * @default "_checkbox_selector"
    */
  var columnId: js.UndefOr[String] = js.native
  /**
    * CSS class to be added to cells in this column
    * @default null
    */
  var cssClass: js.UndefOr[String] = js.native
  /**
    * Tooltip text to display for this column
    * @default "Select/Deselect All"
    */
  var toolTip: js.UndefOr[String] = js.native
  /**
    * Width of the column
    * @default 30
    */
  var width: js.UndefOr[Double] = js.native
}

object SlickGridCheckBoxSelectColumnOptions {
  @scala.inline
  def apply(): SlickGridCheckBoxSelectColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickGridCheckBoxSelectColumnOptions]
  }
  @scala.inline
  implicit class SlickGridCheckBoxSelectColumnOptionsOps[Self <: SlickGridCheckBoxSelectColumnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withToolTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(js.undefined)
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
  }
  
}

