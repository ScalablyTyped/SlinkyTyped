package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a single performance metric that is part of the performance timeline. A performance entry can be directly created by making a performance mark or measure (for example by calling the mark() method) at an explicit point in an application. Performance entries are also created in indirect ways such as loading a resource (such as an image). */
@js.native
trait PerformanceEntry extends js.Object {
  val duration: Double = js.native
  val entryType: java.lang.String = js.native
  val name: java.lang.String = js.native
  val startTime: Double = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceEntry")
@js.native
object PerformanceEntry
  extends Instantiable0[org.scalajs.dom.raw.PerformanceEntry]

