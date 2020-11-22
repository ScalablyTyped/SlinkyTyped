package typingsSlinky.vueCompilerSsr

import typingsSlinky.vueCompilerCore.mod.CodegenResult
import typingsSlinky.vueCompilerCore.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-ssr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compile(template: String): CodegenResult = js.native
  def compile(template: String, options: CompilerOptions): CodegenResult = js.native
}
