package typingsSlinky.tarn

import typingsSlinky.std.Error
import typingsSlinky.tarn.poolMod.PoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Pool[T] protected ()
    extends typingsSlinky.tarn.poolMod.Pool[T] {
    def this(opt: PoolOptions[T]) = this()
  }
  
  @js.native
  class TimeoutError () extends Error
  
}

