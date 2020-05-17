package typingsSlinky.tablesorter.filterOptionsMod

import typingsSlinky.jquery.JQuery.Selector
import typingsSlinky.tablesorter.filterControlFactoryMod.FilterControlFactory
import typingsSlinky.tablesorter.filterFunctionCollectionMod.FilterFunctionCollection
import typingsSlinky.tablesorter.filterFunctionMod.FilterFunction
import typingsSlinky.tablesorter.filterPlaceholdersMod.FilterPlaceholders
import typingsSlinky.tablesorter.mappedSettingsMod.MappedSettings
import typingsSlinky.tablesorter.matchTypeSettingsMod.MatchTypeSettings
import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.selectSourcesMod.SelectSources
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typingsSlinky.tablesorter.validSelectSourcesMod.ValidSelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOptions[TElement] extends js.Object {
  /**
    * A set of classes to apply to the filter-cells.
    */
  var filter_cellFilter: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * A value indicating whether only the filtered column of child-rows should be considered when filtering.
    */
  var filter_childByColumn: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether child-rows should be considered when filtering.
    */
  var filter_childRows: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether siblings should be displayed when filtering.
    */
  var filter_childWithSibs: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether searches using the `{index}:{query}` in the anyMatch-textbox is allowed.
    */
  var filter_columnAnyMatch: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether filtering is enabled.
    */
  var filter_columnFilters: js.UndefOr[Boolean] = js.native
  /**
    * A CSS class which is applied to each filter-cell.
    */
  var filter_cssFilter: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The attribute-name which is used for querying the default filter-value.
    */
  var filter_defaultAttrib: js.UndefOr[String] = js.native
  /**
    * The default filters to apply.
    */
  var filter_defaultFilter: js.UndefOr[MappedSettings[String]] = js.native
  /**
    * A set of filters to prevent.
    */
  var filter_excludeFilter: js.UndefOr[MappedSettings[String]] = js.native
  /**
    * The jQuery-selector for querying the external search-box.
    */
  var filter_external: js.UndefOr[Selector] = js.native
  /**
    * The template for generating the ARIA-label of the filter-control.
    */
  var filter_filterLabel: js.UndefOr[String] = js.native
  /**
    * A CSS class which is applied for each cel which is filtered.
    */
  var filter_filteredRow: js.UndefOr[String] = js.native
  /**
    * The filter-controls to apply.
    */
  var filter_formatter: js.UndefOr[MappedSettings[FilterControlFactory]] = js.native
  /**
    * A set of filter-functions to apply for the columns.
    */
  var filter_functions: js.UndefOr[MappedSettings[FilterFunctionCollection[TElement] | FilterFunction[TElement]]] = js.native
  /**
    * A value indicating whether the filter-controls should be hidden when the table is empty.
    */
  var filter_hideEmpty: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the filter should hide automatically.
    */
  var filter_hideFilters: js.UndefOr[
    Boolean | (js.Function1[/* config */ TablesorterConfigurationStore[TElement], Boolean])
  ] = js.native
  /**
    * A value indicating whether the letter-case should be ignored.
    */
  var filter_ignoreCase: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether a search should be performed without having to hit `Enter`.
    */
  var filter_liveSearch: js.UndefOr[Boolean | Double | (MappedSettings[Boolean | Double])] = js.native
  /**
    * The match-types to apply to the controls.
    */
  var filter_matchType: js.UndefOr[MatchTypeSettings] = js.native
  /**
    * A class for indicating whether only visible entries should be available in `select`-controls.
    */
  var filter_onlyAvail: js.UndefOr[String] = js.native
  /**
    * The placeholders to set initially.
    */
  var filter_placeholder: js.UndefOr[FilterPlaceholders] = js.native
  /**
    * A jQuery-selector for querying the button for resetting the filter.
    */
  var filter_reset: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  /**
    * A value indicating whether the filter should be resetted when `ESC` is hit.
    */
  var filter_resetOnEsc: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the filters should be saved to the client.
    */
  var filter_saveFilters: js.UndefOr[Boolean] = js.native
  /**
    * The number of miliseconds to wait before performing a search.
    */
  var filter_searchDelay: js.UndefOr[Double] = js.native
  /**
    * A value indicating whether only filtered rows should be considered while searching.
    */
  var filter_searchFiltered: js.UndefOr[Boolean] = js.native
  /**
    * The sources for the select-controls.
    */
  var filter_selectSource: js.UndefOr[SelectSources[TElement] | MappedSettings[SelectSources[TElement]]] = js.native
  /**
    * The character for separating display-name and value inside the `filter_selectSource`.
    */
  var filter_selectSourceSeparator: js.UndefOr[String] = js.native
  /**
    * A value indicating whether filtering is performed server-side.
    */
  var filter_serversideFiltering: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether searches should be performed with the `starts with`-logic.
    */
  var filter_startsWith: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether filtering should be perormed using parsed data.
    */
  var filter_useParsedData: js.UndefOr[Boolean] = js.native
}

