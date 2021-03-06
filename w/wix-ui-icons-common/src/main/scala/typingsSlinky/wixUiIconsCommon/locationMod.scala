package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Location", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LocationProps] = js.native
  
  @js.native
  trait LocationProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LocationProps {
    
    @scala.inline
    def apply(): LocationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationProps]
    }
    
    @scala.inline
    implicit class LocationPropsMutableBuilder[Self <: LocationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LocationProps]
  
  /* This means you don't have to write `default`, but can instead just say `locationMod.foo` */
  override def _to: ReactComponentClass[LocationProps] = default
}
