package typingsSlinky.wxServerSdk.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileSuccess extends js.Object {
  
  var fileContent: Buffer = js.native
  
  var statusCode: Double = js.native
}
object DownloadFileSuccess {
  
  @scala.inline
  def apply(fileContent: Buffer, statusCode: Double): DownloadFileSuccess = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileSuccess]
  }
  
  @scala.inline
  implicit class DownloadFileSuccessOps[Self <: DownloadFileSuccess] (val x: Self) extends AnyVal {
    
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
    def setFileContent(value: Buffer): Self = this.set("fileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
}
