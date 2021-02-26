package typingsSlinky.tern.ternMod

import typingsSlinky.estree.mod.Program
import typingsSlinky.tern.inferMod.Scope
import typingsSlinky.tern.ternStrings.delete
import typingsSlinky.tern.ternStrings.full
import typingsSlinky.tern.ternStrings.part
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var asLineChar: js.UndefOr[js.Function1[/* nodePosition */ Double, Position]] = js.native
  
  var ast: Program = js.native
  
  var name: String = js.native
  
  var scope: Scope = js.native
  
  var text: String = js.native
  
  var `type`: js.UndefOr[full | part | delete] = js.native
}
object File {
  
  @scala.inline
  def apply(ast: Program, name: String, scope: Scope, text: String): File = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsLineChar(value: /* nodePosition */ Double => Position): Self = StObject.set(x, "asLineChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsLineCharUndefined: Self = StObject.set(x, "asLineChar", js.undefined)
    
    @scala.inline
    def setAst(value: Program): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: full | part | delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
