package typingsSlinky.yogLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.yogLog.yogLogBooleans.`false`
*/
trait LogReturn extends js.Object

object LogReturn {
  @scala.inline
  def `false`: typingsSlinky.yogLog.yogLogBooleans.`false` = false.asInstanceOf[typingsSlinky.yogLog.yogLogBooleans.`false`]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => LogReturn): LogReturn = value.asInstanceOf[LogReturn]
}

