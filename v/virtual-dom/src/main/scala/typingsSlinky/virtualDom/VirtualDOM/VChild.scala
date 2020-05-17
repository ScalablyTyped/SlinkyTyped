package typingsSlinky.virtualDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[java.lang.String | typingsSlinky.virtualDom.VirtualDOM.VTree]
  - typingsSlinky.virtualDom.VirtualDOM.VTree
  - java.lang.String
*/
trait VChild extends js.Object

object VChild {
  @scala.inline
  implicit def apply(value: js.Array[String | VTree]): VChild = value.asInstanceOf[VChild]
  @scala.inline
  implicit def apply(value: String): VChild = value.asInstanceOf[VChild]
  @scala.inline
  implicit def apply(value: VTree): VChild = value.asInstanceOf[VChild]
}

