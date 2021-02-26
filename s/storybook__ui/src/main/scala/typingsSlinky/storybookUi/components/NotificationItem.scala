package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotificationItem {
  
  @scala.inline
  def apply(
    notification: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'][0] */ js.Any,
    onDismissNotification: String => Unit
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any], onDismissNotification = js.Any.fromFunction1(onDismissNotification))
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Notification]))
  }
  
  @JSImport("@storybook/ui/dist/components/notifications/NotificationItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Notification): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
