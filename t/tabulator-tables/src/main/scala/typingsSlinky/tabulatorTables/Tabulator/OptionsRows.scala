package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.add
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.bottom
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.click
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.delete
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.highlight
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.insert
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.replace
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.top
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsRows extends js.Object {
  /** The position in the table for new rows to be added, "bottom" or "top" */
  var addRowPos: js.UndefOr[bottom | top] = js.native
  /** The dataTreeRowCollapsed callback is triggered when a row with child rows is collapsed to hide its children.*/
  var dataTreeRowCollapsed: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ Double, Unit]] = js.native
  /** The dataTreeRowExpanded callback is triggered when a row with child rows is expanded to reveal the children. */
  var dataTreeRowExpanded: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ Double, Unit]] = js.native
  /** To allow the user to move rows up and down the table, set the movableRows parameter in the options: */
  var movableRows: js.UndefOr[Boolean] = js.native
  /** Tabulator also allows you to move rows between tables. To enable this you should supply either a valid CSS selector string a DOM node for the table or the Tabuator object for the table to the movableRowsConnectedTables option. if you want to connect to multple tables then you can pass in an array of values to this option. */
  var movableRowsConnectedTables: js.UndefOr[String | (js.Array[HTMLElement | String]) | HTMLElement] = js.native
  /** The movableRowsReceived callback is triggered on a receiving table when a row has been successfuly received.*/
  var movableRowsReceived: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typingsSlinky.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /** The movableRowsReceivedFailed callback is triggered on a receiving table when a row receiver has returned false.*/
  var movableRowsReceivedFailed: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typingsSlinky.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /**  The movableRowsReceiver option should be set on the receiving tables, and sets the action that should be taken when the row is dropped into the table.
    There are several inbuilt receiver functions:
    insert - inserts row next to the row it was dropped on, if not dropped on a row it is added to the table (default)
    add - adds row to the table
    update - updates the row it is dropped on with the sent rows data
    replace - replaces the row it is dropped on with the sent row*/
  var movableRowsReceiver: js.UndefOr[
    insert | add | update | replace | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typingsSlinky.tabulatorTables.Tabulator, 
      _
    ])
  ] = js.native
  /** The movableRowsReceivingStart callback is triggered on a receiving table when a connection is established with a sending table. */
  var movableRowsReceivingStart: js.UndefOr[
    js.Function2[
      /* fromRow */ RowComponent, 
      /* toTable */ typingsSlinky.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /** The movableRowsReceivingStop callback is triggered on a receiving table after a row has been dropped and any senders and receivers have been handled.*/
  var movableRowsReceivingStop: js.UndefOr[js.Function1[/* fromTable */ typingsSlinky.tabulatorTables.Tabulator, Unit]] = js.native
  /** The movableRowsSender option should be set on the sending table, and sets the action that should be taken after the row has been successfuly dropped into the receiving table.
    There are several inbuilt sender functions:
    false - do nothing(default)
    delete - deletes the row from the table
    You can also pass a callback to the movableRowsSender option for custom sender functionality
    */
  var movableRowsSender: js.UndefOr[
    `false` | delete | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typingsSlinky.tabulatorTables.Tabulator, 
      _
    ])
  ] = js.native
  /** The movableRowsSendingStart callback is triggered on the sending table when a row is picked up from a sending table. */
  var movableRowsSendingStart: js.UndefOr[js.Function1[/* toTables */ js.Array[_], Unit]] = js.native
  /** The movableRowsSendingStop callback is triggered on the sending table after a row has been dropped and any senders and receivers have been handled. */
  var movableRowsSendingStop: js.UndefOr[js.Function1[/* toTables */ js.Array[_], Unit]] = js.native
  /** The movableRowsSent callback is triggered on the sending table when a row has been successfuly received by a receiving table. */
  var movableRowsSent: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typingsSlinky.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /** The movableRowsSentFailed callback is triggered on the sending table when a row has failed to be received by the receiving table.*/
  var movableRowsSentFailed: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typingsSlinky.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /** You can allow the user to manually resize rows by dragging the top or bottom border of a row. To enable this functionality, set the resizableRows property to true */
  var resizableRows: js.UndefOr[Boolean] = js.native
  /** The rowAdded callback is triggered when a row is added to the table by the addRow and updateOrAddRow functions. */
  var rowAdded: js.UndefOr[RowChangedCallback] = js.native
  /** The rowClick callback is triggered when a user clicks on a row. */
  var rowClick: js.UndefOr[RowEventCallback] = js.native
  /** The rowContext callback is triggered when a user right clicks on a row.
    If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback. */
  var rowContext: js.UndefOr[RowEventCallback] = js.native
  /** The rowDblClick callback is triggered when a user double clicks on a row. */
  var rowDblClick: js.UndefOr[RowEventCallback] = js.native
  /** The rowDblTap callback is triggered when a user taps on a row on a touch display twice in under 300ms. */
  var rowDblTap: js.UndefOr[RowEventCallback] = js.native
  /** The rowDeleted callback is triggered when a row is deleted from the table by the deleteRow function. */
  var rowDeleted: js.UndefOr[RowChangedCallback] = js.native
  /** The rowDeselected event is triggered when a row is deselected, either by the user or programatically. */
  var rowDeselected: js.UndefOr[RowChangedCallback] = js.native
  /** Tabulator also allows you to define a row level formatter using the rowFormatter option. this lets you alter each row of the table based on the data it contains.
    The function accepts one argument, the RowComponent for the row being formatted. */
  var rowFormatter: js.UndefOr[js.Function1[/* row */ RowComponent, _]] = js.native
  /**When copying to the clipboard you may want to apply a different formatter may want to apply a different formatter from the one usualy used to format the row. You can now do this using the rowFormatterClipboard table option, which takes the same inputs as the standard rowFormatter property. Passing a value of false into the formatter prevent the default row formatter from being run when the table is copied to the clipboard*/
  var rowFormatterClipboard: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, _])] = js.native
  /**When the getHtml function is called you may want to apply a different formatter may want to apply a different formatter from the one usualy used to format the row */
  var rowFormatterHtmlOutput: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, _])] = js.native
  /**When printing you may want to apply a different formatter may want to apply a different formatter from the one usualy used to format the row. */
  var rowFormatterPrint: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, _])] = js.native
  /** The rowMouseEnter callback is triggered when the mouse pointer enters a row. */
  var rowMouseEnter: js.UndefOr[RowEventCallback] = js.native
  /** The rowMouseLeave callback is triggered when the mouse pointer leaves a row. */
  var rowMouseLeave: js.UndefOr[RowEventCallback] = js.native
  /** The rowMouseMove callback is triggered when the mouse pointer moves over a row. */
  var rowMouseMove: js.UndefOr[RowEventCallback] = js.native
  /** The rowMouseOut callback is triggered when the mouse pointer leaves a row or any of its child elements. */
  var rowMouseOut: js.UndefOr[RowEventCallback] = js.native
  /**  The rowMouseOver callback is triggered when the mouse pointer enters a row or any of its child elements.*/
  var rowMouseOver: js.UndefOr[RowEventCallback] = js.native
  /** The rowMoved callback will be triggered when a row has been successfuly moved. */
  var rowMoved: js.UndefOr[RowChangedCallback] = js.native
  /** The rowResized callback will be triggered when a row has been resized by the user. */
  var rowResized: js.UndefOr[RowChangedCallback] = js.native
  /** The rowSelected event is triggered when a row is selected, either by the user or programatically. */
  var rowSelected: js.UndefOr[RowChangedCallback] = js.native
  /** Whenever the number of selected rows changes, through selection or deselection, the rowSelectionChanged event is triggered. This passes an array of the data objects for each row in the order they were selected as the first argument, and an array of row components for each of the rows in order of selection as the second argument. */
  var rowSelectionChanged: js.UndefOr[js.Function2[/* data */ js.Array[_], /* rows */ js.Array[RowComponent], Unit]] = js.native
  /** The rowTap callback is triggered when a user taps on a row on a touch display. */
  var rowTap: js.UndefOr[RowEventCallback] = js.native
  /** The rowTapHold callback is triggered when a user taps on a row on a touch display and holds their finger down for over 1 second. */
  var rowTapHold: js.UndefOr[RowEventCallback] = js.native
  /** The rowUpdated callback is triggered when a row is updated by the updateRow, updateOrAddRow, updateData or updateOrAddData, functions. */
  var rowUpdated: js.UndefOr[RowChangedCallback] = js.native
  /** The default option for triggering a ScrollTo on a visible element can be set using the scrollToRowIfVisible option. It can take a boolean value:
    true - scroll to row, even if it is visible (default)
    false - scroll to row, unless it is currently visible, then don't move */
  var scrollToRowIfVisible: js.UndefOr[Boolean] = js.native
  /** * The default ScrollTo position can be set using the scrollToRowPosition option. It can take one of four possible values:
    top - position row with its top edge at the top of the table (default)
    center - position row with its top edge in the center of the table
    bottom - position row with its bottom edge at the bottom of the table
    nearest - position row on the edge of the table it is closest to
    */
  var scrollToRowPosition: js.UndefOr[ScrollToRowPostition] = js.native
  /** The selectable option can take one of a several values:
    false - selectable rows are disabled
    true - selectable rows are enabled, and you can select as many as you want
    integer - any integer value, this sets the maximum number of rows that can be selected (when the maximum number of selected rows is exeded, the first selected row will be deselected to allow the next row to be selected).
    "highlight" (default) - rows have the same hover stylings as selectable rows but do not change state when clicked. This is great for when you want to show that a row is clickable but don't want it to be selectable. */
  var selectable: js.UndefOr[Boolean | Double | highlight] = js.native
  /** You many want to exclude certain rows from being selected. The selectableCheck options allows you to pass a function to check if the current row should be selectable, returning true will allow row selection, false will result in nothing happening. The function should accept a RowComponent as its first argument. */
  var selectableCheck: js.UndefOr[js.Function1[/* row */ RowComponent, Boolean]] = js.native
  /** By default Tabulator will maintain selected rows when the table is filtered, sorted or paginated (but NOT when the setData function is used). If you want the selected rows to be cleared whenever the table view is updated then set the selectablePersistence option to false. */
  var selectablePersistence: js.UndefOr[Boolean] = js.native
  /** By default you can select a range of rows by holding down the shift key and click dragging over a number of rows to toggle the selected state state of all rows the cursor passes over.
    If you would prefere to select a range of row by clicking on the first row then holding down shift and clicking on the end row then you can acheive this by setting the selectableRangeMode to click */
  var selectableRangeMode: js.UndefOr[click] = js.native
  /** By default, row selection works on a rolling basis, if you set the selectable option to a numeric value then when you select past this number of rows, the first row to be selected will be deselected. If you want to disable this behaviour and instead prevent selection of new rows once the limit is reached you can set the selectableRollingSelection option to false. */
  var selectableRollingSelection: js.UndefOr[Boolean] = js.native
  /**  Allows you to specifcy the behaviour when the user tabs from the last editable cell on the last row of the table */
  var tabEndNewRow: js.UndefOr[Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _])] = js.native
}

