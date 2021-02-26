package typingsSlinky.vueTemplateCompiler.mod

import typingsSlinky.std.Record
import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerStrings.condense
import typingsSlinky.vueTemplateCompiler.vueTemplateCompilerStrings.preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Template compilation options / results
  */
@js.native
trait CompilerOptions extends StObject {
  
  var directives: js.UndefOr[Record[String, DirectiveFunction]] = js.native
  
  var modules: js.UndefOr[js.Array[ModuleOptions]] = js.native
  
  var outputSourceRange: js.UndefOr[js.Any] = js.native
  
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  
  var whitespace: js.UndefOr[preserve | condense] = js.native
}
object CompilerOptions {
  
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  @scala.inline
  implicit class CompilerOptionsMutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectives(value: Record[String, DirectiveFunction]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setModules(value: js.Array[ModuleOptions]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: ModuleOptions*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setOutputSourceRange(value: js.Any): Self = StObject.set(x, "outputSourceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSourceRangeUndefined: Self = StObject.set(x, "outputSourceRange", js.undefined)
    
    @scala.inline
    def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
    
    @scala.inline
    def setWhitespace(value: preserve | condense): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
