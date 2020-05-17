package typingsSlinky.themeUi.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.themeUi.mod.ColorMode
import typingsSlinky.themeUi.mod.ObjectOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined theme-ui.theme-ui.ColorMode & {  modes ? :{[k: string] : theme-ui.theme-ui.ColorMode}} */
@js.native
trait ColorModemodeskstringColo extends /* k */ StringDictionary[ColorProperty | ObjectOrArray[ColorProperty]] {
  /**
    * A contrast color for emphasizing UI
    */
  var accent: js.UndefOr[ColorProperty] = js.native
  /**
    * Body background color
    */
  var background: ColorProperty = js.native
  /**
    * Nested color modes can provide overrides when used in conjunction with
    * `Theme.initialColorModeName and `useColorMode()`
    */
  var modes: js.UndefOr[StringDictionary[ColorMode]] = js.native
  /**
    * A faint color for backgrounds, borders, and accents that do not require
    * high contrast with the background color
    */
  var muted: js.UndefOr[ColorProperty] = js.native
  /**
    * Primary brand color for links, buttons, etc.
    */
  var primary: js.UndefOr[ColorProperty] = js.native
  /**
    * A secondary brand color for alternative styling
    */
  var secondary: js.UndefOr[ColorProperty] = js.native
  /**
    * Body foreground color
    */
  var text: ColorProperty = js.native
}

object ColorModemodeskstringColo {
  @scala.inline
  def apply(background: ColorProperty, text: ColorProperty): ColorModemodeskstringColo = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorModemodeskstringColo]
  }
  @scala.inline
  implicit class ColorModemodeskstringColoOps[Self <: ColorModemodeskstringColo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccent(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent")(js.undefined)
        ret
    }
    @scala.inline
    def withModes(value: StringDictionary[ColorMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondary(value: ColorProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(js.undefined)
        ret
    }
  }
  
}

