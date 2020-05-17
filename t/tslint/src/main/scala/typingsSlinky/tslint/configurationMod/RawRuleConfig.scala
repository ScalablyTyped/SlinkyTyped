package typingsSlinky.tslint.configurationMod

import typingsSlinky.tslint.anon.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - scala.Boolean
  - js.Array[js.Any]
  - typingsSlinky.tslint.anon.Severity
*/
trait RawRuleConfig extends js.Object

object RawRuleConfig {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): RawRuleConfig = value.asInstanceOf[RawRuleConfig]
  @scala.inline
  implicit def apply(value: Boolean): RawRuleConfig = value.asInstanceOf[RawRuleConfig]
  @scala.inline
  implicit def apply(value: Null): RawRuleConfig = value.asInstanceOf[RawRuleConfig]
  @scala.inline
  implicit def apply(value: Severity): RawRuleConfig = value.asInstanceOf[RawRuleConfig]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => RawRuleConfig): RawRuleConfig = value.asInstanceOf[RawRuleConfig]
}

