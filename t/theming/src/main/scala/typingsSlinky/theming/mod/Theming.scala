package typingsSlinky.theming.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Context
import typingsSlinky.theming.anon.ThemeNonNullable
import typingsSlinky.theming.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theming[Theme] extends js.Object {
  var ThemeProvider: ThemeProviderFactory[Theme] = js.native
  var context: Context[Theme] = js.native
  var useTheme: UseThemeFactory[Theme] = js.native
  var withTheme: WithThemeFactory[Theme] = js.native
}

object Theming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderFactory[Theme],
    context: Context[Theme],
    useTheme: () => Theme,
    withTheme: /* comp */ ReactComponentClass[ThemeNonNullable[Theme]] => ReactComponentClass[ThemeNonNullable[Theme] with `0`[Theme]]
  ): Theming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[Theming[Theme]]
  }
  @scala.inline
  implicit class ThemingOps[Self[theme] <: Theming[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withThemeProviderFunctionComponent(value: ReactComponentClass[ThemeProviderProps[Theme]]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeProviderComponentClass(value: ReactComponentClass[ThemeProviderProps[Theme]]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeProvider(value: ThemeProviderFactory[Theme]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: Context[Theme]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTheme(value: () => Theme): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTheme")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithTheme(
      value: /* comp */ ReactComponentClass[ThemeNonNullable[Theme]] => ReactComponentClass[ThemeNonNullable[Theme] with `0`[Theme]]
    ): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

