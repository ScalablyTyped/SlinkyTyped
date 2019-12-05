package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuickLaunchOptions extends js.Object

@JSGlobal("SP.QuickLaunchOptions")
@js.native
object QuickLaunchOptions extends js.Object {
  @js.native
  sealed trait defaultValue extends QuickLaunchOptions
  
  @js.native
  sealed trait off extends QuickLaunchOptions
  
  @js.native
  sealed trait on extends QuickLaunchOptions
  
  /* 2 */ val defaultValue: typingsSlinky.sharepoint.SP.QuickLaunchOptions.defaultValue with Double = js.native
  /* 0 */ val off: typingsSlinky.sharepoint.SP.QuickLaunchOptions.off with Double = js.native
  /* 1 */ val on: typingsSlinky.sharepoint.SP.QuickLaunchOptions.on with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuickLaunchOptions with Double] = js.native
}

