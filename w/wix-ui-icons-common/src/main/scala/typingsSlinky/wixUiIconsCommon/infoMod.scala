package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Info", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InfoProps] = js.native
  
  @js.native
  trait InfoProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object InfoProps {
    
    @scala.inline
    def apply(): InfoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoProps]
    }
    
    @scala.inline
    implicit class InfoPropsMutableBuilder[Self <: InfoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[InfoProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoMod.foo` */
  override def _to: ReactComponentClass[InfoProps] = default
}
