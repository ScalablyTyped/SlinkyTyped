package typingsSlinky.uikit.mod.UIkit

import typingsSlinky.uikit.uikitStrings.`bottom-center`
import typingsSlinky.uikit.uikitStrings.`bottom-left`
import typingsSlinky.uikit.uikitStrings.`bottom-right`
import typingsSlinky.uikit.uikitStrings.`top-center`
import typingsSlinky.uikit.uikitStrings.`top-left`
import typingsSlinky.uikit.uikitStrings.`top-right`
import typingsSlinky.uikit.uikitStrings.danger
import typingsSlinky.uikit.uikitStrings.primary
import typingsSlinky.uikit.uikitStrings.success
import typingsSlinky.uikit.uikitStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitNotificationOptions extends StObject {
  
  var group: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var pos: js.UndefOr[
    `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.native
  
  var status: js.UndefOr[primary | success | warning | danger] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object UIkitNotificationOptions {
  
  @scala.inline
  def apply(): UIkitNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitNotificationOptions]
  }
  
  @scala.inline
  implicit class UIkitNotificationOptionsMutableBuilder[Self <: UIkitNotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPos(value: `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    @scala.inline
    def setStatus(value: primary | success | warning | danger): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
