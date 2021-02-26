package typingsSlinky.wxJsSdkDt.wx

import typingsSlinky.wxJsSdkDt.anon.ResultStr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanQRCodeConfig extends WxBaseRequestConfig {
  
  /**
    * 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
    */
  var needResult: js.UndefOr[Double] = js.native
  
  /**
    * ["qrCode","barCode"], 可以指定扫二维码还是一维码，默认二者都有
    */
  var scanType: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * resultStr 是当 needResult 为 1 时，扫码返回的结果
    */
  @JSName("success")
  var success_ScanQRCodeConfig: js.UndefOr[js.Function1[/* res */ ResultStr, Unit]] = js.native
}
object ScanQRCodeConfig {
  
  @scala.inline
  def apply(): ScanQRCodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanQRCodeConfig]
  }
  
  @scala.inline
  implicit class ScanQRCodeConfigMutableBuilder[Self <: ScanQRCodeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNeedResult(value: Double): Self = StObject.set(x, "needResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedResultUndefined: Self = StObject.set(x, "needResult", js.undefined)
    
    @scala.inline
    def setScanType(value: js.Array[String]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
    
    @scala.inline
    def setScanTypeVarargs(value: String*): Self = StObject.set(x, "scanType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ ResultStr => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
