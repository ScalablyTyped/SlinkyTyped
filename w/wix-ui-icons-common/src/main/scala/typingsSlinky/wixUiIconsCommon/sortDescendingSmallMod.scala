package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortDescendingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortDescendingSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SortDescendingSmallProps] = js.native
  
  @js.native
  trait SortDescendingSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SortDescendingSmallProps {
    
    @scala.inline
    def apply(): SortDescendingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortDescendingSmallProps]
    }
    
    @scala.inline
    implicit class SortDescendingSmallPropsMutableBuilder[Self <: SortDescendingSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SortDescendingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortDescendingSmallMod.foo` */
  override def _to: ReactComponentClass[SortDescendingSmallProps] = default
}
