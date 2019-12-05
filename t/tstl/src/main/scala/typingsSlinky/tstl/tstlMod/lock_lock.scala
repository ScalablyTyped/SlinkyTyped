package typingsSlinky.tstl.tstlMod

import typingsSlinky.std.Pick
import typingsSlinky.tstl.threadILockableMod.ILockable
import typingsSlinky.tstl.tstlStrings.lock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "lock")
@js.native
object lock_lock extends js.Object {
  def apply(items: (Pick[ILockable, lock])*): js.Promise[Unit] = js.native
}

