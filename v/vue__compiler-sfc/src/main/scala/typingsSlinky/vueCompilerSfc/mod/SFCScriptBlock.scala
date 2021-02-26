package typingsSlinky.vueCompilerSfc.mod

import typingsSlinky.babelTypes.mod.Statement
import typingsSlinky.std.Record
import typingsSlinky.vueCompilerCore.mod.BindingMetadata
import typingsSlinky.vueCompilerCore.mod.SourceLocation
import typingsSlinky.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typingsSlinky.vueCompilerSfc.vueCompilerSfcStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCScriptBlock extends SFCBlock {
  
  var bindings: js.UndefOr[BindingMetadata] = js.native
  
  var scriptAst: js.UndefOr[js.Array[Statement]] = js.native
  
  var scriptSetupAst: js.UndefOr[js.Array[Statement]] = js.native
  
  var setup: js.UndefOr[String | Boolean] = js.native
  
  @JSName("type")
  var type_SFCScriptBlock: script = js.native
}
object SFCScriptBlock {
  
  @scala.inline
  def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: script): SFCScriptBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCScriptBlock]
  }
  
  @scala.inline
  implicit class SFCScriptBlockMutableBuilder[Self <: SFCScriptBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: BindingMetadata): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setScriptAst(value: js.Array[Statement]): Self = StObject.set(x, "scriptAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptAstUndefined: Self = StObject.set(x, "scriptAst", js.undefined)
    
    @scala.inline
    def setScriptAstVarargs(value: Statement*): Self = StObject.set(x, "scriptAst", js.Array(value :_*))
    
    @scala.inline
    def setScriptSetupAst(value: js.Array[Statement]): Self = StObject.set(x, "scriptSetupAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptSetupAstUndefined: Self = StObject.set(x, "scriptSetupAst", js.undefined)
    
    @scala.inline
    def setScriptSetupAstVarargs(value: Statement*): Self = StObject.set(x, "scriptSetupAst", js.Array(value :_*))
    
    @scala.inline
    def setSetup(value: String | Boolean): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    @scala.inline
    def setType(value: script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
