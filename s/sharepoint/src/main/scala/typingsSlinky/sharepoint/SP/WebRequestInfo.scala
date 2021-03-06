package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestInfo extends ClientValueObject {
  
  def get_body(): String = js.native
  
  def get_headers(): js.Any = js.native
  
  def get_method(): String = js.native
  
  def get_url(): String = js.native
  
  def set_body(value: String): Unit = js.native
  
  def set_headers(value: js.Any): Unit = js.native
  
  def set_method(value: String): Unit = js.native
  
  def set_url(value: String): Unit = js.native
}
object WebRequestInfo {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_body: () => String,
    get_headers: () => js.Any,
    get_method: () => String,
    get_typeId: () => String,
    get_url: () => String,
    set_body: String => Unit,
    set_headers: js.Any => Unit,
    set_method: String => Unit,
    set_url: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): WebRequestInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_body = js.Any.fromFunction0(get_body), get_headers = js.Any.fromFunction0(get_headers), get_method = js.Any.fromFunction0(get_method), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), set_body = js.Any.fromFunction1(set_body), set_headers = js.Any.fromFunction1(set_headers), set_method = js.Any.fromFunction1(set_method), set_url = js.Any.fromFunction1(set_url), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[WebRequestInfo]
  }
  
  @scala.inline
  implicit class WebRequestInfoMutableBuilder[Self <: WebRequestInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_body(value: () => String): Self = StObject.set(x, "get_body", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_headers(value: () => js.Any): Self = StObject.set(x, "get_headers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_method(value: () => String): Self = StObject.set(x, "get_method", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_body(value: String => Unit): Self = StObject.set(x, "set_body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_headers(value: js.Any => Unit): Self = StObject.set(x, "set_headers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_method(value: String => Unit): Self = StObject.set(x, "set_method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_url(value: String => Unit): Self = StObject.set(x, "set_url", js.Any.fromFunction1(value))
  }
}
