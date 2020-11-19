package typingsSlinky.stormReactDiagrams.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import typingsSlinky.stormReactDiagrams.linkWidgetMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkWidget {
  
  @JSImport("storm-react-diagrams", "LinkWidget")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.LinkWidget] {
    
    @scala.inline
    def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraProps(value: js.Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(diagramEngine: DiagramEngine, link: LinkModel[LinkModelListener]): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
}
