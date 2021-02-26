package typingsSlinky.tableau.tableau

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Error Classes
@js.native
trait TableauException extends Error {
  
  var tableauSoftwareErrorCode: ErrorCode = js.native
}
object TableauException {
  
  @scala.inline
  def apply(message: String, name: String, tableauSoftwareErrorCode: ErrorCode): TableauException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tableauSoftwareErrorCode = tableauSoftwareErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableauException]
  }
  
  @scala.inline
  implicit class TableauExceptionMutableBuilder[Self <: TableauException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableauSoftwareErrorCode(value: ErrorCode): Self = StObject.set(x, "tableauSoftwareErrorCode", value.asInstanceOf[js.Any])
  }
}
