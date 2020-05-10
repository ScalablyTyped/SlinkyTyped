package typingsSlinky.stormReactDiagrams.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stormReactDiagrams.defaultLabelModelMod.DefaultLabelModel
import typingsSlinky.stormReactDiagrams.defaultLabelWidgetMod.DefaultLabelWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultLabelWidget {
  @JSImport("storm-react-diagrams", "DefaultLabelWidget")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.DefaultLabelWidget] {
    @scala.inline
    def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def extraProps(value: js.Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DefaultLabelWidgetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(model: DefaultLabelModel): Builder = {
    val __props = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DefaultLabelWidgetProps]))
  }
}

