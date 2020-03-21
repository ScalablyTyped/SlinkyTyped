package typingsSlinky.solidReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.solidReact.mod.AuthButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AuthButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.solidReact.mod.AuthButton] {
  @JSImport("@solid/react", "AuthButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(login: String, logout: String, popup: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.solidReact.mod.AuthButton] = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AuthButtonProps
}

