package typingsSlinky.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageLevel extends js.Object

@JSGlobal("Srch.MessageLevel")
@js.native
object MessageLevel extends js.Object {
  @js.native
  sealed trait error extends MessageLevel
  
  @js.native
  sealed trait information extends MessageLevel
  
  @js.native
  sealed trait warning extends MessageLevel
  
  /* 2 */ val error: typingsSlinky.sharepoint.Srch.MessageLevel.error with Double = js.native
  /* 0 */ val information: typingsSlinky.sharepoint.Srch.MessageLevel.information with Double = js.native
  /* 1 */ val warning: typingsSlinky.sharepoint.Srch.MessageLevel.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageLevel with Double] = js.native
}

