package typingsSlinky.storybookTheming

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.storybookTheming.anon.Background
import typingsSlinky.storybookTheming.anon.Typography
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  @JSImport("@storybook/theming/dist/global", "createGlobal")
  @js.native
  def createGlobal(hasColorBackgroundTypography: Background): Return = js.native
  
  @JSImport("@storybook/theming/dist/global", "createReset")
  @js.native
  def createReset(hasTypography: Typography): Return = js.native
  
  type Return = StringDictionary[StringDictionary[Value]]
  
  type Value = String | Double
}
