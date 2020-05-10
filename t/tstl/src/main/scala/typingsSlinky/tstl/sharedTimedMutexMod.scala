package typingsSlinky.tstl

import typingsSlinky.tstl.isharedtimedlockableMod.ISharedTimedLockable
import typingsSlinky.tstl.itimedlockableMod.ITimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedTimedMutex", JSImport.Namespace)
@js.native
object sharedTimedMutexMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex ()
    extends ITimedLockable
       with ISharedTimedLockable {
    var _Cancel: js.Any = js.native
    var _Current_access_type: js.Any = js.native
    var _Release: js.Any = js.native
    var queue_ : js.Any = js.native
    var reading_ : js.Any = js.native
    var source_ : js.Any = js.native
    var writing_ : js.Any = js.native
  }
  
}

