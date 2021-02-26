package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
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
  implicit class FTInitUploadMutableBuilder[Self <: FTInitUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientftfid(value: Double): Self = StObject.set(x, "clientftfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFtkey(value: String): Self = StObject.set(x, "ftkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFtkeyUndefined: Self = StObject.set(x, "ftkey", js.undefined)
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProto(value: Double): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    
    @scala.inline
    def setSeekpos(value: Double): Self = StObject.set(x, "seekpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekposUndefined: Self = StObject.set(x, "seekpos", js.undefined)
    
    @scala.inline
    def setServerftfid(value: Double): Self = StObject.set(x, "serverftfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerftfidUndefined: Self = StObject.set(x, "serverftfid", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
