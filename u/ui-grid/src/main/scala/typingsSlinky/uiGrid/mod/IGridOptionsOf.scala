package typingsSlinky.uiGrid.mod

import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptionsOf[TEntity]
  extends typingsSlinky.uiGrid.mod.cellNav.IGridOptions
     with typingsSlinky.uiGrid.mod.edit.IGridOptions
     with typingsSlinky.uiGrid.mod.expandable.IGridOptions
     with typingsSlinky.uiGrid.mod.exporter.IGridOptions[TEntity]
     with typingsSlinky.uiGrid.mod.grouping.IGridOptions
     with typingsSlinky.uiGrid.mod.importer.IGridOptions[TEntity]
     with typingsSlinky.uiGrid.mod.infiniteScroll.IGridOptions
     with typingsSlinky.uiGrid.mod.moveColumns.IGridOptions
     with typingsSlinky.uiGrid.mod.pagination.IGridOptions
     with typingsSlinky.uiGrid.mod.pinning.IGridOptions
     with typingsSlinky.uiGrid.mod.resizeColumns.IGridOptions
     with typingsSlinky.uiGrid.mod.rowEdit.IGridOptions
     with typingsSlinky.uiGrid.mod.saveState.IGridOptions
     with typingsSlinky.uiGrid.mod.selection.IGridOptions
     with typingsSlinky.uiGrid.mod.treeBase.IGridOptions[TEntity]
     with typingsSlinky.uiGrid.mod.treeView.IGridOptions {
  /**
    * Default time in milliseconds to throttle aggregation calcuations, defaults to 500ms
    */
  var aggregationCalcThrottle: js.UndefOr[Double] = js.native
  /**
    * by default, the parent scope of the ui-grid element will be assigned to grid.appScope
    * this property allows you to assign any reference you want to grid.appScope
    */
  var appScopeProvider: js.UndefOr[IScope | js.Object] = js.native
  /**
    * Array of columnDef objects.  Only required property is name.
    */
  var columnDefs: js.UndefOr[js.Array[IColumnDefOf[TEntity]]] = js.native
  /**
    * The height of the footer rows (column footer and grid footer) in pixels
    */
  var columnFooterHeight: js.UndefOr[Double] = js.native
  /**
    * Turn virtualization on when number of columns goes over this number, defaults to 10
    * @default 10
    */
  var columnVirtualizationThreshold: js.UndefOr[Double] = js.native
  /**
    * (mandatory) Array of data to be rendered into the grid, providing the data source or data binding for
    * the grid.
    *
    * Most commonly the data is an array of objects, where each object has a number of attributes.
    * Each attribute automatically becomes a column in your grid.  This array could, for example, be sourced from
    * an angularJS $resource query request.  The array can also contain complex objects, refer the binding tutorial
    * for examples of that.
    *
    * The most flexible usage is to set your data on $scope:
    *
    * `$scope.data = data;`
    *
    * And then direct the grid to resolve whatever is in $scope.data:
    *
    * `$scope.gridOptions.data = 'data';`
    *
    * This is the most flexible approach as it allows you to replace $scope.data whenever you feel like it without
    * getting pointer issues.
    *
    * Alternatively you can directly set the data array:
    *
    * `$scope.gridOptions.data = [ ];`
    * or
    *
    * `$http.get('/data/100.json')
    * .success(function(data) {
    *   $scope.myData = data;
    *   $scope.gridOptions.data = $scope.myData;
    *  });`
    *
    * Where you do this, you need to take care in updating the data - you can't just update `$scope.myData` to some
    * other array, you need to update $scope.gridOptions.data to point to that new array as well.
    */
  var data: js.UndefOr[js.Array[TEntity] | String] = js.native
  /**
    * True by default. When enabled, this setting displays a column
    * menu within each column.
    * @default true
    */
  var enableColumnMenus: js.UndefOr[Boolean] = js.native
  /**
    * False by default. When enabled, this setting adds filter
    * boxes to each column header, allowing filtering within the column for the entire grid.
    * Filtering can then be disabled on individual columns using the columnDefs.
    * @default false
    */
  var enableFiltering: js.UndefOr[Boolean] = js.native
  /**
    * False by default. When enabled, this adds a settings icon in the top right of the grid,
    * which floats above the column header. The menu by default gives access to show/hide columns,
    * but can be customized to show additional actions.
    * @default false
    */
  var enableGridMenu: js.UndefOr[Boolean] = js.native
  /**
    * uiGridConstants.scrollbars.ALWAYS by default. This settings controls the horizontal scrollbar for the grid.
    * Supported values: uiGridConstants.scrollbars.ALWAYS, uiGridConstants.scrollbars.NEVER, uiGridConstants.scrollbars.WHEN_NEEDED
    * @default 1
    */
  var enableHorizontalScrollbar: js.UndefOr[Boolean | Double] = js.native
  /**
    * True by default. When enabled, a newly initialized grid will check to see if it is tall enough to display
    * at least one row of data.  If the grid is not tall enough, it will resize the DOM element to display
    * minRowsToShow number of rows.
    * @default true
    */
  var enableMinHeightCheck: js.UndefOr[Boolean] = js.native
  /**
    * True by default. When enabled, this setting allows uiGrid to add
    * `$$hashKey`-type properties (similar to Angular) to elements in the `data` array. This allows
    * the grid to maintain state while vastly speeding up the process of altering `data` by
    * adding/moving/removing rows.
    *
    * Note that this DOES add properties to your data that you may not want, but they are stripped out when
    * using `angular.toJson()`. IF you do not want this at all you can disable this setting but you will take a
    * performance hit if you are using large numbers of rows
    * and are altering the data set often.
    * @default true
    */
  var enableRowHashing: js.UndefOr[Boolean] = js.native
  /**
    * True by default. When enabled, this setting adds sort
    * widgets to the column headers, allowing sorting of the data for the entire grid.
    * Sorting can then be disabled on individual columns using the columnDefs.
    * @default true
    */
  var enableSorting: js.UndefOr[Boolean] = js.native
  /**
    * uiGridConstants.scrollbars.ALWAYS by default. This settings controls the vertical scrollbar for the grid.
    * Supported values: uiGridConstants.scrollbars.ALWAYS, uiGridConstants.scrollbars.NEVER, uiGridConstants.scrollbars.WHEN_NEEDED
    * @default 1
    */
  var enableVerticalScrollbar: js.UndefOr[Boolean | Double] = js.native
  /**
    * Extra columns to to render outside of the viewport, which helps with smoothness of scrolling.
    * Defaults to 4
    * @default 4
    */
  var excessColumns: js.UndefOr[Double] = js.native
  /**
    * Extra rows to to render outside of the viewport, which helps with smoothness of scrolling.
    * Defaults to 4
    * @default 4
    */
  var excessRows: js.UndefOr[Double] = js.native
  /**
    * Array of property names in data to ignore when auto-generating column names.  Provides the
    * inverse of columnDefs - columnDefs is a list of columns to include, excludeProperties is a list of columns
    * to exclude.
    *
    * If columnDefs is defined, this will be ignored.
    *
    * Defaults to ['$$hashKey']
    */
  var excludeProperties: js.UndefOr[js.Array[String]] = js.native
  var fastWatch: js.UndefOr[Boolean] = js.native
  /**
    * Set to true if your columns are all related directly to fields in a flat object structure - i.e.
    * each of your columns associate directly with a propery one each of the entities in your data array.
    *
    * In that situation we can avoid all the logic associated with complex binding to functions or to properties
    * of sub-objects, which can provide a significant speed improvement with large data sets, with filtering and
    * with sorting.
    *
    * By default false
    * @default false
    */
  var flatEntityAccess: js.UndefOr[Boolean] = js.native
  /**
    * (optional) ui-grid/ui-grid-footer by default.  This footer shows the per-column
    * aggregation totals.
    * When provided, this setting uses a custom footer template. Can be set to either the name of a template
    * file 'footer_template.html', inline html
    * <pre>'<div class="ui-grid-bottom-panel" style="text-align: center">I am a Custom Grid Footer</div>'</pre>,
    * or the id of a precompiled template (TBD how to use this).  Refer to the custom footer tutorial for more
    * information.
    * @default 'ui-grid/ui-grid-footer'
    */
  var footerTemplate: js.UndefOr[String] = js.native
  /**
    * This function returns the identity value uniquely identifying this row,
    * if one is not present it does not set it.
    *
    * By default it returns the `$$hashKey` property but can be overridden to use any property
    * or set of properties you want.
    * @param {IGridRow} row The row for which you want the unique id
    * @returns {string} row uid
    */
  var getRowIdentity: js.UndefOr[js.Function1[/* row */ IGridRowOf[TEntity], _]] = js.native
  /**
    * (optional) ui-grid/ui-grid-grid-footer by default. This template by default shows the
    * total items at the bottom of the grid, and the selected items if selection is enabled.
    * @default 'ui-grid/ui-grid-grid-footer'
    */
  var gridFooterTemplate: js.UndefOr[String] = js.native
  /**
    * Null by default. When provided, this setting uses a custom header
    * template, rather than the default template. Can be set to either the name of a template file:
    * <pre>  $scope.gridOptions.headerTemplate = 'header_template.html';</pre>
    * inline html
    * <pre>  $scope.gridOptions.headerTemplate = '<div class="ui-grid-top-panel" style="text-align: center">
    *     I am a Custom Grid Header</div>'</pre>
    * or the id of a precompiled template (TBD how to use this).
    * </br>Refer to the custom header tutorial for more information.
    * If you want no header at all, you can set to an empty div:
    * <pre>  $scope.gridOptions.headerTemplate = '<div></div>';</pre>
    *
    * If you want to only have a static header, then you can set to static content.  If
    * you want to tailor the existing column headers, then you should look at the
    * current 'ui-grid-header.html' template in github as your starting point.
    * @default null
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /**
    * Defaults to 4
    * @default 4
    */
  var horizontalScrollThreshold: js.UndefOr[Double] = js.native
  /**
    * Inform the grid of whether there are rows
    * to load scrolling down
    * @default true
    */
  var infiniteScrollDown: js.UndefOr[Boolean] = js.native
  /**
    * Number of rows from the end of the dataset
    * at which infinite scroll will trigger a request
    * for more data
    * @default 20
    */
  var infiniteScrollRowsFromEnd: js.UndefOr[Double] = js.native
  /**
    * Inform the grid of whether there are rows
    * to load when scrolling up
    * @default false
    */
  var infiniteScrollUp: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to 200
    * @default 200
    */
  var maxVisibleColumnCount: js.UndefOr[Double] = js.native
  /**
    * Minimum number of rows to show when the grid doesn't have a defined height. Defaults to "10".
    * @default 10
    */
  var minRowsToShow: js.UndefOr[Double] = js.native
  /**
    * Columns can't be smaller than this, defaults to 10 pixels
    * @default 10
    */
  var minimumColumnSize: js.UndefOr[Double] = js.native
  /**
    * A callback that returns the gridApi once the grid is instantiated, which is
    * then used to interact with the grid programatically.
    *
    * Note that the gridApi.core.renderingComplete event is identical to this
    * callback, but has the advantage that it can be called from multiple places
    * if needed
    * @param {IGridApi} gridApi
    */
  var onRegisterApi: js.UndefOr[js.Function1[/* gridApi */ IGridApiOf[TEntity], Unit]] = js.native
  /**
    * By default, rows are compared using object equality.  This option can be overridden
    * to compare on any data item property or function
    * @param {TEntity} entityA First Data Item to compare
    * @param {TEntity} entityB Second Data Item to compare
    */
  var rowEquality: js.UndefOr[js.Function2[/* entityA */ TEntity, /* entityB */ TEntity, Boolean]] = js.native
  /**
    * The height of the row in pixels, defaults to 30
    * @default 30
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * This function is used to get and, if necessary, set the value uniquely identifying this row
    * (i.e. if an identity is not present it will set one).
    *
    * By default it returns the `$$hashKey` property if it exists. If it doesn't it uses gridUtil.nextUid()
    * to generate one
    */
  var rowIdentity: js.UndefOr[js.Function1[/* row */ IGridRowOf[TEntity], _]] = js.native
  /**
    * 'ui-grid/ui-grid-row' by default. When provided, this setting uses a
    * custom row template.  Can be set to either the name of a template file:
    * <pre> $scope.gridOptions.rowTemplate = 'row_template.html';</pre>
    * inline html
    * <pre>  $scope.gridOptions.rowTemplate =
    * '<div style="background-color: aquamarine"
    *       ng-click="grid.appScope.fnOne(row)"
    *       ng-repeat="col in colContainer.renderedColumns track by col.colDef.name"
    *       class="ui-grid-cell" ui-grid-cell></div>';</pre>
    * or the id of a precompiled template (TBD how to use this) can be provided.
    * </br>Refer to the custom row template tutorial for more information.
    * @default 'ui-grid/ui-grid-row'
    */
  var rowTemplate: js.UndefOr[String] = js.native
  /**
    * Default time in milliseconds to debounce scroll events, defaults to 300ms
    * @default 300
    */
  var scrollDebounce: js.UndefOr[Double] = js.native
  /**
    * Defaults to 4
    * @default 4
    */
  var scrollThreshold: js.UndefOr[Double] = js.native
  /**
    * Whether or not to show the column footer, defaults to false
    * The column footer displays column aggregates
    * @default false
    */
  var showColumnFooter: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to show the footer, defaults to false
    * The footer display Total Rows and Visible Rows (filtered rows)
    * @default false
    */
  var showGridFooter: js.UndefOr[Boolean] = js.native
  /**
    * True by default. When set to false, this setting will replace the
    * standard header template with '<div></div>', resulting in no header being shown.
    * @default true
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /**
    * Disables client side filtering. When true, handle the filterChanged event and set data,
    * defaults to false
    * @default false
    */
  var useExternalFiltering: js.UndefOr[Boolean] = js.native
  /**
    * Disables client side sorting. When true, handle the sortChanged event and do the sorting there
    * @default false
    */
  var useExternalSorting: js.UndefOr[Boolean] = js.native
  /**
    * Turn virtualization on when number of data elements goes over this number, defaults to 20
    * @default 20
    */
  var virtualizationThreshold: js.UndefOr[Double] = js.native
  /**
    * Default time in milliseconds to throttle scroll events to, defaults to 70ms
    * @default 70
    */
  var wheelScrollThrottle: js.UndefOr[Double] = js.native
}

