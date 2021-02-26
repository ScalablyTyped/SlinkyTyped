package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortByArrowDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SortByArrowDown", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SortByArrowDownProps] = js.native
  
  @js.native
  trait SortByArrowDownProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SortByArrowDownProps {
    
    @scala.inline
    def apply(): SortByArrowDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortByArrowDownProps]
    }
    
    @scala.inline
    implicit class SortByArrowDownPropsMutableBuilder[Self <: SortByArrowDownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SortByArrowDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortByArrowDownMod.foo` */
  override def _to: ReactComponentClass[SortByArrowDownProps] = default
}
