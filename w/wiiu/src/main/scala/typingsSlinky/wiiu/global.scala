package typingsSlinky.wiiu

import typingsSlinky.wiiu.wiiu.ImageView
import typingsSlinky.wiiu.wiiu.VideoPlayer
import typingsSlinky.wiiu.wiiu.WiiuGamePad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object wiiu extends js.Object {
    
    var gamepad: WiiuGamePad = js.native
    
    var imageview: ImageView = js.native
    
    var videoplayer: VideoPlayer = js.native
  }
}
