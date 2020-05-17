package typingsSlinky.vue.optionsMod

import typingsSlinky.vue.anon.Instantiable
import typingsSlinky.vue.anon.InstantiableFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[T]
  - typingsSlinky.vue.anon.Instantiable[T]
  - typingsSlinky.vue.anon.InstantiableFunction
*/
trait Prop[T] extends PropType[T]

object Prop {
  @scala.inline
  implicit def apply[T](value: js.Function0[T]): Prop[T] = value.asInstanceOf[Prop[T]]
  @scala.inline
  implicit def apply[T](value: Instantiable[T]): Prop[T] = value.asInstanceOf[Prop[T]]
  @scala.inline
  implicit def apply[T](value: InstantiableFunction): Prop[T] = value.asInstanceOf[Prop[T]]
}

