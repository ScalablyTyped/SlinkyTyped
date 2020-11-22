package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode
import typingsSlinky.vueCompilerCore.mod.InterpolationNode
import typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode
import typingsSlinky.vueCompilerCore.mod.SourceLocation
import typingsSlinky.vueCompilerCore.mod.TextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createCompoundExpression")
@js.native
object createCompoundExpression extends js.Object {
  
  def apply(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ]
  ): CompoundExpressionNode = js.native
  def apply(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation
  ): CompoundExpressionNode = js.native
}
