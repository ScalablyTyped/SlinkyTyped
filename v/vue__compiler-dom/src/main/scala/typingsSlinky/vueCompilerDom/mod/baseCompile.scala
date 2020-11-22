package typingsSlinky.vueCompilerDom.mod

import typingsSlinky.vueCompilerCore.mod.CodegenResult
import typingsSlinky.vueCompilerCore.mod.CompilerOptions
import typingsSlinky.vueCompilerCore.mod.RootNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "baseCompile")
@js.native
object baseCompile extends js.Object {
  
  def apply(template: String): CodegenResult = js.native
  def apply(template: String, options: CompilerOptions): CodegenResult = js.native
  def apply(template: RootNode): CodegenResult = js.native
  def apply(template: RootNode, options: CompilerOptions): CodegenResult = js.native
}
