package typingsSlinky.winrt.Windows.Data.Json

import typingsSlinky.winrt.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonValueStatics extends StObject {
  
  def createBooleanValue(input: Boolean): JsonValue = js.native
  
  def createNumberValue(input: Double): JsonValue = js.native
  
  def createStringValue(input: String): JsonValue = js.native
  
  def parse(input: String): JsonValue = js.native
  
  def tryParse(input: String): Result = js.native
}
object IJsonValueStatics {
  
  @scala.inline
  def apply(
    createBooleanValue: Boolean => JsonValue,
    createNumberValue: Double => JsonValue,
    createStringValue: String => JsonValue,
    parse: String => JsonValue,
    tryParse: String => Result
  ): IJsonValueStatics = {
    val __obj = js.Dynamic.literal(createBooleanValue = js.Any.fromFunction1(createBooleanValue), createNumberValue = js.Any.fromFunction1(createNumberValue), createStringValue = js.Any.fromFunction1(createStringValue), parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonValueStatics]
  }
  
  @scala.inline
  implicit class IJsonValueStaticsMutableBuilder[Self <: IJsonValueStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateBooleanValue(value: Boolean => JsonValue): Self = StObject.set(x, "createBooleanValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNumberValue(value: Double => JsonValue): Self = StObject.set(x, "createNumberValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateStringValue(value: String => JsonValue): Self = StObject.set(x, "createStringValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: String => JsonValue): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTryParse(value: String => Result): Self = StObject.set(x, "tryParse", js.Any.fromFunction1(value))
  }
}
