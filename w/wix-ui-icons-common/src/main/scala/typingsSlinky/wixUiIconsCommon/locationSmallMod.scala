package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LocationSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LocationSmallProps] = js.native
  
  @js.native
  trait LocationSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LocationSmallProps {
    
    @scala.inline
    def apply(): LocationSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationSmallProps]
    }
    
    @scala.inline
    implicit class LocationSmallPropsMutableBuilder[Self <: LocationSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LocationSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `locationSmallMod.foo` */
  override def _to: ReactComponentClass[LocationSmallProps] = default
}
