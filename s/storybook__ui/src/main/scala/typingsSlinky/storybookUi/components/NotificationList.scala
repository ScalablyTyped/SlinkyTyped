package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.emotionSerialize.mod.CSSObject
import typingsSlinky.storybookUi.anon.ClearNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotificationList {
  
  @scala.inline
  def apply(
    clearNotification: String => Unit,
    notifications: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'] */ js.Any,
    placement: CSSObject
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(clearNotification = js.Any.fromFunction1(clearNotification), notifications = notifications.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ClearNotification]))
  }
  
  @JSImport("@storybook/ui/dist/components/notifications/NotificationList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ClearNotification): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
