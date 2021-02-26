package typingsSlinky.storybookUi

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.storybookUi.anon.ClearNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationListMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/components/notifications/NotificationList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ClearNotification] = js.native
  
  type _To = ReactComponentClass[ClearNotification]
  
  /* This means you don't have to write `default`, but can instead just say `notificationListMod.foo` */
  override def _to: ReactComponentClass[ClearNotification] = default
}
