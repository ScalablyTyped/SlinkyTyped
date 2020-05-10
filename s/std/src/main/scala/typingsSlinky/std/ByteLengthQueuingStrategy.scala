package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait ByteLengthQueuingStrategy
  extends QueuingStrategy[js.typedarray.ArrayBufferView] {
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
}

@JSGlobal("ByteLengthQueuingStrategy")
@js.native
object ByteLengthQueuingStrategy extends Instantiable1[/* options */ AnonHighWaterMark, ByteLengthQueuingStrategy]