object FilterOptions {
  @scala.inline
  def apply[TElement](): FilterOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions[TElement]]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self[telement] <: FilterOptions[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withFilter_cellFilter(value: String | js.Array[String]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_cellFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_cellFilter: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_cellFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_childByColumn(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_childByColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_childByColumn: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_childByColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_childRows(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_childRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_childRows: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_childRows")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_childWithSibs(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_childWithSibs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_childWithSibs: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_childWithSibs")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_columnAnyMatch(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_columnAnyMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_columnAnyMatch: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_columnAnyMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_columnFilters(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_columnFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_columnFilters: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_columnFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_cssFilter(value: String | js.Array[String]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_cssFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_cssFilter: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_cssFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_defaultAttrib(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_defaultAttrib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_defaultAttrib: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_defaultAttrib")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_defaultFilter(value: MappedSettings[String]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_defaultFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_defaultFilter: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_defaultFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_excludeFilter(value: MappedSettings[String]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_excludeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_excludeFilter: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_excludeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_external(value: Selector): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_external: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_external")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_filterLabel(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_filterLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_filterLabel: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_filterLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_filteredRow(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_filteredRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_filteredRow: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_filteredRow")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_formatter(value: MappedSettings[FilterControlFactory]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_formatter: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_functions(value: MappedSettings[FilterFunctionCollection[TElement] | FilterFunction[TElement]]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_functions: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_functions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_hideEmpty(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_hideEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_hideEmpty: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_hideEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_hideFiltersFunction1(value: /* config */ TablesorterConfigurationStore[TElement] => Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_hideFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter_hideFilters(value: Boolean | (js.Function1[/* config */ TablesorterConfigurationStore[TElement], Boolean])): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_hideFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_hideFilters: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_hideFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_ignoreCase(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_ignoreCase: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_ignoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_liveSearch(value: Boolean | Double | (MappedSettings[Boolean | Double])): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_liveSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_liveSearch: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_liveSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_matchType(value: MatchTypeSettings): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_matchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_matchType: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_matchType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_onlyAvail(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_onlyAvail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_onlyAvail: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_onlyAvail")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_placeholder(value: FilterPlaceholders): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_placeholder: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_reset(value: Selector | JQuery[HTMLElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_reset: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_reset")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_resetOnEsc(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_resetOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_resetOnEsc: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_resetOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_saveFilters(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_saveFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_saveFilters: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_saveFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_searchDelay(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_searchDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_searchDelay: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_searchDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_searchFiltered(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_searchFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_searchFiltered: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_searchFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_selectSourceFunction3(value: (TElement, /* index */ Double, /* onlyAvail */ Boolean) => ValidSelectSources): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_selectSource")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFilter_selectSource(value: SelectSources[TElement] | MappedSettings[SelectSources[TElement]]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_selectSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_selectSource: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_selectSource")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_selectSourceNull: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_selectSource")(null)
        ret
    }
    @scala.inline
    def withFilter_selectSourceSeparator(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_selectSourceSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_selectSourceSeparator: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_selectSourceSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_serversideFiltering(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_serversideFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_serversideFiltering: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_serversideFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_startsWith(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_startsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_startsWith: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_startsWith")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_useParsedData(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_useParsedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_useParsedData: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_useParsedData")(js.undefined)
        ret
    }
  }
  
}

