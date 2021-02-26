package typingsSlinky.vueComponentCompilerUtils

import typingsSlinky.vueComponentCompilerUtils.compileStyleMod.StyleCompileOptions
import typingsSlinky.vueComponentCompilerUtils.compileStyleMod.StyleCompileResults
import typingsSlinky.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileOptions
import typingsSlinky.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileResult
import typingsSlinky.vueComponentCompilerUtils.parseMod.ParseOptions
import typingsSlinky.vueComponentCompilerUtils.parseMod.SFCDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/component-compiler-utils", "compileStyle")
  @js.native
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = js.native
  
  @JSImport("@vue/component-compiler-utils", "compileStyleAsync")
  @js.native
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = js.native
  
  @JSImport("@vue/component-compiler-utils", "compileTemplate")
  @js.native
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = js.native
  
  @JSImport("@vue/component-compiler-utils", "parse")
  @js.native
  def parse(options: ParseOptions): SFCDescriptor = js.native
}
