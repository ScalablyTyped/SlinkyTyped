package typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets

import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`22`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`24`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`30`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowMessagesFromCommunityOptions extends StObject {
  
  var height: js.UndefOr[`22` | `24` | `30`] = js.native
}
object AllowMessagesFromCommunityOptions {
  
  @scala.inline
  def apply(): AllowMessagesFromCommunityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMessagesFromCommunityOptions]
  }
  
  @scala.inline
  implicit class AllowMessagesFromCommunityOptionsMutableBuilder[Self <: AllowMessagesFromCommunityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: `22` | `24` | `30`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
  }
}
