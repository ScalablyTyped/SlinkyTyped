package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferUpload extends ResponseEntry {
  
  /** channel id to upload to */
  var cid: js.UndefOr[String] = js.native
  
  /** arbitary id to identify the transfer */
  var clientftfid: js.UndefOr[Double] = js.native
  
  /** channel password of the channel which will be uploaded to */
  var cpw: js.UndefOr[String] = js.native
  
  /** destination filename */
  var name: String = js.native
  
  /** overwrites an existing file */
  var overwrite: js.UndefOr[Double] = js.native
  
  var resume: js.UndefOr[Double] = js.native
  
  /** size of the file */
  var size: Double = js.native
}
object TransferUpload {
  
  @scala.inline
  def apply(name: String, size: Double): TransferUpload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferUpload]
  }
  
  @scala.inline
  implicit class TransferUploadOps[Self <: TransferUpload] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setClientftfid(value: Double): Self = this.set("clientftfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientftfid: Self = this.set("clientftfid", js.undefined)
    
    @scala.inline
    def setCpw(value: String): Self = this.set("cpw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpw: Self = this.set("cpw", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Double): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setResume(value: Double): Self = this.set("resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResume: Self = this.set("resume", js.undefined)
  }
}
