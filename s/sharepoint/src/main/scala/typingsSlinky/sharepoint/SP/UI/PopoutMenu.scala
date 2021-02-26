package typingsSlinky.sharepoint.SP.UI

import typingsSlinky.microsoftAjax.Sys.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoutMenu extends IDisposable {
  
  def closeMenu(): Unit = js.native
  
  def launchMenu(): Unit = js.native
}
object PopoutMenu {
  
  @scala.inline
  def apply(closeMenu: () => Unit, dispose: () => Unit, launchMenu: () => Unit): PopoutMenu = {
    val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu), dispose = js.Any.fromFunction0(dispose), launchMenu = js.Any.fromFunction0(launchMenu))
    __obj.asInstanceOf[PopoutMenu]
  }
  
  @scala.inline
  implicit class PopoutMenuMutableBuilder[Self <: PopoutMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseMenu(value: () => Unit): Self = StObject.set(x, "closeMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLaunchMenu(value: () => Unit): Self = StObject.set(x, "launchMenu", js.Any.fromFunction0(value))
  }
}
