package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsupportedFilter extends BaseSubscriptionFilter
object UnsupportedFilter {
  
  @scala.inline
  def apply(eventType: String, `type`: String): UnsupportedFilter = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFilter]
  }
}
