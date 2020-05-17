package typingsSlinky.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Data
  - js.ThisFunction0[/ * this * / Props with V, Data]
*/
trait DataDef[Data, Props, V] extends js.Object

object DataDef {
  @scala.inline
  implicit def apply[Data, Props, V](value: Data): DataDef[Data, Props, V] = value.asInstanceOf[DataDef[Data, Props, V]]
  @scala.inline
  implicit def apply[Data, Props, V](value: js.ThisFunction0[/* this */ Props with V, Data]): DataDef[Data, Props, V] = value.asInstanceOf[DataDef[Data, Props, V]]
}

