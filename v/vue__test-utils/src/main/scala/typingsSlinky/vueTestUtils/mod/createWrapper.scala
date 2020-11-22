package typingsSlinky.vueTestUtils.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/test-utils", "createWrapper")
@js.native
object createWrapper extends js.Object {
  
  def apply(node: HTMLElement): Wrapper[Null] = js.native
  def apply(node: HTMLElement, options: WrapperOptions): Wrapper[Null] = js.native
  def apply(node: Vue): Wrapper[Vue] = js.native
  def apply(node: Vue, options: WrapperOptions): Wrapper[Vue] = js.native
}
