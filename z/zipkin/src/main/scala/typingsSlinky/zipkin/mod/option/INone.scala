package typingsSlinky.zipkin.mod.option

import typingsSlinky.zipkin.zipkinBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INone[T]
  extends Option[T]
     with IOption[T] {
  val present: `false` = js.native
  val `type`: typingsSlinky.zipkin.zipkinStrings.None = js.native
}

