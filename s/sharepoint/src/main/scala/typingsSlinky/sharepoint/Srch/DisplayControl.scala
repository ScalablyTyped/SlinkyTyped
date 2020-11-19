package typingsSlinky.sharepoint.Srch

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayControl extends ClientControl {
  
  def add_oneTimeResultRendered(value: js.Any): Unit = js.native
  
  def add_queryReady(value: js.Any): Unit = js.native
  
  def add_resultRendered(value: js.Any): Unit = js.native
  
  def dataProvider_QueryIssuing(sender: js.Any, e: js.Any): Unit = js.native
  
  def dataProvider_ResultReady(sender: js.Any, e: js.Any): Unit = js.native
  
  def get_currentResultTableCollection(): js.Any = js.native
  
  def get_dataProvider(): DataProvider = js.native
  
  def get_emptyMessage(): String = js.native
  
  def get_queryGroupName(): String = js.native
  
  def get_renderedResult(): Boolean = js.native
  
  def get_shouldShowNoResultMessage(): Boolean = js.native
  
  def processQueryIssuing(queryState: js.Any): Unit = js.native
  
  def processResultReady(resultTableCollection: js.Any): Unit = js.native
  
  def raiseOneTimeResultRenderedEvent(arg: js.Any): Unit = js.native
  
  def raiseQueryReadyEvent(arg: js.Any): Unit = js.native
  
  def raiseResultRenderedEvent(arg: js.Any): Unit = js.native
  
  def refresh(queryState: js.Any): Unit = js.native
  
  def remove_oneTimeResultRendered(value: js.Any): Unit = js.native
  
  def remove_queryReady(value: js.Any): Unit = js.native
  
  def remove_resultRendered(value: js.Any): Unit = js.native
  
  def render(): Unit = js.native
  
  def set_currentResultTableCollection(value: js.Any): js.Any = js.native
  
  def set_emptyMessage(value: String): String = js.native
  
  def set_queryGroupName(value: String): String = js.native
  
  def set_renderedResult(value: Boolean): Boolean = js.native
  
  def set_shouldShowNoResultMessage(value: Boolean): Boolean = js.native
}
object DisplayControl {
  
