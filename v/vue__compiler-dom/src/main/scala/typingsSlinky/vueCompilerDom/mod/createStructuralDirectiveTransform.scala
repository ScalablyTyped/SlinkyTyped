package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.NodeTransform
import typingsSlinky.vueCompilerCore.mod.StructuralDirectiveTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createStructuralDirectiveTransform")
@js.native
object createStructuralDirectiveTransform extends js.Object {
  
  def apply(name: String, fn: StructuralDirectiveTransform): NodeTransform = js.native
  def apply(name: js.RegExp, fn: StructuralDirectiveTransform): NodeTransform = js.native
}
