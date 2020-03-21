package typingsSlinky.tstl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected ()
  extends typingsSlinky.tstl.threadMod.Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections lockable.
    */
  def this(max: Max) = this()
}

