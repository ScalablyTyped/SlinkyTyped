package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType
import typingsSlinky.vueCompilerCore.mod.JSChildNode
import typingsSlinky.vueCompilerCore.mod.SSRCodegenNode
import typingsSlinky.vueCompilerCore.mod.SourceLocation
import typingsSlinky.vueCompilerCore.mod.TemplateChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createCallExpression")
@js.native
object createCallExpression extends js.Object {
  
  def apply(callee: String): InferCodegenNodeType[String] = js.native
  def apply(callee: String, args: js.UndefOr[scala.Nothing], loc: SourceLocation): InferCodegenNodeType[String] = js.native
  def apply(
    callee: String,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ]
  ): InferCodegenNodeType[String] = js.native
  def apply(
    callee: String,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    loc: SourceLocation
  ): InferCodegenNodeType[String] = js.native
  def apply(callee: js.Symbol): InferCodegenNodeType[js.Symbol] = js.native
  def apply(callee: js.Symbol, args: js.UndefOr[scala.Nothing], loc: SourceLocation): InferCodegenNodeType[js.Symbol] = js.native
  def apply(
    callee: js.Symbol,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ]
  ): InferCodegenNodeType[js.Symbol] = js.native
  def apply(
    callee: js.Symbol,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    loc: SourceLocation
  ): InferCodegenNodeType[js.Symbol] = js.native
}
