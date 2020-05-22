package typingsSlinky.storybookTheming

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.storybookTheming.anon.Background
import typingsSlinky.storybookTheming.anon.Typography
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming/dist/global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  def createGlobal(hasColorBackgroundTypography: Background): Return = js.native
  def createReset(hasTypography: Typography): Return = js.native
  type Return = StringDictionary[StringDictionary[Value]]
  type Value = String | Double
}

