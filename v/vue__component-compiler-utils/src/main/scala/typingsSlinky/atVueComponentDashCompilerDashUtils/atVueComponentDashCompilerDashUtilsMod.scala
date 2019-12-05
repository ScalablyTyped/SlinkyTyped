package typingsSlinky.atVueComponentDashCompilerDashUtils

import typingsSlinky.atVueComponentDashCompilerDashUtils.distCompileStyleMod.StyleCompileOptions
import typingsSlinky.atVueComponentDashCompilerDashUtils.distCompileStyleMod.StyleCompileResults
import typingsSlinky.atVueComponentDashCompilerDashUtils.distCompileTemplateMod.TemplateCompileOptions
import typingsSlinky.atVueComponentDashCompilerDashUtils.distCompileTemplateMod.TemplateCompileResult
import typingsSlinky.atVueComponentDashCompilerDashUtils.distParseMod.ParseOptions
import typingsSlinky.atVueComponentDashCompilerDashUtils.distParseMod.SFCDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@vue/component-compiler-utils", JSImport.Namespace)
@js.native
object atVueComponentDashCompilerDashUtilsMod extends js.Object {
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = js.native
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = js.native
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = js.native
  def parse(options: ParseOptions): SFCDescriptor = js.native
}

