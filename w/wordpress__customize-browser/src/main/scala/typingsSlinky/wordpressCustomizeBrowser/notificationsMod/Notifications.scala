package typingsSlinky.wordpressCustomizeBrowser.notificationsMod

import typingsSlinky.jquery.JQuery.Event
import typingsSlinky.wordpressCustomizeBrowser.notificationMod.Notification
import typingsSlinky.wordpressCustomizeBrowser.valuesMod.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Notifications", "Notifications")
@js.native
class Notifications () extends Values[Notification] {
  
  var alt: Boolean = js.native
  
  def constrainFocus(event: Event): Unit = js.native
  
  def count(): Double = js.native
  
  def get(args: NotificationsGetOptions): js.Array[Notification] = js.native
  
  def initialize(options: NotificationsOptions): Unit = js.native
  
  def render(): Unit = js.native
}