object IGridOptionsOf {
  @scala.inline
  def apply[TEntity](): IGridOptionsOf[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptionsOf[TEntity]]
  }
  @scala.inline
  implicit class IGridOptionsOfOps[Self[tentity] <: IGridOptionsOf[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withAggregationCalcThrottle(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationCalcThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationCalcThrottle: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationCalcThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withAppScopeProvider(value: IScope | js.Object): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appScopeProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppScopeProvider: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appScopeProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDefs(value: js.Array[IColumnDefOf[TEntity]]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDefs: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFooterHeight(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFooterHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFooterHeight: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFooterHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnVirtualizationThreshold(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnVirtualizationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnVirtualizationThreshold: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnVirtualizationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[TEntity] | String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
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
    def withEnableGridMenu(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridMenu: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHorizontalScrollbar(value: Boolean | Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHorizontalScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHorizontalScrollbar: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHorizontalScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMinHeightCheck(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMinHeightCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMinHeightCheck: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMinHeightCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowHashing(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHashing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowHashing: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHashing")(js.undefined)
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
    def withEnableVerticalScrollbar(value: Boolean | Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVerticalScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVerticalScrollbar: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVerticalScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withExcessColumns(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excessColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcessColumns: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excessColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withExcessRows(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excessRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcessRows: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excessRows")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeProperties(value: js.Array[String]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeProperties: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withFastWatch(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastWatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastWatch: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastWatch")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatEntityAccess(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatEntityAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatEntityAccess: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatEntityAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterTemplate(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterTemplate: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowIdentity(value: /* row */ IGridRowOf[TEntity] => _): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIdentity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowIdentity: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withGridFooterTemplate(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridFooterTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridFooterTemplate: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridFooterTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalScrollThreshold(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalScrollThreshold: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteScrollDown(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteScrollDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteScrollDown: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteScrollDown")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteScrollRowsFromEnd(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteScrollRowsFromEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteScrollRowsFromEnd: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteScrollRowsFromEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteScrollUp(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteScrollUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteScrollUp: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteScrollUp")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVisibleColumnCount(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVisibleColumnCount: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRowsToShow(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowsToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRowsToShow: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowsToShow")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumColumnSize(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumColumnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumColumnSize: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumColumnSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRegisterApi(value: /* gridApi */ IGridApiOf[TEntity] => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegisterApi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRegisterApi: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegisterApi")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEquality(value: (/* entityA */ TEntity, /* entityB */ TEntity) => Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEquality")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowEquality: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEquality")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIdentity(value: /* row */ IGridRowOf[TEntity] => _): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIdentity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowIdentity: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTemplate(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTemplate: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDebounce(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDebounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDebounce: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDebounce")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollThreshold(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollThreshold: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnFooter(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnFooter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridFooter(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridFooter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExternalFiltering(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExternalFiltering: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExternalSorting(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExternalSorting: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualizationThreshold(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationThreshold: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelScrollThrottle(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelScrollThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelScrollThrottle: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelScrollThrottle")(js.undefined)
        ret
    }
  }
  
}

