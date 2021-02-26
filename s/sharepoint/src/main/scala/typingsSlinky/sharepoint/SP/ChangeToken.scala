package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeToken extends ClientValueObject {
  
  def get_stringValue(): String = js.native
  
  def set_stringValue(value: String): Unit = js.native
}
object ChangeToken {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_stringValue: () => String,
    get_typeId: () => String,
    set_stringValue: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ChangeToken = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_stringValue = js.Any.fromFunction0(get_stringValue), get_typeId = js.Any.fromFunction0(get_typeId), set_stringValue = js.Any.fromFunction1(set_stringValue), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ChangeToken]
  }
  
  @scala.inline
  implicit class ChangeTokenMutableBuilder[Self <: ChangeToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_stringValue(value: () => String): Self = StObject.set(x, "get_stringValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_stringValue(value: String => Unit): Self = StObject.set(x, "set_stringValue", js.Any.fromFunction1(value))
  }
}
