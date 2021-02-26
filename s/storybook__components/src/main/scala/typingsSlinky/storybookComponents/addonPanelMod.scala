package typingsSlinky.storybookComponents

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonPanelMod {
  
  @JSImport("@storybook/components/dist/addon-panel/addon-panel", "AddonPanel")
  @js.native
  def AddonPanel(hasActiveChildren: AddonPanelProps): ReactElement = js.native
  
  @js.native
  trait AddonPanelProps extends StObject {
    
    var active: Boolean = js.native
    
    var children: ReactElement = js.native
  }
  object AddonPanelProps {
    
    @scala.inline
    def apply(active: Boolean): AddonPanelProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddonPanelProps]
    }
    
    @scala.inline
    implicit class AddonPanelPropsMutableBuilder[Self <: AddonPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
