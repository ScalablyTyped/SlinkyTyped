package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column[T /* <: SlickData */] extends js.Object {
  /**
  		* This accepts a function of the form function(cellNode, row, dataContext, colDef) and is used to post-process the cell's DOM node / nodes
  		* @param cellNode
  		* @param row
  		* @param dataContext
  		* @param colDef
  		* @return
  		**/
  var asyncPostRender: js.UndefOr[
    js.Function4[
      /* cellNode */ js.Any, 
      /* row */ js.Any, 
      /* dataContext */ js.Any, 
      /* colDef */ js.Any, 
      Unit
    ]
  ] = js.native
  /**
  		* Used by the the slick.rowMoveManager.js plugin for moving rows. Has no effect without the plugin installed.
  		**/
  var behavior: js.UndefOr[js.Any] = js.native
  /**
  		* In the "Add New" row, determines whether clicking cells in this column can trigger row addition. If true, clicking on the cell in this column in the "Add New" row will not trigger row addition.
  		**/
  var cannotTriggerInsert: js.UndefOr[Boolean] = js.native
  /**
  		* Accepts a string as a class name, applies that class to every row cell in the column.
  		**/
  var cssClass: js.UndefOr[String] = js.native
  /**
  		* When set to true, the first user click on the header will do a descending sort. When set to false, the first user click on the header will do an ascending sort.
  		**/
  var defaultSortAsc: js.UndefOr[Boolean] = js.native
  /**
  		* The editor for cell edits {TextEditor, IntegerEditor, DateEditor...} See slick.editors.js
  		**/
  var editor: js.UndefOr[js.Any] = js.native
   // typeof Editors.Editor<T>;
  /**
  		* The property name in the data object to pull content from. (This is assumed to be on the root of the data object.)
  		**/
  var field: js.UndefOr[String] = js.native
  /**
  		* When set to false, clicking on a cell in this column will not select the row for that cell. The cells in this column will also be skipped during tab navigation.
  		**/
  var focusable: js.UndefOr[Boolean] = js.native
  /**
  		* This accepts a function of the form function(row, cell, value, columnDef, dataContext) and returns a formatted version of the data in each cell of this column. For example, setting formatter to function(r, c, v, cd, dc) { return "Hello!"; } would overwrite every value in the column with "Hello!" See defaultFormatter in slick.grid.js for an example formatter.
  		* @param row
  		* @param cell
  		* @param value
  		* @param columnDef
  		* @param dataContext
  		* @return
  		**/
  var formatter: js.UndefOr[Formatter[T]] = js.native
  var header: js.UndefOr[Header] = js.native
  /**
  		* Accepts a string as a class name, applies that class to the cell for the column header.
  		**/
  var headerCssClass: js.UndefOr[String] = js.native
  /**
  		* A unique identifier for the column within the grid.
  		**/
  var id: js.UndefOr[String] = js.native
  /**
  		* Set the maximum allowable width of this column, in pixels.
  		**/
  var maxWidth: js.UndefOr[Double] = js.native
  /**
  		*  Set the minimum allowable width of this column, in pixels.
  		**/
  var minWidth: js.UndefOr[Double] = js.native
  /**
  		* The text to display on the column heading.
  		**/
  var name: js.UndefOr[String] = js.native
  /**
  		* If set to true, whenever this column is resized, the entire table view will rerender.
  		**/
  var rerenderOnResize: js.UndefOr[Boolean] = js.native
  /**
  		* If false, column can no longer be resized.
  		**/
  var resizable: js.UndefOr[Boolean] = js.native
  /**
  		* If false, when a row is selected, the CSS class for selected cells ("selected" by default) is not applied to the cell in this column.
  		**/
  var selectable: js.UndefOr[Boolean] = js.native
  /**
  		* If true, the column will be sortable by clicking on the header.
  		**/
  var sortable: js.UndefOr[Boolean] = js.native
  /**
  		* If set to a non-empty string, a tooltip will appear on hover containing the string.
  		**/
  var toolTip: js.UndefOr[String] = js.native
  /**
  		* Width of the column in pixels. (May often be overridden by things like minWidth, maxWidth, forceFitColumns, etc.)
  		**/
  var width: js.UndefOr[Double] = js.native
}

object Column {
  @scala.inline
  def apply[T](): Column[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column[T]]
  }
  @scala.inline
  implicit class ColumnOps[Self[t] <: Column[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAsyncPostRender(
      value: (/* cellNode */ js.Any, /* row */ js.Any, /* dataContext */ js.Any, /* colDef */ js.Any) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPostRender")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAsyncPostRender: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPostRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBehavior(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withCannotTriggerInsert(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotTriggerInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCannotTriggerInsert: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotTriggerInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortAsc(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortAsc: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Header): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCssClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCssClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRerenderOnResize(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerenderOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRerenderOnResize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerenderOnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withToolTip(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolTip: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

