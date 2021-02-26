package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filtersSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FiltersSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FiltersSmallProps] = js.native
  
  @js.native
  trait FiltersSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FiltersSmallProps {
    
    @scala.inline
    def apply(): FiltersSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FiltersSmallProps]
    }
    
    @scala.inline
    implicit class FiltersSmallPropsMutableBuilder[Self <: FiltersSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FiltersSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `filtersSmallMod.foo` */
  override def _to: ReactComponentClass[FiltersSmallProps] = default
}
