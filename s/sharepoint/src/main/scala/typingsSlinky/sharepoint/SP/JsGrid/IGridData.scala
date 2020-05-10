package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IGridData extends js.Object {
  var AdditionalParams: js.UndefOr[js.Any] = js.native
  var AutoFilterEntries: js.UndefOr[js.Any] = js.native
  var AutoFilterState: js.UndefOr[js.Any] = js.native
  var AutoFilterableColumns: js.UndefOr[Boolean] = js.native
  var CellStyles: js.UndefOr[js.Any] = js.native
  var Columns: js.Array[IColumnInfo] = js.native
  var Fields: js.Array[IFieldInfo] = js.native
  var GanttInfo: js.UndefOr[js.Any] = js.native
  var GroupingGridRowStyleIds: js.UndefOr[js.Array[_]] = js.native
  var HierarchyState: js.UndefOr[js.Any] = js.native
  var LocalizedTable: js.Array[_] = js.native
  var LookupTableInfo: js.UndefOr[js.Array[ILookupTableInfo]] = js.native
  var MetaData: IGridMetadata = js.native
  var MultiValueSeparator: js.UndefOr[String] = js.native
  var PaneLayout: js.UndefOr[typingsSlinky.sharepoint.SP.JsGrid.PaneLayout] = js.native
  var PivotedColumns: js.UndefOr[js.Array[ColumnInfo]] = js.native
  var RecordCount: js.UndefOr[Double] = js.native
  var SortState: js.UndefOr[js.Array[_]] = js.native
  var TopRecord: js.UndefOr[Double] = js.native
  var UnfilteredHierarchy: js.UndefOr[js.Any] = js.native
  var UnlocalizedTable: js.Array[_] = js.native
  var ViewDepKeys: js.UndefOr[js.Array[_]] = js.native
  var ViewInfo: js.Array[_] = js.native
}

object IGridData {
  @scala.inline
  def apply(
    Columns: js.Array[IColumnInfo],
    Fields: js.Array[IFieldInfo],
    LocalizedTable: js.Array[_],
    MetaData: IGridMetadata,
    UnlocalizedTable: js.Array[_],
    ViewInfo: js.Array[_]
  ): IGridData = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], LocalizedTable = LocalizedTable.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], UnlocalizedTable = UnlocalizedTable.asInstanceOf[js.Any], ViewInfo = ViewInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridData]
  }
  @scala.inline
  implicit class IGridDataOps[Self <: IGridData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[IColumnInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[IFieldInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalizedTable(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalizedTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaData(value: IGridMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlocalizedTable(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnlocalizedTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewInfo(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFilterEntries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFilterEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFilterEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFilterEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFilterState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFilterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFilterState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFilterState")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFilterableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFilterableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFilterableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFilterableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withCellStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withGanttInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GanttInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGanttInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GanttInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingGridRowStyleIds(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingGridRowStyleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingGridRowStyleIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingGridRowStyleIds")(js.undefined)
        ret
    }
    @scala.inline
    def withHierarchyState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyState")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupTableInfo(value: js.Array[ILookupTableInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookupTableInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupTableInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookupTableInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiValueSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withPaneLayout(value: PaneLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaneLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaneLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaneLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotedColumns(value: js.Array[ColumnInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PivotedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PivotedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSortState(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortState")(js.undefined)
        ret
    }
    @scala.inline
    def withTopRecord(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withUnfilteredHierarchy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnfilteredHierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnfilteredHierarchy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnfilteredHierarchy")(js.undefined)
        ret
    }
    @scala.inline
    def withViewDepKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewDepKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewDepKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewDepKeys")(js.undefined)
        ret
    }
  }
  
}

