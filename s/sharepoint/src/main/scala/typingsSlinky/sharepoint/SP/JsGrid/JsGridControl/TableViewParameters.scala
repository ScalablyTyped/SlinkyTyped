package typingsSlinky.sharepoint.SP.JsGrid.JsGridControl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.SP.JsGrid.ColumnInfoCollection
import typingsSlinky.sharepoint.SP.JsGrid.EditMode
import typingsSlinky.sharepoint.SP.JsGrid.GridField
import typingsSlinky.sharepoint.SP.JsGrid.PaneLayout
import typingsSlinky.sharepoint.SP.JsGrid.SelectionTypeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableViewParameters extends js.Object {
  var allowedSelectionTypes: SelectionTypeFlags = js.native
  var bAutoFilterableColumns: Boolean = js.native
  var bEditingEnabled: Boolean = js.native
  var bFillControlEnabled: Boolean = js.native
  var bHidableColumns: Boolean = js.native
  var bMovableColumns: Boolean = js.native
  var bNewRowEnabled: Boolean = js.native
  var bRecordIndicatorCheckboxesEnabled: Boolean = js.native
  var bResizableColumns: Boolean = js.native
  var bRowHeadersEnabled: Boolean = js.native
  var bSortableColumns: Boolean = js.native
  var checkSelectionCheckboxDisabledRecordKeys: js.Array[String] = js.native
  var checkSelectionCheckboxHiddenRecordKeys: js.Array[String] = js.native
  var checkSelectionCheckedRecordKeys: js.Array[String] = js.native
  var columns: ColumnInfoCollection = js.native
  var defaultEditMode: EditMode = js.native
   // TODO
  var ganttParams: GanttParameters = js.native
  var gridFieldMap: StringDictionary[GridField] = js.native
  var keyFieldName: String = js.native
  var messageOverrides: js.Any = js.native
   // TODO
  var operationalConstantsFieldKeyMap: js.Any = js.native
  var paneLayout: PaneLayout = js.native
  var pivotedGridParams: PivotedGridParameters = js.native
  var rowViewParams: RowViewParameters = js.native
}

object TableViewParameters {
  @scala.inline
  def apply(
    allowedSelectionTypes: SelectionTypeFlags,
    bAutoFilterableColumns: Boolean,
    bEditingEnabled: Boolean,
    bFillControlEnabled: Boolean,
    bHidableColumns: Boolean,
    bMovableColumns: Boolean,
    bNewRowEnabled: Boolean,
    bRecordIndicatorCheckboxesEnabled: Boolean,
    bResizableColumns: Boolean,
    bRowHeadersEnabled: Boolean,
    bSortableColumns: Boolean,
    checkSelectionCheckboxDisabledRecordKeys: js.Array[String],
    checkSelectionCheckboxHiddenRecordKeys: js.Array[String],
    checkSelectionCheckedRecordKeys: js.Array[String],
    columns: ColumnInfoCollection,
    defaultEditMode: EditMode,
    ganttParams: GanttParameters,
    gridFieldMap: StringDictionary[GridField],
    keyFieldName: String,
    messageOverrides: js.Any,
    operationalConstantsFieldKeyMap: js.Any,
    paneLayout: PaneLayout,
    pivotedGridParams: PivotedGridParameters,
    rowViewParams: RowViewParameters
  ): TableViewParameters = {
    val __obj = js.Dynamic.literal(allowedSelectionTypes = allowedSelectionTypes.asInstanceOf[js.Any], bAutoFilterableColumns = bAutoFilterableColumns.asInstanceOf[js.Any], bEditingEnabled = bEditingEnabled.asInstanceOf[js.Any], bFillControlEnabled = bFillControlEnabled.asInstanceOf[js.Any], bHidableColumns = bHidableColumns.asInstanceOf[js.Any], bMovableColumns = bMovableColumns.asInstanceOf[js.Any], bNewRowEnabled = bNewRowEnabled.asInstanceOf[js.Any], bRecordIndicatorCheckboxesEnabled = bRecordIndicatorCheckboxesEnabled.asInstanceOf[js.Any], bResizableColumns = bResizableColumns.asInstanceOf[js.Any], bRowHeadersEnabled = bRowHeadersEnabled.asInstanceOf[js.Any], bSortableColumns = bSortableColumns.asInstanceOf[js.Any], checkSelectionCheckboxDisabledRecordKeys = checkSelectionCheckboxDisabledRecordKeys.asInstanceOf[js.Any], checkSelectionCheckboxHiddenRecordKeys = checkSelectionCheckboxHiddenRecordKeys.asInstanceOf[js.Any], checkSelectionCheckedRecordKeys = checkSelectionCheckedRecordKeys.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], defaultEditMode = defaultEditMode.asInstanceOf[js.Any], ganttParams = ganttParams.asInstanceOf[js.Any], gridFieldMap = gridFieldMap.asInstanceOf[js.Any], keyFieldName = keyFieldName.asInstanceOf[js.Any], messageOverrides = messageOverrides.asInstanceOf[js.Any], operationalConstantsFieldKeyMap = operationalConstantsFieldKeyMap.asInstanceOf[js.Any], paneLayout = paneLayout.asInstanceOf[js.Any], pivotedGridParams = pivotedGridParams.asInstanceOf[js.Any], rowViewParams = rowViewParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewParameters]
  }
  @scala.inline
  implicit class TableViewParametersOps[Self <: TableViewParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedSelectionTypes(value: SelectionTypeFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSelectionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBAutoFilterableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bAutoFilterableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBEditingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bEditingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBFillControlEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bFillControlEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBHidableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bHidableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBMovableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bMovableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBNewRowEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bNewRowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRecordIndicatorCheckboxesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bRecordIndicatorCheckboxesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBResizableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bResizableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRowHeadersEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bRowHeadersEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBSortableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bSortableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckSelectionCheckboxDisabledRecordKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSelectionCheckboxDisabledRecordKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckSelectionCheckboxHiddenRecordKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSelectionCheckboxHiddenRecordKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckSelectionCheckedRecordKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSelectionCheckedRecordKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: ColumnInfoCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultEditMode(value: EditMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEditMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGanttParams(value: GanttParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ganttParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridFieldMap(value: StringDictionary[GridField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridFieldMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageOverrides(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationalConstantsFieldKeyMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalConstantsFieldKeyMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaneLayout(value: PaneLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivotedGridParams(value: PivotedGridParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotedGridParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowViewParams(value: RowViewParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowViewParams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

