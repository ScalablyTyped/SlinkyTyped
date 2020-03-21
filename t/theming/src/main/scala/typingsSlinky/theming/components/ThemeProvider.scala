package typingsSlinky.theming.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.std.NonNullable
import typingsSlinky.theming.mod.DefaultTheme
import typingsSlinky.theming.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.theming.mod.ThemeProvider] {
  @JSImport("theming", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    theme: NonNullable[DefaultTheme] | (js.Function1[DefaultTheme, NonNullable[DefaultTheme]]),
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.theming.mod.ThemeProvider] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ThemeProviderProps[DefaultTheme]
}

