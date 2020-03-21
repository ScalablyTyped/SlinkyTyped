package typingsSlinky.solidReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.solidReact.mod.LoginButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoginButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.solidReact.mod.LoginButton] {
  @JSImport("@solid/react", "LoginButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(popup: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.solidReact.mod.LoginButton] = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LoginButtonProps
}

