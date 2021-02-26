package typingsSlinky.stormReactDiagrams.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.nodeLayerWidgetMod.NodeLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeLayerWidget {
  
  @scala.inline
  def apply(diagramEngine: DiagramEngine): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NodeLayerProps]))
  }
  
  @JSImport("storm-react-diagrams", "NodeLayerWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.NodeLayerWidget] {
    
    @scala.inline
    def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraProps(value: js.Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NodeLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
