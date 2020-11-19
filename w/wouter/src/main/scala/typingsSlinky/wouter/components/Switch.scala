package typingsSlinky.wouter.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wouter.mod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  @JSImport("wouter", "Switch")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def location(value: String): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: js.Array[ReactElement]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SwitchProps]))
  }
}
