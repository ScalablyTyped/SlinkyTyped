package typingsSlinky.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTempFileURLResultItem extends StObject {
  
  var errMsg: String = js.native
  
  var fileID: String = js.native
  
  var maxAge: Double = js.native
  
  var status: Double = js.native
  
  var tempFileURL: String = js.native
}
object GetTempFileURLResultItem {
  
  @scala.inline
  def apply(errMsg: String, fileID: String, maxAge: Double, status: Double, tempFileURL: String): GetTempFileURLResultItem = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileURLResultItem]
  }
  
  @scala.inline
  implicit class GetTempFileURLResultItemMutableBuilder[Self <: GetTempFileURLResultItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFileURL(value: String): Self = StObject.set(x, "tempFileURL", value.asInstanceOf[js.Any])
  }
}
