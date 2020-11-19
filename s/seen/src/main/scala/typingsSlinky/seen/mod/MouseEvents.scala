package typingsSlinky.seen.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.seen.mod.Events.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "MouseEvents")
@js.native
class MouseEvents protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: MouseEventOptions) = this()
  def this(elementOrId: HTMLElement, options: MouseEventOptions) = this()
  
  def attach(): Unit = js.native
  
  def detach(): Unit = js.native
  
  var dispatch: Dispatcher = js.native
  
  var el: HTMLElement = js.native
}
