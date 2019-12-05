package typingsSlinky.tstl.tstlMod

import typingsSlinky.std.Pick
import typingsSlinky.tstl.baseThreadUnderscoreITimedLockableMod._ITimedLockable
import typingsSlinky.tstl.threadILockableMod.ILockable
import typingsSlinky.tstl.threadUniqueLockMod.Closure
import typingsSlinky.tstl.threadUniqueLockMod.IMutex
import typingsSlinky.tstl.tstlStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "unique_lock")
@js.native
class unique_lock[Mutex /* <: IMutex */] protected ()
  extends typingsSlinky.tstl.threadMod.unique_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

@JSImport("tstl", "unique_lock")
@js.native
object unique_lock extends js.Object {
  def lock[Mutex /* <: Pick[ILockable, typingsSlinky.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  def try_lock[Mutex /* <: Pick[ILockable, typingsSlinky.tstl.tstlStrings.try_lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_for[Mutex /* <: Pick[_ITimedLockable, typingsSlinky.tstl.tstlStrings.try_lock_for | unlock] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_until[Mutex /* <: Pick[_ITimedLockable, typingsSlinky.tstl.tstlStrings.try_lock_until | unlock] */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
}

