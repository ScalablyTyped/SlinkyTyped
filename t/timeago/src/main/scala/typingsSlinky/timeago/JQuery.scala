package typingsSlinky.timeago

import typingsSlinky.timeago.timeagoStrings.dispose
import typingsSlinky.timeago.timeagoStrings.init
import typingsSlinky.timeago.timeagoStrings.update
import typingsSlinky.timeago.timeagoStrings.updateFromDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def timeago(): this.type = js.native
  @JSName("timeago")
  def timeago_dispose(action: dispose): this.type = js.native
  @JSName("timeago")
  def timeago_init(action: init): this.type = js.native
  @JSName("timeago")
  def timeago_update(action: update, timestamp: String): this.type = js.native
  @JSName("timeago")
  def timeago_update(action: update, timestamp: js.Date): this.type = js.native
  @JSName("timeago")
  def timeago_updateFromDOM(action: updateFromDOM): this.type = js.native
}
