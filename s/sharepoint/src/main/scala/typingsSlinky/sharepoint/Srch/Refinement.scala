package typingsSlinky.sharepoint.Srch

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refinement extends DisplayControl {
  def addRefinementFilter(filterName: String, filterToken: js.Any): Unit = js.native
  def addRefinementFilters(refiners: js.Array[_]): Unit = js.native
  def addRefinementFiltersJSON(refinersJSON: String): Unit = js.native
  def addRefinementFiltersJSONWithOr(refinersJSON: String): Unit = js.native
  def addRefinementFiltersWithOp(refiners: js.Array[_], op: String): Unit = js.native
  def getCurrentRefinementCategory(refinementName: String): js.Any = js.native
  /** Gets refinement control with the specified propertyName */
  def getRefinementControl(refinerName: String): RefinementControl = js.native
  def get_emptyRefinementMessageId(): String = js.native
  def get_selectedRefinementControls(): js.Array[RefinementControl] = js.native
  def get_useManagedNavigationRefiners(): Boolean = js.native
  def hasAllRefinementFilters(filterName: String, filterTokens: js.Array[String]): Boolean = js.native
  def hasRefinementCategory(refinementName: String): Boolean = js.native
  def hasRefinementFilter(filterName: String, filterToken: String): Boolean = js.native
  /** Returns true if selected refinement controls collection contains a control with the specified propertyName */
  def hasRefiner(refinerName: String): Boolean = js.native
  def removeRefinementCategory(rcs: js.Any, filterName: String): Unit = js.native
  def removeRefinementFilter(filterName: String, filterToken: String): Unit = js.native
  def removeRefinementFiltersJSON(refinersJSON: String): Unit = js.native
  def replaceRefinementFilter(oldRefinementFilter: js.Any, newRefinementFilter: js.Any): Unit = js.native
  def set_emptyRefinementMessageId(value: String): String = js.native
  def set_selectedRefinementControls(value: js.Array[RefinementControl]): js.Array[RefinementControl] = js.native
  def set_useManagedNavigationRefiners(value: Boolean): Boolean = js.native
  /** Replaces the refinement controls */
  def updateRefinementControls(newControls: js.Array[RefinementControl]): Unit = js.native
  def updateRefinementFilters(
    filterName: String,
    filterTokens: js.Array[String],
    op: String,
    useKQL: Boolean,
    tokenToDisplayValueMap: js.Any
  ): Unit = js.native
  def updateRefiners(refiners: js.Array[_], op: String, useKQL: Boolean, tokenToDisplayValueMap: js.Any): Unit = js.native
  def updateRefinersJSON(refinersJSON: String): Unit = js.native
}

