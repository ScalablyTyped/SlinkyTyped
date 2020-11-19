package typingsSlinky.solidReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.solidReact.mod.AuthButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthButton {
  
  @JSImport("@solid/react", "AuthButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.solidReact.mod.AuthButton] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AuthButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(login: String, logout: String, popup: String): Builder = {
    val __props = js.Dynamic.literal(login = login.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AuthButtonProps]))
  }
}
