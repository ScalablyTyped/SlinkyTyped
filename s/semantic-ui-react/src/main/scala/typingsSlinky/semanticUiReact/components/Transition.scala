package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticTRANSITIONS
import typingsSlinky.semanticUiReact.transitionGroupMod.TransitionGroupProps
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionEventData
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionPropDuration
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transition {
  
  object Group {
    
    @JSImport("semantic-ui-react", "Transition.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_TransitionGroupProps_897508211[typingsSlinky.semanticUiReact.mod.Transition.Group] = new SharedBuilder_TransitionGroupProps_897508211[typingsSlinky.semanticUiReact.mod.Transition.Group](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransitionGroupProps): SharedBuilder_TransitionGroupProps_897508211[typingsSlinky.semanticUiReact.mod.Transition.Group] = new SharedBuilder_TransitionGroupProps_897508211[typingsSlinky.semanticUiReact.mod.Transition.Group](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Transition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Transition] {
    
    @scala.inline
    def animation(value: SemanticTRANSITIONS | String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directional(value: Boolean): this.type = set("directional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double | String | TransitionPropDuration): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mountOnShow(value: Boolean): this.type = set("mountOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onComplete(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): this.type = set("onComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def onHide(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): this.type = set("onHide", js.Any.fromFunction2(value))
    
    @scala.inline
    def onShow(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): this.type = set("onShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def onStart(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): this.type = set("onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def reactKey(value: String): this.type = set("reactKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionOnMount(value: Boolean): this.type = set("transitionOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unmountOnHide(value: Boolean): this.type = set("unmountOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Transition.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
