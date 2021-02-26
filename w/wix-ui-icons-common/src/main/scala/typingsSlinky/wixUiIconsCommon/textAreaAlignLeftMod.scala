package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaAlignLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaAlignLeft", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaAlignLeftProps] = js.native
  
  @js.native
  trait TextAreaAlignLeftProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaAlignLeftProps {
    
    @scala.inline
    def apply(): TextAreaAlignLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignLeftProps]
    }
    
    @scala.inline
    implicit class TextAreaAlignLeftPropsMutableBuilder[Self <: TextAreaAlignLeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaAlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaAlignLeftMod.foo` */
  override def _to: ReactComponentClass[TextAreaAlignLeftProps] = default
}
