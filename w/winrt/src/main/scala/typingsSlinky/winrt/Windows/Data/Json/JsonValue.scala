package typingsSlinky.winrt.Windows.Data.Json

import typingsSlinky.winrt.AnonResultSucceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonValue")
@js.native
class JsonValue () extends IJsonValue

/* static members */
@JSGlobal("Windows.Data.Json.JsonValue")
@js.native
object JsonValue extends js.Object {
  def createBooleanValue(input: Boolean): JsonValue = js.native
  def createNumberValue(input: Double): JsonValue = js.native
  def createStringValue(input: String): JsonValue = js.native
  def parse(input: String): JsonValue = js.native
  def tryParse(input: String): AnonResultSucceeded = js.native
}

