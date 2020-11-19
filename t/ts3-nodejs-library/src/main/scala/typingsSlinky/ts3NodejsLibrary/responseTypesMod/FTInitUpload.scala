package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FTInitUpload extends ResponseEntry {
  
  var clientftfid: Double = js.native
  
  /** exists when file is uploadable */
  var ftkey: js.UndefOr[String] = js.native
  
  /** exists when an error occured */
  var msg: js.UndefOr[String] = js.native
  
  /** exists when file is uploadable */
  var port: js.UndefOr[Double] = js.native
  
  /** exists when file is uploadable */
  var proto: js.UndefOr[Double] = js.native
  
  /** exists when file is uploadable */
  var seekpos: js.UndefOr[Double] = js.native
  
  /** exists when file is uploadable */
  var serverftfid: js.UndefOr[Double] = js.native
  
  /** exists when an error occured */
  var size: js.UndefOr[Double] = js.native
  
  /** exists when an error occured */
  var status: js.UndefOr[Double] = js.native
}
object FTInitUpload {
  
  @scala.inline
  def apply(clientftfid: Double): FTInitUpload = {
    val __obj = js.Dynamic.literal(clientftfid = clientftfid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTInitUpload]
  }
  
  @scala.inline
  implicit class FTInitUploadOps[Self <: FTInitUpload] (val x: Self) extends AnyVal {
    
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
    def setClientftfid(value: Double): Self = this.set("clientftfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFtkey(value: String): Self = this.set("ftkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFtkey: Self = this.set("ftkey", js.undefined)
    
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProto(value: Double): Self = this.set("proto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProto: Self = this.set("proto", js.undefined)
    
    @scala.inline
    def setSeekpos(value: Double): Self = this.set("seekpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeekpos: Self = this.set("seekpos", js.undefined)
    
    @scala.inline
    def setServerftfid(value: Double): Self = this.set("serverftfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerftfid: Self = this.set("serverftfid", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
