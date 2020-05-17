package typingsSlinky.storybookTheming

import typingsSlinky.storybookTheming.anon.ColorString
import typingsSlinky.storybookTheming.storybookThemingStrings.dark
import typingsSlinky.storybookTheming.storybookThemingStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def darkenColor(color: String): String = js.native
  def getPreferredColorScheme(): light | dark = js.native
  def lightenColor(color: String): String = js.native
  def mkColor(color: String): ColorString = js.native
}

