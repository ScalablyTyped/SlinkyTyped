package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadSuccessData extends StObject {
  
  /**
    * 开发者服务器返回的 HTTP 状态码
    */
  var statusCode: js.UndefOr[Double] = js.native
  
  /**
    * 临时文件路径，下载后的文件会存储到一个临时文件
    */
  var tempFilePath: js.UndefOr[String] = js.native
}
object DownloadSuccessData {
  
  @scala.inline
  def apply(): DownloadSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadSuccessData]
  }
  
  @scala.inline
  implicit class DownloadSuccessDataMutableBuilder[Self <: DownloadSuccessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
  }
}
