package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridColumnOf[TEntity] extends js.Object {
  /** Column definition */
  var colDef: IColumnDefOf[TEntity] = js.native
  /** Default sort on this column */
  var defaultSort: js.UndefOr[ISortInfo] = js.native
  /**
    * Column name that will be shown in the header.
    * If displayName is not provided then one is generated using the name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * field must be provided if you wish to bind to a property in the data source.
    * Should be an angular expression that evaluates against grid.options.data array element.
    * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
    * See the angular docs on binding expressions.
    */
  var field: js.UndefOr[String] = js.native
  /** Filter on this column */
  var filter: js.UndefOr[IFilterOptions] = js.native
  /** Filters for this column. Includes 'term' property bound to filter input elements */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.native
  /** Reference to grid containing the column */
  var grid: IGridInstanceOf[TEntity] = js.native
  var name: js.UndefOr[String] = js.native
  /** Sort on this column */
  var sort: js.UndefOr[ISortInfo] = js.native
  /**
    * Algorithm to use for sorting this column. Takes 'a' and 'b' parameters
    * like any normal sorting function with additional 'rowA', 'rowB', and 'direction'
    * parameters that are the row objects and the current direction of the sort
    * respectively.
    */
  var sortingAlgorithm: js.UndefOr[
    js.Function5[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* rowA */ IGridRowOf[TEntity], 
      /* rowB */ IGridRowOf[TEntity], 
      /* direction */ String, 
      Double
    ]
  ] = js.native
  /** Column width */
  var width: Double = js.native
  /**
    * Initializes a column
    * @param colDef the column def to associate with this column
    * @param uid The unique and immutable uid we'd like to allocate to this column
    * @param grid the grid we'd like to create this column in
    */
  def GridColumn(colDef: IColumnDefOf[TEntity], uid: Double, grid: IGridInstanceOf[TEntity]): Unit = js.native
  /**
    * Gets the aggregation label from colDef.aggregationLabel if specified or by using i18n,
    * including deciding whether or not to display based on colDef.aggregationHideLabel.
    * @param label the i18n lookup value to use for the column label
    */
  def getAggregationText(label: String): Unit = js.native
  /**
    * gets the aggregation value based on the aggregation type for this column.
    * Debounced using scrollDebounce option setting
    */
  def getAggregationValue(): String = js.native
  /**
    * Returns the class name for the column
    * @param prefixDot if true, will return .className instead of className
    */
  def getColClass(prefixDot: Boolean): String = js.native
  /** Returns the class definition for th column */
  def getColClassDefinition(): String = js.native
  /**
    * Returns the render container object that this column belongs to.
    * Columns will be default be in the body render container
    * if they aren't allocated to one specifically.
    */
  def getRenderContainer(): js.Any = js.native
   // @todo replace with interface for render container
  /** Hides the column by setting colDef.visible = false */
  def hideColumn(): Unit = js.native
  /** Returns true if column is in the left render container */
  def isPinnedLeft(): Boolean = js.native
  /** Returns true if column is in the right render container */
  def isPinnedRight(): Boolean = js.native
  /**
    * Sets a property on the column using the passed in columnDef,
    * and setting the defaultValue if the value cannot be found on the colDef
    * @param colDef the column def to look in for the property value
    * @param propName the property name we'd like to set
    * @param defaultValue the value to use if the colDef doesn't provide the setting
    */
  def setPropertyOrDefault(colDef: IColumnDefOf[TEntity], propName: String, defaultValue: js.Any): Unit = js.native
  /** Makes the column visible by setting colDef.visible = true */
  def showColumn(): Unit = js.native
  /**
    * Moves settings from the columnDef down onto the column, and sets properties as appropriate
    * @param colDef the column def to look in for property value
    * @param isNew whether the column is being newly created, if not we're updating an existing
    *              column, and some items such as the sort shouldn't be copied down
    */
  def updateColumnDef(colDef: IColumnDefOf[TEntity], isNew: Boolean): Unit = js.native
}

object IGridColumnOf {
  @scala.inline
  def apply[TEntity](
    GridColumn: (IColumnDefOf[TEntity], Double, IGridInstanceOf[TEntity]) => Unit,
    colDef: IColumnDefOf[TEntity],
    getAggregationText: String => Unit,
    getAggregationValue: () => String,
    getColClass: Boolean => String,
    getColClassDefinition: () => String,
    getRenderContainer: () => js.Any,
    grid: IGridInstanceOf[TEntity],
    hideColumn: () => Unit,
    isPinnedLeft: () => Boolean,
    isPinnedRight: () => Boolean,
    setPropertyOrDefault: (IColumnDefOf[TEntity], String, js.Any) => Unit,
    showColumn: () => Unit,
    updateColumnDef: (IColumnDefOf[TEntity], Boolean) => Unit,
    width: Double
  ): IGridColumnOf[TEntity] = {
    val __obj = js.Dynamic.literal(GridColumn = js.Any.fromFunction3(GridColumn), colDef = colDef.asInstanceOf[js.Any], getAggregationText = js.Any.fromFunction1(getAggregationText), getAggregationValue = js.Any.fromFunction0(getAggregationValue), getColClass = js.Any.fromFunction1(getColClass), getColClassDefinition = js.Any.fromFunction0(getColClassDefinition), getRenderContainer = js.Any.fromFunction0(getRenderContainer), grid = grid.asInstanceOf[js.Any], hideColumn = js.Any.fromFunction0(hideColumn), isPinnedLeft = js.Any.fromFunction0(isPinnedLeft), isPinnedRight = js.Any.fromFunction0(isPinnedRight), setPropertyOrDefault = js.Any.fromFunction3(setPropertyOrDefault), showColumn = js.Any.fromFunction0(showColumn), updateColumnDef = js.Any.fromFunction2(updateColumnDef), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridColumnOf[TEntity]]
  }
  @scala.inline
  implicit class IGridColumnOfOps[Self[tentity] <: IGridColumnOf[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withGridColumn(value: (IColumnDefOf[TEntity], Double, IGridInstanceOf[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridColumn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withColDef(value: IColumnDefOf[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAggregationText(value: String => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAggregationText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAggregationValue(value: () => String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAggregationValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColClass(value: Boolean => String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetColClassDefinition(value: () => String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColClassDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRenderContainer(value: () => js.Any): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGrid(value: IGridInstanceOf[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideColumn(value: () => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPinnedLeft(value: () => Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPinnedLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPinnedRight(value: () => Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPinnedRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPropertyOrDefault(value: (IColumnDefOf[TEntity], String, js.Any) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPropertyOrDefault")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withShowColumn(value: () => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateColumnDef(value: (IColumnDefOf[TEntity], Boolean) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateColumnDef")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSort(value: ISortInfo): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSort: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSort")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: IFilterOptions): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[IFilterOptions]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: ISortInfo): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingAlgorithm(
      value: (/* a */ js.Any, /* b */ js.Any, /* rowA */ IGridRowOf[TEntity], /* rowB */ IGridRowOf[TEntity], /* direction */ String) => Double
    ): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingAlgorithm")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSortingAlgorithm: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingAlgorithm")(js.undefined)
        ret
    }
  }
  
}

