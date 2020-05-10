package typingsSlinky.winrt.Windows.Data.Json

import typingsSlinky.winrt.AnonSucceeded
import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonObject")
@js.native
class JsonObject ()
  extends IJsonObject
     with IMap[String, IJsonValue]

/* static members */
@JSGlobal("Windows.Data.Json.JsonObject")
@js.native
object JsonObject extends js.Object {
  def parse(input: String): JsonObject = js.native
  def tryParse(input: String): AnonSucceeded = js.native
}

