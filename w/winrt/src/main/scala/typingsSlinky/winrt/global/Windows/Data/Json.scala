package typingsSlinky.winrt.global.Windows.Data

import typingsSlinky.winrt.Windows.Data.Json.JsonErrorStatus
import typingsSlinky.winrt.anon.Result
import typingsSlinky.winrt.anon.ResultSucceeded
import typingsSlinky.winrt.anon.Succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json")
@js.native
object Json extends js.Object {
  @js.native
  class JsonArray ()
    extends typingsSlinky.winrt.Windows.Data.Json.JsonArray
  
  @js.native
  class JsonError ()
    extends typingsSlinky.winrt.Windows.Data.Json.JsonError
  
  @js.native
  class JsonObject ()
    extends typingsSlinky.winrt.Windows.Data.Json.JsonObject
  
  @js.native
  class JsonValue ()
    extends typingsSlinky.winrt.Windows.Data.Json.JsonValue
  
  /* static members */
  @js.native
  object JsonArray extends js.Object {
    def parse(input: String): typingsSlinky.winrt.Windows.Data.Json.JsonArray = js.native
    def tryParse(input: String): ResultSucceeded = js.native
  }
  
  /* static members */
  @js.native
  object JsonError extends js.Object {
    def getStatus(hresult: Double): JsonErrorStatus = js.native
  }
  
  @js.native
  object JsonErrorStatus extends js.Object {
    /* 4 */ val implementationLimit: typingsSlinky.winrt.Windows.Data.Json.JsonErrorStatus.implementationLimit with Double = js.native
    /* 2 */ val invalidJsonNumber: typingsSlinky.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonNumber with Double = js.native
    /* 1 */ val invalidJsonString: typingsSlinky.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonString with Double = js.native
    /* 3 */ val jsonValueNotFound: typingsSlinky.winrt.Windows.Data.Json.JsonErrorStatus.jsonValueNotFound with Double = js.native
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Data.Json.JsonErrorStatus.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Data.Json.JsonErrorStatus with Double] = js.native
  }
  
  /* static members */
  @js.native
  object JsonObject extends js.Object {
    def parse(input: String): typingsSlinky.winrt.Windows.Data.Json.JsonObject = js.native
    def tryParse(input: String): Succeeded = js.native
  }
  
  /* static members */
  @js.native
  object JsonValue extends js.Object {
    def createBooleanValue(input: Boolean): typingsSlinky.winrt.Windows.Data.Json.JsonValue = js.native
    def createNumberValue(input: Double): typingsSlinky.winrt.Windows.Data.Json.JsonValue = js.native
    def createStringValue(input: String): typingsSlinky.winrt.Windows.Data.Json.JsonValue = js.native
    def parse(input: String): typingsSlinky.winrt.Windows.Data.Json.JsonValue = js.native
    def tryParse(input: String): Result = js.native
  }
  
  @js.native
  object JsonValueType extends js.Object {
    /* 4 */ val array: typingsSlinky.winrt.Windows.Data.Json.JsonValueType.array with Double = js.native
    /* 1 */ val boolean: typingsSlinky.winrt.Windows.Data.Json.JsonValueType.boolean with Double = js.native
    /* 0 */ val null_ : typingsSlinky.winrt.Windows.Data.Json.JsonValueType.null_ with Double = js.native
    /* 2 */ val number: typingsSlinky.winrt.Windows.Data.Json.JsonValueType.number with Double = js.native
    /* 5 */ val `object`: typingsSlinky.winrt.Windows.Data.Json.JsonValueType.`object` with Double = js.native
    /* 3 */ val string: typingsSlinky.winrt.Windows.Data.Json.JsonValueType.string with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Data.Json.JsonValueType with Double] = js.native
  }
  
}

