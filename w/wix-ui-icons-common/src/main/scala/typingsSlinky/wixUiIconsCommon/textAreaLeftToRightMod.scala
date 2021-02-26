package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaLeftToRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaLeftToRight", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaLeftToRightProps] = js.native
  
  @js.native
  trait TextAreaLeftToRightProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaLeftToRightProps {
    
    @scala.inline
    def apply(): TextAreaLeftToRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaLeftToRightProps]
    }
    
    @scala.inline
    implicit class TextAreaLeftToRightPropsMutableBuilder[Self <: TextAreaLeftToRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaLeftToRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaLeftToRightMod.foo` */
  override def _to: ReactComponentClass[TextAreaLeftToRightProps] = default
}
