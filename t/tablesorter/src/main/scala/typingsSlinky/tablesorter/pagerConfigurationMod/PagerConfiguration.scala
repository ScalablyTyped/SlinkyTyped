package typingsSlinky.tablesorter.pagerConfigurationMod

import typingsSlinky.jquery.JQueryAjaxSettings
import typingsSlinky.jquery.JQuery_.AjaxSettings
import typingsSlinky.jquery.JQuery_.Selector
import typingsSlinky.jquery.JQuery_.jqXHR
import typingsSlinky.tablesorter.ajaxDataProcessorMod.AjaxDataProcessor
import typingsSlinky.tablesorter.ajaxErrorHandlerMod.AjaxErrorHandler
import typingsSlinky.tablesorter.ajaxUrlProcessorMod.AjaxUrlProcessor
import typingsSlinky.tablesorter.mod._Global_.HTMLElement
import typingsSlinky.tablesorter.mod._Global_.JQuery
import typingsSlinky.tablesorter.pageSizeMod.PageSize
import typingsSlinky.tablesorter.pagerDataPartMod.PagerDataPart
import typingsSlinky.tablesorter.pagerInitialRowsMod.PagerInitialRows
import typingsSlinky.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerConfiguration[TElement] extends js.Object {
  /**
    * Handles errors caused by an ajax-request.
    */
  var ajaxError: js.UndefOr[AjaxErrorHandler[TElement]] = js.native
  /**
    * The settings for the api-interaction of the pager.
    */
  var ajaxObject: js.UndefOr[JQueryAjaxSettings] = js.native
  /**
    * Processes the ajax-result for the `pager`-widget.
    *
    * @param data
    * The result of ajax.
    *
    * @param table
    * The table which is being processed.
    *
    * @param request
    * The ajax-request which processed the `data`.
    *
    * @return
    * The data for the pager to show.
    */
  var ajaxProcessing: js.UndefOr[AjaxDataProcessor[TElement]] = js.native
  /**
    * The url to query data from.
    *
    * Following portions of text are substituted:
    *
    * | Tag                                    | Replacement                                                            |
    * |----------------------------------------|------------------------------------------------------------------------|
    * | `{page}`                               | The zero-based index of the page to show.                              |
    * | `{page+n}`                             | The zero-based index of the page added to `n`.                         |
    * | `{size}`                               | The number of rows to fetch.                                           |
    * | `{sortList:name}` or `{sort:name}`     | A GET-variable called `name` containing the current sorting.           |
    * | `{filterList:name}` or `{filter:name}` | A GET-variable called `name` containing all currently applied filters. |
    */
  var ajaxUrl: js.UndefOr[String] = js.native
  /**
    * The selector for querying the pager-container.
    */
  var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * A value indicating whether to split child-rows on page-breaks.
    */
  var countChildRows: js.UndefOr[Boolean] = js.native
  /**
    * The css-class to apply to disabled pager-controls.
    */
  var cssDisabled: js.UndefOr[String] = js.native
  /**
    * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
    */
  var cssErrorRow: js.UndefOr[String] = js.native
  /**
    * The selector for querying the control to jump to the first page.
    */
  var cssFirst: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the dropdown-control to jump to a specific page.
    */
  var cssGoto: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the last page.
    */
  var cssLast: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the next page.
    */
  var cssNext: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the container to print the output to.
    */
  var cssPageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to set the page-size.
    */
  var cssPageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * The selector for querying the control to jump to the previous page.
    */
  var cssPrev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * Pre-processes the url for `ajax`.
    */
  var customAjaxUrl: js.UndefOr[AjaxUrlProcessor[TElement]] = js.native
  /**
    * A value indicating whether the table should always have the same number of rows even if there is a lesser number of records to show.
    */
  var fixedHeight: js.UndefOr[Boolean] = js.native
  /**
    * The initial amount of rows to show.
    */
  var initialRows: js.UndefOr[PagerInitialRows] = js.native
  /**
    * The output to display in the output-area.
    *
    * Following portions of text are substituted:
    *
    * | Tag                | Replacement                                  |
    * |--------------------|----------------------------------------------|
    * | `{size}`           | The current page size.                       |
    * | `{page}`           | The current page.                            |
    * | `{page:input}`     | The page inputted by the user.               |
    * | `{totalPages}`     | The total amount of pages.                   |
    * | `{filteredPages}`  | The filtered number of pages.                |
    * | `{startRow}`       | The number of the first row being displayed. |
    * | `{startRow:input}` | The start-row inputted by the user.          |
    * | `{endRow}`         | The number of the last row being displayed.  |
    * | `{filteredRows}`   | The amount of filtered rows.                 |
    * | `{totalRows}`      | The total amount of rows.                    |
    */
  var output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.native
  /**
    * The number of the first page to show.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * The number of the first page to show after applying a filter.
    */
  var pageReset: js.UndefOr[Double | Boolean] = js.native
  /**
    * A value indicating whether an ajax-request should be executed after the initialization of the table.
    */
  var processAjaxOnInit: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether to remove the rows while performing sortings for speed up.
    */
  var removeRows: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether to save the current page locally.
    */
  var savePages: js.UndefOr[Boolean] = js.native
  /**
    * The initial page-size.
    */
  var size: js.UndefOr[PageSize] = js.native
  /**
    * The key to of the local storage to save data to.
    */
  var storageKey: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the `cssDisabled` class should be applied to non-applicable buttons.
    */
  var updateArrows: js.UndefOr[Boolean] = js.native
}

