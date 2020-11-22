package typingsSlinky.wordpressCustomizeBrowser.notificationMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.wordpressCustomizeBrowser.classMod.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Notification", "Notification")
@js.native
class Notification () extends Class {
  
  var code: String = js.native
  
  var containerClasses: String = js.native
  
  def initialize(): Unit = js.native
  def initialize(code: js.UndefOr[scala.Nothing], params: NotificationParams): Unit = js.native
  def initialize(code: String): Unit = js.native
  def initialize(code: String, params: NotificationParams): Unit = js.native
  
  def render(): JQuery[HTMLElement] = js.native
  
  var template: Null | (js.Function1[/* data */ this.type, Unit]) = js.native
  
  var templateId: String = js.native
}
