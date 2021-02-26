package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextAlignRight", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAlignRightProps] = js.native
  
  @js.native
  trait TextAlignRightProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAlignRightProps {
    
    @scala.inline
    def apply(): TextAlignRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignRightProps]
    }
    
    @scala.inline
    implicit class TextAlignRightPropsMutableBuilder[Self <: TextAlignRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAlignRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignRightMod.foo` */
  override def _to: ReactComponentClass[TextAlignRightProps] = default
}
