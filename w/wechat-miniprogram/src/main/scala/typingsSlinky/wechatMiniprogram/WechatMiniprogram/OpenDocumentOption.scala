package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.doc
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.docx
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.pdf
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.ppt
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.pptx
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.xls
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenDocumentOption extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenDocumentCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenDocumentFailCallback] = js.native
  
  /** 文件路径 (本地路径) ，可通过 downloadFile 获得 */
  var filePath: String = js.native
  
  /** 文件类型，指定文件类型打开文件
    *
    * 可选值：
    * - 'doc': doc 格式;
    * - 'docx': docx 格式;
    * - 'xls': xls 格式;
    * - 'xlsx': xlsx 格式;
    * - 'ppt': ppt 格式;
    * - 'pptx': pptx 格式;
    * - 'pdf': pdf 格式;
    *
    * 最低基础库： `1.4.0` */
  var fileType: js.UndefOr[doc | docx | xls | xlsx | ppt | pptx | pdf] = js.native
  
  /** 是否显示右上角菜单
    *
    * 最低基础库： `2.11.0` */
  var showMenu: js.UndefOr[Boolean] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenDocumentSuccessCallback] = js.native
}
object OpenDocumentOption {
  
  @scala.inline
  def apply(filePath: String): OpenDocumentOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDocumentOption]
  }
  
  @scala.inline
  implicit class OpenDocumentOptionOps[Self <: OpenDocumentOption] (val x: Self) extends AnyVal {
    
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setFileType(value: doc | docx | xls | xlsx | ppt | pptx | pdf): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setShowMenu(value: Boolean): Self = this.set("showMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMenu: Self = this.set("showMenu", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
