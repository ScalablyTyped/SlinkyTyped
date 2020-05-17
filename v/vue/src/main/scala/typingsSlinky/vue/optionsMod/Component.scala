package typingsSlinky.vue.optionsMod

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vue.vueMod.VueConstructor[typingsSlinky.vue.vueMod.Vue]
  - typingsSlinky.vue.optionsMod.FunctionalComponentOptions[Props, typingsSlinky.vue.optionsMod.PropsDefinition[Props]]
  - typingsSlinky.vue.optionsMod.ComponentOptions[scala.Nothing, Data, Methods, Computed, Props, typingsSlinky.vue.optionsMod.DefaultProps]
*/
trait Component[Data, Methods, Computed, Props] extends js.Object

object Component {
  @scala.inline
  implicit def apply[Data, Methods, Computed, Props](value: ComponentOptions[scala.Nothing, Data, Methods, Computed, Props, DefaultProps]): Component[Data, Methods, Computed, Props] = value.asInstanceOf[Component[Data, Methods, Computed, Props]]
  @scala.inline
  implicit def apply[Data, Methods, Computed, Props](value: FunctionalComponentOptions[Props, PropsDefinition[Props]]): Component[Data, Methods, Computed, Props] = value.asInstanceOf[Component[Data, Methods, Computed, Props]]
  @scala.inline
  implicit def apply[Data, Methods, Computed, Props](value: VueConstructor[Vue]): Component[Data, Methods, Computed, Props] = value.asInstanceOf[Component[Data, Methods, Computed, Props]]
}

