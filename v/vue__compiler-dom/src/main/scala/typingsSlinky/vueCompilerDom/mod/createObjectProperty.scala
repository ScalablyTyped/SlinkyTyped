package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.ExpressionNode
import typingsSlinky.vueCompilerCore.mod.JSChildNode
import typingsSlinky.vueCompilerCore.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createObjectProperty")
@js.native
object createObjectProperty extends js.Object {
  
  def apply(key: String, value: JSChildNode): Property = js.native
  def apply(key: ExpressionNode, value: JSChildNode): Property = js.native
}
