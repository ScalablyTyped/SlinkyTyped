package typingsSlinky.wiiu

import typingsSlinky.wiiu.wiiu.ImageView
import typingsSlinky.wiiu.wiiu.VideoPlayer
import typingsSlinky.wiiu.wiiu.WiiuGamePad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofwiiu extends StObject {
    
    var gamepad: WiiuGamePad = js.native
    
    var imageview: ImageView = js.native
    
    var videoplayer: VideoPlayer = js.native
  }
  object Typeofwiiu {
    
    @scala.inline
    def apply(gamepad: WiiuGamePad, imageview: ImageView, videoplayer: VideoPlayer): Typeofwiiu = {
      val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any], imageview = imageview.asInstanceOf[js.Any], videoplayer = videoplayer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofwiiu]
    }
    
    @scala.inline
    implicit class TypeofwiiuMutableBuilder[Self <: Typeofwiiu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGamepad(value: WiiuGamePad): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageview(value: ImageView): Self = StObject.set(x, "imageview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoplayer(value: VideoPlayer): Self = StObject.set(x, "videoplayer", value.asInstanceOf[js.Any])
    }
  }
}
