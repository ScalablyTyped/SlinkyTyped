package typingsSlinky.winrt.global.Windows.Data

import typingsSlinky.winrt.Windows.Data.Json.IJsonValue
import typingsSlinky.winrt.Windows.Data.Json.JsonErrorStatus
import typingsSlinky.winrt.Windows.Data.Json.JsonValueType
import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
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
    extends typingsSlinky.winrt.Windows.Data.Json.JsonArray {
    /* CompleteClass */
    override var valueType: JsonValueType = js.native
    /* CompleteClass */
    override def first(): IIterator[IJsonValue] = js.native
    /* CompleteClass */
    override def getArray(): typingsSlinky.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getArrayAt(index: Double): typingsSlinky.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getBoolean(): Boolean = js.native
    /* CompleteClass */
    override def getBooleanAt(index: Double): Boolean = js.native
    /* CompleteClass */
    override def getNumber(): Double = js.native
    /* CompleteClass */
    override def getNumberAt(index: Double): Double = js.native
    /* CompleteClass */
    override def getObject(): typingsSlinky.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getObjectAt(index: Double): typingsSlinky.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getString(): String = js.native
    /* CompleteClass */
    override def getStringAt(index: Double): String = js.native
    /* CompleteClass */
    override def stringify(): String = js.native
  }
  
  @js.native
  class JsonError ()
    extends typingsSlinky.winrt.Windows.Data.Json.JsonError
  
  @js.native
  class JsonObject ()
    extends typingsSlinky.winrt.Windows.Data.Json.JsonObject {
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override var valueType: JsonValueType = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, IJsonValue]] = js.native
    /* CompleteClass */
    override def getArray(): typingsSlinky.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getBoolean(): Boolean = js.native
    /* CompleteClass */
    override def getNamedArray(name: String): typingsSlinky.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getNamedBoolean(name: String): Boolean = js.native
    /* CompleteClass */
    override def getNamedNumber(name: String): Double = js.native
    /* CompleteClass */
    override def getNamedObject(name: String): typingsSlinky.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getNamedString(name: String): String = js.native
    /* CompleteClass */
    override def getNamedValue(name: String): typingsSlinky.winrt.Windows.Data.Json.JsonValue = js.native
    /* CompleteClass */
    override def getNumber(): Double = js.native
    /* CompleteClass */
    override def getObject(): typingsSlinky.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getString(): String = js.native
    /* CompleteClass */
    override def getView(): IMapView[String, IJsonValue] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def insert(key: String, value: IJsonValue): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): IJsonValue = js.native
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    /* CompleteClass */
    override def setNamedValue(name: String, value: IJsonValue): Unit = js.native
    /* CompleteClass */
    override def stringify(): String = js.native
  }
  
  @js.native
  class JsonValue ()
    extends typingsSlinky.winrt.Windows.Data.Json.JsonValue {
    /* CompleteClass */
    override var valueType: JsonValueType = js.native
    /* CompleteClass */
    override def getArray(): typingsSlinky.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getBoolean(): Boolean = js.native
    /* CompleteClass */
    override def getNumber(): Double = js.native
    /* CompleteClass */
    override def getObject(): typingsSlinky.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getString(): String = js.native
    /* CompleteClass */
    override def stringify(): String = js.native
  }
  
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

