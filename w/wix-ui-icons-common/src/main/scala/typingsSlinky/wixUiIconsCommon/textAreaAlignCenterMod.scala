package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaAlignCenterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaAlignCenter", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaAlignCenterProps] = js.native
  
  @js.native
  trait TextAreaAlignCenterProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaAlignCenterProps {
    
    @scala.inline
    def apply(): TextAreaAlignCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignCenterProps]
    }
    
    @scala.inline
    implicit class TextAreaAlignCenterPropsMutableBuilder[Self <: TextAreaAlignCenterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaAlignCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaAlignCenterMod.foo` */
  override def _to: ReactComponentClass[TextAreaAlignCenterProps] = default
}
