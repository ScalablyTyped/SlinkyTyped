package typingsSlinky.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vue.optionsMod.PropOptions[T]
  - typingsSlinky.vue.optionsMod.PropType[T]
*/
trait PropValidator[T] extends js.Object

object PropValidator {
  @scala.inline
  implicit def apply[T](value: PropOptions[T]): PropValidator[T] = value.asInstanceOf[PropValidator[T]]
  @scala.inline
  implicit def apply[T](value: PropType[T]): PropValidator[T] = value.asInstanceOf[PropValidator[T]]
}