object OptionsRows {
  @scala.inline
  def apply(): OptionsRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsRows]
  }
  @scala.inline
  implicit class OptionsRowsOps[Self <: OptionsRows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRowPos(value: bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddRowPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowPos")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeRowCollapsed(value: (/* row */ RowComponent, /* level */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeRowCollapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataTreeRowCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeRowCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeRowExpanded(value: (/* row */ RowComponent, /* level */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeRowExpanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataTreeRowExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeRowExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovableRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsConnectedTablesHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsConnectedTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovableRowsConnectedTables(value: String | (js.Array[HTMLElement | String]) | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsConnectedTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovableRowsConnectedTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsConnectedTables")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsReceived(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typingsSlinky.tabulatorTables.Tabulator) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceived")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMovableRowsReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsReceivedFailed(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typingsSlinky.tabulatorTables.Tabulator) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceivedFailed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMovableRowsReceivedFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceivedFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsReceiverFunction3(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typingsSlinky.tabulatorTables.Tabulator) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceiver")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMovableRowsReceiver(
      value: insert | add | update | replace | (js.Function3[
          /* fromRow */ RowComponent, 
          /* toRow */ RowComponent, 
          /* fromTable */ typingsSlinky.tabulatorTables.Tabulator, 
          _
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovableRowsReceiver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceiver")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsReceivingStart(value: (/* fromRow */ RowComponent, /* toTable */ typingsSlinky.tabulatorTables.Tabulator) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceivingStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMovableRowsReceivingStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceivingStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsReceivingStop(value: /* fromTable */ typingsSlinky.tabulatorTables.Tabulator => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceivingStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMovableRowsReceivingStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsReceivingStop")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsSenderFunction3(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typingsSlinky.tabulatorTables.Tabulator) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMovableRowsSender(
      value: `false` | delete | (js.Function3[
          /* fromRow */ RowComponent, 
          /* toRow */ RowComponent, 
          /* toTable */ typingsSlinky.tabulatorTables.Tabulator, 
          _
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovableRowsSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSender")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsSendingStart(value: /* toTables */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSendingStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMovableRowsSendingStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSendingStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsSendingStop(value: /* toTables */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSendingStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMovableRowsSendingStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSendingStop")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsSent(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typingsSlinky.tabulatorTables.Tabulator) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMovableRowsSent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSent")(js.undefined)
        ret
    }
    @scala.inline
    def withMovableRowsSentFailed(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typingsSlinky.tabulatorTables.Tabulator) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSentFailed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMovableRowsSentFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movableRowsSentFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withResizableRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizableRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableRows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowAdded(value: /* row */ RowComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClick(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRowContext(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowContext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowContext")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDblClick(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDblClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDblTap(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDblTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowDblTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDblTap")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDeleted(value: /* row */ RowComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDeselected(value: /* row */ RowComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeselected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDeselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeselected")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFormatter(value: /* row */ RowComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFormatterClipboardFunction1(value: /* row */ RowComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterClipboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowFormatterClipboard(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFormatterClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFormatterHtmlOutputFunction1(value: /* row */ RowComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterHtmlOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowFormatterHtmlOutput(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterHtmlOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFormatterHtmlOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterHtmlOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFormatterPrintFunction1(value: /* row */ RowComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterPrint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowFormatterPrint(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFormatterPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFormatterPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withRowMouseEnter(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withRowMouseLeave(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withRowMouseMove(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withRowMouseOut(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseOut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withRowMouseOver(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withRowMoved(value: /* row */ RowComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowMoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMoved")(js.undefined)
        ret
    }
    @scala.inline
    def withRowResized(value: /* row */ RowComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowResized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowResized")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelected(value: /* row */ RowComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelectionChanged(value: (/* data */ js.Array[_], /* rows */ js.Array[RowComponent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTap(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTap")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTapHold(value: (/* e */ js.Any, /* row */ RowComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTapHold")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowTapHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTapHold")(js.undefined)
        ret
    }
    @scala.inline
    def withRowUpdated(value: /* row */ RowComponent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToRowIfVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRowIfVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToRowIfVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRowIfVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToRowPosition(value: ScrollToRowPostition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToRowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRowPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean | Double | highlight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableCheck(value: /* row */ RowComponent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectableCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableRangeMode(value: click): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRangeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableRangeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRangeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableRollingSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRollingSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableRollingSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableRollingSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withTabEndNewRowFunction1(value: /* row */ RowComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabEndNewRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabEndNewRow(value: Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabEndNewRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabEndNewRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabEndNewRow")(js.undefined)
        ret
    }
  }
  
}

