package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.AggregateErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AggregateError")
@js.native
class AggregateError protected ()
  extends typingsSlinky.std.AggregateError {
  def this(errors: js.Iterable[_]) = this()
  def this(errors: js.Iterable[_], message: java.lang.String) = this()
  /* CompleteClass */
  override var errors: js.Array[_] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

@JSGlobal("AggregateError")
@js.native
object AggregateError extends TopLevel[AggregateErrorConstructor]

