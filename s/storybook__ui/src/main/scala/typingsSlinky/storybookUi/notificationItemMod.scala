package typingsSlinky.storybookUi

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.Notification
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationItemMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/components/notifications/NotificationItem", JSImport.Default)
  @js.native
  val default: ReactComponentClass[Notification] = js.native
  
  @JSImport("@storybook/ui/dist/components/notifications/NotificationItem", "NotificationItemSpacer")
  @js.native
  val NotificationItemSpacer: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  type _To = ReactComponentClass[Notification]
  
  /* This means you don't have to write `default`, but can instead just say `notificationItemMod.foo` */
  override def _to: ReactComponentClass[Notification] = default
}
