package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileLevel extends js.Object

@JSGlobal("SP.FileLevel")
@js.native
object FileLevel extends js.Object {
  @js.native
  sealed trait checkout extends FileLevel
  
  @js.native
  sealed trait draft extends FileLevel
  
  @js.native
  sealed trait published extends FileLevel
  
  /* 2 */ val checkout: typingsSlinky.sharepoint.SP.FileLevel.checkout with Double = js.native
  /* 1 */ val draft: typingsSlinky.sharepoint.SP.FileLevel.draft with Double = js.native
  /* 0 */ val published: typingsSlinky.sharepoint.SP.FileLevel.published with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileLevel with Double] = js.native
}

