package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebResponseInfo extends ClientValueObject {
  
  def get_body(): String = js.native
  
  def get_headers(): js.Any = js.native
  
  def get_statusCode(): Double = js.native
  
  def set_body(value: String): Unit = js.native
  
  def set_headers(value: js.Any): Unit = js.native
  
  def set_statusCode(value: Double): Unit = js.native
}
object WebResponseInfo {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_body: () => String,
    get_headers: () => js.Any,
    get_statusCode: () => Double,
    get_typeId: () => String,
    set_body: String => Unit,
    set_headers: js.Any => Unit,
    set_statusCode: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): WebResponseInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_body = js.Any.fromFunction0(get_body), get_headers = js.Any.fromFunction0(get_headers), get_statusCode = js.Any.fromFunction0(get_statusCode), get_typeId = js.Any.fromFunction0(get_typeId), set_body = js.Any.fromFunction1(set_body), set_headers = js.Any.fromFunction1(set_headers), set_statusCode = js.Any.fromFunction1(set_statusCode), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[WebResponseInfo]
  }
  
  @scala.inline
  implicit class WebResponseInfoMutableBuilder[Self <: WebResponseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_body(value: () => String): Self = StObject.set(x, "get_body", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_headers(value: () => js.Any): Self = StObject.set(x, "get_headers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_statusCode(value: () => Double): Self = StObject.set(x, "get_statusCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_body(value: String => Unit): Self = StObject.set(x, "set_body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_headers(value: js.Any => Unit): Self = StObject.set(x, "set_headers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_statusCode(value: Double => Unit): Self = StObject.set(x, "set_statusCode", js.Any.fromFunction1(value))
  }
}
