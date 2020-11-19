package typingsSlinky.stormReactDiagrams.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stormReactDiagrams.nodeModelMod.NodeModel
import typingsSlinky.stormReactDiagrams.portWidgetMod.PortProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortWidget {
  
  @JSImport("storm-react-diagrams", "PortWidget")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.PortWidget] {
    
    @scala.inline
    def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraProps(value: js.Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PortProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String, node: NodeModel): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PortProps]))
  }
}
