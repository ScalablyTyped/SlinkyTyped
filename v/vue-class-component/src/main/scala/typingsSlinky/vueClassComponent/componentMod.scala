package typingsSlinky.vueClassComponent

import typingsSlinky.vue.optionsMod.ComponentOptions
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.PropsDefinition
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueClassComponent.declarationsMod.VueClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @JSName("$internalHooks")
  val internalHooks: js.Array[String] = js.native
  def componentFactory(Component: VueClass[Vue]): VueClass[Vue] = js.native
  def componentFactory(
    Component: VueClass[Vue],
    options: ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): VueClass[Vue] = js.native
}

