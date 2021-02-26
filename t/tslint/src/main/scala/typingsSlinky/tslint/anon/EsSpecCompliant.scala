package typingsSlinky.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EsSpecCompliant extends StObject {
  
  var esSpecCompliant: Boolean = js.native
  
  var multiline: String = js.native
  
  var singleline: String = js.native
}
object EsSpecCompliant {
  
  @scala.inline
  def apply(esSpecCompliant: Boolean, multiline: String, singleline: String): EsSpecCompliant = {
    val __obj = js.Dynamic.literal(esSpecCompliant = esSpecCompliant.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsSpecCompliant]
  }
  
  @scala.inline
  implicit class EsSpecCompliantMutableBuilder[Self <: EsSpecCompliant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEsSpecCompliant(value: Boolean): Self = StObject.set(x, "esSpecCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiline(value: String): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleline(value: String): Self = StObject.set(x, "singleline", value.asInstanceOf[js.Any])
  }
}
