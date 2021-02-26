package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textJustifyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextJustify", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextJustifyProps] = js.native
  
  @js.native
  trait TextJustifyProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextJustifyProps {
    
    @scala.inline
    def apply(): TextJustifyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextJustifyProps]
    }
    
    @scala.inline
    implicit class TextJustifyPropsMutableBuilder[Self <: TextJustifyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextJustifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `textJustifyMod.foo` */
  override def _to: ReactComponentClass[TextJustifyProps] = default
}
