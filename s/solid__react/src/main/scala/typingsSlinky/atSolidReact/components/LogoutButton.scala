package typingsSlinky.atSolidReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atSolidReact.Anon_ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LogoutButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atSolidReact.atSolidReactMod.LogoutButton] {
  @JSImport("@solid/react", "LogoutButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atSolidReact.atSolidReactMod.LogoutButton] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Anon_ClassName
}

