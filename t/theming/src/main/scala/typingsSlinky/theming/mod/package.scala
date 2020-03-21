package typingsSlinky.theming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultTheme = js.Object | scala.Null
  type ThemeProviderFactory[Theme] = slinky.core.ReactComponentClass[typingsSlinky.theming.mod.ThemeProviderProps[Theme]]
  type UseThemeFactory[Theme] = js.Function0[Theme]
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ slinky.core.ReactComponentClass[typingsSlinky.theming.AnonTheme[Theme]], 
    slinky.core.ReactComponentClass[
      typingsSlinky.theming.AnonTheme[Theme] with typingsSlinky.theming.AnonThemeNonNullable[Theme]
    ]
  ]
}
