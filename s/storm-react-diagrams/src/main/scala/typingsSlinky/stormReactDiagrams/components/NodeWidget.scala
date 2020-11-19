package typingsSlinky.stormReactDiagrams.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.nodeModelMod.NodeModel
import typingsSlinky.stormReactDiagrams.nodeWidgetMod.NodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeWidget {
  
  @JSImport("storm-react-diagrams", "NodeWidget")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.NodeWidget] {
    
    @scala.inline
    def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraProps(value: js.Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(diagramEngine: DiagramEngine, node: NodeModel): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NodeProps]))
  }
}
