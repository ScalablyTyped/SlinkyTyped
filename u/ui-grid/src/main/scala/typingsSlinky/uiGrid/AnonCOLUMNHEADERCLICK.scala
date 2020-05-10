package typingsSlinky.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCOLUMNHEADERCLICK extends js.Object {
  var COLUMN_HEADER_CLICK: String = js.native
  var COLUMN_MENU_SHOWN: String = js.native
  var GRID_SCROLL: String = js.native
  var ITEM_DRAGGING: String = js.native
}

object AnonCOLUMNHEADERCLICK {
  @scala.inline
  def apply(COLUMN_HEADER_CLICK: String, COLUMN_MENU_SHOWN: String, GRID_SCROLL: String, ITEM_DRAGGING: String): AnonCOLUMNHEADERCLICK = {
    val __obj = js.Dynamic.literal(COLUMN_HEADER_CLICK = COLUMN_HEADER_CLICK.asInstanceOf[js.Any], COLUMN_MENU_SHOWN = COLUMN_MENU_SHOWN.asInstanceOf[js.Any], GRID_SCROLL = GRID_SCROLL.asInstanceOf[js.Any], ITEM_DRAGGING = ITEM_DRAGGING.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCOLUMNHEADERCLICK]
  }
  @scala.inline
  implicit class AnonCOLUMNHEADERCLICKOps[Self <: AnonCOLUMNHEADERCLICK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCOLUMN_HEADER_CLICK(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COLUMN_HEADER_CLICK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOLUMN_MENU_SHOWN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COLUMN_MENU_SHOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGRID_SCROLL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GRID_SCROLL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withITEM_DRAGGING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ITEM_DRAGGING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

