package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[java.lang.String, js.Any]
  - js.UndefOr[scala.Nothing]
*/
trait DefaultContext extends js.Object

object DefaultContext {
  @scala.inline
  implicit def apply(value: Record[String, js.Any]): DefaultContext = value.asInstanceOf[DefaultContext]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => DefaultContext): DefaultContext = value.asInstanceOf[DefaultContext]
}

