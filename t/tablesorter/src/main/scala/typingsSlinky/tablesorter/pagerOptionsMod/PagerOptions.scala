package typingsSlinky.tablesorter.pagerOptionsMod

import typingsSlinky.jquery.JQuery.AjaxSettings
import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.jquery.JQueryAjaxSettings
import typingsSlinky.tablesorter.ajaxDataProcessorMod.AjaxDataProcessor
import typingsSlinky.tablesorter.ajaxErrorHandlerMod.AjaxErrorHandler
import typingsSlinky.tablesorter.ajaxUrlProcessorMod.AjaxUrlProcessor
import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.pageSizeMod.PageSize
import typingsSlinky.tablesorter.pagerClassesMod.PagerClasses
import typingsSlinky.tablesorter.pagerDataPartMod.PagerDataPart
import typingsSlinky.tablesorter.pagerInitialRowsMod.PagerInitialRows
import typingsSlinky.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import typingsSlinky.tablesorter.pagerSelectorsMod.PagerSelectors
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerOptions[TElement] extends js.Object {
  /**
    * Handles errors caused by an ajax-request.
    */
  var pager_ajaxError: js.UndefOr[AjaxErrorHandler[TElement]] = js.native
  /**
    * The settings for the api-interaction of the pager.
    */
  var pager_ajaxObject: js.UndefOr[JQueryAjaxSettings] = js.native
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
  var pager_ajaxProcessing: js.UndefOr[AjaxDataProcessor[TElement]] = js.native
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
  var pager_ajaxUrl: js.UndefOr[String] = js.native
  /**
    * A value indicating whether to split child-rows on page-breaks.
    */
  var pager_countChildRows: js.UndefOr[Boolean] = js.native
  /**
    * The css-classes to apply to the pager-controls.
    */
  var pager_css: js.UndefOr[PagerClasses] = js.native
  /**
    * Pre-processes the url for `ajax`.
    */
  var pager_customAjaxUrl: js.UndefOr[AjaxUrlProcessor[TElement]] = js.native
  /**
    * A value indicating whether the table should always have the same number of rows even if there is a lesser number of records to show.
    */
  var pager_fixedHeight: js.UndefOr[Boolean] = js.native
  /**
    * The initial amount of rows to show.
    */
  var pager_initialRows: js.UndefOr[PagerInitialRows] = js.native
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
  var pager_output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.native
  /**
    * The number of the first page to show after applying a filter.
    */
  var pager_pageReset: js.UndefOr[Double | Boolean] = js.native
  /**
    * A value indicating whether an ajax-request should be executed after the initialization of the table.
    */
  var pager_processAjaxOnInit: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether to remove the rows while performing sortings for speed up.
    */
  var pager_removeRows: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether to save the current page locally.
    */
  var pager_savePages: js.UndefOr[Boolean] = js.native
  /**
    * The selectors for for handling click-events.
    */
  var pager_selectors: js.UndefOr[PagerSelectors] = js.native
  /**
    * The initial page-size.
    */
  var pager_size: js.UndefOr[PageSize] = js.native
  /**
    * The number of the first page to show.
    */
  var pager_startPage: js.UndefOr[Double] = js.native
  /**
    * The key to of the local storage to save data to.
    */
  var pager_storageKey: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the `pager_css.disabled` class should be applied to non-applicable buttons.
    */
  var pager_updateArrows: js.UndefOr[Boolean] = js.native
}

object PagerOptions {
  @scala.inline
  def apply[TElement](): PagerOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerOptions[TElement]]
  }
  @scala.inline
  implicit class PagerOptionsOps[Self[telement] <: PagerOptions[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withPager_ajaxError(
      value: (/* config */ TablesorterConfigurationStore[TElement], /* request */ jqXHR[js.Any], /* ajaxSettings */ AjaxSettings[js.Any], /* thrownError */ String) => String
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_ajaxError")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutPager_ajaxError: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_ajaxError")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_ajaxObject(value: JQueryAjaxSettings): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_ajaxObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_ajaxObject: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_ajaxObject")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_ajaxProcessing(
      value: (/* data */ js.Any, TElement, /* request */ jqXHR[js.Any]) => PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
          Double, 
          JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
          js.UndefOr[js.Array[String]]
        ])
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_ajaxProcessing")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPager_ajaxProcessing: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_ajaxProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_ajaxUrl(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_ajaxUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_ajaxUrl: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_ajaxUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_countChildRows(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_countChildRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_countChildRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_countChildRows")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_css(value: PagerClasses): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_css: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_css")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_customAjaxUrl(value: (TElement, /* url */ String) => String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_customAjaxUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPager_customAjaxUrl: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_customAjaxUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_fixedHeight(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_fixedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_fixedHeight: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_fixedHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_initialRows(value: PagerInitialRows): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_initialRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_initialRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_initialRows")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_outputFunction2(value: (TElement, /* pager */ js.Any) => String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_output")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPager_output(value: String | PagerOutputProcessor[TElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_output: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_output")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_pageReset(value: Double | Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_pageReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_pageReset: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_pageReset")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_processAjaxOnInit(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_processAjaxOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_processAjaxOnInit: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_processAjaxOnInit")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_removeRows(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_removeRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_removeRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_removeRows")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_savePages(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_savePages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_savePages: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_savePages")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_selectors(value: PagerSelectors): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_selectors: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_size(value: PageSize): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_size: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_size")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_startPage(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_startPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_startPage: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_startPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_storageKey(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_storageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_storageKey: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_storageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPager_updateArrows(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_updateArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager_updateArrows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager_updateArrows")(js.undefined)
        ret
    }
  }
  
}

