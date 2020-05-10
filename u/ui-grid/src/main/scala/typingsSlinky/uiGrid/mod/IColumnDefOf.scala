package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDefOf[TEntity]
  extends typingsSlinky.uiGrid.mod.cellNav.IColumnDef
     with typingsSlinky.uiGrid.mod.edit.IColumnDef[TEntity]
     with typingsSlinky.uiGrid.mod.exporter.IColumnDef
     with typingsSlinky.uiGrid.mod.grouping.IColumnDef
     with typingsSlinky.uiGrid.mod.moveColumns.IColumnDef
     with typingsSlinky.uiGrid.mod.pinning.IColumnDef
     with typingsSlinky.uiGrid.mod.resizeColumns.IColumnDef
     with typingsSlinky.uiGrid.mod.treeBase.IColumnDef[TEntity] {
  /**
    * defaults to false
    * if set to true hides the label text in the aggregation footer, so only the value is displayed.
    */
  var aggregationHideLabel: js.UndefOr[Boolean] = js.native
  /**
    * The aggregation that you'd like to show in the columnFooter for this column.
    * Valid values are in uiGridConstants, and currently include:
    * uiGridConstants.aggregationTypes.count, uiGridConstants.aggregationTypes.sum,
    * uiGridConstants.aggregationTypes.avg, uiGridConstants.aggregationTypes.min,
    * uiGridConstants.aggregationTypes.max.
    *
    * You can also provide a function as the aggregation type,
    * in this case your function needs to accept the full set of visible rows,
    * and return a value that should be shown
    */
  var aggregationType: js.UndefOr[Double | js.Function] = js.native
  /**
    * cellClass can be a string specifying the class to append to a cell
    * or it can be a function(row,rowRenderIndex, col, colRenderIndex)
    * that returns a class name
    */
  var cellClass: js.UndefOr[String | ICellClassGetter[TEntity]] = js.native
  /** cellFilter is a filter to apply to the content of each cell */
  var cellFilter: js.UndefOr[String] = js.native
  /**
    * a custom template for each cell in this column.
    * The default is ui-grid/uiGridCell.
    * If you are using the cellNav feature,
    * this template must contain a div that can receive focus.
    */
  var cellTemplate: js.UndefOr[String] = js.native
  /**
    * Whether or not to show a tooltip when a user hovers over the cell.
    * If set to false, no tooltip.
    * If true, the cell value is shown in the tooltip (useful if you have long values in your cells),
    * if a function then that function is called passing in the row and the col cellTooltip(row, col)
    * and the return value is shown in the tooltip,
    * if it is a static string then displays that static string.
    * Defaults to false
    * @default false
    */
  var cellTooltip: js.UndefOr[Boolean | String | ICellTooltipGetter[TEntity]] = js.native
  /** Default object of sort information */
  var defaultSort: js.UndefOr[ISortInfo] = js.native
  /**
    * Column name that will be shown in the header.
    * If displayName is not provided then one is generated using the name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * if column menus are enabled, controls the column menus for this specific column
    * (i.e. if gridOptions.enableColumnMenus, then you can control column menus using this option.
    * If gridOptions.enableColumnMenus === false then you get no column menus irrespective of the value of this
    * option
    * ). Defaults to true.
    * @default true
    */
  var enableColumnMenu: js.UndefOr[Boolean] = js.native
  /**
    * Override for column menus everywhere - if set to false then you get no column menus.
    * Defaults to true
    * @default true
    */
  var enableColumnMenus: js.UndefOr[Boolean] = js.native
  /** turn off filtering for an individual column, where you've turned on filtering for the overall grid */
  var enableFiltering: js.UndefOr[Boolean] = js.native
  /**
    * When set to false, this setting prevents a user from hiding the column using the column menu or the grid
    * menu.
    * @default true
    */
  var enableHiding: js.UndefOr[Boolean] = js.native
  /**
    * When enabled, this setting adds sort widgets to the column header, allowing sorting of the data in the
    * individual column.
    * @default true
    */
  var enableSorting: js.UndefOr[Boolean] = js.native
  /**
    * field must be provided if you wish to bind to a property in the data source.
    * Should be an angular expression that evaluates against grid.options.data array element
    * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
    * See the angular docs on binding expressions.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Specify a single filter field on this column.
    * A filter consists of a condition, a term, and a placeholder:
    */
  var filter: js.UndefOr[IFilterOptions] = js.native
  /**
    * @default false
    * When true uiGrid will apply the cellFilter before applying search filters
    */
  var filterCellFiltered: js.UndefOr[Boolean] = js.native
  /**
    * a custom template for the filter input. The default is ui-grid/ui-grid-filter
    */
  var filterHeaderTemplate: js.UndefOr[String] = js.native
  /** Specify multiple filter fields */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.native
  /**
    * footerCellClass can be a string specifying the class to append to a cell or it can be
    * a function(row,rowRenderIndex, col, colRenderIndex) that returns a class name
    */
  var footerCellClass: js.UndefOr[String | IHeaderFooterCellClassGetter[TEntity]] = js.native
  /** footerCellFilter is a filter to apply to the content of the column footer */
  var footerCellFilter: js.UndefOr[String] = js.native
  /** a custom template for the footer for this column. The default is ui-grid/uiGridFooterCell */
  var footerCellTemplate: js.UndefOr[String] = js.native
  /**
    * headerCellClass can be a string specifying the class to append to a cell or it can be
    * a function(row,rowRenderIndex, col, colRenderIndex) that returns a class name
    */
  var headerCellClass: js.UndefOr[String | IHeaderFooterCellClassGetter[TEntity]] = js.native
  /** headerCellFilter is a filter to apply to the content of the column header */
  var headerCellFilter: js.UndefOr[String] = js.native
  /** a custom template for the header for this column. The default is ui-grid/uiGridHeaderCell */
  var headerCellTemplate: js.UndefOr[String] = js.native
  /**
    * Whether or not to show a tooltip when a user hovers over the header cell.
    * If set to false, no tooltip.
    * If true, the displayName is shown in the tooltip
    * (useful if you have long values in your headers),
    * if a function then that function is called passing in the row and the col
    * headerTooltip( col ), and the return value is shown in the tooltip,
    * if a static string then shows that static string.
    * @default false
    */
  var headerTooltip: js.UndefOr[Boolean | String | IHeaderTooltipGetter[TEntity]] = js.native
  /** sets the maximum column width */
  var maxWidth: js.UndefOr[Double] = js.native
  /** used to add menu items to a column. Refer to the tutorial on this functionality */
  var menuItems: js.UndefOr[js.Array[IMenuItem]] = js.native
  /** Sets the minimum column width */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * (mandatory) each column should have a name,
    * although for backward compatibility with 2.x name can be omitted if field is present
    */
  var name: js.UndefOr[String] = js.native
  /** An object of sort information */
  var sort: js.UndefOr[ISortInfo] = js.native
  /**
    * @default false
    * When true uiGrid will apply the cellFilter before sorting the data
    * Note that when using this option uiGrid will assume that the displayed value is a string,
    * and use the sortAlpha sortFn.
    * It is possible to return a non-string value from an angularjs filter,
    * in which case you should define a sortingAlgorithm for the column
    * which handles the returned type.
    * You may specify one of the sortingAlgorithms found in the rowSorter service.
    */
  var sortCellFiltered: js.UndefOr[Boolean] = js.native
  /**
    *(optional) An array of sort directions, specifying the order that they should cycle through as
    * the user repeatedly clicks on the column heading. The default is [null, uiGridConstants.ASC, uiGridConstants.DESC].
    * Null refers to the unsorted state. This does not affect the initial sort direction; use the sort property for that.
    * If suppressRemoveSort is also set, the unsorted state will be skipped even if it is listed here. Each direction may
    * not appear in the list more than once (e.g. [ASC, DESC, DESC] is not allowed), and the list may not be empty.*
    */
  var sortDirectionCycle: js.UndefOr[js.Array[Null | String]] = js.native
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
  /**
    * When enabled, this setting hides the removeSort option in the menu,
    * and prevents users from manually removing the sort
    * @default false
    */
  var suppressRemoveSort: js.UndefOr[Boolean] = js.native
  /**
    * the type of the column, used in sorting. If not provided then the grid will guess the type.
    * Add this only if the grid guessing is not to your satisfaction.
    * Note that if you choose date, your dates should be in a javascript date type
    * One of:
    * 'string', 'boolean', 'number', 'date', 'object', 'numberStr'
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * sets whether or not the column is visible
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * sets the column width.  Can be either a number or a percentage, or an * for auto.
    */
  var width: js.UndefOr[Double | String] = js.native
}

