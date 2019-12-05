package typingsSlinky.tstl.tstlMod

import typingsSlinky.std.Pick
import typingsSlinky.tstl.baseThreadUnderscoreISharedLockableMod._ISharedLockable
import typingsSlinky.tstl.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable
import typingsSlinky.tstl.threadSharedLockMod.Closure
import typingsSlinky.tstl.threadSharedLockMod.IMutex
import typingsSlinky.tstl.tstlStrings.lock_shared
import typingsSlinky.tstl.tstlStrings.try_lock_shared
import typingsSlinky.tstl.tstlStrings.try_lock_shared_for
import typingsSlinky.tstl.tstlStrings.try_lock_shared_until
import typingsSlinky.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "shared_lock")
@js.native
class shared_lock[Mutex /* <: IMutex */] protected ()
  extends typingsSlinky.tstl.threadMod.shared_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

@JSImport("tstl", "shared_lock")
@js.native
object shared_lock extends js.Object {
  def lock[Mutex /* <: Pick[_ISharedLockable, lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  def try_lock[Mutex /* <: Pick[_ISharedLockable, try_lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_for[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_for | unlock_shared] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_until[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_until | unlock_shared] */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
}

