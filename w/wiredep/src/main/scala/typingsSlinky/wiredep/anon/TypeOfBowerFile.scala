package typingsSlinky.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOfBowerFile extends StObject {
  
  /**
    * match the way this type of file is included
    */
  var typeOfBowerFile: js.RegExp = js.native
}
object TypeOfBowerFile {
  
  @scala.inline
  def apply(typeOfBowerFile: js.RegExp): TypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOfBowerFile]
  }
  
  @scala.inline
  implicit class TypeOfBowerFileMutableBuilder[Self <: TypeOfBowerFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeOfBowerFile(value: js.RegExp): Self = StObject.set(x, "typeOfBowerFile", value.asInstanceOf[js.Any])
  }
}
