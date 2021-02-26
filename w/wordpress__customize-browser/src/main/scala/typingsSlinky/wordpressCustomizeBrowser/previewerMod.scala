package typingsSlinky.wordpressCustomizeBrowser

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.jquery.JQuery
import typingsSlinky.jquery.JQuery.Deferred
import typingsSlinky.jquery.JQuery.Promise
import typingsSlinky.wordpressCustomizeBrowser.messengerMod.Messenger
import typingsSlinky.wordpressCustomizeBrowser.messengerMod.MessengerParams
import typingsSlinky.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewerMod {
  
  @JSImport("@wordpress/customize-browser/Previewer", "Previewer")
  @js.native
  class Previewer[T] protected () extends Messenger[T] {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def abort(): Unit = js.native
    
    var allowedUrls: js.Array[String] = js.native
    
    def cheatin(): Unit = js.native
    
    var container: JQuery[HTMLElement] = js.native
    
    var deferred: PreviewerDeferred = js.native
    
    def initialize(params: PreviewerParams): Unit = js.native
    def initialize(params: PreviewerParams, options: js.Object): Unit = js.native
    
    def keepPreviewAlive(): Unit = js.native
    
    def login(): Promise[_, _, _] = js.native
    
    var previewUrl: Value[String] = js.native
    
    def query(): Unit = js.native
    
    def ready(data: PreviewerData): Unit = js.native
    
    def refresh(): Unit = js.native
    
    var refreshBuffer: Null | Double = js.native
    
    def refreshNonces(): Deferred[_, _, _] = js.native
  }
  
  @js.native
  trait PreviewerData extends StObject {
    
    // TODO
    var activeControls: js.Any = js.native
    
    var activePanels: js.Any = js.native
    
    // TODO
    var activeSections: js.Any = js.native
    
    var currentUrl: String = js.native
  }
  object PreviewerData {
    
    @scala.inline
    def apply(activeControls: js.Any, activePanels: js.Any, activeSections: js.Any, currentUrl: String): PreviewerData = {
      val __obj = js.Dynamic.literal(activeControls = activeControls.asInstanceOf[js.Any], activePanels = activePanels.asInstanceOf[js.Any], activeSections = activeSections.asInstanceOf[js.Any], currentUrl = currentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewerData]
    }
    
    @scala.inline
    implicit class PreviewerDataMutableBuilder[Self <: PreviewerData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveControls(value: js.Any): Self = StObject.set(x, "activeControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePanels(value: js.Any): Self = StObject.set(x, "activePanels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSections(value: js.Any): Self = StObject.set(x, "activeSections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUrl(value: String): Self = StObject.set(x, "currentUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreviewerDeferred extends StObject {
    
    var active: Deferred[_, _, _] = js.native
  }
  object PreviewerDeferred {
    
    @scala.inline
    def apply(active: Deferred[_, _, _]): PreviewerDeferred = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewerDeferred]
    }
    
    @scala.inline
    implicit class PreviewerDeferredMutableBuilder[Self <: PreviewerDeferred] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Deferred[_, _, _]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreviewerParams extends MessengerParams {
    
    var allowedUrls: js.Array[_] = js.native
    
    // TODO
    var container: String = js.native
    
    var form: String = js.native
    
    var previewUrl: String = js.native
  }
  object PreviewerParams {
    
    @scala.inline
    def apply(
      allowedUrls: js.Array[_],
      channel: String,
      container: String,
      form: String,
      previewUrl: String,
      targetWindow: Window,
      url: String
    ): PreviewerParams = {
      val __obj = js.Dynamic.literal(allowedUrls = allowedUrls.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], targetWindow = targetWindow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewerParams]
    }
    
    @scala.inline
    implicit class PreviewerParamsMutableBuilder[Self <: PreviewerParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedUrls(value: js.Array[_]): Self = StObject.set(x, "allowedUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedUrlsVarargs(value: js.Any*): Self = StObject.set(x, "allowedUrls", js.Array(value :_*))
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    }
  }
}
