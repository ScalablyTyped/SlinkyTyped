package typingsSlinky.vscode.anon

import typingsSlinky.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var uri: Uri = js.native
}
object Name {
  
  @scala.inline
  def apply(uri: Uri): Name = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
