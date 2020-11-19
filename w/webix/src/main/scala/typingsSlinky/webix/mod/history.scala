package typingsSlinky.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait history extends js.Object {
  
  def push(view: String, url: String, value: js.Any): Unit = js.native
  
  def track(view: String, url: String): Unit = js.native
}
@JSImport("webix", "history")
@js.native
object history
  extends TopLevel[typingsSlinky.webix.webix.history]
