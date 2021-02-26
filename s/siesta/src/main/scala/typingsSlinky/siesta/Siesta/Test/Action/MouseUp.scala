package typingsSlinky.siesta.Siesta.Test.Action

import typingsSlinky.siesta.Siesta.Test.Action.Role.IHasTarget
import typingsSlinky.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
@js.native
trait MouseUp
  extends IAction
     with IHasTarget {
  
  var options: js.UndefOr[js.Any] = js.native
}
object MouseUp {
  
  @scala.inline
  def apply(): MouseUp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseUp]
  }
  
  @scala.inline
  implicit class MouseUpMutableBuilder[Self <: MouseUp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
