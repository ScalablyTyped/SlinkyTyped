package typingsSlinky.spectacle.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.spectacle.mod.ComponentPlaygroundProps
import typingsSlinky.spectacle.mod.themeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentPlayground
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.spectacle.mod.ComponentPlayground] {
  @JSImport("spectacle", "ComponentPlayground")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    code: String = null,
    previewBackgroundColor: String = null,
    scope: js.Object = null,
    theme: themeType = null,
    transformCode: /* code */ String => String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.spectacle.mod.ComponentPlayground] = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (previewBackgroundColor != null) __obj.updateDynamic("previewBackgroundColor")(previewBackgroundColor.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction1(transformCode))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.spectacle.mod.ComponentPlayground] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.spectacle.mod.ComponentPlayground](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ComponentPlaygroundProps
}