object PagerConfiguration {
  @scala.inline
  def apply[TElement](): PagerConfiguration[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerConfiguration[TElement]]
  }
  @scala.inline
  implicit class PagerConfigurationOps[Self[telement] <: PagerConfiguration[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withAjaxError(
      value: (/* config */ TablesorterConfigurationStore[TElement], /* request */ jqXHR[js.Any], /* ajaxSettings */ AjaxSettings[js.Any], /* thrownError */ String) => String
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAjaxError: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxObject(value: JQueryAjaxSettings): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxObject: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxObject")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxProcessing(
      value: (/* data */ js.Any, TElement, /* request */ jqXHR[js.Any]) => PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
          Double, 
          JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
          js.UndefOr[js.Array[String]]
        ])
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxProcessing")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAjaxProcessing: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxUrl(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxUrl: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCountChildRows(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countChildRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountChildRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countChildRows")(js.undefined)
        ret
    }
    @scala.inline
    def withCssDisabled(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssDisabled: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCssErrorRow(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssErrorRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssErrorRow: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssErrorRow")(js.undefined)
        ret
    }
    @scala.inline
    def withCssFirst(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssFirst: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withCssGoto(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssGoto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssGoto: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssGoto")(js.undefined)
        ret
    }
    @scala.inline
    def withCssLast(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssLast: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssLast")(js.undefined)
        ret
    }
    @scala.inline
    def withCssNext(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssNext: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssNext")(js.undefined)
        ret
    }
    @scala.inline
    def withCssPageDisplay(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPageDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssPageDisplay: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPageDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withCssPageSize(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssPageSize: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCssPrev(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssPrev: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAjaxUrl(value: (TElement, /* url */ String) => String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAjaxUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomAjaxUrl: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAjaxUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeight(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeight: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRows(value: PagerInitialRows): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRows")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFunction2(value: (TElement, /* pager */ js.Any) => String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOutput(value: String | PagerOutputProcessor[TElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPageReset(value: Double | Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageReset: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageReset")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessAjaxOnInit(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processAjaxOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessAjaxOnInit: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processAjaxOnInit")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveRows(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSavePages(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavePages: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savePages")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: PageSize): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageKey(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageKey: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateArrows(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateArrows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateArrows")(js.undefined)
        ret
    }
  }
  
}

