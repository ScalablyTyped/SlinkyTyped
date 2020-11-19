package typingsSlinky.tstl.mod

import typingsSlinky.tstl.anon.PickILockablelockunlock
import typingsSlinky.tstl.anon.PickILockabletrylockunloc
import typingsSlinky.tstl.anon.PickITimedLockabletrylock
import typingsSlinky.tstl.anon.PickITimedLockabletrylockTrylockuntil
import typingsSlinky.tstl.uniqueLockMod.UniqueLock.Closure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "UniqueLock")
@js.native
class UniqueLock ()
  extends typingsSlinky.tstl.uniqueLockMod.UniqueLock
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
