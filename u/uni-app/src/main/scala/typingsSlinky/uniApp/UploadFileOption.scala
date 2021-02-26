package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.audio
import typingsSlinky.uniApp.uniAppStrings.image
import typingsSlinky.uniApp.uniAppStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileOption extends StObject {
  
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.native
  
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.native
  
  /**
    * 要上传文件资源的路径
    */
  var filePath: js.UndefOr[String] = js.native
  
  /**
    * 文件类型，image/video/audio，仅支付宝小程序，且必填。
    * - image: 图像
    * - video: 视频
    * - audio: 音频
    */
  var fileType: js.UndefOr[image | video | audio] = js.native
  
  /**
    * 需要上传的文件列表。使用 files 时，filePath 和 name 不生效。仅 5+App 支持
    */
  var files: js.UndefOr[js.Array[UploadFileOptionFiles]] = js.native
  
  /**
    * HTTP 请求中其他额外的 form data
    */
  var formData: js.UndefOr[js.Any] = js.native
  
  /**
    * HTTP 请求 Header, header 中不能设置 Referer
    */
  var header: js.UndefOr[js.Any] = js.native
  
  /**
    * 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ UploadFileSuccessCallbackResult, Unit]] = js.native
  
  /**
    * 开发者服务器 url
    */
  var url: js.UndefOr[String] = js.native
}
object UploadFileOption {
  
  @scala.inline
  def apply(): UploadFileOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadFileOption]
  }
  
  @scala.inline
  implicit class UploadFileOptionMutableBuilder[Self <: UploadFileOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* result */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setFileType(value: image | video | audio): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[UploadFileOptionFiles]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: UploadFileOptionFiles*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ UploadFileSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
