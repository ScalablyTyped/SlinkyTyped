package typingsSlinky.senchaTouch.Ext.mixin

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.data.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectable extends IBase {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Deselects the given record s
  		* @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
  		* @param suppressEvent Boolean If true the deselect event will not be fired.
  		*/
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Deselects all records
  		* @param supress Object
  		*/
  var deselectAll: js.UndefOr[js.Function1[/* supress */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param suppressEvent Boolean Set to false to not fire a deselect event.
  		*/
  var doDeselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event.
  		*/
  var doSelect: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the array of previously selected items
  		* @returns Array The previous selection.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[String]] = js.native
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
  var getSelectionMode: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var mode: js.UndefOr[String] = js.native
  /** [Method] Adds the given records to the currently selected set
  		* @param records Ext.data.Model/Array/Number The records to select.
  		* @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
  		* @param suppressEvent Boolean If true, the select event will not be fired.
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Selects all records
  		* @param silent Boolean true to suppress all select events.
  		*/
  var selectAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
  		* @param startRecord Number The index of the first row in the range.
  		* @param endRecord Number The index of the last row in the range.
  		* @param keepExisting Boolean true to retain existing selections.
  		*/
  var selectRange: js.UndefOr[
    js.Function3[
      /* startRecord */ js.UndefOr[Double], 
      /* endRecord */ js.UndefOr[Double], 
      /* keepExisting */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of deselectOnContainerClick
  		* @param deselectOnContainerClick Boolean The new value.
  		*/
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[/* deselectOnContainerClick */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  var setDisableSelection: js.UndefOr[js.Function1[/* disableSelection */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets a record as the last focused record
  		* @param newRecord Ext.data.Record
  		* @param oldRecord Ext.data.Record
  		*/
  var updateLastFocused: js.UndefOr[
    js.Function2[/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord], Unit]
  ] = js.native
}

object ISelectable {
  @scala.inline
  def apply(): ISelectable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectable]
  }
  @scala.inline
  implicit class ISelectableOps[Self <: ISelectable] (val x: Self) extends AnyVal {
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
    def withDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = {
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
    def withDeselectAll(value: /* supress */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withDoDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = {
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
    def withDoSelect(
      value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = {
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
    def withGetMode(value: () => String): Self = {
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
    def withGetSelectionMode(value: () => String): Self = {
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
    def withIsSelected(value: /* record */ js.UndefOr[js.Any] => Boolean): Self = {
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
    def withMode(value: String): Self = {
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
    def withSelect(
      value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = {
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
    def withSelectAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withSelectRange(
      value: (/* startRecord */ js.UndefOr[Double], /* endRecord */ js.UndefOr[Double], /* keepExisting */ js.UndefOr[Boolean]) => Unit
    ): Self = {
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
    def withSetAllowDeselect(value: /* allowDeselect */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withSetDeselectOnContainerClick(value: /* deselectOnContainerClick */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withSetDisableSelection(value: /* disableSelection */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withSetMode(value: /* mode */ js.UndefOr[String] => Unit): Self = {
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
    def withUpdateLastFocused(value: (/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord]) => Unit): Self = {
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
  }
  
}

