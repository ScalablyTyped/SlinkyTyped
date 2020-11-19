package typingsSlinky.swig

import typingsSlinky.swig.mod.TemplateLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Typeofloaders extends js.Object {
    
    def fs(): TemplateLoader = js.native
    def fs(basepath: js.UndefOr[scala.Nothing], encoding: String): TemplateLoader = js.native
    def fs(basepath: String): TemplateLoader = js.native
    def fs(basepath: String, encoding: String): TemplateLoader = js.native
    
    def memory(mapping: js.Any): TemplateLoader = js.native
    def memory(mapping: js.Any, basepath: String): TemplateLoader = js.native
  }
}
