package typingsSlinky.xstate.anon

import typingsSlinky.xstate.xstateStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var event: _empty = js.native
}
object `0` {
  
  @scala.inline
  def apply(event: _empty): `0` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: _empty): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
