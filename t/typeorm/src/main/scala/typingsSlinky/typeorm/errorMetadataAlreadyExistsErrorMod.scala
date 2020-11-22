package typingsSlinky.typeorm

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/MetadataAlreadyExistsError", JSImport.Namespace)
@js.native
object errorMetadataAlreadyExistsErrorMod extends js.Object {
  
  @js.native
  class MetadataAlreadyExistsError protected () extends Error {
    def this(metadataType: String, constructor: js.Function) = this()
    def this(metadataType: String, constructor: js.Function, propertyName: String) = this()
  }
}
