package typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets

import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`18`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`20`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`22`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`24`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`30`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactUsOptions extends StObject {
  
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object ContactUsOptions {
  
  @scala.inline
  def apply(): ContactUsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactUsOptions]
  }
  
  @scala.inline
  implicit class ContactUsOptionsMutableBuilder[Self <: ContactUsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: `18` | `20` | `22` | `24` | `30`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
