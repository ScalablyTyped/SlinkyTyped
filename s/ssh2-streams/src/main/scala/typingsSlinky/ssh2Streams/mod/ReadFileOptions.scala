package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadFileOptions extends js.Object {
  
  var encoding: js.UndefOr[String] = js.native
  
  var flag: js.UndefOr[String] = js.native
}
object ReadFileOptions {
  
  @scala.inline
  def apply(): ReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadFileOptions]
  }
  
  @scala.inline
  implicit class ReadFileOptionsOps[Self <: ReadFileOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
  }
}
