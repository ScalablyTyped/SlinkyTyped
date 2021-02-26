package typingsSlinky.tinymce.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends StObject {
  
  var android: Boolean = js.native
  
  var ceFalse: Boolean = js.native
  
  var contentEditable: Boolean = js.native
  
  var documentMode: Boolean = js.native
  
  var fileApi: Boolean = js.native
  
  var gecko: Boolean = js.native
  
  var iOS: Boolean = js.native
  
  var ie: Boolean = js.native
  
  var mac: Boolean = js.native
  
  var noCaretAfter: Boolean = js.native
  
  var opera: Boolean = js.native
  
  var range: Boolean = js.native
  
  var transparentSrc: Boolean = js.native
  
  var webKit: Boolean = js.native
}
object Env {
  
  @scala.inline
  def apply(
    android: Boolean,
    ceFalse: Boolean,
    contentEditable: Boolean,
    documentMode: Boolean,
    fileApi: Boolean,
    gecko: Boolean,
    iOS: Boolean,
    ie: Boolean,
    mac: Boolean,
    noCaretAfter: Boolean,
    opera: Boolean,
    range: Boolean,
    transparentSrc: Boolean,
    webKit: Boolean
  ): Env = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ceFalse = ceFalse.asInstanceOf[js.Any], contentEditable = contentEditable.asInstanceOf[js.Any], documentMode = documentMode.asInstanceOf[js.Any], fileApi = fileApi.asInstanceOf[js.Any], gecko = gecko.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], noCaretAfter = noCaretAfter.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], transparentSrc = transparentSrc.asInstanceOf[js.Any], webKit = webKit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  @scala.inline
  implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCeFalse(value: Boolean): Self = StObject.set(x, "ceFalse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditable(value: Boolean): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMode(value: Boolean): Self = StObject.set(x, "documentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileApi(value: Boolean): Self = StObject.set(x, "fileApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGecko(value: Boolean): Self = StObject.set(x, "gecko", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOS(value: Boolean): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe(value: Boolean): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCaretAfter(value: Boolean): Self = StObject.set(x, "noCaretAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpera(value: Boolean): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentSrc(value: Boolean): Self = StObject.set(x, "transparentSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebKit(value: Boolean): Self = StObject.set(x, "webKit", value.asInstanceOf[js.Any])
  }
}
