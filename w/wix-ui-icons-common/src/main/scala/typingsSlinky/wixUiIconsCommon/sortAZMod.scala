package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortAZMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortAZ", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SortAZProps] = js.native
  
  @js.native
  trait SortAZProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SortAZProps {
    
    @scala.inline
    def apply(): SortAZProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortAZProps]
    }
    
    @scala.inline
    implicit class SortAZPropsMutableBuilder[Self <: SortAZProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SortAZProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortAZMod.foo` */
  override def _to: ReactComponentClass[SortAZProps] = default
}
