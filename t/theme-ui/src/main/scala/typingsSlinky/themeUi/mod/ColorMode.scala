package typingsSlinky.themeUi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.csstype.mod.ColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorMode extends /* k */ StringDictionary[ColorProperty | ObjectOrArray[ColorProperty]] {
  /**
    * A contrast color for emphasizing UI
    */
  var accent: js.UndefOr[ColorProperty] = js.native
  /**
    * Body background color
    */
  var background: ColorProperty = js.native
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

@JSImport("theme-ui", "ColorMode")
@js.native
object ColorMode
  extends TopLevel[ReactComponentClass[js.Object]]

