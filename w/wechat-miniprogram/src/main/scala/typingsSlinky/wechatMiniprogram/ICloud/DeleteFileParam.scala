package typingsSlinky.wechatMiniprogram.ICloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileParam extends ICloudAPIParam[DeleteFileResult] {
  
  var fileList: js.Array[String] = js.native
}
object DeleteFileParam {
  
  @scala.inline
  def apply(fileList: js.Array[String]): DeleteFileParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileParam]
  }
  
  @scala.inline
  implicit class DeleteFileParamOps[Self <: DeleteFileParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileListVarargs(value: String*): Self = this.set("fileList", js.Array(value :_*))
    
    @scala.inline
    def setFileList(value: js.Array[String]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
}
