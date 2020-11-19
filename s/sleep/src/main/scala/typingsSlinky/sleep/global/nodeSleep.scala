package typingsSlinky.sleep.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__node_sleep")
@js.native
object nodeSleep extends js.Object {
  
  /**
    * Sleep for n milliseconds.
    *
    * @param n Number of milliseconds to sleep.
    */
  def msleep(n: Double): Unit = js.native
  
  /**
    * Sleep for <i>n</i> seconds.
    *
    * @param n Number of seconds to sleep.
    */
  def sleep(n: Double): Unit = js.native
  
  /**
    * Sleep for n microseconds.
    *
    * @param n Number of microseconds to sleep; 1 second is 1,000,000 microseconds.
    */
  def usleep(n: Double): Unit = js.native
}
