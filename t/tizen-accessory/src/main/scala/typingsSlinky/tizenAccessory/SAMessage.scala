package typingsSlinky.tizenAccessory

import typingsSlinky.tizenAccessory.anon.Onsent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMessage extends StObject {
  
  def sendData(peerAgent: SAPeerAgent, data: String, callback: Onsent): Unit = js.native
  
  def sendSecureData(peerAgent: SAPeerAgent, data: String, callback: Onsent): Unit = js.native
  
  def setMessageReceiveListener(receiveDataCallback: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit]): Unit = js.native
}
object SAMessage {
  
  @scala.inline
  def apply(
    sendData: (SAPeerAgent, String, Onsent) => Unit,
    sendSecureData: (SAPeerAgent, String, Onsent) => Unit,
    setMessageReceiveListener: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit] => Unit
  ): SAMessage = {
    val __obj = js.Dynamic.literal(sendData = js.Any.fromFunction3(sendData), sendSecureData = js.Any.fromFunction3(sendSecureData), setMessageReceiveListener = js.Any.fromFunction1(setMessageReceiveListener))
    __obj.asInstanceOf[SAMessage]
  }
  
  @scala.inline
  implicit class SAMessageMutableBuilder[Self <: SAMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendData(value: (SAPeerAgent, String, Onsent) => Unit): Self = StObject.set(x, "sendData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSendSecureData(value: (SAPeerAgent, String, Onsent) => Unit): Self = StObject.set(x, "sendSecureData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetMessageReceiveListener(value: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit] => Unit): Self = StObject.set(x, "setMessageReceiveListener", js.Any.fromFunction1(value))
  }
}
