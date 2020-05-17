package typingsSlinky.tablesorter.tablesorterConfigurationMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.jquery.JQuery.Selector
import typingsSlinky.tablesorter.coreThemeMod.CoreTheme
import typingsSlinky.tablesorter.emptySortingMod.EmptySorting
import typingsSlinky.tablesorter.globalizeSettingsMod.GlobalizeSettings
import typingsSlinky.tablesorter.initializationEventHandlerMod.InitializationEventHandler
import typingsSlinky.tablesorter.mappedSettingsMod.MappedSettings
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.numberSorterMod.NumberSorter
import typingsSlinky.tablesorter.relativeSortDefinitionMod.RelativeSortDefinition
import typingsSlinky.tablesorter.renderHeaderEventHandlerMod.RenderHeaderEventHandler
import typingsSlinky.tablesorter.renderTemplateEventHandlerMod.RenderTemplateEventHandler
import typingsSlinky.tablesorter.sortDefinitionMod.SortDefinition
import typingsSlinky.tablesorter.stringSortingMod.StringSorting
import typingsSlinky.tablesorter.tablesorterConfigBaseMod.TablesorterConfigBase
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typingsSlinky.tablesorter.tablesorterHeadingMod.TablesorterHeading
import typingsSlinky.tablesorter.tablesorterStrings.altKey
import typingsSlinky.tablesorter.tablesorterStrings.basic
import typingsSlinky.tablesorter.tablesorterStrings.button
import typingsSlinky.tablesorter.tablesorterStrings.buttons
import typingsSlinky.tablesorter.tablesorterStrings.clientX
import typingsSlinky.tablesorter.tablesorterStrings.clientY
import typingsSlinky.tablesorter.tablesorterStrings.ctrlKey
import typingsSlinky.tablesorter.tablesorterStrings.metaKey
import typingsSlinky.tablesorter.tablesorterStrings.movementX
import typingsSlinky.tablesorter.tablesorterStrings.movementY
import typingsSlinky.tablesorter.tablesorterStrings.offsetX
import typingsSlinky.tablesorter.tablesorterStrings.offsetY
import typingsSlinky.tablesorter.tablesorterStrings.pageX
import typingsSlinky.tablesorter.tablesorterStrings.pageY
import typingsSlinky.tablesorter.tablesorterStrings.relatedTarget
import typingsSlinky.tablesorter.tablesorterStrings.screenX
import typingsSlinky.tablesorter.tablesorterStrings.screenY
import typingsSlinky.tablesorter.tablesorterStrings.shiftKey
import typingsSlinky.tablesorter.tablesorterStrings.x
import typingsSlinky.tablesorter.tablesorterStrings.y
import typingsSlinky.tablesorter.textExtractorMod.TextExtractor
import typingsSlinky.tablesorter.textSorterMod.TextSorter
import typingsSlinky.tablesorter.widgetOptionsMod.WidgetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesorterConfiguration[TElement] extends TablesorterConfigBase {
  /**
    * A value indicating whether the selection of the text in the table headers should be disabled.
    */
  var cancelSelection: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether only visible rows should be affected by the checkbox located in the header.
    */
  var cehckboxVisible: js.UndefOr[Boolean] = js.native
  /**
    * A class to add to checked rows.
    */
  var checkboxClass: js.UndefOr[String] = js.native
  /**
    * A class to add to table headers with ascending sort.
    */
  var cssAsc: js.UndefOr[String] = js.native
  /**
    * A class for indicating rows which should be attached to the above row.
    */
  var cssChildRow: js.UndefOr[String] = js.native
  /**
    * A class to add to table headers with descending sort.
    */
  var cssDesc: js.UndefOr[String] = js.native
  /**
    * A class to add to the table headers.
    */
  var cssHeader: js.UndefOr[String] = js.native
  /**
    * A class to add to the header-row.
    */
  var cssHeaderRow: js.UndefOr[String] = js.native
  /**
    * A class to add to the sort-icons.
    */
  var cssIcon: js.UndefOr[String] = js.native
  /**
    * A class to add to sort-icons for with ascending sorting.
    */
  var cssIconAsc: js.UndefOr[String] = js.native
  /**
    * A class to add to sort-icons with descending sorting.
    */
  var cssIconDesc: js.UndefOr[String] = js.native
  /**
    * A class to add to sort-icons with disabled sorting.
    */
  var cssIconDisabled: js.UndefOr[String] = js.native
  /**
    * A class to add to sort-icons without sorting.
    */
  var cssIconNone: js.UndefOr[String] = js.native
  /**
    * A class for indicating rows which should be ignored.
    */
  var cssIgnoreRow: js.UndefOr[String] = js.native
  /**
    * A class for indicating `tbody`s which should not be sortable.
    */
  var cssInfoBlock: js.UndefOr[String] = js.native
  /**
    * A class for indicating elements which don't cause a sort when clicking on them.
    */
  var cssNoSort: js.UndefOr[String] = js.native
  /**
    * A class to add to headers when no sort is applied.
    */
  var cssNone: js.UndefOr[String] = js.native
  /**
    * A class to add to the header-row while applying a processing the table.
    */
  var cssProcessing: js.UndefOr[String] = js.native
  /**
    * The storage for the `build-table` widget.
    */
  var data: js.UndefOr[js.Object | js.Array[js.Array[_]]] = js.native
  /**
    * The date-range for two-digit years.
    */
  var dateRange: js.UndefOr[Double] = js.native
  /**
    * Either value indicating whether debug-information should be printed or a set of plugin-names to print debug-information from.
    */
  var debug: js.UndefOr[Boolean | String] = js.native
  /**
    * A value indicating whether the table should be initialized upon the initial sort-action.
    */
  var delayInit: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether contents of spanned cells should be sortable and filterable in all table headers.
    */
  var duplicateSpan: js.UndefOr[Boolean] = js.native
  /**
    * The sorting to apply for empty cells.
    */
  var emptyTo: js.UndefOr[EmptySorting] = js.native
  /**
    * Either global `Globalize`-settings or per-column `Globalize`-settings to apply.
    */
  var globalize: js.UndefOr[GlobalizeSettings | NumberDictionary[GlobalizeSettings]] = js.native
  /**
    * A template for generating headers.
    *
    * ***Note:***
    *   * `{content}` is replaced by the actual content of the header
    *   * If `cssIcon` is set, `{icon}` is replaced by a tag for the icon
    *
    * This template may also contain html-code.
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /**
    * Specific configurations for separate headers.
    */
  var headers: js.UndefOr[NumberDictionary[TablesorterHeading]] = js.native
  /**
    * A value indicating whether letter-case should be considered while sorting.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether changes to child-rows are ignored by the table-sorter.
    */
  var ignoreChildRow: js.UndefOr[Boolean] = js.native
  /**
    * The attribute to read the text-value from `img`-tags.
    */
  var imgAttr: js.UndefOr[String] = js.native
  /**
    * A value indicating whether widgets should be initialized.
    */
  var initWidgets: js.UndefOr[Boolean] = js.native
  /**
    * Processes the table after the initialization.
    */
  var initialized: js.UndefOr[InitializationEventHandler[TElement]] = js.native
  /**
    * The namespace of the table.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * The number-sorting to apply.
    */
  var numberSorter: js.UndefOr[NumberSorter] = js.native
  /**
    * A function to execute after the content of the header is processed.
    *
    * @param index
    * The zero-based index of the current table header cell.
    *
    * @param config
    * The current configuration of the table.
    *
    * @param table
    * The jQuery-object of the table.
    */
  var onRenderHeader: js.UndefOr[RenderHeaderEventHandler[TElement]] = js.native
  /**
    * A function for processing the header.
    *
    * @param index
    * The zero-based index of the header.
    *
    * @param template
    * The rendered content of the header.
    *
    * @return
    * A manipulated version of the content of the header.
    */
  var onRenderTemplate: js.UndefOr[RenderTemplateEventHandler] = js.native
  /**
    * One or more events which should be considered as a `click`-event.
    */
  var pointerClick: js.UndefOr[String] = js.native
  /**
    * One or more events which should be considered as a `mousedown`-event.
    */
  var pointerDown: js.UndefOr[String] = js.native
  /**
    * One or more events which should be considered as a `mouseup`-event.
    */
  var pointerUp: js.UndefOr[String] = js.native
  /**
    * A value indicating whether the sorting should be reapplied after an update of the table-data.
    */
  var resort: js.UndefOr[Boolean] = js.native
  /**
    * A jQuery-selector for finding cells in the header-row.
    */
  var selectorHeaders: js.UndefOr[Selector] = js.native
  /**
    * A jQuery-selector for finding rows to remove prior to a table-update.
    */
  var selectorRemove: js.UndefOr[Selector] = js.native
  /**
    * A jQuery-selector to find clickable elements inside the result of `selectorHeaders` for triggering a sort.
    */
  var selectorSort: js.UndefOr[Selector] = js.native
  /**
    * A value indicating whether the sorting is performed by the server.
    */
  var serverSideSorting: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether a timer icon should be shown while applying sorting and filtering.
    */
  var showProcessing: js.UndefOr[Boolean] = js.native
  /**
    * Sortings to append to the current sorting.
    */
  var sortAppend: js.UndefOr[js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]] = js.native
  /**
    * Sortings to prepend to the current sorting.
    */
  var sortForce: js.UndefOr[js.Array[SortDefinition]] = js.native
  /**
    * The initial sorting after the initialization of the table.
    */
  var sortList: js.UndefOr[js.Array[SortDefinition]] = js.native
  /**
    * A value indicating whether accent character should be converted to their equivalent characters during sort.
    */
  var sortLocaleCompare: js.UndefOr[Boolean] = js.native
  /**
    * The key which is used for selecting multiple columns.
    */
  var sortMultiSortKey: js.UndefOr[
    altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
  ] = js.native
  /**
    * A value indicating whether the user can reset a sorting of a column by clicking on it a third time.
    */
  var sortReset: js.UndefOr[Boolean] = js.native
  /**
    * The key to hold while clicking on a heading for reseting the sorting for the whole table.
    */
  var sortResetKey: js.UndefOr[
    altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | x | y
  ] = js.native
  /**
    * A value indicating whether sortings other than the ones in the `sortList` should be prevented.
    */
  var sortRestart: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether to apply the original sorting when two cells have the same value.
    */
  var sortStable: js.UndefOr[Boolean] = js.native
  /**
    * The sorting to apply to text cells in numeric columns.
    */
  var stringTo: js.UndefOr[StringSorting] = js.native
  /**
    * A value indicating whether tabbing through table headings is enabled.
    */
  var tabIndex: js.UndefOr[Boolean] = js.native
  /**
    * A class to add to the table.
    */
  var tableClass: js.UndefOr[String] = js.native
  /**
    * The `data-attribute` to automatically read text from cells.
    */
  var textAttribute: js.UndefOr[String] = js.native
  /**
    * The methods for extracting text from cells.
    */
  var textExtraction: js.UndefOr[
    basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])
  ] = js.native
  /**
    * The text-sorting to apply.
    */
  var textSorter: js.UndefOr[TextSorter[TElement] | MappedSettings[TextSorter[TElement]]] = js.native
  /**
    * The theme to use.
    */
  var theme: js.UndefOr[CoreTheme | String] = js.native
  /**
    * A value indicating whether to use `en-US`-flavored numbers.
    */
  var usNumberFormat: js.UndefOr[Boolean] = js.native
  /**
    * The format of the class-names for automatically loading the widget with the id `{name}`.
    *
    * The default setting is `widget-{name}`.
    */
  var widgetClass: js.UndefOr[String] = js.native
  /**
    * The options for the widgets.
    */
  var widgetOptions: js.UndefOr[WidgetOptions[TElement]] = js.native
  /**
    * The widgets to initialize.
    */
  var widgets: js.UndefOr[js.Array[String]] = js.native
  /**
    * A value indicating whether the width of the columns should be fixed.
    */
  var widthFixed: js.UndefOr[Boolean] = js.native
}

