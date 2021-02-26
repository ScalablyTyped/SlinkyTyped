package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.anon.OnDraggableEnd
import typingsSlinky.wordpressComponents.draggableMod.Draggable.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draggable {
  
  @scala.inline
  def apply(children: OnDraggableEnd => ReactElement, elementId: String, transferData: js.Any): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), elementId = elementId.asInstanceOf[js.Any], transferData = transferData.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "Draggable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def onDragEnd(value: () => Unit): this.type = set("onDragEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDragStart(value: () => Unit): this.type = set("onDragStart", js.Any.fromFunction0(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
