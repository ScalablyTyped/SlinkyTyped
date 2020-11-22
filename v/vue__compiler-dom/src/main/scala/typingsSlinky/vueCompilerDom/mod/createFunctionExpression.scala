package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.ExpressionNode
import typingsSlinky.vueCompilerCore.mod.FunctionExpression
import typingsSlinky.vueCompilerCore.mod.JSChildNode
import typingsSlinky.vueCompilerCore.mod.SourceLocation
import typingsSlinky.vueCompilerCore.mod.TemplateChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createFunctionExpression")
@js.native
object createFunctionExpression extends js.Object {
  
  def apply(
    params: js.UndefOr[ExpressionNode | String | (js.Array[ExpressionNode | String])],
    returns: js.UndefOr[TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode],
    newline: js.UndefOr[Boolean],
    isSlot: js.UndefOr[Boolean],
    loc: js.UndefOr[SourceLocation]
  ): FunctionExpression = js.native
}
