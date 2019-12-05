package typingsSlinky.theming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themingMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.theming.Anon_Theme
  import typingsSlinky.theming.Anon_ThemeNonNullable

  type DefaultTheme = js.Object | Null
  type ThemeProviderFactory[Theme] = ReactComponentClass[ThemeProviderProps[Theme]]
  type UseThemeFactory[Theme] = js.Function0[Theme]
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ ReactComponentClass[Anon_Theme[Theme]], 
    ReactComponentClass[Anon_Theme[Theme] with Anon_ThemeNonNullable[Theme]]
  ]
}
