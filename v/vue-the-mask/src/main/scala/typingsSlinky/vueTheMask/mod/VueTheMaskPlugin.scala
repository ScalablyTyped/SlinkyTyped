package typingsSlinky.vueTheMask.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vue.optionsMod.Component
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.DirectiveBinding
import typingsSlinky.vue.optionsMod.DirectiveFunction
import typingsSlinky.vue.pluginMod.PluginObject
import typingsSlinky.vue.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTheMaskPlugin
  extends PluginObject[js.UndefOr[scala.Nothing]] {
  
  var TheMask: Component[
    DefaultData[scala.Nothing], 
    DefaultMethods[scala.Nothing], 
    DefaultComputed, 
    DefaultProps
  ] = js.native
  
  def mask(el: HTMLElement, binding: DirectiveBinding, vnode: VNode, oldVnode: VNode): Unit = js.native
  @JSName("mask")
  var mask_Original: DirectiveFunction = js.native
}
@JSImport("vue-the-mask", "VueTheMaskPlugin")
@js.native
object VueTheMaskPlugin extends js.Object {
  
  type VueStatic = js.Function0[Unit]
}
