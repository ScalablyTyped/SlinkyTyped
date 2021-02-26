package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaLinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaLink", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaLinkProps] = js.native
  
  @js.native
  trait TextAreaLinkProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaLinkProps {
    
    @scala.inline
    def apply(): TextAreaLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaLinkProps]
    }
    
    @scala.inline
    implicit class TextAreaLinkPropsMutableBuilder[Self <: TextAreaLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaLinkMod.foo` */
  override def _to: ReactComponentClass[TextAreaLinkProps] = default
}
