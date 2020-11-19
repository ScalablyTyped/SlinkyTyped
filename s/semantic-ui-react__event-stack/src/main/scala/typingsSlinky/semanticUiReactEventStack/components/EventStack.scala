package typingsSlinky.semanticUiReactEventStack.components

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReactEventStack.mod.default
import typingsSlinky.semanticUiReactEventStack.typesEventStackMod.EventStackProps
import typingsSlinky.semanticUiReactEventStack.typesMod.InputEventListener
import typingsSlinky.semanticUiReactEventStack.typesMod.InputTargetElement
import typingsSlinky.semanticUiReactEventStack.typesMod.TargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventStack {
  
  @JSImport("@semantic-ui-react/event-stack", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def pool(value: String): this.type = set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetWindow(value: Window): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: InputTargetElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetDocument(value: Document): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetRefObject(value: ReactRef[TargetElement]): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EventStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String, on: InputEventListener): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EventStackProps]))
  }
}
