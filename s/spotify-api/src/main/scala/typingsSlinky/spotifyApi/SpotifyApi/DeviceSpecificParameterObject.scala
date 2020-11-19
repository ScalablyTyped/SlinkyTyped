package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceSpecificParameterObject extends js.Object {
  
  var context_uri: js.UndefOr[String] = js.native
  
  var device_id: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[js.Object] = js.native
  
  var position_ms: js.UndefOr[Double] = js.native
  
  var uris: js.UndefOr[js.Array[String]] = js.native
}
object DeviceSpecificParameterObject {
  
  @scala.inline
  def apply(): DeviceSpecificParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSpecificParameterObject]
  }
  
  @scala.inline
  implicit class DeviceSpecificParameterObjectOps[Self <: DeviceSpecificParameterObject] (val x: Self) extends AnyVal {
    
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
    def setContext_uri(value: String): Self = this.set("context_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext_uri: Self = this.set("context_uri", js.undefined)
    
    @scala.inline
    def setDevice_id(value: String): Self = this.set("device_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice_id: Self = this.set("device_id", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Object): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition_ms(value: Double): Self = this.set("position_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition_ms: Self = this.set("position_ms", js.undefined)
    
    @scala.inline
    def setUrisVarargs(value: String*): Self = this.set("uris", js.Array(value :_*))
    
    @scala.inline
    def setUris(value: js.Array[String]): Self = this.set("uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUris: Self = this.set("uris", js.undefined)
  }
}
