package typingsSlinky.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UDPSendParams extends StObject {
  
  /**
    * 要发消息的地址。可以是一个和本机同网段的 IP 地址，也可以是在安全域名列表内的域名地址
    */
  var address: String = js.native
  
  /**
    * 发送数据的长度，仅当 message 为 ArrayBuffer 类型时有效，默认值message.byteLength
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * 要发送的数据
    */
  var message: String | js.typedarray.ArrayBuffer = js.native
  
  /**
    * 发送数据的偏移量，仅当 message 为 ArrayBuffer 类型时有效，默认值0
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * 要发送消息的端口号
    */
  var port: Double = js.native
}
object UDPSendParams {
  
  @scala.inline
  def apply(address: String, message: String | js.typedarray.ArrayBuffer, port: Double): UDPSendParams = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSendParams]
  }
  
  @scala.inline
  implicit class UDPSendParamsMutableBuilder[Self <: UDPSendParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMessage(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
