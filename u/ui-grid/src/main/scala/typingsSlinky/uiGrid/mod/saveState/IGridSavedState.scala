package typingsSlinky.uiGrid.mod.saveState

import typingsSlinky.uiGrid.mod.grouping.IGridGroupingConfiguration
import typingsSlinky.uiGrid.mod.treeBase.ITreeState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridSavedState extends js.Object {
  var columns: js.UndefOr[js.Array[ISavedColumn]] = js.native
  var grouping: IGridGroupingConfiguration = js.native
  var scrollFocus: js.UndefOr[ISavedScrollFocus] = js.native
  var selection: js.Array[IRowVal] = js.native
  var treeView: ITreeState = js.native
}

object IGridSavedState {
  @scala.inline
  def apply(grouping: IGridGroupingConfiguration, selection: js.Array[IRowVal], treeView: ITreeState): IGridSavedState = {
    val __obj = js.Dynamic.literal(grouping = grouping.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridSavedState]
  }
  @scala.inline
  implicit class IGridSavedStateOps[Self <: IGridSavedState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrouping(value: IGridGroupingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[IRowVal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeView(value: ITreeState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ISavedColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollFocus(value: ISavedScrollFocus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFocus")(js.undefined)
        ret
    }
  }
  
}

