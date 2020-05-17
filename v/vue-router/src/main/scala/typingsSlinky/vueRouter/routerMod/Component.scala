package typingsSlinky.vueRouter.routerMod

import typingsSlinky.vue.optionsMod.AsyncComponent
import typingsSlinky.vue.optionsMod.ComponentOptions
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.PropsDefinition
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vue.optionsMod.ComponentOptions[
typingsSlinky.vue.vueMod.Vue, 
typingsSlinky.vue.optionsMod.DefaultData[typingsSlinky.vue.vueMod.Vue], 
typingsSlinky.vue.optionsMod.DefaultMethods[typingsSlinky.vue.vueMod.Vue], 
typingsSlinky.vue.optionsMod.DefaultComputed, 
typingsSlinky.vue.optionsMod.PropsDefinition[typingsSlinky.vue.optionsMod.DefaultProps], 
typingsSlinky.vue.optionsMod.DefaultProps]
  - typingsSlinky.vue.vueMod.VueConstructor[typingsSlinky.vue.vueMod.Vue]
  - typingsSlinky.vue.optionsMod.AsyncComponent[
typingsSlinky.vue.optionsMod.DefaultData[scala.Nothing], 
typingsSlinky.vue.optionsMod.DefaultMethods[scala.Nothing], 
typingsSlinky.vue.optionsMod.DefaultComputed, 
typingsSlinky.vue.optionsMod.DefaultProps]
*/
trait Component extends js.Object

object Component {
  @scala.inline
  implicit def apply(
    value: AsyncComponent[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]
  ): Component = value.asInstanceOf[Component]
  @scala.inline
  implicit def apply(
    value: ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): Component = value.asInstanceOf[Component]
  @scala.inline
  implicit def apply(value: VueConstructor[Vue]): Component = value.asInstanceOf[Component]
}

