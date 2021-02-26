package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolboxSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ToolboxSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ToolboxSmallProps] = js.native
  
  @js.native
  trait ToolboxSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ToolboxSmallProps {
    
    @scala.inline
    def apply(): ToolboxSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolboxSmallProps]
    }
    
    @scala.inline
    implicit class ToolboxSmallPropsMutableBuilder[Self <: ToolboxSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ToolboxSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `toolboxSmallMod.foo` */
  override def _to: ReactComponentClass[ToolboxSmallProps] = default
}
