package typingsSlinky.tstl.tstlModuleMod

import typingsSlinky.tstl.anon.PickISharedLockablelocksh
import typingsSlinky.tstl.anon.PickISharedLockabletryloc
import typingsSlinky.tstl.anon.PickISharedTimedLockablet
import typingsSlinky.tstl.anon.PickISharedTimedLockabletTrylockshareduntil
import typingsSlinky.tstl.sharedLockMod.SharedLock.Closure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "SharedLock")
@js.native
class SharedLock ()
  extends typingsSlinky.tstl.sharedLockMod.SharedLock
@JSImport("tstl/module", "SharedLock")
@js.native
object SharedLock extends js.Object {
  
  def lock[Mutex /* <: PickISharedLockablelocksh */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  
  @JSName("try_lock")
  def tryLock[Mutex /* <: PickISharedLockabletryloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  
  @JSName("try_lock_for")
  def tryLockFor[Mutex /* <: PickISharedTimedLockablet */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  
  @JSName("try_lock_until")
  def tryLockUntil[Mutex /* <: PickISharedTimedLockabletTrylockshareduntil */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
}
