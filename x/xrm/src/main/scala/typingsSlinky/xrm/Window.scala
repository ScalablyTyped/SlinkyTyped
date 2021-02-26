package typingsSlinky.xrm

import typingsSlinky.xrm.Xrm.GlobalContext
import typingsSlinky.xrm.Xrm.XrmStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  def GetGlobalContext(): GlobalContext = js.native
  
  var Xrm: XrmStatic = js.native
}
object Window {
  
  @scala.inline
  def apply(GetGlobalContext: () => GlobalContext, Xrm: XrmStatic): Window = {
    val __obj = js.Dynamic.literal(GetGlobalContext = js.Any.fromFunction0(GetGlobalContext), Xrm = Xrm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGlobalContext(value: () => GlobalContext): Self = StObject.set(x, "GetGlobalContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setXrm(value: XrmStatic): Self = StObject.set(x, "Xrm", value.asInstanceOf[js.Any])
  }
}
