package typingsSlinky.tablesorter

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.jquery.JQuery.Selector
import typingsSlinky.jquery.JQuery.TypeOrArray
import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.jquery.JQueryAjaxSettings
import typingsSlinky.tablesorter.columnFilterMod.ColumnFilter
import typingsSlinky.tablesorter.emptySortingMod.EmptySorting
import typingsSlinky.tablesorter.filterFormatterMod.FilterFormatter
import typingsSlinky.tablesorter.filterStaticMod.FilterStatic
import typingsSlinky.tablesorter.headerResizeOptionsMod.HeaderResizeOptions
import typingsSlinky.tablesorter.localeMod.Locale
import typingsSlinky.tablesorter.mappedSettingsMod.MappedSettings
import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.parsedCellMod.ParsedCell
import typingsSlinky.tablesorter.parsedDataMod.ParsedData
import typingsSlinky.tablesorter.parserMod.Parser
import typingsSlinky.tablesorter.relativeSortDefinitionMod.RelativeSortDefinition
import typingsSlinky.tablesorter.sortDefinitionMod.SortDefinition
import typingsSlinky.tablesorter.sortOrderMod.SortOrder
import typingsSlinky.tablesorter.storageConfigurationMod.StorageConfiguration
import typingsSlinky.tablesorter.stringSortingMod.StringSorting
import typingsSlinky.tablesorter.tablesorterBooleans.`false`
import typingsSlinky.tablesorter.tablesorterBooleans.`true`
import typingsSlinky.tablesorter.tablesorterConfigurationMod.TablesorterConfiguration
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typingsSlinky.tablesorter.tablesorterHeadingMod.TablesorterHeading
import typingsSlinky.tablesorter.tablesorterStrings.all
import typingsSlinky.tablesorter.tablesorterStrings.dateFormat
import typingsSlinky.tablesorter.tablesorterStrings.empty
import typingsSlinky.tablesorter.tablesorterStrings.filter
import typingsSlinky.tablesorter.tablesorterStrings.lockedOrder
import typingsSlinky.tablesorter.tablesorterStrings.parser
import typingsSlinky.tablesorter.tablesorterStrings.resizable
import typingsSlinky.tablesorter.tablesorterStrings.sortInitialOrder
import typingsSlinky.tablesorter.tablesorterStrings.sorter
import typingsSlinky.tablesorter.tablesorterStrings.string
import typingsSlinky.tablesorter.themeCollectionMod.ThemeCollection
import typingsSlinky.tablesorter.triggerCallbackHandlerMod.TriggerCallbackHandler
import typingsSlinky.tablesorter.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesorterMod {
  
  @js.native
  trait Tablesorter[TElement] extends StObject {
    
    def addHeaderResizeEvent(table: TElement, disable: Boolean): Unit = js.native
    def addHeaderResizeEvent(table: TElement, disable: Boolean, options: HeaderResizeOptions): Unit = js.native
    /**
      * Adds an event-handler to the `resize`-event for the sticky headers.
      *
      * @param table
      * The table to add the event to.
      *
      * @param disable
      * A value indicating whether the event-handler should be disabled.
      *
      * @param options
      * Options for the event-handler.
      */
    def addHeaderResizeEvent(table: JQuery[TElement], disable: Boolean): Unit = js.native
    def addHeaderResizeEvent(table: JQuery[TElement], disable: Boolean, options: HeaderResizeOptions): Unit = js.native
    
    /**
      * Adds instance-methods to the tablesorter.
      *
      * @param methods
      * The methods to add.
      */
    def addInstanceMethods(methods: StringDictionary[js.Function0[_]]): Unit = js.native
    
    /**
      * Adds a parser to the tablesorter.
      *
      * @param parser
      * The parser to add.
      */
    def addParser(parser: Parser[TElement]): Unit = js.native
    
    def addRows(config: TablesorterConfigurationStore[TElement], rows: String, resort: js.Array[SortDefinition]): Unit = js.native
    def addRows(
      config: TablesorterConfigurationStore[TElement],
      rows: String,
      resort: js.Array[SortDefinition],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def addRows(config: TablesorterConfigurationStore[TElement], rows: String, resort: Boolean): Unit = js.native
    def addRows(
      config: TablesorterConfigurationStore[TElement],
      rows: String,
      resort: Boolean,
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def addRows(
      config: TablesorterConfigurationStore[TElement],
      rows: JQuery[HTMLElement],
      resort: js.Array[SortDefinition]
    ): Unit = js.native
    def addRows(
      config: TablesorterConfigurationStore[TElement],
      rows: JQuery[HTMLElement],
      resort: js.Array[SortDefinition],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    /**
      * Adds rows to the table.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param rows
      * The rows to add.
      *
      * @param resort
      * Either a value indicating whether to resort the table or a new sort-definition to apply.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def addRows(config: TablesorterConfigurationStore[TElement], rows: JQuery[HTMLElement], resort: Boolean): Unit = js.native
    def addRows(
      config: TablesorterConfigurationStore[TElement],
      rows: JQuery[HTMLElement],
      resort: Boolean,
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    
    /**
      * Adds a widget to the tablesorter.
      *
      * @param widget
      * The widget to add.
      */
    def addWidget(widget: Widget[TElement]): Unit = js.native
    
    /**
      * Adds all cached table-rows back into the table.
      *
      * @param config
      * The configuration of the table-sorter.
      */
    def appendCache(config: TablesorterConfigurationStore[TElement]): Unit = js.native
    
    def applyWidget(table: TElement): Unit = js.native
    def applyWidget(table: TElement, initialize: js.UndefOr[scala.Nothing], callback: TriggerCallbackHandler[TElement]): Unit = js.native
    def applyWidget(table: TElement, initialize: Boolean): Unit = js.native
    def applyWidget(table: TElement, initialize: Boolean, callback: TriggerCallbackHandler[TElement]): Unit = js.native
    /**
      * Refreshes all currently loaded widgets.
      *
      * @param table
      * The table which is being processed.
      *
      * @param initialize
      * A value indicating whether the widgets should be initialized.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def applyWidget(table: JQuery[TElement]): Unit = js.native
    def applyWidget(
      table: JQuery[TElement],
      initialize: js.UndefOr[scala.Nothing],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def applyWidget(table: JQuery[TElement], initialize: Boolean): Unit = js.native
    def applyWidget(table: JQuery[TElement], initialize: Boolean, callback: TriggerCallbackHandler[TElement]): Unit = js.native
    
    def applyWidgetId(table: TElement, id: String): Unit = js.native
    /**
      * Applies the widget to the specified `table`.
      *
      * @param table
      * The table to apply the widget to.
      *
      * @param id
      * The id of the widget to apply.
      */
    def applyWidgetId(table: JQuery[TElement], id: String): Unit = js.native
    
    def bindEvents(table: TElement, elements: JQuery[HTMLElement]): Unit = js.native
    /**
      * Binds the header-events to the specified `elements`.
      *
      * @param table
      * The table which is being processed.
      *
      * @param elements
      * The jQuery-object containing the elements to bind the header-events to.
      */
    def bindEvents(table: JQuery[TElement], elements: JQuery[HTMLElement]): Unit = js.native
    
    def clearTableBody(table: TElement): Unit = js.native
    /**
      * Clears all table-bodies inside the specified `table`.
      *
      * @param table
      * The table which is being processed.
      */
    def clearTableBody(table: JQuery[TElement]): Unit = js.native
    
    /**
      * Re-calculates the `data-column`-attribute of the cells inside the rows.
      *
      * If a `config` is passed, the `data-column`-attributes will be removed for cells whose index matches its actual position.
      *
      * @param rows
      * The rows to compute.
      *
      * @param config
      * The tablesorter-configuration.
      */
    def computeColumnIndex(rows: JQuery[HTMLElement]): Unit = js.native
    def computeColumnIndex(rows: JQuery[HTMLElement], config: TablesorterConfigurationStore[TElement]): Unit = js.native
    
    /**
      * The default settings.
      */
    var defaults: TablesorterConfiguration[TElement] = js.native
    
    def destroy(table: TElement): Unit = js.native
    def destroy(
      table: TElement,
      removeClasses: js.UndefOr[scala.Nothing],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def destroy(table: TElement, removeClasses: Boolean): Unit = js.native
    def destroy(table: TElement, removeClasses: Boolean, callback: TriggerCallbackHandler[TElement]): Unit = js.native
    /**
      * Removes the `tablesorter` from a table.
      *
      * @param table
      * The table to destroy.
      *
      * @param removeClasses
      * A value indicating whether the classes added by tablesorter should be removed.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def destroy(table: JQuery[TElement]): Unit = js.native
    def destroy(
      table: JQuery[TElement],
      removeClasses: js.UndefOr[scala.Nothing],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def destroy(table: JQuery[TElement], removeClasses: Boolean): Unit = js.native
    def destroy(table: JQuery[TElement], removeClasses: Boolean, callback: TriggerCallbackHandler[TElement]): Unit = js.native
    
    /**
      * Provides methods for the `filter`-widget.
      */
    var filter: FilterStatic[TElement] = js.native
    
    /**
      * Provides methods for creating filter-controls.
      */
    var filterFormatter: FilterFormatter = js.native
    
    def fixColumnWidth(table: TElement): Unit = js.native
    /**
      * Adds a `colgroup`-element to the specified `table`.
      *
      * @param table
      * The table to add the fixed columns to.
      */
    def fixColumnWidth(table: JQuery[TElement]): Unit = js.native
    
    def formatFloat(text: String, table: TElement): Unit = js.native
    /**
      * Formats a text containing a number according to the correct format.
      *
      * @param text
      * The text to format.
      *
      * @param table
      * The table which is being processed.
      */
    def formatFloat(text: String, table: JQuery[TElement]): Unit = js.native
    
    def getColumnData[T](table: TElement, `object`: MappedSettings[T], key: String): T = js.native
    def getColumnData[T](table: TElement, `object`: MappedSettings[T], key: Double): T = js.native
    /**
      * Identifies the correct settings for the specified column `key` in the per-column settings `object`.
      *
      * @param table
      * The table which is being processed.
      *
      * @param object
      * The object which contains column-specific values.
      *
      * @param key
      * The column-index or the class-name of the collumn to get the settings from.
      *
      * @return
      * The settings inside the settings-`object` for the column with the specified `key`.
      */
    def getColumnData[T](table: JQuery[TElement], `object`: MappedSettings[T], key: String): T = js.native
    def getColumnData[T](table: JQuery[TElement], `object`: MappedSettings[T], key: Double): T = js.native
    
    def getColumnText(table: TElement, column: Double): ParsedData = js.native
    def getColumnText(
      table: TElement,
      column: Double,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* element */ HTMLElement, Boolean]
    ): ParsedData = js.native
    def getColumnText(table: TElement, column: Double, callback: js.UndefOr[scala.Nothing], rowFilter: Selector): ParsedData = js.native
    def getColumnText(
      table: TElement,
      column: Double,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: TypeOrArray[Element]
    ): ParsedData = js.native
    def getColumnText(
      table: TElement,
      column: Double,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: JQuery[HTMLElement]
    ): ParsedData = js.native
    def getColumnText(table: TElement, column: Double, callback: js.Function1[/* cell */ ParsedCell, Unit]): ParsedData = js.native
    def getColumnText(
      table: TElement,
      column: Double,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* element */ HTMLElement, Boolean]
    ): ParsedData = js.native
    def getColumnText(
      table: TElement,
      column: Double,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: Selector
    ): ParsedData = js.native
    def getColumnText(
      table: TElement,
      column: Double,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: TypeOrArray[Element]
    ): ParsedData = js.native
    def getColumnText(
      table: TElement,
      column: Double,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: JQuery[HTMLElement]
    ): ParsedData = js.native
    /**
      * Parses the text of a column.
      *
      * @param table
      * The table which is being processed.
      *
      * @param column
      * The index of the column to get the text from.
      *
      * @param callback
      * A callback for processing the cell-text.
      *
      * @param rowFilter
      * An object for filtering the rows to process.
      *
      * @return
      * The parsed data of the column.
      */
    def getColumnText(table: JQuery[TElement], column: Double): ParsedData = js.native
    def getColumnText(
      table: JQuery[TElement],
      column: Double,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* element */ HTMLElement, Boolean]
    ): ParsedData = js.native
    def getColumnText(table: JQuery[TElement], column: Double, callback: js.UndefOr[scala.Nothing], rowFilter: Selector): ParsedData = js.native
    def getColumnText(
      table: JQuery[TElement],
      column: Double,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: TypeOrArray[Element]
    ): ParsedData = js.native
    def getColumnText(
      table: JQuery[TElement],
      column: Double,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: JQuery[HTMLElement]
    ): ParsedData = js.native
    def getColumnText(table: JQuery[TElement], column: Double, callback: js.Function1[/* cell */ ParsedCell, Unit]): ParsedData = js.native
    def getColumnText(
      table: JQuery[TElement],
      column: Double,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* element */ HTMLElement, Boolean]
    ): ParsedData = js.native
    def getColumnText(
      table: JQuery[TElement],
      column: Double,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: Selector
    ): ParsedData = js.native
    def getColumnText(
      table: JQuery[TElement],
      column: Double,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: TypeOrArray[Element]
    ): ParsedData = js.native
    def getColumnText(
      table: JQuery[TElement],
      column: Double,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: JQuery[HTMLElement]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(table: TElement, column: all): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: TElement,
      column: all,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* element */ HTMLElement, Boolean]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(table: TElement, column: all, callback: js.UndefOr[scala.Nothing], rowFilter: Selector): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(table: TElement, column: all, callback: js.UndefOr[scala.Nothing], rowFilter: TypeOrArray[Element]): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(table: TElement, column: all, callback: js.UndefOr[scala.Nothing], rowFilter: JQuery[HTMLElement]): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(table: TElement, column: all, callback: js.Function1[/* cell */ ParsedCell, Unit]): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: TElement,
      column: all,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* element */ HTMLElement, Boolean]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: TElement,
      column: all,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: Selector
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: TElement,
      column: all,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: TypeOrArray[Element]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: TElement,
      column: all,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: JQuery[HTMLElement]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(table: JQuery[TElement], column: all): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: JQuery[TElement],
      column: all,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* element */ HTMLElement, Boolean]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(table: JQuery[TElement], column: all, callback: js.UndefOr[scala.Nothing], rowFilter: Selector): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: JQuery[TElement],
      column: all,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: TypeOrArray[Element]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: JQuery[TElement],
      column: all,
      callback: js.UndefOr[scala.Nothing],
      rowFilter: JQuery[HTMLElement]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(table: JQuery[TElement], column: all, callback: js.Function1[/* cell */ ParsedCell, Unit]): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: JQuery[TElement],
      column: all,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* element */ HTMLElement, Boolean]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: JQuery[TElement],
      column: all,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: Selector
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: JQuery[TElement],
      column: all,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: TypeOrArray[Element]
    ): ParsedData = js.native
    @JSName("getColumnText")
    def getColumnText_all(
      table: JQuery[TElement],
      column: all,
      callback: js.Function1[/* cell */ ParsedCell, Unit],
      rowFilter: JQuery[HTMLElement]
    ): ParsedData = js.native
    
    @JSName("getData")
    def getData_dateFormat(header: HTMLElement, headerConfig: TablesorterHeading, option: dateFormat): js.UndefOr[String] = js.native
    @JSName("getData")
    def getData_dateFormat(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: dateFormat): js.UndefOr[String] = js.native
    @JSName("getData")
    def getData_empty(header: HTMLElement, headerConfig: TablesorterHeading, option: empty): js.UndefOr[EmptySorting] = js.native
    @JSName("getData")
    def getData_empty(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: empty): js.UndefOr[EmptySorting] = js.native
    @JSName("getData")
    def getData_filter(header: HTMLElement, headerConfig: TablesorterHeading, option: filter): js.UndefOr[ColumnFilter] = js.native
    @JSName("getData")
    def getData_filter(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: filter): js.UndefOr[ColumnFilter] = js.native
    @JSName("getData")
    def getData_lockedOrder(header: HTMLElement, headerConfig: TablesorterHeading, option: lockedOrder): js.UndefOr[SortOrder] = js.native
    @JSName("getData")
    def getData_lockedOrder(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: lockedOrder): js.UndefOr[SortOrder] = js.native
    @JSName("getData")
    def getData_parser(header: HTMLElement, headerConfig: TablesorterHeading, option: parser): js.UndefOr[String | Boolean] = js.native
    @JSName("getData")
    def getData_parser(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: parser): js.UndefOr[String | Boolean] = js.native
    @JSName("getData")
    def getData_resizable(header: HTMLElement, headerConfig: TablesorterHeading, option: resizable): js.UndefOr[Boolean] = js.native
    @JSName("getData")
    def getData_resizable(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: resizable): js.UndefOr[Boolean] = js.native
    @JSName("getData")
    def getData_sortInitialOrder(header: HTMLElement, headerConfig: TablesorterHeading, option: sortInitialOrder): js.UndefOr[SortOrder] = js.native
    @JSName("getData")
    def getData_sortInitialOrder(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: sortInitialOrder): js.UndefOr[SortOrder] = js.native
    @JSName("getData")
    def getData_sorter(header: HTMLElement, headerConfig: TablesorterHeading, option: sorter): js.UndefOr[String | Boolean] = js.native
    /**
      * Identifies the correct setting for a header.
      *
      * @param header
      * The header-cell to get the data from.
      *
      * @param headerConfig
      * The configuration of the header to get the data from.
      *
      * @param option
      * The name of the option to get.
      *
      * @return
      * The correct `option` for the specified `header`.
      */
    @JSName("getData")
    def getData_sorter(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: sorter): js.UndefOr[String | Boolean] = js.native
    @JSName("getData")
    def getData_string(header: HTMLElement, headerConfig: TablesorterHeading, option: string): js.UndefOr[StringSorting] = js.native
    @JSName("getData")
    def getData_string(header: JQuery[HTMLElement], headerConfig: TablesorterHeading, option: string): js.UndefOr[StringSorting] = js.native
    
    def getFilters(table: TElement): js.Array[String] = js.native
    def getFilters(table: TElement, cached: Boolean): js.Array[String] = js.native
    /**
      * Fetches all filters from the tablesorter.
      *
      * @param table
      * The table to get the filters from.
      *
      * @return
      * The filters applied to the `table`.
      */
    def getFilters(table: JQuery[TElement]): js.Array[String] = js.native
    def getFilters(table: JQuery[TElement], cached: Boolean): js.Array[String] = js.native
    
    /**
      * Gets a parser of the tablesorter.
      *
      * @param id
      * The id of the parser to get.
      *
      * @return
      * The parser with the specified `id`.
      */
    def getParserById(id: String): Parser[TElement] = js.native
    
    /**
      * Gets a widget of the tablesorter.
      *
      * @param id
      * The id of the widget to get.
      *
      * @return
      * The widget with the specified `id`.
      */
    def getWidgetById(id: String): Widget[TElement] = js.native
    
    def hasWidget(table: TElement, id: String): Boolean = js.native
    /**
      * Verifies whether the specified `table` has a widget with the specified `id`.
      *
      * @param table
      * The table to check.
      *
      * @param id
      * The id of the widget to verify.
      *
      * @return
      * A value indicating whether a widget with the specified `id` is loaded for the specified `table`.
      */
    def hasWidget(table: JQuery[TElement], id: String): Boolean = js.native
    
    /**
      * The custom instance-methods added to the tablesorter.
      */
    var instanceMethods: StringDictionary[js.Function0[_]] = js.native
    
    /**
      * Verifies whether the specified `text` is a digit.
      *
      * @param text
      * The text to check.
      *
      * @return
      * A value indicating whether the specified `text` is a digit.
      */
    def isDigit(text: String): Boolean = js.native
    
    def isProcessing(table: TElement, state: Boolean): Unit = js.native
    def isProcessing(table: TElement, state: Boolean, headers: JQuery[HTMLElement]): Unit = js.native
    /**
      * Adds a processing-icon to headers.
      *
      * @param table
      * The table to apply the processing-icons to.
      *
      * @param state
      * A valud indicating whether the headers are processing.
      *
      * @param headers
      * A jQuery-object containing the objects to apply the processing-icons to.
      */
    def isProcessing(table: JQuery[TElement], state: Boolean): Unit = js.native
    def isProcessing(table: JQuery[TElement], state: Boolean, headers: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Checks whether a `SortDefinition` for the specified `column` exists.
      *
      * @param column
      * The column-index to check.
      *
      * @param array
      * The sort-definitions to browse.
      *
      * @return
      * A value indicating whether a `SortDefinition` for the specified `column` exists.
      */
    def isValueInArray(value: Double, array: js.Array[js.Tuple2[Double, _]]): Boolean = js.native
    
    /**
      * The localized text for the tablesorter.
      */
    var language: Locale = js.native
    
    /**
      * The parsers of the tablesorter.
      */
    var parsers: js.Array[Parser[TElement]] = js.native
    
    def processTbody(table: TElement, tbody: JQuery[HTMLElement]): Unit = js.native
    def processTbody(table: JQuery[TElement], tbody: JQuery[HTMLElement]): Unit = js.native
    @JSName("processTbody")
    def processTbody_false(table: TElement, tbody: JQuery[HTMLElement], detach: `false`): Unit = js.native
    @JSName("processTbody")
    def processTbody_false(table: JQuery[TElement], tbody: JQuery[HTMLElement], detach: `false`): Unit = js.native
    @JSName("processTbody")
    def processTbody_true(table: TElement, tbody: JQuery[HTMLElement], detach: `true`): JQuery[HTMLElement] = js.native
    /**
      * Provides the functionality to process the `tbody`.
      *
      * @param table
      * The table the `tbody` belongs to.
      *
      * @param tbody
      * The `tbody` to process.
      *
      * @param detach
      * A value indicating whether the `tbody` should be detached.
      */
    @JSName("processTbody")
    def processTbody_true(table: JQuery[TElement], tbody: JQuery[HTMLElement], detach: `true`): JQuery[HTMLElement] = js.native
    
    def refreshWidgets(table: TElement): Unit = js.native
    def refreshWidgets(table: TElement, removeAll: js.UndefOr[scala.Nothing], reapply: Boolean): Unit = js.native
    def refreshWidgets(table: TElement, removeAll: Boolean): Unit = js.native
    def refreshWidgets(table: TElement, removeAll: Boolean, reapply: Boolean): Unit = js.native
    /**
      * Refreshes the widgets.
      *
      * @param table
      * The table which is being processed.
      *
      * @param removeAll
      * A value indicating whether the widgets should be removed from the table.
      *
      * @param reapply
      * A value indicating whether the widgets should be reapplied after removing them.
      */
    def refreshWidgets(table: JQuery[TElement]): Unit = js.native
    def refreshWidgets(table: JQuery[TElement], removeAll: js.UndefOr[scala.Nothing], reapply: Boolean): Unit = js.native
    def refreshWidgets(table: JQuery[TElement], removeAll: Boolean): Unit = js.native
    def refreshWidgets(table: JQuery[TElement], removeAll: Boolean, reapply: Boolean): Unit = js.native
    
    def removeWidget(table: TElement, id: String): Unit = js.native
    def removeWidget(table: TElement, id: String, refreshing: Boolean): Unit = js.native
    def removeWidget(table: TElement, id: js.Array[String]): Unit = js.native
    def removeWidget(table: TElement, id: js.Array[String], refreshing: Boolean): Unit = js.native
    def removeWidget(table: TElement, id: Boolean): Unit = js.native
    def removeWidget(table: TElement, id: Boolean, refreshing: Boolean): Unit = js.native
    /**
      * Removes widgets from the specified `table`.
      *
      * @param table
      * The table to remove the widget from.
      *
      * @param id
      * Either the id of the widget to remove or a value indicating whether to remove all widgets.
      *
      * @param refreshing
      * A value indicating whether to keep the id of the widget in the `widgets`-option.
      */
    def removeWidget(table: JQuery[TElement], id: String): Unit = js.native
    def removeWidget(table: JQuery[TElement], id: String, refreshing: Boolean): Unit = js.native
    def removeWidget(table: JQuery[TElement], id: js.Array[String]): Unit = js.native
    def removeWidget(table: JQuery[TElement], id: js.Array[String], refreshing: Boolean): Unit = js.native
    def removeWidget(table: JQuery[TElement], id: Boolean): Unit = js.native
    def removeWidget(table: JQuery[TElement], id: Boolean, refreshing: Boolean): Unit = js.native
    
    /**
      * Replaces all accent characters in the `text`.
      *
      * @param text
      * The text to process.
      *
      * @return
      * The processed text.
      */
    def replaceAccents(text: String): String = js.native
    
    def resizableReset(table: TElement): Unit = js.native
    def resizableReset(table: TElement, keepLocalSettings: Boolean): Unit = js.native
    /**
      * Resets the column-widths and optionally clears the locally stored column-widths.
      *
      * @param table
      * The table to reset the resizable settings for.
      *
      * @param keepLocalSettings
      * A value indicating whether local settings should not be cleared.
      */
    def resizableReset(table: JQuery[TElement]): Unit = js.native
    def resizableReset(table: JQuery[TElement], keepLocalSettings: Boolean): Unit = js.native
    
    def restoreHeaders(table: TElement): Unit = js.native
    /**
      * Restores the headers of a table.
      *
      * @param table
      * The table to process.
      */
    def restoreHeaders(table: JQuery[TElement]): Unit = js.native
    
    def setFilters(table: TElement, filter: js.Array[String]): Unit = js.native
    def setFilters(table: TElement, filter: js.Array[String], apply: Boolean): Unit = js.native
    /**
      * Sets the filter-text of the tablesorter.
      *
      * @param table
      * The table to set the filter-text for.
      *
      * @param filter
      * The filter-text to set.
      *
      * @param apply
      * A value indicating whether to apply the filter after setting the filter-text.
      */
    def setFilters(table: JQuery[TElement], filter: js.Array[String]): Unit = js.native
    def setFilters(table: JQuery[TElement], filter: js.Array[String], apply: Boolean): Unit = js.native
    
    def showError(table: TElement, request: String, settings: JQueryAjaxSettings, message: String): Unit = js.native
    def showError(table: TElement, request: jqXHR[_], settings: JQueryAjaxSettings, message: String): Unit = js.native
    /**
      * Pins an error-message to the table.
      *
      * @param table
      * The table to pin the error-message to.
      *
      * @param request
      * The request which caused an error.
      *
      * @param settings
      * The ajax-settings of the `request`.
      *
      * @param message
      * A message which describes the error.
      */
    def showError(table: JQuery[TElement], request: String, settings: JQueryAjaxSettings, message: String): Unit = js.native
    def showError(table: JQuery[TElement], request: jqXHR[_], settings: JQueryAjaxSettings, message: String): Unit = js.native
    
    /**
      * Compares two strings and returns a value indicating whether one is less than, equal to or greater than the other.
      *
      * @param x
      * The first string to compare.
      *
      * @param y
      * The second string to compare.
      *
      * @param ascending
      * A value indicating whether an ascending sort is being performed.
      *
      * @param index
      * The index of the column which is being sorted.
      *
      * @param table
      * The table which is being sorted.
      *
      * @return
      * An integer that indicated the relative values of `x` and `y`:
      *   - If less than 0, `x` is less than `y`.
      *   - If `0`, `x` equals `y`.
      *   - If greater than 0, `x` is greater than `y`.
      */
    def sortNatural(x: String, y: String): Double = js.native
    
    /**
      * Applies a sort to the table.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param sort
      * The sort to apply.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def sortOn(
      config: TablesorterConfigurationStore[TElement],
      sort: js.Array[SortDefinition | RelativeSortDefinition]
    ): Unit = js.native
    def sortOn(
      config: TablesorterConfigurationStore[TElement],
      sort: js.Array[SortDefinition | RelativeSortDefinition],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    
    /**
      * Resets the sorting.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def sortReset(config: TablesorterConfigurationStore[TElement]): Unit = js.native
    def sortReset(config: TablesorterConfigurationStore[TElement], callback: TriggerCallbackHandler[TElement]): Unit = js.native
    
    /**
      * Compares two strings and returns a value indicating whether one is less than, equal to or greater than the other.
      *
      * @param x
      * The first string to compare.
      *
      * @param y
      * The second string to compare.
      *
      * @param ascending
      * A value indicating whether an ascending sort is being performed.
      *
      * @param index
      * The index of the column which is being sorted.
      *
      * @param table
      * The table which is being sorted.
      *
      * @return
      * An integer that indicated the relative values of `x` and `y`:
      *   - If less than 0, `x` is less than `y`.
      *   - If `0`, `x` equals `y`.
      *   - If greater than 0, `x` is greater than `y`.
      */
    def sortText(x: String, y: String): Double = js.native
    
    def storage(table: TElement, key: String): js.Any = js.native
    def storage(table: TElement, key: String, value: js.UndefOr[scala.Nothing], options: StorageConfiguration): js.Any = js.native
    def storage(table: TElement, key: String, value: js.Any): Unit = js.native
    def storage(table: TElement, key: String, value: js.Any, options: StorageConfiguration): Unit = js.native
    def storage(table: TElement, key: String, value: Null, options: StorageConfiguration): js.Any = js.native
    /**
      * Saves data to the storage.
      *
      * @param table
      * The table to store data for.
      *
      * @param key
      * The name of the option to save.
      *
      * @param value
      * The value of the option to save.
      *
      * @param options
      * The options for customizing the way to save the data to the storage.
      */
    def storage(table: JQuery[TElement], key: String): js.Any = js.native
    def storage(
      table: JQuery[TElement],
      key: String,
      value: js.UndefOr[scala.Nothing],
      options: StorageConfiguration
    ): js.Any = js.native
    /**
      * Saves data to the storage.
      *
      * @param table
      * The table to store data for.
      *
      * @param key
      * The name of the option to save.
      *
      * @param value
      * The value of the option to save.
      *
      * @param options
      * The options for customizing the way to save the data to the storage.
      */
    def storage(table: JQuery[TElement], key: String, value: js.Any): Unit = js.native
    def storage(table: JQuery[TElement], key: String, value: js.Any, options: StorageConfiguration): Unit = js.native
    def storage(table: JQuery[TElement], key: String, value: Null, options: StorageConfiguration): js.Any = js.native
    
    /**
      * The settings of the themes.
      */
    var themes: ThemeCollection = js.native
    
    /**
      * Updates the data of the table-body.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def update(config: TablesorterConfigurationStore[TElement]): Unit = js.native
    def update(
      config: TablesorterConfigurationStore[TElement],
      sorting: js.UndefOr[scala.Nothing],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def update(config: TablesorterConfigurationStore[TElement], sorting: js.Array[SortDefinition]): Unit = js.native
    def update(
      config: TablesorterConfigurationStore[TElement],
      sorting: js.Array[SortDefinition],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def update(config: TablesorterConfigurationStore[TElement], sorting: Boolean): Unit = js.native
    def update(
      config: TablesorterConfigurationStore[TElement],
      sorting: Boolean,
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    
    /**
      * Updates the data of the whole table.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param sorting
      * Either a new sorting to apply or a value indicating whether the current sorting should be re-applied.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def updateAll(config: TablesorterConfigurationStore[TElement]): Unit = js.native
    def updateAll(
      config: TablesorterConfigurationStore[TElement],
      sorting: js.UndefOr[scala.Nothing],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def updateAll(config: TablesorterConfigurationStore[TElement], sorting: js.Array[SortDefinition]): Unit = js.native
    def updateAll(
      config: TablesorterConfigurationStore[TElement],
      sorting: js.Array[SortDefinition],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def updateAll(config: TablesorterConfigurationStore[TElement], sorting: Boolean): Unit = js.native
    def updateAll(
      config: TablesorterConfigurationStore[TElement],
      sorting: Boolean,
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    
    /**
      * Updates the cache and optionally adds new `tbody`s.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param callback
      * A callback for post-processing the table.
      *
      * @param tbodies
      * The `tbody`s to add.
      */
    def updateCache(config: TablesorterConfigurationStore[TElement]): Unit = js.native
    def updateCache(
      config: TablesorterConfigurationStore[TElement],
      callback: js.UndefOr[scala.Nothing],
      tbodies: JQuery[HTMLElement]
    ): Unit = js.native
    def updateCache(config: TablesorterConfigurationStore[TElement], callback: TriggerCallbackHandler[TElement]): Unit = js.native
    def updateCache(
      config: TablesorterConfigurationStore[TElement],
      callback: TriggerCallbackHandler[TElement],
      tbodies: JQuery[HTMLElement]
    ): Unit = js.native
    
    /**
      * Updates the cell of the table.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param cell
      * The cell to update.
      *
      * @param sorting
      * Either a new sorting to apply or a value indicating whether the current sorting should be re-applied.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def updateCell(config: TablesorterConfigurationStore[TElement], cell: JQuery[HTMLElement]): Unit = js.native
    def updateCell(
      config: TablesorterConfigurationStore[TElement],
      cell: JQuery[HTMLElement],
      sorting: js.UndefOr[scala.Nothing],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def updateCell(
      config: TablesorterConfigurationStore[TElement],
      cell: JQuery[HTMLElement],
      sorting: js.Array[SortDefinition]
    ): Unit = js.native
    def updateCell(
      config: TablesorterConfigurationStore[TElement],
      cell: JQuery[HTMLElement],
      sorting: js.Array[SortDefinition],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def updateCell(config: TablesorterConfigurationStore[TElement], cell: JQuery[HTMLElement], sorting: Boolean): Unit = js.native
    def updateCell(
      config: TablesorterConfigurationStore[TElement],
      cell: JQuery[HTMLElement],
      sorting: Boolean,
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    
    /**
      * Updates the table-headers.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def updateHeaders(config: TablesorterConfigurationStore[TElement]): Unit = js.native
    def updateHeaders(config: TablesorterConfigurationStore[TElement], callback: TriggerCallbackHandler[TElement]): Unit = js.native
    
    /**
      * Updates the data of the table-body.
      *
      * @param config
      * The configuration of the table-sorter.
      *
      * @param callback
      * A callback for post-processing the table.
      */
    def updateRows(config: TablesorterConfigurationStore[TElement]): Unit = js.native
    def updateRows(
      config: TablesorterConfigurationStore[TElement],
      sorting: js.UndefOr[scala.Nothing],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def updateRows(config: TablesorterConfigurationStore[TElement], sorting: js.Array[SortDefinition]): Unit = js.native
    def updateRows(
      config: TablesorterConfigurationStore[TElement],
      sorting: js.Array[SortDefinition],
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    def updateRows(config: TablesorterConfigurationStore[TElement], sorting: Boolean): Unit = js.native
    def updateRows(
      config: TablesorterConfigurationStore[TElement],
      sorting: Boolean,
      callback: TriggerCallbackHandler[TElement]
    ): Unit = js.native
    
    /**
      * The widgets of the tablesorter.
      */
    var widgets: js.Array[Widget[TElement]] = js.native
  }
}
