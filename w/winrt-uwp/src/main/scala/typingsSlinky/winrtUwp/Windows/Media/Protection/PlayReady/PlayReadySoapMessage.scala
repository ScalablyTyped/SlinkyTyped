package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a SOAP message used in manual challenge requests. */
@js.native
trait PlayReadySoapMessage extends StObject {
  
  /**
    * Retrieves the contents of the SOAP message.
    * @return The contents of the SOAP message.
    */
  def getMessageBody(): js.Array[Double] = js.native
  
  /** Gets a collection of the SOAP headers applied to the current SOAP request or SOAP response. */
  var messageHeaders: IPropertySet = js.native
  
  /** Gets the base URL of the XML Web service. */
  var uri: Uri = js.native
}
object PlayReadySoapMessage {
  
  @scala.inline
  def apply(getMessageBody: () => js.Array[Double], messageHeaders: IPropertySet, uri: Uri): PlayReadySoapMessage = {
    val __obj = js.Dynamic.literal(getMessageBody = js.Any.fromFunction0(getMessageBody), messageHeaders = messageHeaders.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadySoapMessage]
  }
  
  @scala.inline
  implicit class PlayReadySoapMessageMutableBuilder[Self <: PlayReadySoapMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMessageBody(value: () => js.Array[Double]): Self = StObject.set(x, "getMessageBody", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageHeaders(value: IPropertySet): Self = StObject.set(x, "messageHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
