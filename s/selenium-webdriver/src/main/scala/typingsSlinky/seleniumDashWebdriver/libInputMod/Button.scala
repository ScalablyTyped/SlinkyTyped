package typingsSlinky.seleniumDashWebdriver.libInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

@JSImport("selenium-webdriver/lib/input", "Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait LEFT extends Button
  
  @js.native
  sealed trait MIDDLE extends Button
  
  @js.native
  sealed trait RIGHT extends Button
  
  /* 0 */ val LEFT: typingsSlinky.seleniumDashWebdriver.libInputMod.Button.LEFT with Double = js.native
  /* 1 */ val MIDDLE: typingsSlinky.seleniumDashWebdriver.libInputMod.Button.MIDDLE with Double = js.native
  /* 2 */ val RIGHT: typingsSlinky.seleniumDashWebdriver.libInputMod.Button.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Button with Double] = js.native
}

