package typingsSlinky.storybookUi

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.storybookApi.mod.Combo
import typingsSlinky.storybookUi.anon.Notifications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/containers/notifications", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Any] = js.native
  
  @JSImport("@storybook/ui/dist/containers/notifications", "mapper")
  @js.native
  def mapper(hasState: Combo): Notifications = js.native
  
  type _To = ReactComponentClass[js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `notificationsMod.foo` */
  override def _to: ReactComponentClass[js.Any] = default
}
