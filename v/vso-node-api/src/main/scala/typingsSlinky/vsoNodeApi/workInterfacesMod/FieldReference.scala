package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldReference extends StObject {
  
  /**
    * fieldRefName for the field
    */
  var referenceName: String = js.native
  
  /**
    * Full http link to more information about the field
    */
  var url: String = js.native
}
object FieldReference {
  
  @scala.inline
  def apply(referenceName: String, url: String): FieldReference = {
    val __obj = js.Dynamic.literal(referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldReference]
  }
  
  @scala.inline
  implicit class FieldReferenceMutableBuilder[Self <: FieldReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
