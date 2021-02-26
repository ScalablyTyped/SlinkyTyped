package typingsSlinky.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Semantic extends StObject {
  
  var semantic: String = js.native
  
  var token: String = js.native
}
object Semantic {
  
  @scala.inline
  def apply(semantic: String, token: String): Semantic = {
    val __obj = js.Dynamic.literal(semantic = semantic.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Semantic]
  }
  
  @scala.inline
  implicit class SemanticMutableBuilder[Self <: Semantic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSemantic(value: String): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
