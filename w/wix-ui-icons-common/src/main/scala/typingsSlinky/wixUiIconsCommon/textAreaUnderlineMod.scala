package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaUnderlineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaUnderline", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaUnderlineProps] = js.native
  
  @js.native
  trait TextAreaUnderlineProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaUnderlineProps {
    
    @scala.inline
    def apply(): TextAreaUnderlineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaUnderlineProps]
    }
    
    @scala.inline
    implicit class TextAreaUnderlinePropsMutableBuilder[Self <: TextAreaUnderlineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaUnderlineProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaUnderlineMod.foo` */
  override def _to: ReactComponentClass[TextAreaUnderlineProps] = default
}
