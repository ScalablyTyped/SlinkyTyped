package typingsSlinky.umbraco.umbracoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("umbraco", "services")
@js.native
object services extends js.Object {
  /**
    * Notification Type
    */
  @js.native
  object NotificationType extends js.Object {
    /* 1 */ val error: typingsSlinky.umbraco.umbraco.services.NotificationType.error with Double = js.native
    /* 3 */ val info: typingsSlinky.umbraco.umbraco.services.NotificationType.info with Double = js.native
    /* 0 */ val success: typingsSlinky.umbraco.umbraco.services.NotificationType.success with Double = js.native
    /* 2 */ val warning: typingsSlinky.umbraco.umbraco.services.NotificationType.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.umbraco.umbraco.services.NotificationType with Double] = js.native
  }
  
}