  @scala.inline
  def apply(
    addCssClass: String => Unit,
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
    get_alternateErrorMessage: () => String,
    get_currentResultTableCollection: () => js.Any,
    get_dataProvider: () => DataProvider,
    get_delayLoadTemplateScripts: () => Boolean,
    get_element: () => HTMLElement,
    get_emptyMessage: () => String,
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
    get_shouldShowNoResultMessage: () => Boolean,
    get_showDataErrors: () => Boolean,
    get_states: () => js.Any,
    hasMessages: () => js.Any,
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
    remove_disposing: js.Function => Unit,
    remove_oneTimeResultRendered: js.Any => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_queryReady: js.Any => Unit,
    remove_resultRendered: js.Any => Unit,
    render: () => Unit,
    renderControl: (js.Any, js.Any) => Unit,
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
    set_id: String => Unit,
    set_messages: js.Array[_] => js.Array[_],
    set_queryGroupName: String => String,
    set_renderTemplateId: String => String,
    set_renderedResult: Boolean => Boolean,
    set_shouldShowNoResultMessage: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_states: js.Any => js.Any,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => js.Any,
    updated: () => Unit
  ): DisplayControl = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_oneTimeResultRendered = js.Any.fromFunction1(add_oneTimeResultRendered), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_queryReady = js.Any.fromFunction1(add_queryReady), add_resultRendered = js.Any.fromFunction1(add_resultRendered), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2(dataProvider_QueryIssuing), dataProvider_ResultReady = js.Any.fromFunction2(dataProvider_ResultReady), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_currentResultTableCollection = js.Any.fromFunction0(get_currentResultTableCollection), get_dataProvider = js.Any.fromFunction0(get_dataProvider), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_element = js.Any.fromFunction0(get_element), get_emptyMessage = js.Any.fromFunction0(get_emptyMessage), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_queryGroupName = js.Any.fromFunction0(get_queryGroupName), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_renderedResult = js.Any.fromFunction0(get_renderedResult), get_shouldShowNoResultMessage = js.Any.fromFunction0(get_shouldShowNoResultMessage), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_states = js.Any.fromFunction0(get_states), hasMessages = js.Any.fromFunction0(hasMessages), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processQueryIssuing = js.Any.fromFunction1(processQueryIssuing), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), processResultReady = js.Any.fromFunction1(processResultReady), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raiseOneTimeResultRenderedEvent = js.Any.fromFunction1(raiseOneTimeResultRenderedEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), raiseQueryReadyEvent = js.Any.fromFunction1(raiseQueryReadyEvent), raiseResultRenderedEvent = js.Any.fromFunction1(raiseResultRenderedEvent), refresh = js.Any.fromFunction1(refresh), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_oneTimeResultRendered = js.Any.fromFunction1(remove_oneTimeResultRendered), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_queryReady = js.Any.fromFunction1(remove_queryReady), remove_resultRendered = js.Any.fromFunction1(remove_resultRendered), render = js.Any.fromFunction0(render), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentResultTableCollection = js.Any.fromFunction1(set_currentResultTableCollection), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_emptyMessage = js.Any.fromFunction1(set_emptyMessage), set_id = js.Any.fromFunction1(set_id), set_messages = js.Any.fromFunction1(set_messages), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_renderedResult = js.Any.fromFunction1(set_renderedResult), set_shouldShowNoResultMessage = js.Any.fromFunction1(set_shouldShowNoResultMessage), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_states = js.Any.fromFunction1(set_states), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[DisplayControl]
  }
  
  @scala.inline
  implicit class DisplayControlOps[Self <: DisplayControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd_oneTimeResultRendered(value: js.Any => Unit): Self = this.set("add_oneTimeResultRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd_queryReady(value: js.Any => Unit): Self = this.set("add_queryReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd_resultRendered(value: js.Any => Unit): Self = this.set("add_resultRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataProvider_QueryIssuing(value: (js.Any, js.Any) => Unit): Self = this.set("dataProvider_QueryIssuing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataProvider_ResultReady(value: (js.Any, js.Any) => Unit): Self = this.set("dataProvider_ResultReady", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet_currentResultTableCollection(value: () => js.Any): Self = this.set("get_currentResultTableCollection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_dataProvider(value: () => DataProvider): Self = this.set("get_dataProvider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_emptyMessage(value: () => String): Self = this.set("get_emptyMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queryGroupName(value: () => String): Self = this.set("get_queryGroupName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_renderedResult(value: () => Boolean): Self = this.set("get_renderedResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_shouldShowNoResultMessage(value: () => Boolean): Self = this.set("get_shouldShowNoResultMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProcessQueryIssuing(value: js.Any => Unit): Self = this.set("processQueryIssuing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcessResultReady(value: js.Any => Unit): Self = this.set("processResultReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRaiseOneTimeResultRenderedEvent(value: js.Any => Unit): Self = this.set("raiseOneTimeResultRenderedEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRaiseQueryReadyEvent(value: js.Any => Unit): Self = this.set("raiseQueryReadyEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRaiseResultRenderedEvent(value: js.Any => Unit): Self = this.set("raiseResultRenderedEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: js.Any => Unit): Self = this.set("refresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_oneTimeResultRendered(value: js.Any => Unit): Self = this.set("remove_oneTimeResultRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_queryReady(value: js.Any => Unit): Self = this.set("remove_queryReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_resultRendered(value: js.Any => Unit): Self = this.set("remove_resultRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_currentResultTableCollection(value: js.Any => js.Any): Self = this.set("set_currentResultTableCollection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_emptyMessage(value: String => String): Self = this.set("set_emptyMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_queryGroupName(value: String => String): Self = this.set("set_queryGroupName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_renderedResult(value: Boolean => Boolean): Self = this.set("set_renderedResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_shouldShowNoResultMessage(value: Boolean => Boolean): Self = this.set("set_shouldShowNoResultMessage", js.Any.fromFunction1(value))
  }
}
