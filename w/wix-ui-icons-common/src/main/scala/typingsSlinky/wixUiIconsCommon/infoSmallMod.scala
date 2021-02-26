package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/InfoSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InfoSmallProps] = js.native
  
  @js.native
  trait InfoSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object InfoSmallProps {
    
    @scala.inline
    def apply(): InfoSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoSmallProps]
    }
    
    @scala.inline
    implicit class InfoSmallPropsMutableBuilder[Self <: InfoSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[InfoSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoSmallMod.foo` */
  override def _to: ReactComponentClass[InfoSmallProps] = default
}