object IColumnDefOf {
  @scala.inline
  def apply[TEntity](): IColumnDefOf[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDefOf[TEntity]]
  }
  @scala.inline
  implicit class IColumnDefOfOps[Self[tentity] <: IColumnDefOf[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withAggregationHideLabel(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationHideLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationHideLabel: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationHideLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregationType(value: Double | js.Function): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationType: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationType")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClassFunction5(
      value: (/* grid */ js.UndefOr[IGridInstanceOf[TEntity]], /* gridRow */ js.UndefOr[IGridRowOf[TEntity]], /* gridCol */ js.UndefOr[IGridColumnOf[TEntity]], /* rowRenderIndex */ js.UndefOr[Double], /* colRenderIndex */ js.UndefOr[Double]) => String
    ): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCellClass(value: String | ICellClassGetter[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellClass: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCellFilter(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellFilter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTemplate(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTemplate: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTooltipFunction2(value: (/* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity]) => String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCellTooltip(value: Boolean | String | ICellTooltipGetter[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTooltip: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltip")(js.undefined)
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
    def withEnableColumnMenu(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnMenu: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnMenus(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnMenus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnMenus: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnMenus")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFiltering(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFiltering: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHiding(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHiding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHiding: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSorting(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSorting: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(js.undefined)
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
    def withFilterCellFiltered(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCellFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterCellFiltered: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCellFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterHeaderTemplate(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterHeaderTemplate: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHeaderTemplate")(js.undefined)
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
    def withFooterCellClassFunction5(
      value: (/* grid */ IGridInstanceOf[TEntity], /* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* rowRenderIndex */ Double, /* colRenderIndex */ Double) => String
    ): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCellClass")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFooterCellClass(value: String | IHeaderFooterCellClassGetter[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCellClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterCellClass: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCellClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterCellFilter(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCellFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterCellFilter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCellFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterCellTemplate(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterCellTemplate: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellClassFunction5(
      value: (/* grid */ IGridInstanceOf[TEntity], /* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* rowRenderIndex */ Double, /* colRenderIndex */ Double) => String
    ): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellClass")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withHeaderCellClass(value: String | IHeaderFooterCellClassGetter[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCellClass: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellFilter(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCellFilter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellTemplate(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCellTemplate: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTooltipFunction1(value: /* gridCol */ IGridColumnOf[TEntity] => String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderTooltip(value: Boolean | String | IHeaderTooltipGetter[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTooltip: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItems(value: js.Array[IMenuItem]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItems: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
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
    def withSortCellFiltered(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCellFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortCellFiltered: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCellFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirectionCycle(value: js.Array[Null | String]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirectionCycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirectionCycle: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirectionCycle")(js.undefined)
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
    @scala.inline
    def withSuppressRemoveSort(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRemoveSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressRemoveSort: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRemoveSort")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

