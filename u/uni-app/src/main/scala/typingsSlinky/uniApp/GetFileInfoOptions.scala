package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileInfoOptions extends js.Object {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 计算文件摘要的算法，默认值 md5，有效值：md5，sha1
    */
  var digestAlgorithm: js.UndefOr[String] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 本地路径
    */
  var filePath: js.UndefOr[String] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetFileInfoSuccess, Unit]] = js.native
}
object GetFileInfoOptions {
  
  @scala.inline
  def apply(): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileInfoOptions]
  }
  
  @scala.inline
  implicit class GetFileInfoOptionsOps[Self <: GetFileInfoOptions] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestAlgorithm: Self = this.set("digestAlgorithm", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ GetFileInfoSuccess => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
