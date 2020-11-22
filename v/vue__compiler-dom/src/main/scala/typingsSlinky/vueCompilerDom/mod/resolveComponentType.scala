package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.CallExpression
import typingsSlinky.vueCompilerCore.mod.ComponentNode
import typingsSlinky.vueCompilerCore.mod.TransformContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "resolveComponentType")
@js.native
object resolveComponentType extends js.Object {
  
  def apply(node: ComponentNode, context: TransformContext): String | js.Symbol | CallExpression = js.native
  def apply(node: ComponentNode, context: TransformContext, ssr: Boolean): String | js.Symbol | CallExpression = js.native
}
