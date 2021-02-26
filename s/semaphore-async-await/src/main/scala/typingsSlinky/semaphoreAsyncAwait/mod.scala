package typingsSlinky.semaphoreAsyncAwait

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semaphore-async-await", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.semaphoreAsyncAwait.semaphoreMod.default {
    /**
      * Creates a semaphore.
      * @param permits  The number of permits, i.e. things being allowed to run in parallel.
      * To create a lock that only lets one thing run at a time, set this to 1.
      * This number can also be negative.
      */
    def this(permits: Double) = this()
  }
  
  @JSImport("semaphore-async-await", "Lock")
  @js.native
  /**
    * Creates a lock.
    */
  class Lock ()
    extends typingsSlinky.semaphoreAsyncAwait.lockMod.Lock
}
