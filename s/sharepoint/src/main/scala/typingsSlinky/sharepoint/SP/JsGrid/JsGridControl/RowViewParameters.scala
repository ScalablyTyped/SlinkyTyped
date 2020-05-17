package typingsSlinky.sharepoint.SP.JsGrid.JsGridControl

import typingsSlinky.sharepoint.SP.JsGrid.HierarchyMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowViewParameters extends js.Object {
  var autoFilterEntries: js.Any = js.native
  var autoFilterState: js.Any = js.native
  var filterState: js.Any = js.native
  var filteredDescCounts: js.Any = js.native
  var groupingLevel: js.Any = js.native
  var groupingRecordKeyPrefix: js.Any = js.native
  var hierarchyDelayLoadKeys: js.Any = js.native
  var hierarchyMode: HierarchyMode = js.native
  var hierarchyState: js.Any = js.native
  var sortState: js.Any = js.native
  var topViewIdx: Double = js.native
  var unfilteredHierarchyMgr: js.Any = js.native
  var view: js.Any = js.native
}

object RowViewParameters {
  @scala.inline
  def apply(
    autoFilterEntries: js.Any,
    autoFilterState: js.Any,
    filterState: js.Any,
    filteredDescCounts: js.Any,
    groupingLevel: js.Any,
    groupingRecordKeyPrefix: js.Any,
    hierarchyDelayLoadKeys: js.Any,
    hierarchyMode: HierarchyMode,
    hierarchyState: js.Any,
    sortState: js.Any,
    topViewIdx: Double,
    unfilteredHierarchyMgr: js.Any,
    view: js.Any
  ): RowViewParameters = {
    val __obj = js.Dynamic.literal(autoFilterEntries = autoFilterEntries.asInstanceOf[js.Any], autoFilterState = autoFilterState.asInstanceOf[js.Any], filterState = filterState.asInstanceOf[js.Any], filteredDescCounts = filteredDescCounts.asInstanceOf[js.Any], groupingLevel = groupingLevel.asInstanceOf[js.Any], groupingRecordKeyPrefix = groupingRecordKeyPrefix.asInstanceOf[js.Any], hierarchyDelayLoadKeys = hierarchyDelayLoadKeys.asInstanceOf[js.Any], hierarchyMode = hierarchyMode.asInstanceOf[js.Any], hierarchyState = hierarchyState.asInstanceOf[js.Any], sortState = sortState.asInstanceOf[js.Any], topViewIdx = topViewIdx.asInstanceOf[js.Any], unfilteredHierarchyMgr = unfilteredHierarchyMgr.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowViewParameters]
  }
  @scala.inline
  implicit class RowViewParametersOps[Self <: RowViewParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFilterEntries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilterEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFilterState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteredDescCounts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredDescCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupingLevel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupingRecordKeyPrefix(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingRecordKeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchyDelayLoadKeys(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyDelayLoadKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchyMode(value: HierarchyMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchyState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopViewIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topViewIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfilteredHierarchyMgr(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilteredHierarchyMgr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

