package typingsSlinky.solidReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.solidReact.mod.LoginButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginButton {
  
  @JSImport("@solid/react", "LoginButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.solidReact.mod.LoginButton] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoginButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(popup: String): Builder = {
    val __props = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LoginButtonProps]))
  }
}
