package typingsSlinky.vuePropertyDecorator.mod

import typingsSlinky.std.ThisType
import typingsSlinky.vue.optionsMod.ComponentOptions
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.PropsDefinition
import typingsSlinky.vueClassComponent.declarationsMod.VueClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-property-decorator", "Component")
@js.native
object Component extends js.Object {
  
  def apply[V /* <: typingsSlinky.vue.vueMod.Vue */](
    options: (ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]) with ThisType[V]
  ): js.Function1[/* target */ VueClass[V], VueClass[V]] = js.native
  def apply[VC /* <: VueClass[typingsSlinky.vue.vueMod.Vue] */](target: VC): VC = js.native
  
  var registerHooks: js.Function1[/* keys */ js.Array[String], Unit] = js.native
}
