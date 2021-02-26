package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteFileFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory, open ${filePath}': 指定的 filePath 所在目录不存在;
    * - 'fail permission denied, open ${dirPath}': 指定的 filePath 路径没有写权限;
    * - 'fail the maximum size of the file storage limit is exceeded': 存储空间不足; */
  var errMsg: String = js.native
}
object WriteFileFailCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): WriteFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileFailCallbackResult]
  }
  
  @scala.inline
  implicit class WriteFileFailCallbackResultMutableBuilder[Self <: WriteFileFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
