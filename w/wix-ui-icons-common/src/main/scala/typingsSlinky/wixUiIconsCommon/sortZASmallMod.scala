package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortZASmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortZASmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SortZASmallProps] = js.native
  
  @js.native
  trait SortZASmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SortZASmallProps {
    
    @scala.inline
    def apply(): SortZASmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortZASmallProps]
    }
    
    @scala.inline
    implicit class SortZASmallPropsMutableBuilder[Self <: SortZASmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SortZASmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortZASmallMod.foo` */
  override def _to: ReactComponentClass[SortZASmallProps] = default
}
