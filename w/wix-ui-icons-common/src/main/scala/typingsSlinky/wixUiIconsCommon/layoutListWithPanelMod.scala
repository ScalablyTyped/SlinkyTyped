package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutListWithPanelMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutListWithPanel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LayoutListWithPanelProps] = js.native
  
  @js.native
  trait LayoutListWithPanelProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LayoutListWithPanelProps {
    
    @scala.inline
    def apply(): LayoutListWithPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutListWithPanelProps]
    }
    
    @scala.inline
    implicit class LayoutListWithPanelPropsMutableBuilder[Self <: LayoutListWithPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LayoutListWithPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutListWithPanelMod.foo` */
  override def _to: ReactComponentClass[LayoutListWithPanelProps] = default
}
