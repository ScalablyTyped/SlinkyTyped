package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.DirectiveNode
import typingsSlinky.vueCompilerCore.mod.ElementNode
import typingsSlinky.vueCompilerCore.mod.ForNode
import typingsSlinky.vueCompilerCore.mod.TransformContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "processFor")
@js.native
object processFor extends js.Object {
  
  def apply(node: ElementNode, dir: DirectiveNode, context: TransformContext): js.UndefOr[js.Function0[Unit]] = js.native
  def apply(
    node: ElementNode,
    dir: DirectiveNode,
    context: TransformContext,
    processCodegen: js.Function1[/* forNode */ ForNode, js.UndefOr[js.Function0[Unit]]]
  ): js.UndefOr[js.Function0[Unit]] = js.native
}
