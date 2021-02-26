package typingsSlinky.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareMessageToFriendScene extends StObject {
  
  /**
    * 需要传递的代表场景的数字，需要在 0 - 50 之间
    */
  var shareMessageToFriendScene: Double = js.native
}
object ShareMessageToFriendScene {
  
  @scala.inline
  def apply(shareMessageToFriendScene: Double): ShareMessageToFriendScene = {
    val __obj = js.Dynamic.literal(shareMessageToFriendScene = shareMessageToFriendScene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareMessageToFriendScene]
  }
  
  @scala.inline
  implicit class ShareMessageToFriendSceneMutableBuilder[Self <: ShareMessageToFriendScene] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShareMessageToFriendScene(value: Double): Self = StObject.set(x, "shareMessageToFriendScene", value.asInstanceOf[js.Any])
  }
}
