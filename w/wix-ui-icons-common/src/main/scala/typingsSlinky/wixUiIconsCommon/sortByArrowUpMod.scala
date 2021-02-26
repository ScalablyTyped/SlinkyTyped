package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortByArrowUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SortByArrowUp", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SortByArrowUpProps] = js.native
  
  @js.native
  trait SortByArrowUpProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SortByArrowUpProps {
    
    @scala.inline
    def apply(): SortByArrowUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortByArrowUpProps]
    }
    
    @scala.inline
    implicit class SortByArrowUpPropsMutableBuilder[Self <: SortByArrowUpProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SortByArrowUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortByArrowUpMod.foo` */
  override def _to: ReactComponentClass[SortByArrowUpProps] = default
}
