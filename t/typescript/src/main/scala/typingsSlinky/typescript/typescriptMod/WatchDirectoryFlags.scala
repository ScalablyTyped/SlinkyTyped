package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WatchDirectoryFlags extends js.Object

@JSImport("typescript", "WatchDirectoryFlags")
@js.native
object WatchDirectoryFlags extends js.Object {
  @js.native
  sealed trait None extends WatchDirectoryFlags
  
  @js.native
  sealed trait Recursive extends WatchDirectoryFlags
  
  /* 0 */ val None: typingsSlinky.typescript.typescriptMod.WatchDirectoryFlags.None with Double = js.native
  /* 1 */ val Recursive: typingsSlinky.typescript.typescriptMod.WatchDirectoryFlags.Recursive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryFlags with Double] = js.native
}

