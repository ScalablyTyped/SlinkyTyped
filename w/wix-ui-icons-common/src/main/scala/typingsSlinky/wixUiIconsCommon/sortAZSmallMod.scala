package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortAZSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortAZSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SortAZSmallProps] = js.native
  
  @js.native
  trait SortAZSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SortAZSmallProps {
    
    @scala.inline
    def apply(): SortAZSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortAZSmallProps]
    }
    
    @scala.inline
    implicit class SortAZSmallPropsMutableBuilder[Self <: SortAZSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SortAZSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortAZSmallMod.foo` */
  override def _to: ReactComponentClass[SortAZSmallProps] = default
}
