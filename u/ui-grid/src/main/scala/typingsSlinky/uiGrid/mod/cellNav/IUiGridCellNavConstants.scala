package typingsSlinky.uiGrid.mod.cellNav

import typingsSlinky.uiGrid.AnonCLEAR
import typingsSlinky.uiGrid.AnonLEFT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUiGridCellNavConstants extends js.Object {
  var CELL_NAV_EVENT: String = js.native
  var EVENT_TYPE: AnonCLEAR = js.native
  var FEATURE_NAME: String = js.native
  var direction: AnonLEFT = js.native
}

object IUiGridCellNavConstants {
  @scala.inline
  def apply(CELL_NAV_EVENT: String, EVENT_TYPE: AnonCLEAR, FEATURE_NAME: String, direction: AnonLEFT): IUiGridCellNavConstants = {
    val __obj = js.Dynamic.literal(CELL_NAV_EVENT = CELL_NAV_EVENT.asInstanceOf[js.Any], EVENT_TYPE = EVENT_TYPE.asInstanceOf[js.Any], FEATURE_NAME = FEATURE_NAME.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridCellNavConstants]
  }
  @scala.inline
  implicit class IUiGridCellNavConstantsOps[Self <: IUiGridCellNavConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCELL_NAV_EVENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_NAV_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_TYPE(value: AnonCLEAR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TYPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFEATURE_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FEATURE_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: AnonLEFT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

