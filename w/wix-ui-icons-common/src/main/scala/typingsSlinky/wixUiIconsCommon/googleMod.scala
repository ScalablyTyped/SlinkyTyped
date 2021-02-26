package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Google", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GoogleProps] = js.native
  
  @js.native
  trait GoogleProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object GoogleProps {
    
    @scala.inline
    def apply(): GoogleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleProps]
    }
    
    @scala.inline
    implicit class GooglePropsMutableBuilder[Self <: GoogleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GoogleProps]
  
  /* This means you don't have to write `default`, but can instead just say `googleMod.foo` */
  override def _to: ReactComponentClass[GoogleProps] = default
}
