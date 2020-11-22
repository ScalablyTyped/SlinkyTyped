package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.BlockStatement
import typingsSlinky.vueCompilerCore.mod.ExpressionNode
import typingsSlinky.vueCompilerCore.mod.IfStatement
import typingsSlinky.vueCompilerCore.mod.ReturnStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createIfStatement")
@js.native
object createIfStatement extends js.Object {
  
  def apply(test: ExpressionNode, consequent: BlockStatement): IfStatement = js.native
  def apply(test: ExpressionNode, consequent: BlockStatement, alternate: BlockStatement): IfStatement = js.native
  def apply(test: ExpressionNode, consequent: BlockStatement, alternate: IfStatement): IfStatement = js.native
  def apply(test: ExpressionNode, consequent: BlockStatement, alternate: ReturnStatement): IfStatement = js.native
}
