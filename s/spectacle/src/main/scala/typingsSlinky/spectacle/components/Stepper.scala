package typingsSlinky.spectacle.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.anon.DefaultValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stepper {
  @JSImport("spectacle", "Stepper")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def defaultValue(value: js.Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DefaultValue): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: (js.Any, Double) => ReactElement, values: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DefaultValue]))
  }
}

