package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.anon.HighWaterMark
import typingsSlinky.std.stdNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CountQueuingStrategy")
@js.native
class CountQueuingStrategy protected ()
  extends typingsSlinky.std.CountQueuingStrategy {
  def this(options: HighWaterMark) = this()
  /* CompleteClass */
  @JSName("highWaterMark")
  override var highWaterMark_CountQueuingStrategy: Double = js.native
  /* CompleteClass */
  @JSName("size")
  override def size_MCountQueuingStrategy(chunk: js.Any): `1` = js.native
}

@JSGlobal("CountQueuingStrategy")
@js.native
object CountQueuingStrategy
  extends Instantiable1[/* options */ HighWaterMark, typingsSlinky.std.CountQueuingStrategy]

