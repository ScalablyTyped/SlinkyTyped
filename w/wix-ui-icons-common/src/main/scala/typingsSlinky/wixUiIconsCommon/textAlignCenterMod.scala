package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignCenterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextAlignCenter", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAlignCenterProps] = js.native
  
  @js.native
  trait TextAlignCenterProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAlignCenterProps {
    
    @scala.inline
    def apply(): TextAlignCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignCenterProps]
    }
    
    @scala.inline
    implicit class TextAlignCenterPropsMutableBuilder[Self <: TextAlignCenterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAlignCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignCenterMod.foo` */
  override def _to: ReactComponentClass[TextAlignCenterProps] = default
}
