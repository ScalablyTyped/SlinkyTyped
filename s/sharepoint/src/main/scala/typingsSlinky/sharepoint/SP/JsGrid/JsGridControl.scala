package typingsSlinky.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import typingsSlinky.sharepoint.SP.JsGrid.Internal.DiffTracker
import typingsSlinky.sharepoint.SP.JsGrid.JsGridControl.Parameters
import typingsSlinky.sharepoint.SP.Utilities.Set
import typingsSlinky.sharepoint.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsGridControl extends StObject {
  
  /** Adds one of builtin row state indicator icons into the row header.
    Please pass one of the values of SP.JsGrid.RowHeaderStyleId
    Row header is the leftmost gray column of the table. */
  def AddBuiltInRowHeaderState(recordKey: Double, rowHeaderStateId: String): Unit = js.native
  
  /** Adds a column, based on the specified grid field */
  def AddColumn(columnInfo: ColumnInfo, gridField: GridField): Unit = js.native
  
  /** Adds the specified state into the row header.
    There can be several row header states for one row. Only one is shown (according to the Priority).
    Row header is the leftmost gray column of the table. */
  def AddRowHeaderState(recordKey: Double, rowHeaderState: RowHeaderState): Unit = js.native
  
  /** Returns true, if there are any errors in the JsGrid */
  def AnyErrors(): Boolean = js.native
  
  /** Returns true, if there are any errors in a specified row */
  def AnyErrorsInRecord(recordKey: Double): Boolean = js.native
  
  // todo
  def AnyUncomittedProvisionalRecords(): Boolean = js.native
  
  /** Returns true if there are any unsaved new record rows (aka entry rows). */
  def AnyUncommitedEntryRecords(): Boolean = js.native
  
  /** Attach event handler to a particular event type */
  def AttachEvent(eventType: EventType, fnOnEvent: js.Function1[/* args */ IEventArgs, Unit]): Unit = js.native
  
  def CanMoveRecordsDownByOne(recordKeys: js.Any): Boolean = js.native
  
  def CanMoveRecordsUpByOne(recordKeys: js.Any): Boolean = js.native
  
  def ChangeKeys(oldKey: js.Any, newKey: js.Any): Unit = js.native
  
  def Cleanup(): Unit = js.native
  
  /** Clear all errors in the specified cell. */
  def ClearAllErrorsOnCell(recordKey: Double, fieldKey: String): Unit = js.native
  
  /** Clear all errors in the specified row. */
  def ClearAllErrorsOnRow(recordKey: Double): Unit = js.native
  
  /** Clear specified by id error that was previously set on the specified by recordKey and fieldKey cell. */
  def ClearCellError(recordKey: Double, fieldKey: String, id: Double): Unit = js.native
  
  /** Clears undo queue, and also differencies tracker state and versions manager state. */
  def ClearChanges(): Unit = js.native
  
  /** Clear specified by id error that was previously set on the specified by recordKey row. */
  def ClearRowError(recordKey: Double, id: Double): Unit = js.native
  
  def ClearTableView(): Unit = js.native
  
  /** Removes all new record rows (aka entry rows), including unsaved and even empty ones.
    The latter seems to be a bug, as I haven't found any easy way to restore the empty entry row. */
  def ClearUncommitedEntryRecords(): Unit = js.native
  
  /** Copy data from currently selected cells into the clipboard. */
  def CopyToClipboard(): Unit = js.native
  
  def CreateAndSynchronizeToNewChangeKey(): js.Any = js.native
  
  def CreateDataUpdateCmd(bUseCustomInitialUpdate: Boolean): js.Any = js.native
  
  /** Cut data from currently selected cells into the clipboard.
    Will not work if current selection contains entry row or readonly cells. */
  def CutToClipboard(): Unit = js.native
  
  def DeleteRecords(recordKeys: js.Any): js.Any = js.native
  def DeleteRecords(recordKeys: js.Any, optChangeKey: js.Any): js.Any = js.native
  
  /** Detach a previously set event handler */
  def DetachEvent(eventType: EventType, fnOnEvent: js.Any): Unit = js.native
  
  /** Covers the grid with the semi-transparent panel, preventing any operations with it.
    Additionally, displays loading animated gif and optMsg as the message next to it.
    If optMsg is not specified, displays "Loading..." text. */
  def Disable(): Unit = js.native
  def Disable(optMsg: String): Unit = js.native
  
  /** Disables grid editing: all the records become readonly */
  def DisableEditing(): Unit = js.native
  
  /** Removes all event handlers and markup associated with the control */
  def Dispose(): Unit = js.native
  
  /** Enable grid after Disable. */
  def Enable(): Unit = js.native
  
  /** Enables grid editing */
  def EnableEditing(): Unit = js.native
  
  def EnsurePaneWidth(): Unit = js.native
  
  def FinalizeEditing(fnContinue: js.Function0[Unit], fnError: js.Function0[Unit]): Unit = js.native
  
  /** Moves focus to the JsGrid control */
  def Focus(): Unit = js.native
  
  def GetAllDataJson(fnOnFinished: js.Any): Unit = js.native
  def GetAllDataJson(fnOnFinished: js.Any, optFnGetCellStyleID: js.Any): Unit = js.native
  
  /** Get error message for the specified cell.
    If many errors are set on the cell, only first is returned.
    If there are no errors in the cell, returns null. */
  def GetCellErrorMessage(recordKey: Double, fieldKey: String): String = js.native
  
  def GetChangeKeyForVersion(version: js.Any): js.Any = js.native
  
  def GetCheckSelectionManager(): js.Any = js.native
  
  /** Get ColumnInfo object by fieldKey
    @fieldKey when working with SharePoint data sources, fieldKey corresponds to field internal name */
  def GetColumnByFieldKey(fieldKey: String): ColumnInfo = js.native
  def GetColumnByFieldKey(fieldKey: String, optPaneId: js.Any): ColumnInfo = js.native
  
  def GetColumns(): js.Array[ColumnInfo] = js.native
  def GetColumns(optPaneId: String): js.Array[ColumnInfo] = js.native
  
  def GetContiguousRowSelectionWithoutEntryRecords(): Begin = js.native
  
  def GetCurrentChangeKey(): js.Any = js.native
  
  /** Get current delegate. */
  def GetDelegate(delegateKey: DelegateType): js.Any = js.native
  
  /** Get diff tracker object that tracks changes to the grid data. */
  def GetDiffTracker(): DiffTracker = js.native
  
  /** Get entry record with the specified key.
    Entry record is a special type of record because it represents a new record that doesn't exist yet. */
  def GetEntryRecord(key: js.Any): js.Any = js.native
  
  def GetFocusedItem(): js.Any = js.native
  
  def GetGanttZoomLevel(): js.Any = js.native
  
  def GetHierarchyQueryObject(): js.Any = js.native
  
  def GetHierarchyState(bDecompressGuidKeys: Boolean): js.Any = js.native
  
  def GetLastRecordKey(): String = js.native
  
  def GetLeftColumnIndex(): js.Any = js.native
  def GetLeftColumnIndex(optPaneId: js.Any): js.Any = js.native
  
  def GetNodeExpandCollapseState(recordKey: Double): js.Any = js.native
  
  def GetOutlineLevel(record: js.Any): js.Any = js.native
  
  /** Gets record based on the recordKey
    @recordKey internal unique id of a row. You can get recordKey from view index via GetRecordKeyByViewIndex method. */
  def GetRecord(recordKey: Double): IRecord = js.native
  
  /** Returns index of the system RecordIndicatorCheckBoxColumn. If not present in the view, returns null. */
  def GetRecordIndicatorCheckBoxColumnIndex(): Double = js.native
  
  /** Get record key for a row that is specified by the viewIdx.
    viewIdx - index of the row in the view, use GetTopRecordIndex to get the first one.
    Returns recordKey, which is a unique numeric identifier of a row within a dataset.
    Main difference between viewIdx and recordKey is that viewIdx is only unique within a view,
    e.g. if you do paging, it can be same for different records.
    */
  def GetRecordKeyByViewIndex(viewIdx: Double): Double = js.native
  
  def GetReorderRange(recordKeys: js.Any): js.Any = js.native
  
  /** Get error message for the specified row.
    If many errors are set on the row, only first is returned.
    If there are no errors in the row, returns null. */
  def GetRowErrorMessage(recordKey: Double): String = js.native
  
  def GetSelectedColumnRanges(): js.Any = js.native
  def GetSelectedColumnRanges(optPaneId: js.Any): js.Any = js.native
  
  def GetSelectedRanges(): js.Any = js.native
  def GetSelectedRanges(optPaneId: js.Any): js.Any = js.native
  
  def GetSelectedRecordKeys(bDuplicatesAllowed: Boolean): js.Any = js.native
  
  def GetSelectedRowRanges(): js.Any = js.native
  def GetSelectedRowRanges(optPaneId: js.Any): js.Any = js.native
  
  def GetSpCsrRenderCtx(): js.Any = js.native
  
  def GetSplitterPosition(): js.Any = js.native
  
  /** Get top record view index.
    You can then use GetRecordKeyByViewIndex to convert this value into the recordKey. */
  def GetTopRecordIndex(): Double = js.native
  
  /** Get top row index. Usually returns 0.
    You can then use GetRecordKeyByViewIndex to convert this value into the recordKey. */
  def GetTopRowIndex(): Double = js.native
  
  /** Get undo manager for performing undo/redo operations programmatically. */
  def GetUndoManager(): CommandManager = js.native
  
  def GetUnfilteredHierarchyMap(): js.Any = js.native
  
  /** Opposite to GetRecordKeyByViewIndex, resolves the view index of the record based on record key.
    recordKey - unique numeric identifier of a row in the current dataset.
    Returns viewIdx - index of the row in the current view */
  def GetViewIndexOfRecord(recordKey: Double): Double = js.native
  
  /** Get number of rows displayed in the current view. */
  def GetViewRecordCount(): Double = js.native
  
  /** Gets number of records visible in the current view, including the entry row. */
  def GetVisibleRecordCount(): Double = js.native
  
  /** Hide the specified column from grid */
  def HideColumn(columnKey: String): Unit = js.native
  
  def HideInitialLoadingBanner(): Unit = js.native
  
  def IndentRecords(recordKeys: js.Any): js.Any = js.native
  def IndentRecords(recordKeys: js.Any, optChangeKey: js.Any): js.Any = js.native
  
  /** Initialize the control */
  def Init(parameters: Parameters): Unit = js.native
  
  def InsertHiddenRecord(recordKey: Double, changeKey: js.Any): js.Any = js.native
  def InsertHiddenRecord(recordKey: Double, changeKey: js.Any, optAfterRecordKey: js.Any): js.Any = js.native
  
  def InsertProvisionalRecordAfter(afterRecordKey: Double, newRecord: js.Any, initialValues: js.Any): js.Any = js.native
  
  def InsertProvisionalRecordBefore(beforeRecordKey: Double, newRecord: js.Any, initialValues: js.Any): js.Any = js.native
  
  def InsertRecordAfter(afterRecordKey: Double, newRecord: js.Any): js.Any = js.native
  def InsertRecordAfter(afterRecordKey: Double, newRecord: js.Any, optChangeKey: js.Any): js.Any = js.native
  
  def InsertRecordBefore(beforeRecordKey: Double, newRecord: js.Any): js.Any = js.native
  def InsertRecordBefore(beforeRecordKey: Double, newRecord: js.Any, optChangeKey: js.Any): js.Any = js.native
  
  /** Determine whether the specified cell is editable. */
  def IsCellEditable(record: IRecord, fieldKey: String): Boolean = js.native
  def IsCellEditable(record: IRecord, fieldKey: String, optPaneId: js.Any): Boolean = js.native
  
  def IsChangeKeyApplied(changeKey: js.Any): js.Any = js.native
  
  /** Determine if the specified record key identifies valid entry row. */
  def IsEntryRecord(recordKey: Double): Boolean = js.native
  
  def IsGroupingColumnKey(recordKey: Double): Boolean = js.native
  
  def IsGroupingRecordKey(recordKey: Double): Boolean = js.native
  
  /** Returns true if Init method has been executed successfully */
  def IsInitialized(): Boolean = js.native
  
  def IsProvisionalRecordKey(recordKey: Double): Boolean = js.native
  
  /** Determines if the specified record is visible in the current view. */
  def IsRecordVisibleInView(recordKey: Double): Boolean = js.native
  
  /** Moves cursor to entry record (the row that is used to add new records) */
  def JumpToEntryRecord(): Unit = js.native
  
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.UndefOr[scala.Nothing],
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.UndefOr[scala.Nothing],
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any
  ): Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: String,
    bEnableGantt: Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): Unit = js.native
  
  def MarkPropUpdateInvalid(recordKey: Double, fieldKey: js.Any, changeKey: js.Any): js.Any = js.native
  def MarkPropUpdateInvalid(recordKey: Double, fieldKey: js.Any, changeKey: js.Any, optErrorMsg: js.Any): js.Any = js.native
  
  def MoveRecordsDownByOne(recordKeys: js.Any): js.Any = js.native
  
  def MoveRecordsUpByOne(recordKeys: js.Any): js.Any = js.native
  
  // todo
  def NotifyDataAvailable(): Unit = js.native
  
  def NotifyHide(): Unit = js.native
  
  def NotifyResize(): Unit = js.native
  
  def NotifySave(): Unit = js.native
  
  def OutdentRecords(recordKeys: js.Any): js.Any = js.native
  def OutdentRecords(recordKeys: js.Any, optChangeKey: js.Any): js.Any = js.native
  
  /** Paste data from clipboard into currently selected cells. */
  def PasteFromClipboard(): Unit = js.native
  
  /** Re-render all rows in the view.
    It can be used e.g. if you have some custom display controls and they are rendered differently depending on some external settings.
    In this case, if you update the external settings, obviously you have to then update the view for these settings to take effect. */
  def RefreshAllRows(): Unit = js.native
  
  /** Re-render the specified row in the view. */
  def RefreshRow(recordKey: Double): Unit = js.native
  
  /** Removes header state with specified id from the row. */
  def RemoveRowHeaderState(recordKey: Double, rowHeaderStateId: String): Unit = js.native
  
  /** Switches column header in rename mode, showing textbox and thus giving the user possibility to rename this column. */
  def RenameColumn(columnKey: String): Unit = js.native
  
  def ReorderRecords(beginRecordKey: Double, endRecordKey: Double, afterRecordKey: Double, bSelectAfterwards: Boolean): js.Any = js.native
  
  /** Replaces the control TableCache object with the provided one */
  def ResetData(cache: TableCache): Unit = js.native
  
  def ScrollGanttToDate(date: js.Any): Unit = js.native
  
  /** This method is used mostly when you have a rather tall JSGrid and you want to ensure that user sees
    that some error has occured.
    You can specify the minId or/and filter function.
    If minId is specified, method searches for an error with first id which is greater than minId.
    Scrolls to the Returns the id of the found record.
    If there aren't any errors, that satisfy the conditions, method does nothing and returns null. */
  def ScrollToAndExpandNextError(): js.Any = js.native
  def ScrollToAndExpandNextError(
    minId: js.UndefOr[scala.Nothing],
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean]
  ): js.Any = js.native
  def ScrollToAndExpandNextError(minId: Double): js.Any = js.native
  def ScrollToAndExpandNextError(
    minId: Double,
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean]
  ): js.Any = js.native
  
  /** Same as ScrollToAndExpandNextError, but searches within the specified record.
    recordKey should be not null, otherwise you'll get an exception.
    bDontExpand controls whether the error tooltip will be shown (if bDontExpand=true, tooltip will not be shown). */
  def ScrollToAndExpandNextErrorOnRecord(): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: js.UndefOr[scala.Nothing],
    recordKey: js.UndefOr[scala.Nothing],
    fnFilter: js.UndefOr[scala.Nothing],
    bDontExpand: Boolean
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: js.UndefOr[scala.Nothing],
    recordKey: js.UndefOr[scala.Nothing],
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean]
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: js.UndefOr[scala.Nothing],
    recordKey: js.UndefOr[scala.Nothing],
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean],
    bDontExpand: Boolean
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(minId: js.UndefOr[scala.Nothing], recordKey: Double): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: js.UndefOr[scala.Nothing],
    recordKey: Double,
    fnFilter: js.UndefOr[scala.Nothing],
    bDontExpand: Boolean
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: js.UndefOr[scala.Nothing],
    recordKey: Double,
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean]
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: js.UndefOr[scala.Nothing],
    recordKey: Double,
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean],
    bDontExpand: Boolean
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(minId: Double): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: Double,
    recordKey: js.UndefOr[scala.Nothing],
    fnFilter: js.UndefOr[scala.Nothing],
    bDontExpand: Boolean
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: Double,
    recordKey: js.UndefOr[scala.Nothing],
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean]
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: Double,
    recordKey: js.UndefOr[scala.Nothing],
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean],
    bDontExpand: Boolean
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(minId: Double, recordKey: Double): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(minId: Double, recordKey: Double, fnFilter: js.UndefOr[scala.Nothing], bDontExpand: Boolean): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: Double,
    recordKey: Double,
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean]
  ): js.Any = js.native
  def ScrollToAndExpandNextErrorOnRecord(
    minId: Double,
    recordKey: Double,
    fnFilter: js.Function3[/* recordKey */ Double, /* fieldKey */ String, /* id */ Double, Boolean],
    bDontExpand: Boolean
  ): js.Any = js.native
  
  def SelectCellRange(rowIdx1: Double, rowIdx2: Double, colIdx1: Double, colIdx2: Double, bAppend: Boolean): Unit = js.native
  def SelectCellRange(
    rowIdx1: Double,
    rowIdx2: Double,
    colIdx1: Double,
    colIdx2: Double,
    bAppend: Boolean,
    optPaneId: String
  ): Unit = js.native
  
  def SelectCellRangeByKey(recordKey1: String, recordKey2: String, colKey1: js.Any, colKey2: js.Any, bAppend: Boolean): Unit = js.native
  def SelectCellRangeByKey(
    recordKey1: String,
    recordKey2: String,
    colKey1: js.Any,
    colKey2: js.Any,
    bAppend: Boolean,
    optPaneId: String
  ): Unit = js.native
  
  def SelectColumnRange(colIdx1: Double, colIdx2: Double, bAppend: Boolean): Unit = js.native
  def SelectColumnRange(colIdx1: Double, colIdx2: Double, bAppend: Boolean, optPaneId: String): Unit = js.native
  
  def SelectColumnRangeByKey(colKey1: js.Any, colKey2: js.Any, bAppend: Boolean): Unit = js.native
  def SelectColumnRangeByKey(colKey1: js.Any, colKey2: js.Any, bAppend: Boolean, optPaneId: String): Unit = js.native
  
  def SelectRowRange(rowIdx1: Double, rowIdx2: Double, bAppend: Boolean): Unit = js.native
  def SelectRowRange(rowIdx1: Double, rowIdx2: Double, bAppend: Boolean, optPaneId: String): Unit = js.native
  
  def SelectRowRangeByKey(rowKey1: js.Any, rowKey2: js.Any, bAppend: Boolean): Unit = js.native
  def SelectRowRangeByKey(rowKey1: js.Any, rowKey2: js.Any, bAppend: Boolean, optPaneId: String): Unit = js.native
  
  def SendKeyDownEvent(eventInfo: DomEvent): js.Any = js.native
  
  /** Set error for the specified by recordKey and fieldKey cell.
    Returns id of the error, so that later you can clear the error using this id. */
  def SetCellError(recordKey: Double, fieldKey: String, errorMessage: String): Double = js.native
  
  /** Set a delegate. Delegates are way to replace default functionality with custom one. */
  def SetDelegate(delegateKey: DelegateType, fn: js.Any): Unit = js.native
  
  def SetGanttZoomLevel(level: js.Any): Unit = js.native
  
  /** Set error for the specified by recordKey row.
    In the leftmost column of this row, exclamation mark error indicator will appear.
    Clicking on this indicator will cause the specified error message appear in form of a reddish tooltip.
    Returns id of the error, so that later you can clear the error using this id. */
  def SetRowError(recordKey: Double, errorMessage: String): Double = js.native
  
  def SetRowView(rowViewParam: js.Any): Unit = js.native
  
  def SetSplitterPosition(pos: js.Any): Unit = js.native
  
  def SetTableView(tableViewParams: js.Any): Unit = js.native
  
  /** Show a previously hidden column at a specified position.
    If atIdx is not defined, column will be shown at it's previous position. */
  def ShowColumn(columnKey: String): Unit = js.native
  def ShowColumn(columnKey: String, atIdx: Double): Unit = js.native
  
  /** Shows a dialog where user can reorder columns and change their widths. */
  def ShowColumnConfigurationDialog(): Unit = js.native
  
  def ShowGridErrorMsg(errorMsg: String): Unit = js.native
  
  def ShowInitialGridErrorMsg(errorMsg: String): Unit = js.native
  
  def ToggleExpandCollapse(recordKey: Double): Unit = js.native
  
  /** Switches the currently selected cell into edit mode: displays edit control and sets focus into it.
    Returns true if success. */
  def TryBeginEdit(): Boolean = js.native
  
  /** Try saving the new record row (aka entry row) if it was edited. */
  def TryCommitFirstEntryRecords(fnCommitComplete: js.Function0[Unit]): Unit = js.native
  
  def TryReadPropForChangeKey(recordKey: Double, fieldKey: js.Any, changeKey: js.Any): js.Any = js.native
  
  def TryRestoreFocusAfterInsertOrDeleteColumns(origFocus: js.Any): Unit = js.native
  
  /** Update column descriptions */
  def UpdateColumns(columnInfoCollection: ColumnInfoCollection): Unit = js.native
  
  def UpdateProperties(propertyUpdates: js.Any, changeName: js.Any): js.Any = js.native
  def UpdateProperties(propertyUpdates: js.Any, changeName: js.Any, optChangeKey: js.Any): js.Any = js.native
}
object JsGridControl {
  
