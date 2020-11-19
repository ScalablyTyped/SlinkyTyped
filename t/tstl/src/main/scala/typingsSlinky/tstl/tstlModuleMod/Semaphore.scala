package typingsSlinky.tstl.tstlModuleMod

import typingsSlinky.tstl.anon.PickSemaphorenumberacquir
import typingsSlinky.tstl.itimedlockableMod.ITimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected ()
  extends typingsSlinky.tstl.tstlThreadMod.Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections acquirable.
    */
  def this(max: Max) = this()
}
@JSImport("tstl/module", "Semaphore")
@js.native
object Semaphore extends js.Object {
  
  /**
    * Capsules a {@link Semaphore} to be suitable for the {@link UniqueLock}.
    *
    * @param semaphore Target semaphore to capsule.
    * @return Lockable instance suitable for the {@link UniqueLock}
    */
  @JSName("get_lockable")
  def getLockable[SemaphoreT /* <: PickSemaphorenumberacquir */](semaphore: SemaphoreT): ITimedLockable = js.native
}
