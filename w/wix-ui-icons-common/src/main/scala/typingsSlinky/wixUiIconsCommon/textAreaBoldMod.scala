package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaBold", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaBoldProps] = js.native
  
  @js.native
  trait TextAreaBoldProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaBoldProps {
    
    @scala.inline
    def apply(): TextAreaBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaBoldProps]
    }
    
    @scala.inline
    implicit class TextAreaBoldPropsMutableBuilder[Self <: TextAreaBoldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaBoldMod.foo` */
  override def _to: ReactComponentClass[TextAreaBoldProps] = default
}
