package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.events
import typingsSlinky.semanticUiReact.semanticUiReactStrings.repaint
import typingsSlinky.semanticUiReact.visibilityVisibilityMod.VisibilityEventData
import typingsSlinky.semanticUiReact.visibilityVisibilityMod.VisibilityOnPassed
import typingsSlinky.semanticUiReact.visibilityVisibilityMod.VisibilityProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Visibility {
  
  @JSImport("semantic-ui-react", "Visibility")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Visibility] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextDocument(value: Document): this.type = set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextHTMLElement(value: HTMLElement): this.type = set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextWindow(value: Window): this.type = set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def context(value: Document | Window | HTMLElement): this.type = set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def continuous(value: Boolean): this.type = set("continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fireOnMount(value: Boolean): this.type = set("fireOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetVarargs(value: (Double | String)*): this.type = set("offset", js.Array(value :_*))
    
    @scala.inline
    def offset(value: Double | String | (js.Array[Double | String])): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBottomPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onBottomPassed", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBottomPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onBottomPassedReverse", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBottomVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onBottomVisible", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBottomVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onBottomVisibleReverse", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOffScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onOffScreen", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOnScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onOnScreen", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPassed(value: VisibilityOnPassed): this.type = set("onPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPassing(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onPassing", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPassingReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onPassingReverse", js.Any.fromFunction2(value))
    
    @scala.inline
    def onTopPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onTopPassed", js.Any.fromFunction2(value))
    
    @scala.inline
    def onTopPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onTopPassedReverse", js.Any.fromFunction2(value))
    
    @scala.inline
    def onTopVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onTopVisible", js.Any.fromFunction2(value))
    
    @scala.inline
    def onTopVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onTopVisibleReverse", js.Any.fromFunction2(value))
    
    @scala.inline
    def onUpdate(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): this.type = set("onUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def once(value: Boolean): this.type = set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def updateOn(value: events | repaint): this.type = set("updateOn", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VisibilityProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Visibility.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
