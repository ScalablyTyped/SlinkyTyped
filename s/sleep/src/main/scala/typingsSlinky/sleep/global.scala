package typingsSlinky.sleep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object nodeSleep {
    
    /**
      * Sleep for n milliseconds.
      *
      * @param n Number of milliseconds to sleep.
      */
    @JSGlobal("__node_sleep.msleep")
    @js.native
    def msleep(n: Double): Unit = js.native
    
    /**
      * Sleep for <i>n</i> seconds.
      *
      * @param n Number of seconds to sleep.
      */
    @JSGlobal("__node_sleep.sleep")
    @js.native
    def sleep(n: Double): Unit = js.native
    
    /**
      * Sleep for n microseconds.
      *
      * @param n Number of microseconds to sleep; 1 second is 1,000,000 microseconds.
      */
    @JSGlobal("__node_sleep.usleep")
    @js.native
    def usleep(n: Double): Unit = js.native
  }
}
