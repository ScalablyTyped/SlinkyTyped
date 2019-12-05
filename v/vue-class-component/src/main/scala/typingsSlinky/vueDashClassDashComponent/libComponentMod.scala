package typingsSlinky.vueDashClassDashComponent

import typingsSlinky.vue.typesOptionsMod.ComponentOptions
import typingsSlinky.vue.typesOptionsMod.DefaultComputed
import typingsSlinky.vue.typesOptionsMod.DefaultData
import typingsSlinky.vue.typesOptionsMod.DefaultMethods
import typingsSlinky.vue.typesOptionsMod.DefaultProps
import typingsSlinky.vue.typesOptionsMod.PropsDefinition
import typingsSlinky.vue.typesVueMod.Vue
import typingsSlinky.vueDashClassDashComponent.libDeclarationsMod.VueClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/component", JSImport.Namespace)
@js.native
object libComponentMod extends js.Object {
  @JSName("$internalHooks")
  val $internalHooks: js.Array[String] = js.native
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

