package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.CallExpression
import typingsSlinky.vueCompilerCore.mod.DirectiveArguments
import typingsSlinky.vueCompilerCore.mod.ForRenderListExpression
import typingsSlinky.vueCompilerCore.mod.PropsExpression
import typingsSlinky.vueCompilerCore.mod.SlotsExpression
import typingsSlinky.vueCompilerCore.mod.SourceLocation
import typingsSlinky.vueCompilerCore.mod.TemplateChildNode
import typingsSlinky.vueCompilerCore.mod.TemplateTextChildNode
import typingsSlinky.vueCompilerCore.mod.TransformContext
import typingsSlinky.vueCompilerCore.mod.VNodeCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createVNodeCall")
@js.native
object createVNodeCall extends js.Object {
  
  def apply(
    context: TransformContext | Null,
    tag: String | js.Symbol | CallExpression,
    props: js.UndefOr[PropsExpression],
    children: js.UndefOr[
      js.Array[TemplateChildNode] | TemplateTextChildNode | SlotsExpression | ForRenderListExpression
    ],
    patchFlag: js.UndefOr[String],
    dynamicProps: js.UndefOr[String],
    directives: js.UndefOr[DirectiveArguments],
    isBlock: js.UndefOr[Boolean],
    disableTracking: js.UndefOr[Boolean],
    loc: js.UndefOr[SourceLocation]
  ): VNodeCall = js.native
}
