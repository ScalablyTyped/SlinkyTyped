package typingsSlinky.winrt.Windows.Data.Json

import typingsSlinky.winrt.AnonResult
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonArray")
@js.native
class JsonArray ()
  extends IJsonArray
     with IVector[IJsonValue]

/* static members */
@JSGlobal("Windows.Data.Json.JsonArray")
@js.native
object JsonArray extends js.Object {
  def parse(input: String): JsonArray = js.native
  def tryParse(input: String): AnonResult = js.native
}

