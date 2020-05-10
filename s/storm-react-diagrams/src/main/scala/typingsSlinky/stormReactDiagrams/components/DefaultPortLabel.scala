package typingsSlinky.stormReactDiagrams.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stormReactDiagrams.defaultPortLabelWidgetMod.DefaultPortLabelProps
import typingsSlinky.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultPortLabel {
  @JSImport("storm-react-diagrams", "DefaultPortLabel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.DefaultPortLabel] {
    @scala.inline
    def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def extraProps(value: js.Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DefaultPortLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(model: DefaultPortModel): Builder = {
    val __props = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DefaultPortLabelProps]))
  }
}

