package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.stdNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait CountQueuingStrategy
  extends QueuingStrategy[js.Any] {
  @JSName("highWaterMark")
  var highWaterMark_CountQueuingStrategy: Double = js.native
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): `1` = js.native
}

@JSGlobal("CountQueuingStrategy")
@js.native
object CountQueuingStrategy extends Instantiable1[/* options */ AnonHighWaterMark, CountQueuingStrategy]

