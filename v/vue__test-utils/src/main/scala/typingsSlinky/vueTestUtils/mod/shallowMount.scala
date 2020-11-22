package typingsSlinky.vueTestUtils.mod

import typingsSlinky.vue.optionsMod.ComponentOptions
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.FunctionalComponentOptions
import typingsSlinky.vue.optionsMod.PropsDefinition
import typingsSlinky.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/test-utils", "shallowMount")
@js.native
object shallowMount extends js.Object {
  
  def apply[V /* <: Vue */](
    component: ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): Wrapper[V] = js.native
  def apply[V /* <: Vue */](
    component: ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ],
    options: ThisTypedShallowMountOptions[V]
  ): Wrapper[V] = js.native
  def apply[V /* <: Vue */](component: VueClass[V]): Wrapper[V] = js.native
  def apply[V /* <: Vue */](component: VueClass[V], options: ThisTypedShallowMountOptions[V]): Wrapper[V] = js.native
  def apply[Props, PropDefs](component: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = js.native
  def apply[Props, PropDefs](component: FunctionalComponentOptions[Props, PropDefs], options: ShallowMountOptions[Vue]): Wrapper[Vue] = js.native
}
