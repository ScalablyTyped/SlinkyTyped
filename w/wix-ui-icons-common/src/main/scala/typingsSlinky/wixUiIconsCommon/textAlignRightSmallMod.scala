package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextAlignRightSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAlignRightSmallProps] = js.native
  
  @js.native
  trait TextAlignRightSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAlignRightSmallProps {
    
    @scala.inline
    def apply(): TextAlignRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignRightSmallProps]
    }
    
    @scala.inline
    implicit class TextAlignRightSmallPropsMutableBuilder[Self <: TextAlignRightSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAlignRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignRightSmallMod.foo` */
  override def _to: ReactComponentClass[TextAlignRightSmallProps] = default
}
