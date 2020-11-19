package typingsSlinky.swaggerizeExpress.mod.Swagger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.swaggerizeExpress.mod.Swagger.ResponseObject
  - typingsSlinky.swaggerizeExpress.mod.Swagger.ReferenceObject
*/
trait Response extends js.Object
object Response {
  
  @scala.inline
  def ResponseObject(description: String): Response = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  def ReferenceObject($ref: String): Response = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}
