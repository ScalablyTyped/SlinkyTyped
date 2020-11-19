package typingsSlinky.vueComponentCompilerUtils

import typingsSlinky.vueComponentCompilerUtils.compileStyleMod.StyleCompileOptions
import typingsSlinky.vueComponentCompilerUtils.compileStyleMod.StyleCompileResults
import typingsSlinky.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileOptions
import typingsSlinky.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileResult
import typingsSlinky.vueComponentCompilerUtils.parseMod.ParseOptions
import typingsSlinky.vueComponentCompilerUtils.parseMod.SFCDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/component-compiler-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = js.native
  
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = js.native
  
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = js.native
  
  def parse(options: ParseOptions): SFCDescriptor = js.native
}
