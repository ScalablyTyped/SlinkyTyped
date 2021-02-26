package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUssdMessage extends StObject {
  
  var dataCodingScheme: Double = js.native
  
  def getPayload(): js.typedarray.Uint8Array = js.native
  
  var payloadAsText: String = js.native
  
  def setPayload(value: js.typedarray.Uint8Array): Unit = js.native
}
object IUssdMessage {
  
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => js.typedarray.Uint8Array,
    payloadAsText: String,
    setPayload: js.typedarray.Uint8Array => Unit
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[IUssdMessage]
  }
  
  @scala.inline
  implicit class IUssdMessageMutableBuilder[Self <: IUssdMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCodingScheme(value: Double): Self = StObject.set(x, "dataCodingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPayload(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "getPayload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPayloadAsText(value: String): Self = StObject.set(x, "payloadAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPayload(value: js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "setPayload", js.Any.fromFunction1(value))
  }
}
