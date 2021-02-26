package typingsSlinky.vueTheMask

import org.scalablytyped.runtime.Shortcut
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-the-mask", JSImport.Namespace)
  @js.native
  val ^ : VueTheMaskPlugin = js.native
  
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
  object VueTheMaskPlugin {
    
    type VueStatic = js.Function0[Unit]
  }
  
  type _To = VueTheMaskPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VueTheMaskPlugin = ^
}
