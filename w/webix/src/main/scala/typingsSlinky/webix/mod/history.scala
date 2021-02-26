package typingsSlinky.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait history extends StObject {
  
  def push(view: String, url: String, value: js.Any): Unit = js.native
  
  def track(view: String, url: String): Unit = js.native
}
object history {
  
  @JSImport("webix", "history")
  @js.native
  val ^ : typingsSlinky.webix.webix.history = js.native
  
  @scala.inline
  implicit class historyMutableBuilder[Self <: history] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPush(value: (String, String, js.Any) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTrack(value: (String, String) => Unit): Self = StObject.set(x, "track", js.Any.fromFunction2(value))
  }
}
