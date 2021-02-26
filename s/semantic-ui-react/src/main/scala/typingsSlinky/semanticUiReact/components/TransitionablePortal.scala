package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.portalPortalMod.PortalProps
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionEventData
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionProps
import typingsSlinky.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalProps
import typingsSlinky.semanticUiReact.transitionablePortalTransitionablePortalMod.TransitionablePortalState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransitionablePortal {
  
  @JSImport("semantic-ui-react", "TransitionablePortal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.TransitionablePortal] {
    
    @scala.inline
    def onClose(value: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def onHide(value: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit): this.type = set("onHide", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOpen(value: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit): this.type = set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def onStart(value: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit): this.type = set("onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transition(value: TransitionProps): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TransitionablePortal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TransitionablePortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
