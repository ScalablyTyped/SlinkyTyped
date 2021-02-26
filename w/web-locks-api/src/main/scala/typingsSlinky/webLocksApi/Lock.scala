package typingsSlinky.webLocksApi

import typingsSlinky.webLocksApi.webLocksApiStrings.exclusive
import typingsSlinky.webLocksApi.webLocksApiStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lock extends StObject {
  
  val mode: exclusive | shared = js.native
  
  val name: String = js.native
}
object Lock {
  
  @scala.inline
  def apply(mode: exclusive | shared, name: String): Lock = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lock]
  }
  
  @scala.inline
  implicit class LockMutableBuilder[Self <: Lock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: exclusive | shared): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