object TablesorterConfiguration {
  @scala.inline
  def apply[TElement](): TablesorterConfiguration[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablesorterConfiguration[TElement]]
  }
  @scala.inline
  implicit class TablesorterConfigurationOps[Self[telement] <: TablesorterConfiguration[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withCancelSelection(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelSelection: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCehckboxVisible(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cehckboxVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCehckboxVisible: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cehckboxVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxClass(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxClass: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCssAsc(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssAsc: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withCssChildRow(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssChildRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssChildRow: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssChildRow")(js.undefined)
        ret
    }
    @scala.inline
    def withCssDesc(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssDesc: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withCssHeader(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssHeader: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withCssHeaderRow(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssHeaderRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssHeaderRow: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssHeaderRow")(js.undefined)
        ret
    }
    @scala.inline
    def withCssIcon(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssIcon: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCssIconAsc(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIconAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssIconAsc: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIconAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withCssIconDesc(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIconDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssIconDesc: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIconDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withCssIconDisabled(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIconDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssIconDisabled: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIconDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCssIconNone(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIconNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssIconNone: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIconNone")(js.undefined)
        ret
    }
    @scala.inline
    def withCssIgnoreRow(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIgnoreRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssIgnoreRow: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssIgnoreRow")(js.undefined)
        ret
    }
    @scala.inline
    def withCssInfoBlock(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssInfoBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssInfoBlock: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssInfoBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withCssNoSort(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssNoSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssNoSort: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssNoSort")(js.undefined)
        ret
    }
    @scala.inline
    def withCssNone(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssNone: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssNone")(js.undefined)
        ret
    }
    @scala.inline
    def withCssProcessing(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssProcessing: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Object | js.Array[js.Array[_]]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRange(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRange: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean | String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayInit(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayInit: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayInit")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateSpan(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateSpan: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyTo(value: EmptySorting): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyTo: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalize(value: GlobalizeSettings | NumberDictionary[GlobalizeSettings]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalize: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalize")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: NumberDictionary[TablesorterHeading]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCase(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreChildRow(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreChildRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreChildRow: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreChildRow")(js.undefined)
        ret
    }
    @scala.inline
    def withImgAttr(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgAttr: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withInitWidgets(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initWidgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitWidgets: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initWidgets")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialized(value: TElement => Unit): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialized: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberSorter(value: (/* x */ Double, /* y */ Double, /* ascending */ Boolean, /* maxValue */ Double) => Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberSorter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutNumberSorter: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderHeader(
      value: (/* index */ Double, /* config */ TablesorterConfigurationStore[TElement], /* table */ JQuery[TElement]) => Unit
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderHeader")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRenderHeader: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderTemplate(value: (/* index */ Double, /* template */ String) => String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderTemplate: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerClick(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerClick: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerDown(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerDown: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerUp(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerUp: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withResort(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResort: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resort")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorHeaders(value: Selector): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorHeaders: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorRemove(value: Selector): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorRemove: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorSort(value: Selector): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorSort: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorSort")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideSorting(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideSorting: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withShowProcessing(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProcessing: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withSortAppend(value: js.Array[SortDefinition] | NumberDictionary[js.Array[RelativeSortDefinition]]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAppend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAppend: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAppend")(js.undefined)
        ret
    }
    @scala.inline
    def withSortForce(value: js.Array[SortDefinition]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortForce: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortForce")(js.undefined)
        ret
    }
    @scala.inline
    def withSortList(value: js.Array[SortDefinition]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortList: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortList")(js.undefined)
        ret
    }
    @scala.inline
    def withSortLocaleCompare(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortLocaleCompare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortLocaleCompare: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortLocaleCompare")(js.undefined)
        ret
    }
    @scala.inline
    def withSortMultiSortKey(
      value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typingsSlinky.tablesorter.tablesorterStrings.x | y
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMultiSortKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortMultiSortKey: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMultiSortKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSortReset(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortReset: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortReset")(js.undefined)
        ret
    }
    @scala.inline
    def withSortResetKey(
      value: altKey | button | buttons | clientX | clientY | ctrlKey | metaKey | movementX | movementY | offsetX | offsetY | pageX | pageY | relatedTarget | screenX | screenY | shiftKey | typingsSlinky.tablesorter.tablesorterStrings.x | y
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortResetKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortResetKey: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortResetKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSortRestart(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortRestart: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRestart")(js.undefined)
        ret
    }
    @scala.inline
    def withSortStable(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortStable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortStable: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortStable")(js.undefined)
        ret
    }
    @scala.inline
    def withStringTo(value: StringSorting): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringTo: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTableClass(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableClass: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAttribute(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAttribute: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withTextExtractionFunction3(value: (/* cell */ Element, TElement, /* index */ Double) => String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textExtraction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTextExtraction(value: basic | TextExtractor[TElement] | (MappedSettings[basic | TextExtractor[TElement]])): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textExtraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextExtraction: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textExtraction")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSorterFunction5(
      value: (/* x */ String, /* y */ String, /* ascending */ Boolean, /* index */ Double, TElement) => Double
    ): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSorter")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withTextSorter(value: TextSorter[TElement] | MappedSettings[TextSorter[TElement]]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSorter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSorter: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: CoreTheme | String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUsNumberFormat(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usNumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsNumberFormat: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usNumberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgetClass(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgetClass: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetClass")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgetOptions(value: WidgetOptions[TElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgetOptions: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgets(value: js.Array[String]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgets: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthFixed(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthFixed: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthFixed")(js.undefined)
        ret
    }
  }
  
}

