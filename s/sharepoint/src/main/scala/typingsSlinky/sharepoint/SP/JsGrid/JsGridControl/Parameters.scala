package typingsSlinky.sharepoint.SP.JsGrid.JsGridControl

import typingsSlinky.sharepoint.SP.JsGrid.CommandManager
import typingsSlinky.sharepoint.SP.JsGrid.IStyleManager
import typingsSlinky.sharepoint.SP.JsGrid.TableCache
import typingsSlinky.sharepoint.SP.Utilities.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  var bEnableDiffTracking: Boolean = js.native
   // TODO
  var bNotificationsEnabled: Boolean = js.native
  var commandMgr: CommandManager = js.native
  var enabledRowHeaderAutoStates: Set = js.native
  var isRTL: Boolean = js.native
  var minHeaderHeight: Double = js.native
  var minRowHeight: Double = js.native
  var name: js.Any = js.native
  var styleManager: IStyleManager = js.native
  var tableCache: TableCache = js.native
  var tableViewParams: TableViewParameters = js.native
}

object Parameters {
  @scala.inline
  def apply(
    bEnableDiffTracking: Boolean,
    bNotificationsEnabled: Boolean,
    commandMgr: CommandManager,
    enabledRowHeaderAutoStates: Set,
    isRTL: Boolean,
    minHeaderHeight: Double,
    minRowHeight: Double,
    name: js.Any,
    styleManager: IStyleManager,
    tableCache: TableCache,
    tableViewParams: TableViewParameters
  ): Parameters = {
    val __obj = js.Dynamic.literal(bEnableDiffTracking = bEnableDiffTracking.asInstanceOf[js.Any], bNotificationsEnabled = bNotificationsEnabled.asInstanceOf[js.Any], commandMgr = commandMgr.asInstanceOf[js.Any], enabledRowHeaderAutoStates = enabledRowHeaderAutoStates.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], minHeaderHeight = minHeaderHeight.asInstanceOf[js.Any], minRowHeight = minRowHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any], tableCache = tableCache.asInstanceOf[js.Any], tableViewParams = tableViewParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBEnableDiffTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bEnableDiffTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBNotificationsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bNotificationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandMgr(value: CommandManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandMgr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabledRowHeaderAutoStates(value: Set): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledRowHeaderAutoStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleManager(value: IStyleManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableCache(value: TableCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableViewParams(value: TableViewParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableViewParams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