  @js.native
  trait GanttParameters extends StObject {
    
    var columns: ColumnInfoCollection = js.native
  }
  object GanttParameters {
    
    @scala.inline
    def apply(columns: ColumnInfoCollection): GanttParameters = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[GanttParameters]
    }
    
    @scala.inline
    implicit class GanttParametersMutableBuilder[Self <: GanttParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: ColumnInfoCollection): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Parameters extends StObject {
    
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
    implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBEnableDiffTracking(value: Boolean): Self = StObject.set(x, "bEnableDiffTracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBNotificationsEnabled(value: Boolean): Self = StObject.set(x, "bNotificationsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandMgr(value: CommandManager): Self = StObject.set(x, "commandMgr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledRowHeaderAutoStates(value: Set): Self = StObject.set(x, "enabledRowHeaderAutoStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeaderHeight(value: Double): Self = StObject.set(x, "minHeaderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleManager(value: IStyleManager): Self = StObject.set(x, "styleManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableCache(value: TableCache): Self = StObject.set(x, "tableCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableViewParams(value: TableViewParameters): Self = StObject.set(x, "tableViewParams", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PivotedGridParameters extends StObject
  
  @js.native
  trait RowViewParameters extends StObject {
    
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
    implicit class RowViewParametersMutableBuilder[Self <: RowViewParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFilterEntries(value: js.Any): Self = StObject.set(x, "autoFilterEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFilterState(value: js.Any): Self = StObject.set(x, "autoFilterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterState(value: js.Any): Self = StObject.set(x, "filterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredDescCounts(value: js.Any): Self = StObject.set(x, "filteredDescCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingLevel(value: js.Any): Self = StObject.set(x, "groupingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingRecordKeyPrefix(value: js.Any): Self = StObject.set(x, "groupingRecordKeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHierarchyDelayLoadKeys(value: js.Any): Self = StObject.set(x, "hierarchyDelayLoadKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHierarchyMode(value: HierarchyMode): Self = StObject.set(x, "hierarchyMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHierarchyState(value: js.Any): Self = StObject.set(x, "hierarchyState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortState(value: js.Any): Self = StObject.set(x, "sortState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopViewIdx(value: Double): Self = StObject.set(x, "topViewIdx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfilteredHierarchyMgr(value: js.Any): Self = StObject.set(x, "unfilteredHierarchyMgr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: js.Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableViewParameters extends StObject {
    
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
    implicit class TableViewParametersMutableBuilder[Self <: TableViewParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedSelectionTypes(value: SelectionTypeFlags): Self = StObject.set(x, "allowedSelectionTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBAutoFilterableColumns(value: Boolean): Self = StObject.set(x, "bAutoFilterableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBEditingEnabled(value: Boolean): Self = StObject.set(x, "bEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBFillControlEnabled(value: Boolean): Self = StObject.set(x, "bFillControlEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBHidableColumns(value: Boolean): Self = StObject.set(x, "bHidableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBMovableColumns(value: Boolean): Self = StObject.set(x, "bMovableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBNewRowEnabled(value: Boolean): Self = StObject.set(x, "bNewRowEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBRecordIndicatorCheckboxesEnabled(value: Boolean): Self = StObject.set(x, "bRecordIndicatorCheckboxesEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBResizableColumns(value: Boolean): Self = StObject.set(x, "bResizableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBRowHeadersEnabled(value: Boolean): Self = StObject.set(x, "bRowHeadersEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBSortableColumns(value: Boolean): Self = StObject.set(x, "bSortableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckSelectionCheckboxDisabledRecordKeys(value: js.Array[String]): Self = StObject.set(x, "checkSelectionCheckboxDisabledRecordKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckSelectionCheckboxDisabledRecordKeysVarargs(value: String*): Self = StObject.set(x, "checkSelectionCheckboxDisabledRecordKeys", js.Array(value :_*))
      
      @scala.inline
      def setCheckSelectionCheckboxHiddenRecordKeys(value: js.Array[String]): Self = StObject.set(x, "checkSelectionCheckboxHiddenRecordKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckSelectionCheckboxHiddenRecordKeysVarargs(value: String*): Self = StObject.set(x, "checkSelectionCheckboxHiddenRecordKeys", js.Array(value :_*))
      
      @scala.inline
      def setCheckSelectionCheckedRecordKeys(value: js.Array[String]): Self = StObject.set(x, "checkSelectionCheckedRecordKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckSelectionCheckedRecordKeysVarargs(value: String*): Self = StObject.set(x, "checkSelectionCheckedRecordKeys", js.Array(value :_*))
      
      @scala.inline
      def setColumns(value: ColumnInfoCollection): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEditMode(value: EditMode): Self = StObject.set(x, "defaultEditMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGanttParams(value: GanttParameters): Self = StObject.set(x, "ganttParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridFieldMap(value: StringDictionary[GridField]): Self = StObject.set(x, "gridFieldMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFieldName(value: String): Self = StObject.set(x, "keyFieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageOverrides(value: js.Any): Self = StObject.set(x, "messageOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationalConstantsFieldKeyMap(value: js.Any): Self = StObject.set(x, "operationalConstantsFieldKeyMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaneLayout(value: PaneLayout): Self = StObject.set(x, "paneLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotedGridParams(value: PivotedGridParameters): Self = StObject.set(x, "pivotedGridParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowViewParams(value: RowViewParameters): Self = StObject.set(x, "rowViewParams", value.asInstanceOf[js.Any])
    }
  }
}
