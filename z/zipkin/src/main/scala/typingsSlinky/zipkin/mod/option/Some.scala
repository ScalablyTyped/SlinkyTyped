package typingsSlinky.zipkin.mod.option

import typingsSlinky.zipkin.zipkinBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "option.Some")
@js.native
class Some[T] protected ()
  extends Option[T]
     with IOption[T] {
  def this(value: T) = this()
  val present: `true` = js.native
  val `type`: typingsSlinky.zipkin.zipkinStrings.Some = js.native
}

