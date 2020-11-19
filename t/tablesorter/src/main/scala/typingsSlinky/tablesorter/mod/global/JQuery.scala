package typingsSlinky.tablesorter.mod.global

import typingsSlinky.tablesorter.commonEventHandlerMod.CommonEventHandler
import typingsSlinky.tablesorter.configEventHandlerMod.ConfigEventHandler
import typingsSlinky.tablesorter.configEventMapMod.ConfigEventMap
import typingsSlinky.tablesorter.eventMapMod.EventMap
import typingsSlinky.tablesorter.filterEventHandlerMod.FilterEventHandler
import typingsSlinky.tablesorter.pagerConfigurationMod.PagerConfiguration
import typingsSlinky.tablesorter.pagerEventHandlerMod.PagerEventHandler
import typingsSlinky.tablesorter.pagerEventMapMod.PagerEventMap
import typingsSlinky.tablesorter.parameterlessTriggerNameMapMod.ParameterlessTriggerNameMap
import typingsSlinky.tablesorter.relativeSortDefinitionMod.RelativeSortDefinition
import typingsSlinky.tablesorter.sortDefinitionMod.SortDefinition
import typingsSlinky.tablesorter.tablesorterConfigurationMod.TablesorterConfiguration
import typingsSlinky.tablesorter.tablesorterEventHandlerMod.TablesorterEventHandler
import typingsSlinky.tablesorter.tablesorterStrings.addRows
import typingsSlinky.tablesorter.tablesorterStrings.applyWidgetId
import typingsSlinky.tablesorter.tablesorterStrings.applyWidgets
import typingsSlinky.tablesorter.tablesorterStrings.destroy
import typingsSlinky.tablesorter.tablesorterStrings.filterStart
import typingsSlinky.tablesorter.tablesorterStrings.pageAndSize
import typingsSlinky.tablesorter.tablesorterStrings.pageSet
import typingsSlinky.tablesorter.tablesorterStrings.pageSize
import typingsSlinky.tablesorter.tablesorterStrings.pagerUpdate
import typingsSlinky.tablesorter.tablesorterStrings.refreshWidgets
import typingsSlinky.tablesorter.tablesorterStrings.removeWidget
import typingsSlinky.tablesorter.tablesorterStrings.search
import typingsSlinky.tablesorter.tablesorterStrings.sortReset
import typingsSlinky.tablesorter.tablesorterStrings.sorton
import typingsSlinky.tablesorter.tablesorterStrings.stickyHeadersInit
import typingsSlinky.tablesorter.tablesorterStrings.update
import typingsSlinky.tablesorter.tablesorterStrings.updateAll
import typingsSlinky.tablesorter.tablesorterStrings.updateCache
import typingsSlinky.tablesorter.tablesorterStrings.updateCell
import typingsSlinky.tablesorter.tablesorterStrings.updateHeaders
import typingsSlinky.tablesorter.tablesorterStrings.updateRows
import typingsSlinky.tablesorter.triggerCallbackHandlerMod.TriggerCallbackHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery[TElement] extends js.Object {
  
  def bind(name: ConfigEventMap, callback: ConfigEventHandler[TElement]): this.type = js.native
  def bind(name: EventMap, callback: TablesorterEventHandler[TElement]): this.type = js.native
  def bind(name: PagerEventMap, callback: PagerEventHandler[TElement]): this.type = js.native
  @JSName("bind")
  def bind_filterStart(name: filterStart, callback: FilterEventHandler[TElement]): this.type = js.native
  @JSName("bind")
  def bind_stickyHeadersInit(name: stickyHeadersInit, callback: CommonEventHandler[TElement]): this.type = js.native
  
  /**
    * Initializes a new `tablesorter`.
    *
    * @param options
    * The options for the tablesorter.
    */
  def tablesorter(): this.type = js.native
  def tablesorter(options: TablesorterConfiguration[TElement]): this.type = js.native
  
  /**
    * Initializes a pager for a tablesorter.
    */
  def tablesorterPager(): this.type = js.native
  def tablesorterPager(options: PagerConfiguration[TElement]): this.type = js.native
  
  def trigger(name: ParameterlessTriggerNameMap): this.type = js.native
  @JSName("trigger")
  def trigger_addRows(
    name: addRows,
    extraParameters: js.Tuple3[JQuery[HTMLElement] | String, Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_applyWidgetId(name: applyWidgetId, extraParameters: String): this.type = js.native
  @JSName("trigger")
  def trigger_applyWidgets(name: applyWidgets, extraParameters: TriggerCallbackHandler[TElement]): this.type = js.native
  @JSName("trigger")
  def trigger_destroy(name: destroy, extraParameters: js.Tuple2[Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]): this.type = js.native
  @JSName("trigger")
  def trigger_pageAndSize(name: pageAndSize, extraParameters: js.Tuple2[Double, Double]): this.type = js.native
  @JSName("trigger")
  def trigger_pageSet(name: pageSet, extraParameters: Double): this.type = js.native
  @JSName("trigger")
  def trigger_pageSize(name: pageSize, extraParameters: Double): this.type = js.native
  @JSName("trigger")
  def trigger_pagerUpdate(name: pagerUpdate, extraParameters: Double): this.type = js.native
  @JSName("trigger")
  def trigger_refreshWidgets(name: refreshWidgets, extraParameters: js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Boolean]]): this.type = js.native
  @JSName("trigger")
  def trigger_removeWidget(name: removeWidget, extraParameters: String): this.type = js.native
  @JSName("trigger")
  def trigger_removeWidget(name: removeWidget, extraParameters: js.Array[String]): this.type = js.native
  @JSName("trigger")
  def trigger_removeWidget(name: removeWidget, extraParameters: Boolean): this.type = js.native
  @JSName("trigger")
  def trigger_search(name: search, extraParameters: js.Array[js.UndefOr[js.Array[String]]]): this.type = js.native
  @JSName("trigger")
  def trigger_search(name: search, extraParameters: Boolean): this.type = js.native
  @JSName("trigger")
  def trigger_sortReset(name: sortReset, extraParameters: js.Array[js.UndefOr[TriggerCallbackHandler[TElement]]]): this.type = js.native
  @JSName("trigger")
  def trigger_sorton(
    name: sorton,
    extraParameters: js.Tuple2[
      js.Array[SortDefinition | RelativeSortDefinition], 
      js.UndefOr[TriggerCallbackHandler[TElement]]
    ]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_update(
    name: update,
    extraParameters: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_updateAll(
    name: updateAll,
    extraParameters: js.Tuple2[
      js.UndefOr[Boolean | js.Array[SortDefinition]], 
      js.UndefOr[TriggerCallbackHandler[TElement]]
    ]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_updateCache(
    name: updateCache,
    extraParameters: js.Tuple2[js.UndefOr[TriggerCallbackHandler[TElement]], js.UndefOr[JQuery[HTMLElement]]]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_updateCell(
    name: updateCell,
    extraParameters: js.Tuple3[
      JQuery[HTMLElement], 
      js.UndefOr[Boolean | js.Array[SortDefinition]], 
      js.UndefOr[TriggerCallbackHandler[TElement]]
    ]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_updateHeaders(name: updateHeaders, extraParameters: TriggerCallbackHandler[TElement]): this.type = js.native
  @JSName("trigger")
  def trigger_updateRows(
    name: updateRows,
    extraParameters: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
  ): this.type = js.native
}
