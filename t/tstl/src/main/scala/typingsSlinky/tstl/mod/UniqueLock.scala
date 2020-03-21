package typingsSlinky.tstl.mod

import typingsSlinky.tstl.PickILockablelockunlock
import typingsSlinky.tstl.PickILockabletrylockunloc
import typingsSlinky.tstl.PickITimedLockabletrylock
import typingsSlinky.tstl.PickITimedLockabletrylockTrylockuntil
import typingsSlinky.tstl.uniqueLockMod.Closure
import typingsSlinky.tstl.uniqueLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "UniqueLock")
@js.native
class UniqueLock[Mutex /* <: IMutex */] protected ()
  extends typingsSlinky.tstl.threadMod.UniqueLock[Mutex] {
  def this(mutex: Mutex) = this()
}

@JSImport("tstl", "UniqueLock")
@js.native
object UniqueLock extends js.Object {
  def lock[Mutex /* <: PickILockablelockunlock */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def tryLock[Mutex /* <: PickILockabletrylockunloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  @JSName("try_lock_for")
  def tryLockFor[Mutex /* <: PickITimedLockabletrylock */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  @JSName("try_lock_until")
  def tryLockUntil[Mutex /* <: PickITimedLockabletrylockTrylockuntil */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
}

