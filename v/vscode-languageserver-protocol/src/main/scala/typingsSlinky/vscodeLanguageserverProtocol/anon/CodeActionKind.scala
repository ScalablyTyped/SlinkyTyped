package typingsSlinky.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionKind extends StObject {
  
  /**
    * The code action kind is support with the following value
    * set.
    */
  var codeActionKind: `2` = js.native
}
object CodeActionKind {
  
  @scala.inline
  def apply(codeActionKind: `2`): CodeActionKind = {
    val __obj = js.Dynamic.literal(codeActionKind = codeActionKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionKind]
  }
  
  @scala.inline
  implicit class CodeActionKindMutableBuilder[Self <: CodeActionKind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeActionKind(value: `2`): Self = StObject.set(x, "codeActionKind", value.asInstanceOf[js.Any])
  }
}
