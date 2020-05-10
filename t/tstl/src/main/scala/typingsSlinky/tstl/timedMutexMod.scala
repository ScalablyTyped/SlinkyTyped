package typingsSlinky.tstl

import typingsSlinky.tstl.itimedlockableMod.ITimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/TimedMutex", JSImport.Namespace)
@js.native
object timedMutexMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex () extends ITimedLockable {
    var mutex_ : js.Any = js.native
  }
  
}

