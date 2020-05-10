package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomitems extends js.Object {
  var button: js.UndefOr[AnonMaxchars] = js.native
  var `custom-items`: js.UndefOr[js.Array[AnonFunction]] = js.native
  /**
    * To fix the position of the context menu to one side of the chart. true | false
    */
  var docked: js.UndefOr[Boolean] = js.native
  /**
    * Empties all default context-menu items, leaving just the "About ZingChart" button. true | false | 1 | 0
    */
  var empty: js.UndefOr[Boolean] = js.native
  var gear: js.UndefOr[AnonOffsety] = js.native
  var item: js.UndefOr[AnonFontcolorHoverstate] = js.native
  /**
    * To position the context menu button on the left or right side of the chart. left | right
    */
  var position: js.UndefOr[String] = js.native
}

object AnonCustomitems {
  @scala.inline
  def apply(): AnonCustomitems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCustomitems]
  }
  @scala.inline
  implicit class AnonCustomitemsOps[Self <: AnonCustomitems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: AnonMaxchars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def `withCustom-items`(value: js.Array[AnonFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom-items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCustom-items`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom-items")(js.undefined)
        ret
    }
    @scala.inline
    def withDocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docked")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withGear(value: AnonOffsety): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gear")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: AnonFontcolorHoverstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

