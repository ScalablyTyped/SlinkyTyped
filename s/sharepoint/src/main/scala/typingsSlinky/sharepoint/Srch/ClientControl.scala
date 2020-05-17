package typingsSlinky.sharepoint.Srch

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.microsoftAjax.Sys.UI.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientControl extends Control {
  var alternateRenderContext: js.Any = js.native
  var alternateRenderer: js.Any = js.native
  var loaded: Boolean = js.native
  var serverTemplateScriptsToLoad: js.Array[_] = js.native
  def clickHandler(e: Event): js.Any = js.native
  def get_alternateErrorMessage(): String = js.native
  /** Returns true if control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def get_delayLoadTemplateScripts(): Boolean = js.native
  /** returns true if control has already been loaded at least once */
  def get_isInitialLoad(): Boolean = js.native
  def get_messages(): js.Array[_] = js.native
  /** returns next unique identifier for nested controls */
  def get_nextUniqueId(): String = js.native
  /** Gets the id of View display template that is used to render this control.
    * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
    */
  def get_renderTemplateId(): String = js.native
  def get_showDataErrors(): Boolean = js.native
  def get_states(): js.Any = js.native
  def hasMessages(): js.Any = js.native
  def invokeAlternateRender(callback: js.Any, container: js.Any, ctx: js.Any): js.Any = js.native
  def invokeClientRenderer(node: js.Any, ctx: js.Any): js.Any = js.native
  def loadRenderTemplateScripts(
    scriptReferences: js.Any,
    success: js.Any,
    failure: js.Any,
    timeout: js.Any,
    loadStandAloneCustomScripts: js.Any
  ): Boolean = js.native
  def loadServerTemplateScripts(): Unit = js.native
  def processDataErrorMessages(dataErrorsList: js.Any): js.Any = js.native
  def processDataProviderErrors(dataProviderToProcess: js.Any): Unit = js.native
  def processRenderingErrorMessages(ctx: js.Any): js.Any = js.native
  def renderControl(listData: js.Any, dataProvider: js.Any): Unit = js.native
  def scriptApplication_Load(sender: js.Any, e: js.Any): Unit = js.native
  def scriptApplication_PostLoad(sender: js.Any, e: js.Any): Unit = js.native
  def scriptApplication_PreLoad(sender: js.Any, e: js.Any): Unit = js.native
  def serverTemplateScriptsCallback(): Unit = js.native
  /** show/hide the DOM element associated with control */
  def setControlElementVisibility(showElement: Boolean): js.Any = js.native
  def set_alternateErrorMessage(value: String): String = js.native
  /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def set_delayLoadTemplateScripts(value: Boolean): Boolean = js.native
  def set_messages(value: js.Array[_]): js.Array[_] = js.native
  def set_renderTemplateId(value: String): String = js.native
  /** False by default. */
  def set_showDataErrors(value: Boolean): Boolean = js.native
  def set_states(value: js.Any): js.Any = js.native
  def updateDisplayControlWithNewMessages(): js.Any = js.native
}

object ClientControl {
  @scala.inline
  def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    beginUpdate: () => Unit,
    clickHandler: Event => js.Any,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_alternateErrorMessage: () => String,
    get_delayLoadTemplateScripts: () => Boolean,
    get_element: () => HTMLElement,
    get_events: () => js.Any,
    get_id: () => String,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_messages: () => js.Array[_],
    get_nextUniqueId: () => String,
    get_renderTemplateId: () => String,
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
    processRenderingErrorMessages: js.Any => js.Any,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raisePropertyChanged: String => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    renderControl: (js.Any, js.Any) => Unit,
    scriptApplication_Load: (js.Any, js.Any) => Unit,
    scriptApplication_PostLoad: (js.Any, js.Any) => Unit,
    scriptApplication_PreLoad: (js.Any, js.Any) => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[_],
    setControlElementVisibility: Boolean => js.Any,
    set_alternateErrorMessage: String => String,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_id: String => Unit,
    set_messages: js.Array[_] => js.Array[_],
    set_renderTemplateId: String => String,
    set_showDataErrors: Boolean => Boolean,
    set_states: js.Any => js.Any,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => js.Any,
    updated: () => Unit
  ): ClientControl = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_states = js.Any.fromFunction0(get_states), hasMessages = js.Any.fromFunction0(hasMessages), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_id = js.Any.fromFunction1(set_id), set_messages = js.Any.fromFunction1(set_messages), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_states = js.Any.fromFunction1(set_states), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[ClientControl]
  }
  @scala.inline
  implicit class ClientControlOps[Self <: ClientControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateRenderContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateRenderContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternateRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickHandler(value: Event => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_alternateErrorMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_alternateErrorMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_delayLoadTemplateScripts(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_delayLoadTemplateScripts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_isInitialLoad(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_isInitialLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_messages(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_messages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_nextUniqueId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_nextUniqueId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_renderTemplateId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_renderTemplateId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_showDataErrors(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_showDataErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_states(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_states")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasMessages(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMessages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvokeAlternateRender(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeAlternateRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInvokeClientRenderer(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeClientRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadRenderTemplateScripts(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRenderTemplateScripts")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withLoadServerTemplateScripts(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadServerTemplateScripts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessDataErrorMessages(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDataErrorMessages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcessDataProviderErrors(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDataProviderErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcessRenderingErrorMessages(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processRenderingErrorMessages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderControl(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderControl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScriptApplication_Load(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptApplication_Load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScriptApplication_PostLoad(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptApplication_PostLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScriptApplication_PreLoad(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptApplication_PreLoad")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withServerTemplateScriptsCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTemplateScriptsCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withServerTemplateScriptsToLoad(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTemplateScriptsToLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetControlElementVisibility(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControlElementVisibility")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_alternateErrorMessage(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_alternateErrorMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_delayLoadTemplateScripts(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_delayLoadTemplateScripts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_messages(value: js.Array[_] => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_messages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_renderTemplateId(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_renderTemplateId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_showDataErrors(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_showDataErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_states(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_states")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateDisplayControlWithNewMessages(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDisplayControlWithNewMessages")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