object Refinement {
  @scala.inline
  def apply(
    addCssClass: String => Unit,
    addRefinementFilter: (String, js.Any) => Unit,
    addRefinementFilters: js.Array[_] => Unit,
    addRefinementFiltersJSON: String => Unit,
    addRefinementFiltersJSONWithOr: String => Unit,
    addRefinementFiltersWithOp: (js.Array[_], String) => Unit,
    add_disposing: js.Function => Unit,
    add_oneTimeResultRendered: js.Any => Unit,
    add_propertyChanged: js.Function => Unit,
    add_queryReady: js.Any => Unit,
    add_resultRendered: js.Any => Unit,
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    beginUpdate: () => Unit,
    clickHandler: Event => js.Any,
    dataProvider_QueryIssuing: (js.Any, js.Any) => Unit,
    dataProvider_ResultReady: (js.Any, js.Any) => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    getCurrentRefinementCategory: String => js.Any,
    getRefinementControl: String => RefinementControl,
    get_alternateErrorMessage: () => String,
    get_currentResultTableCollection: () => js.Any,
    get_dataProvider: () => DataProvider,
    get_delayLoadTemplateScripts: () => Boolean,
    get_element: () => HTMLElement,
    get_emptyMessage: () => String,
    get_emptyRefinementMessageId: () => String,
    get_events: () => js.Any,
    get_id: () => String,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_messages: () => js.Array[_],
    get_nextUniqueId: () => String,
    get_queryGroupName: () => String,
    get_renderTemplateId: () => String,
    get_renderedResult: () => Boolean,
    get_selectedRefinementControls: () => js.Array[RefinementControl],
    get_shouldShowNoResultMessage: () => Boolean,
    get_showDataErrors: () => Boolean,
    get_states: () => js.Any,
    get_useManagedNavigationRefiners: () => Boolean,
    hasAllRefinementFilters: (String, js.Array[String]) => Boolean,
    hasMessages: () => js.Any,
    hasRefinementCategory: String => Boolean,
    hasRefinementFilter: (String, String) => Boolean,
    hasRefiner: String => Boolean,
    initialize: () => Unit,
    invokeAlternateRender: (js.Any, js.Any, js.Any) => js.Any,
    invokeClientRenderer: (js.Any, js.Any) => js.Any,
    loadRenderTemplateScripts: (js.Any, js.Any, js.Any, js.Any, js.Any) => Boolean,
    loadServerTemplateScripts: () => Unit,
    loaded: Boolean,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    processDataErrorMessages: js.Any => js.Any,
    processDataProviderErrors: js.Any => Unit,
    processQueryIssuing: js.Any => Unit,
    processRenderingErrorMessages: js.Any => js.Any,
    processResultReady: js.Any => Unit,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raiseOneTimeResultRenderedEvent: js.Any => Unit,
    raisePropertyChanged: String => Unit,
    raiseQueryReadyEvent: js.Any => Unit,
    raiseResultRenderedEvent: js.Any => Unit,
    refresh: js.Any => Unit,
    removeCssClass: String => Unit,
    removeRefinementCategory: (js.Any, String) => Unit,
    removeRefinementFilter: (String, String) => Unit,
    removeRefinementFiltersJSON: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_oneTimeResultRendered: js.Any => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_queryReady: js.Any => Unit,
    remove_resultRendered: js.Any => Unit,
    render: () => Unit,
    renderControl: (js.Any, js.Any) => Unit,
    replaceRefinementFilter: (js.Any, js.Any) => Unit,
    scriptApplication_Load: (js.Any, js.Any) => Unit,
    scriptApplication_PostLoad: (js.Any, js.Any) => Unit,
    scriptApplication_PreLoad: (js.Any, js.Any) => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[_],
    setControlElementVisibility: Boolean => js.Any,
    set_alternateErrorMessage: String => String,
    set_currentResultTableCollection: js.Any => js.Any,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_emptyMessage: String => String,
    set_emptyRefinementMessageId: String => String,
    set_id: String => Unit,
    set_messages: js.Array[_] => js.Array[_],
    set_queryGroupName: String => String,
    set_renderTemplateId: String => String,
    set_renderedResult: Boolean => Boolean,
    set_selectedRefinementControls: js.Array[RefinementControl] => js.Array[RefinementControl],
    set_shouldShowNoResultMessage: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_states: js.Any => js.Any,
    set_useManagedNavigationRefiners: Boolean => Boolean,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => js.Any,
    updateRefinementControls: js.Array[RefinementControl] => Unit,
    updateRefinementFilters: (String, js.Array[String], String, Boolean, js.Any) => Unit,
    updateRefiners: (js.Array[_], String, Boolean, js.Any) => Unit,
    updateRefinersJSON: String => Unit,
    updated: () => Unit
  ): Refinement = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), addRefinementFilter = js.Any.fromFunction2(addRefinementFilter), addRefinementFilters = js.Any.fromFunction1(addRefinementFilters), addRefinementFiltersJSON = js.Any.fromFunction1(addRefinementFiltersJSON), addRefinementFiltersJSONWithOr = js.Any.fromFunction1(addRefinementFiltersJSONWithOr), addRefinementFiltersWithOp = js.Any.fromFunction2(addRefinementFiltersWithOp), add_disposing = js.Any.fromFunction1(add_disposing), add_oneTimeResultRendered = js.Any.fromFunction1(add_oneTimeResultRendered), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_queryReady = js.Any.fromFunction1(add_queryReady), add_resultRendered = js.Any.fromFunction1(add_resultRendered), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2(dataProvider_QueryIssuing), dataProvider_ResultReady = js.Any.fromFunction2(dataProvider_ResultReady), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), getCurrentRefinementCategory = js.Any.fromFunction1(getCurrentRefinementCategory), getRefinementControl = js.Any.fromFunction1(getRefinementControl), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_currentResultTableCollection = js.Any.fromFunction0(get_currentResultTableCollection), get_dataProvider = js.Any.fromFunction0(get_dataProvider), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_element = js.Any.fromFunction0(get_element), get_emptyMessage = js.Any.fromFunction0(get_emptyMessage), get_emptyRefinementMessageId = js.Any.fromFunction0(get_emptyRefinementMessageId), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_queryGroupName = js.Any.fromFunction0(get_queryGroupName), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_renderedResult = js.Any.fromFunction0(get_renderedResult), get_selectedRefinementControls = js.Any.fromFunction0(get_selectedRefinementControls), get_shouldShowNoResultMessage = js.Any.fromFunction0(get_shouldShowNoResultMessage), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_states = js.Any.fromFunction0(get_states), get_useManagedNavigationRefiners = js.Any.fromFunction0(get_useManagedNavigationRefiners), hasAllRefinementFilters = js.Any.fromFunction2(hasAllRefinementFilters), hasMessages = js.Any.fromFunction0(hasMessages), hasRefinementCategory = js.Any.fromFunction1(hasRefinementCategory), hasRefinementFilter = js.Any.fromFunction2(hasRefinementFilter), hasRefiner = js.Any.fromFunction1(hasRefiner), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processQueryIssuing = js.Any.fromFunction1(processQueryIssuing), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), processResultReady = js.Any.fromFunction1(processResultReady), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raiseOneTimeResultRenderedEvent = js.Any.fromFunction1(raiseOneTimeResultRenderedEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), raiseQueryReadyEvent = js.Any.fromFunction1(raiseQueryReadyEvent), raiseResultRenderedEvent = js.Any.fromFunction1(raiseResultRenderedEvent), refresh = js.Any.fromFunction1(refresh), removeCssClass = js.Any.fromFunction1(removeCssClass), removeRefinementCategory = js.Any.fromFunction2(removeRefinementCategory), removeRefinementFilter = js.Any.fromFunction2(removeRefinementFilter), removeRefinementFiltersJSON = js.Any.fromFunction1(removeRefinementFiltersJSON), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_oneTimeResultRendered = js.Any.fromFunction1(remove_oneTimeResultRendered), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_queryReady = js.Any.fromFunction1(remove_queryReady), remove_resultRendered = js.Any.fromFunction1(remove_resultRendered), render = js.Any.fromFunction0(render), renderControl = js.Any.fromFunction2(renderControl), replaceRefinementFilter = js.Any.fromFunction2(replaceRefinementFilter), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentResultTableCollection = js.Any.fromFunction1(set_currentResultTableCollection), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_emptyMessage = js.Any.fromFunction1(set_emptyMessage), set_emptyRefinementMessageId = js.Any.fromFunction1(set_emptyRefinementMessageId), set_id = js.Any.fromFunction1(set_id), set_messages = js.Any.fromFunction1(set_messages), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_renderedResult = js.Any.fromFunction1(set_renderedResult), set_selectedRefinementControls = js.Any.fromFunction1(set_selectedRefinementControls), set_shouldShowNoResultMessage = js.Any.fromFunction1(set_shouldShowNoResultMessage), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_states = js.Any.fromFunction1(set_states), set_useManagedNavigationRefiners = js.Any.fromFunction1(set_useManagedNavigationRefiners), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updateRefinementControls = js.Any.fromFunction1(updateRefinementControls), updateRefinementFilters = js.Any.fromFunction5(updateRefinementFilters), updateRefiners = js.Any.fromFunction4(updateRefiners), updateRefinersJSON = js.Any.fromFunction1(updateRefinersJSON), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[Refinement]
  }
  @scala.inline
  implicit class RefinementOps[Self <: Refinement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRefinementFilter(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRefinementFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddRefinementFilters(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRefinementFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddRefinementFiltersJSON(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRefinementFiltersJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddRefinementFiltersJSONWithOr(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRefinementFiltersJSONWithOr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddRefinementFiltersWithOp(value: (js.Array[_], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRefinementFiltersWithOp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCurrentRefinementCategory(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentRefinementCategory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRefinementControl(value: String => RefinementControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefinementControl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_emptyRefinementMessageId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_emptyRefinementMessageId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_selectedRefinementControls(value: () => js.Array[RefinementControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_selectedRefinementControls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_useManagedNavigationRefiners(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_useManagedNavigationRefiners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAllRefinementFilters(value: (String, js.Array[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAllRefinementFilters")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasRefinementCategory(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRefinementCategory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasRefinementFilter(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRefinementFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasRefiner(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRefiner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveRefinementCategory(value: (js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRefinementCategory")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveRefinementFilter(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRefinementFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveRefinementFiltersJSON(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRefinementFiltersJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceRefinementFilter(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceRefinementFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet_emptyRefinementMessageId(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_emptyRefinementMessageId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_selectedRefinementControls(value: js.Array[RefinementControl] => js.Array[RefinementControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_selectedRefinementControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_useManagedNavigationRefiners(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_useManagedNavigationRefiners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateRefinementControls(value: js.Array[RefinementControl] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRefinementControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateRefinementFilters(value: (String, js.Array[String], String, Boolean, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRefinementFilters")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withUpdateRefiners(value: (js.Array[_], String, Boolean, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRefiners")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUpdateRefinersJSON(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRefinersJSON")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

