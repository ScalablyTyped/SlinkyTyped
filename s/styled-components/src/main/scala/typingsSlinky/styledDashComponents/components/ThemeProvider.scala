package typingsSlinky.styledDashComponents.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typingsSlinky.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typingsSlinky.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.styledDashComponents.macroMod.ThemeProvider] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.styledDashComponents.macroMod.ThemeProvider].asInstanceOf[String | js.Object]
  def apply(
    theme: AnyIfEmpty[AnyIfEmpty[DefaultTheme]] | (js.Function1[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]),
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.styledDashComponents.macroMod.ThemeProvider] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ThemeProviderProps[js.Any, js.Any]
}

