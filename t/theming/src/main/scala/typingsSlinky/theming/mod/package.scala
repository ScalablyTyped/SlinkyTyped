package typingsSlinky.theming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ThemeProviderFactory[Theme] = slinky.core.ReactComponentClass[typingsSlinky.theming.mod.ThemeProviderProps[Theme]]
  type UseThemeFactory[Theme] = js.Function0[Theme]
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ slinky.core.ReactComponentClass[typingsSlinky.theming.anon.ThemeNonNullable[Theme]], 
    slinky.core.ReactComponentClass[
      typingsSlinky.theming.anon.ThemeNonNullable[Theme] with typingsSlinky.theming.anon.`0`[Theme]
    ]
  ]
}
