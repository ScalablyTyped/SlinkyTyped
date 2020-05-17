package typingsSlinky.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vue.optionsMod.Prop[T]
  - js.Array[typingsSlinky.vue.optionsMod.Prop[T]]
*/
trait PropType[T] extends PropValidator[T]

object PropType {
  @scala.inline
  implicit def apply[T](value: js.Array[Prop[T]]): PropType[T] = value.asInstanceOf[PropType[T]]
  @scala.inline
  implicit def apply[T](value: Prop[T]): PropType[T] = value.asInstanceOf[PropType[T]]
}

