package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabPaneProps extends TabProps {
  
  var tab: js.UndefOr[ReactElement] = js.native
  
  var tabWidth: js.UndefOr[Double] = js.native
}
object TabPaneProps {
  
  @scala.inline
  def apply(): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPaneProps]
  }
  
  @scala.inline
  implicit class TabPanePropsMutableBuilder[Self <: TabPaneProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: ReactElement): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabReactElement(value: ReactElement): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    
    @scala.inline
    def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
  }
}
