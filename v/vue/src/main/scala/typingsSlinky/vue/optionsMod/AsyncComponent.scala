package typingsSlinky.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vue.optionsMod.AsyncComponentPromise[Data, Methods, Computed, Props]
  - typingsSlinky.vue.optionsMod.AsyncComponentFactory[Data, Methods, Computed, Props]
*/
trait AsyncComponent[Data, Methods, Computed, Props] extends js.Object

object AsyncComponent {
  @scala.inline
  implicit def apply[Data, Methods, Computed, Props](value: AsyncComponentFactory[Data, Methods, Computed, Props]): AsyncComponent[Data, Methods, Computed, Props] = value.asInstanceOf[AsyncComponent[Data, Methods, Computed, Props]]
  @scala.inline
  implicit def apply[Data, Methods, Computed, Props](value: AsyncComponentPromise[Data, Methods, Computed, Props]): AsyncComponent[Data, Methods, Computed, Props] = value.asInstanceOf[AsyncComponent[Data, Methods, Computed, Props]]
}

