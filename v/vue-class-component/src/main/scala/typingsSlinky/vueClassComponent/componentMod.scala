package typingsSlinky.vueClassComponent

import typingsSlinky.vue.optionsMod.ComponentOptions
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.PropsDefinition
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueClassComponent.declarationsMod.VueClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("vue-class-component/lib/component", "componentFactory")
  @js.native
  def componentFactory(Component: VueClass[Vue]): VueClass[Vue] = js.native
  @JSImport("vue-class-component/lib/component", "componentFactory")
  @js.native
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
  
  @JSImport("vue-class-component/lib/component", "$internalHooks")
  @js.native
  val internalHooks: js.Array[String] = js.native
}
