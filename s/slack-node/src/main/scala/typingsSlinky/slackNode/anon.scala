package typingsSlinky.slackNode

import typingsSlinky.slackNode.slackNodeStrings.icon_emoji
import typingsSlinky.slackNode.slackNodeStrings.icon_url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Key extends StObject {
    
    var key: icon_url | icon_emoji = js.native
    
    var `val`: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: icon_url | icon_emoji, `val`: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: icon_url | icon_emoji): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
