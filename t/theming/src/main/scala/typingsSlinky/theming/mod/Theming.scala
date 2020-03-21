package typingsSlinky.theming.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Context
import typingsSlinky.theming.AnonTheme
import typingsSlinky.theming.AnonThemeNonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theming[Theme] extends js.Object {
  var ThemeProvider: ThemeProviderFactory[Theme]
  var context: Context[Theme]
  var useTheme: UseThemeFactory[Theme]
  var withTheme: WithThemeFactory[Theme]
}

object Theming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderFactory[Theme],
    context: Context[Theme],
    useTheme: () => Theme,
    withTheme: /* comp */ ReactComponentClass[AnonTheme[Theme]] => ReactComponentClass[AnonTheme[Theme] with AnonThemeNonNullable[Theme]]
  ): Theming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
  
    __obj.asInstanceOf[Theming[Theme]]
  }
}

