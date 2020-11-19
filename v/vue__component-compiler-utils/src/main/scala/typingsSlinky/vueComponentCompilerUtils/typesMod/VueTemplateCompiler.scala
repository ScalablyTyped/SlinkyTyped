package typingsSlinky.vueComponentCompilerUtils.typesMod

import typingsSlinky.vueComponentCompilerUtils.parseMod.SFCDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTemplateCompiler extends js.Object {
  
  def compile(template: String, options: VueTemplateCompilerOptions): VueTemplateCompilerResults = js.native
  
  def parseComponent(source: String): SFCDescriptor = js.native
  def parseComponent(source: String, options: js.Any): SFCDescriptor = js.native
  
  def ssrCompile(template: String, options: VueTemplateCompilerOptions): VueTemplateCompilerResults = js.native
}
