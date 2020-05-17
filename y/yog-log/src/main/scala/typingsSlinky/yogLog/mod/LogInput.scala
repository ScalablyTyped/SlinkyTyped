package typingsSlinky.yogLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.yogLog.mod.LogInfo
  - typingsSlinky.std.Error
*/
trait LogInput extends js.Object

object LogInput {
  @scala.inline
  implicit def apply(value: js.Error): LogInput = value.asInstanceOf[LogInput]
  @scala.inline
  implicit def apply(value: LogInfo): LogInput = value.asInstanceOf[LogInput]
  @scala.inline
  implicit def apply(value: String): LogInput = value.asInstanceOf[LogInput]
}

