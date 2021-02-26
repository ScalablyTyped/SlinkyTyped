package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.blockMoverMod.BlockMover.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockMover {
  
  @scala.inline
  def apply(clientIds: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor", "BlockMover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def blockElementId(value: String): this.type = set("blockElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def instanceId(value: String): this.type = set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDraggable(value: Boolean): this.type = set("isDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isHidden(value: Boolean): this.type = set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnd(value: () => Unit): this.type = set("onDragEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDragStart(value: () => Unit): this.type = set("onDragStart", js.Any.fromFunction0(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
