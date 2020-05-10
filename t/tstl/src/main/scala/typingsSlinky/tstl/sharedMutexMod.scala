package typingsSlinky.tstl

import typingsSlinky.tstl.ilockableMod.ILockable
import typingsSlinky.tstl.isharedlockableMod.ISharedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedMutex", JSImport.Namespace)
@js.native
object sharedMutexMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex ()
    extends ILockable
       with ISharedLockable {
    var mutex_ : js.Any = js.native
  }
  
}

