package typingsSlinky.senchaTouch.Ext

import typingsSlinky.senchaTouch.Ext.data.IModel
import typingsSlinky.senchaTouch.Ext.data.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.mixin.ISelectable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined allowDeselect, deselectOnContainerClick, disableSelection, locked, mode, clearSelections, deselect, deselectAll, doDeselect, doSelect, getAllowDeselect, getCount, getDeselectOnContainerClick, getDisableSelection, getLastSelected, getMode, getSelection, getSelectionCount, getSelectionMode, hasSelection, isLocked, isSelected, select, selectAll, selectRange, setAllowDeselect, setDeselectOnContainerClick, setDisableSelection, setLastFocused, setMode, updateLastFocused */ @js.native
trait IDataView extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  /** [Method] Binds a new Store to this DataView  */
  var bindStore: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole  */
  var collectData: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object[]) */
  @JSName("data")
  var data_IDataView: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects the given record s
  		* @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
  		* @param suppressEvent Boolean If true the deselect event will not be fired.
  		*/
  var deselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Deselects all records
  		* @param supress Object
  		*/
  var deselectAll: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param suppressEvent Boolean Set to false to not fire a deselect event.
  		*/
  var doDeselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event.
  		*/
  var doSelect: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one  */
  var findItemByChild: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found  */
  var findTargetByEvent: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of data
  		* @returns Object[]
  		*/
  @JSName("getData")
  var getData_IDataView: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of deferEmptyText
  		* @returns Boolean
  		*/
  var getDeferEmptyText: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of emptyText
  		* @returns String
  		*/
  var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of inline
  		* @returns Boolean/Object
  		*/
  var getInline: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an item at the specified index
  		* @param index Number Index of the item.
  		* @returns Ext.dom.Element/Ext.dataview.component.DataItem item Item at the specified index.
  		*/
  var getItemAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns the value of itemCls
  		* @returns String
  		*/
  var getItemCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of itemConfig
  		* @returns Object
  		*/
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an index for the specified item
  		* @param item Number The item to locate.
  		* @returns Number Index for the specified item.
  		*/
  var getItemIndex: js.UndefOr[js.Function1[/* item */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Returns the value of itemTpl
  		* @returns String/String[]/Ext.XTemplate
  		*/
  var getItemTpl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the array of previously selected items
  		* @returns Array The previous selection.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of loadingText
  		* @returns String/Boolean
  		*/
  var getLoadingText: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of maxItemCache
  		* @returns Number
  		*/
  var getMaxItemCache: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Gets a template node  */
  var getNode: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets a range nodes  */
  var getNodes: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of pressedDelay
  		* @returns Number
  		*/
  var getPressedDelay: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets an array of the records from an array of nodes  */
  var getRecords: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of scrollToTopOnRefresh
  		* @returns Boolean
  		*/
  var getScrollToTopOnRefresh: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of selectedCls
  		* @returns String
  		*/
  var getSelectedCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Gets the currently selected nodes  */
  var getSelectedNodes: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets an array of the selected records  */
  var getSelectedRecords: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns an array of the currently selected records
  		* @returns Array An array of selected records.
  		*/
  var getSelection: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the selection mode currently used by this Selectable
  		* @returns String The current mode.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store/Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of triggerCtEvent
  		* @returns String
  		*/
  var getTriggerCtEvent: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of triggerEvent
  		* @returns String
  		*/
  var getTriggerEvent: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of useComponents
  		* @returns Boolean
  		*/
  var getUseComponents: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns an array of the current items in the DataView
  		* @returns Ext.dom.Element[]/Ext.dataview.component.DataItem[] Array of Items.
  		*/
  var getViewItems: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Method called when the Store s Reader throws an exception */
  var handleException: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Finds the index of the passed node  */
  var indexOf: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Object) */
  var `inline`: js.UndefOr[js.Any] = js.native
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var itemConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Boolean) */
  var loadingText: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var maxItemCache: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var overItemCls: js.UndefOr[Boolean] = js.native
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
  		* @param data Object/Object[] The raw data object that was used to create the Record.
  		* @param index Number the index number of the Record being prepared for rendering.
  		* @param record Ext.data.Model The Record being prepared for rendering.
  		* @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
  		*/
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* record */ js.UndefOr[IModel], 
      _
    ]
  ] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var pressedDelay: js.UndefOr[Double] = js.native
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Refreshes an individual node s data from the store  */
  var refreshNode: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var scrollToTopOnRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Adds the given records to the currently selected set
  		* @param records Ext.data.Model/Array/Number The records to select.
  		* @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
  		* @param suppressEvent Boolean If true, the select event will not be fired.
  		*/
  var select: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Selects all records
  		* @param silent Boolean true to suppress all select events.
  		*/
  var selectAll: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
  		* @param startRecord Number The index of the first row in the range.
  		* @param endRecord Number The index of the last row in the range.
  		* @param keepExisting Boolean true to retain existing selections.
  		*/
  var selectRange: js.UndefOr[js.Function3[js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var selectedItemCls: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of data
  		* @param data Object[] The new value.
  		*/
  @JSName("setData")
  var setData_IDataView: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of deferEmptyText
  		* @param deferEmptyText Boolean The new value.
  		*/
  var setDeferEmptyText: js.UndefOr[js.Function1[/* deferEmptyText */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of deselectOnContainerClick
  		* @param deselectOnContainerClick Boolean The new value.
  		*/
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  var setDisableSelection: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of inline
  		* @param inline Boolean/Object The new value.
  		*/
  var setInline: js.UndefOr[js.Function1[/* inline */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of itemCls
  		* @param itemCls String The new value.
  		*/
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String/String[]/Ext.XTemplate The new value.
  		*/
  var setItemTpl: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of loadingText
  		* @param loadingText String/Boolean The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of maxItemCache
  		* @param maxItemCache Number The new value.
  		*/
  var setMaxItemCache: js.UndefOr[js.Function1[/* maxItemCache */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of pressedDelay
  		* @param pressedDelay Number The new value.
  		*/
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of scrollToTopOnRefresh
  		* @param scrollToTopOnRefresh Boolean The new value.
  		*/
  var setScrollToTopOnRefresh: js.UndefOr[js.Function1[/* scrollToTopOnRefresh */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of selectedCls
  		* @param selectedCls String The new value.
  		*/
  var setSelectedCls: js.UndefOr[js.Function1[/* selectedCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store/Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of triggerCtEvent
  		* @param triggerCtEvent String The new value.
  		*/
  var setTriggerCtEvent: js.UndefOr[js.Function1[/* triggerCtEvent */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of triggerEvent
  		* @param triggerEvent String The new value.
  		*/
  var setTriggerEvent: js.UndefOr[js.Function1[/* triggerEvent */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of useComponents
  		* @param useComponents Boolean The new value.
  		*/
  var setUseComponents: js.UndefOr[js.Function1[/* useComponents */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Store/Object) */
  var store: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var triggerCtEvent: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets a record as the last focused record
  		* @param newRecord Ext.data.Record
  		* @param oldRecord Ext.data.Record
  		*/
  var updateLastFocused: js.UndefOr[js.Function2[js.UndefOr[IRecord], js.UndefOr[IRecord], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useComponents: js.UndefOr[Boolean] = js.native
}

object IDataView {
  @scala.inline
  def apply(): IDataView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataView]
  }
  @scala.inline
  implicit class IDataViewOps[Self <: IDataView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDeselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withBindStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withClearSelections(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearSelections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelections")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCollectData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectData")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferEmptyText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEmptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectAll(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeselectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectOnContainerClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectOnContainerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectOnContainerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectOnContainerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDoDeselect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doDeselect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withDoSelect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSelect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withFindItemByChild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findItemByChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFindItemByChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findItemByChild")(js.undefined)
        ret
    }
    @scala.inline
    def withFindTargetByEvent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findTargetByEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFindTargetByEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findTargetByEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowDeselect(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowDeselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDeferEmptyText(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferEmptyText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDeferEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDeselectOnContainerClick(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeselectOnContainerClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDeselectOnContainerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeselectOnContainerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisableSelection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisableSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisableSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisableSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEmptyText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmptyText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInline(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInline")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemAt(value: /* index */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemConfig(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemIndex(value: /* item */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemTpl(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemTpl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLastSelected(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLastSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLoadingText(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadingText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxItemCache(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxItemCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxItemCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxItemCache")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMode(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodes(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPressedCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPressedDelay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedDelay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPressedDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPressedDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecords(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollToTopOnRefresh(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollToTopOnRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollToTopOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollToTopOnRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectedCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectedNodes(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectedRecords(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelection(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectionCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectionMode(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTriggerCtEvent(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerCtEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTriggerCtEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerCtEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTriggerEvent(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTriggerEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseComponents(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseComponents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withGetViewItems(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetViewItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewItems")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleException(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleException")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHandleException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleException")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSelection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOf(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIndexOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withItemConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItemCache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItemCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCache")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOverItemCls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overItemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overItemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepareData(
      value: (/* data */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPrepareData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareData")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshNode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRefreshNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshNode")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToTopOnRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToTopOnRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToTopOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToTopOnRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAll(value: js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectRange(value: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSelectRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemCls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowDeselect(value: js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowDeselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: /* data */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDeferEmptyText(value: /* deferEmptyText */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDeferEmptyText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDeferEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDeferEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDeselectOnContainerClick(value: js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDeselectOnContainerClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDeselectOnContainerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDeselectOnContainerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisableSelection(value: js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisableSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisableSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisableSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEmptyText(value: /* emptyText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEmptyText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInline(value: /* inline */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInline")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemCls(value: /* itemCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemConfig(value: /* itemConfig */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemTpl(value: /* itemTpl */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemTpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLastFocused(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastFocused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetLastFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoadingText(value: /* loadingText */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadingText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxItemCache(value: /* maxItemCache */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxItemCache")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxItemCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxItemCache")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMode(value: js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPressedDelay(value: /* pressedDelay */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedDelay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPressedDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPressedDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollToTopOnRefresh(value: /* scrollToTopOnRefresh */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollToTopOnRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScrollToTopOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollToTopOnRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSelectedCls(value: /* selectedCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectedCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSelectedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTriggerCtEvent(value: /* triggerCtEvent */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTriggerCtEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTriggerCtEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTriggerCtEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTriggerEvent(value: /* triggerEvent */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTriggerEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTriggerEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTriggerEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseComponents(value: /* useComponents */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseComponents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOver")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerCtEvent(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCtEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerCtEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCtEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerEvent(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLastFocused(value: (js.UndefOr[IRecord], js.UndefOr[IRecord]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLastFocused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateLastFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLastFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withUseComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useComponents")(js.undefined)
        ret
    }
  }
  
}

