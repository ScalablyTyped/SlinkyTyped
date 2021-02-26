package typingsSlinky.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonArray extends IJsonValue {
  
  def getArrayAt(index: Double): JsonArray = js.native
  
  def getBooleanAt(index: Double): Boolean = js.native
  
  def getNumberAt(index: Double): Double = js.native
  
  def getObjectAt(index: Double): JsonObject = js.native
  
  def getStringAt(index: Double): String = js.native
}
object IJsonArray {
  
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getArrayAt: Double => JsonArray,
    getBoolean: () => Boolean,
    getBooleanAt: Double => Boolean,
    getNumber: () => Double,
    getNumberAt: Double => Double,
    getObject: () => JsonObject,
    getObjectAt: Double => JsonObject,
    getString: () => String,
    getStringAt: Double => String,
    stringify: () => String,
    valueType: JsonValueType
  ): IJsonArray = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getArrayAt = js.Any.fromFunction1(getArrayAt), getBoolean = js.Any.fromFunction0(getBoolean), getBooleanAt = js.Any.fromFunction1(getBooleanAt), getNumber = js.Any.fromFunction0(getNumber), getNumberAt = js.Any.fromFunction1(getNumberAt), getObject = js.Any.fromFunction0(getObject), getObjectAt = js.Any.fromFunction1(getObjectAt), getString = js.Any.fromFunction0(getString), getStringAt = js.Any.fromFunction1(getStringAt), stringify = js.Any.fromFunction0(stringify), valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonArray]
  }
  
  @scala.inline
  implicit class IJsonArrayMutableBuilder[Self <: IJsonArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetArrayAt(value: Double => JsonArray): Self = StObject.set(x, "getArrayAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBooleanAt(value: Double => Boolean): Self = StObject.set(x, "getBooleanAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumberAt(value: Double => Double): Self = StObject.set(x, "getNumberAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetObjectAt(value: Double => JsonObject): Self = StObject.set(x, "getObjectAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStringAt(value: Double => String): Self = StObject.set(x, "getStringAt", js.Any.fromFunction1(value))
  }
}
