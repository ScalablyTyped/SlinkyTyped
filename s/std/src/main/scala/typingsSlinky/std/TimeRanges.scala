package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to represent a set of time ranges, primarily for the purpose of tracking which portions of media have been buffered when loading it for use by the <audio> and <video> elements. */
@js.native
trait TimeRanges extends js.Object {
  val length: Double = js.native
  def end(index: Double): Double = js.native
  def start(index: Double): Double = js.native
}

@JSGlobal("TimeRanges")
@js.native
object TimeRanges
  extends Instantiable0[org.scalajs.dom.raw.TimeRanges]

