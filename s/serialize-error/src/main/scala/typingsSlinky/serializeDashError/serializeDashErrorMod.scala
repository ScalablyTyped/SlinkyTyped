package typingsSlinky.serializeDashError

import typingsSlinky.typeDashFest.typeDashFestMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialize-error", JSImport.Namespace)
@js.native
object serializeDashErrorMod extends js.Object {
  def deserializeError(errorObject: js.Any): js.Error = js.native
  def deserializeError(errorObject: ErrorObject): js.Error = js.native
  def serializeError[ErrorType](error: ErrorType): ErrorObject | ErrorType = js.native
  type ErrorObject = Anon_Code with JsonObject
}

