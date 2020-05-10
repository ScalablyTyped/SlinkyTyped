package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlickGridAutoTooltipsOption extends PluginOptions {
  /**
    * Enable tooltip for grid cells
    * @default true
    */
  var enableForCells: js.UndefOr[Boolean] = js.native
  /**
    * Enable tooltip for header cells
    * @default false
    */
  var enableForHeaderCells: js.UndefOr[Boolean] = js.native
  /**
    * The maximum length for a tooltip
    * @default null
    */
  var maxToolTipLength: js.UndefOr[Double] = js.native
}

object SlickGridAutoTooltipsOption {
  @scala.inline
  def apply(): SlickGridAutoTooltipsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickGridAutoTooltipsOption]
  }
  @scala.inline
  implicit class SlickGridAutoTooltipsOptionOps[Self <: SlickGridAutoTooltipsOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableForCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableForCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableForCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableForCells")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableForHeaderCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableForHeaderCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableForHeaderCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableForHeaderCells")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxToolTipLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxToolTipLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxToolTipLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxToolTipLength")(js.undefined)
        ret
    }
  }
  
}

