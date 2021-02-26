package typingsSlinky.tarn

import typingsSlinky.tarn.poolMod.PoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tarn", "Pool")
  @js.native
  class Pool[T] protected ()
    extends typingsSlinky.tarn.poolMod.Pool[T] {
    def this(opt: PoolOptions[T]) = this()
  }
  
  @JSImport("tarn", "TimeoutError")
  @js.native
  class TimeoutError ()
    extends typingsSlinky.tarn.timeoutErrorMod.TimeoutError
}
