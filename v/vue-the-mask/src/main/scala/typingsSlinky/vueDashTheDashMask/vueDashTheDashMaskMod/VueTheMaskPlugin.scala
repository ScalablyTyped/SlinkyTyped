package typingsSlinky.vueDashTheDashMask.vueDashTheDashMaskMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vue.typesOptionsMod.Component
import typingsSlinky.vue.typesOptionsMod.DefaultComputed
import typingsSlinky.vue.typesOptionsMod.DefaultData
import typingsSlinky.vue.typesOptionsMod.DefaultMethods
import typingsSlinky.vue.typesOptionsMod.DefaultProps
import typingsSlinky.vue.typesOptionsMod.DirectiveBinding
import typingsSlinky.vue.typesOptionsMod.DirectiveFunction
import typingsSlinky.vue.typesPluginMod.PluginObject
import typingsSlinky.vue.typesVnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTheMaskPlugin
  extends PluginObject[js.UndefOr[scala.Nothing]] {
  var TheMask: Component[
    DefaultData[scala.Nothing], 
    DefaultMethods[scala.Nothing], 
    DefaultComputed, 
    DefaultProps
  ] = js.native
  @JSName("mask")
  var mask_Original: DirectiveFunction = js.native
  def mask(el: HTMLElement, binding: DirectiveBinding, vnode: VNode, oldVnode: VNode): Unit = js.native
}

@JSImport("vue-the-mask", "VueTheMaskPlugin")
@js.native
object VueTheMaskPlugin extends js.Object {
  type VueStatic = js.Function0[Unit]
}

