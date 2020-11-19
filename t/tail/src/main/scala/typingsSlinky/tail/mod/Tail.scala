package typingsSlinky.tail.mod

import typingsSlinky.tail.tailStrings.error
import typingsSlinky.tail.tailStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tail extends js.Object {
  
  /** Error callback */
  @JSName("on")
  def on_error(eventType: error, cb: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  /** Callback to listen for newlines appended to file */
  @JSName("on")
  def on_line(eventType: line, cb: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  
  /** Stop watching file */
  def unwatch(): Unit = js.native
  
  /** Start watching file if previously stopped */
  def watch(): Unit = js.native
}
