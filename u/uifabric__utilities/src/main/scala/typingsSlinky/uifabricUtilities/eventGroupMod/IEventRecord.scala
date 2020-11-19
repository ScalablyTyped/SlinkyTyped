package typingsSlinky.uifabricUtilities.eventGroupMod

import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventRecord extends js.Object {
  
  def callback(): Unit = js.native
  def callback(args: js.Any): Unit = js.native
  
  var elementCallback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var eventName: String = js.native
  
  var objectCallback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
  
  var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.native
  
  var parent: js.Any = js.native
  
  var target: js.Any = js.native
}
