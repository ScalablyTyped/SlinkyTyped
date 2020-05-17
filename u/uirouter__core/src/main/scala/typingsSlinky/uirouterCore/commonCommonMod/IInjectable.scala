package typingsSlinky.uirouterCore.commonCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function
  - js.Array[js.Any]
*/
trait IInjectable extends js.Object

object IInjectable {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): IInjectable = value.asInstanceOf[IInjectable]
  @scala.inline
  implicit def apply(value: js.Function): IInjectable = value.asInstanceOf[IInjectable]
}

