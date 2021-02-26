package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaAlignRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaAlignRight", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaAlignRightProps] = js.native
  
  @js.native
  trait TextAreaAlignRightProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaAlignRightProps {
    
    @scala.inline
    def apply(): TextAreaAlignRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignRightProps]
    }
    
    @scala.inline
    implicit class TextAreaAlignRightPropsMutableBuilder[Self <: TextAreaAlignRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaAlignRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaAlignRightMod.foo` */
  override def _to: ReactComponentClass[TextAreaAlignRightProps] = default
}
