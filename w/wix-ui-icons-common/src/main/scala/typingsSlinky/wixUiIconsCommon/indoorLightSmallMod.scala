package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indoorLightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/IndoorLightSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IndoorLightSmallProps] = js.native
  
  @js.native
  trait IndoorLightSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object IndoorLightSmallProps {
    
    @scala.inline
    def apply(): IndoorLightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndoorLightSmallProps]
    }
    
    @scala.inline
    implicit class IndoorLightSmallPropsMutableBuilder[Self <: IndoorLightSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[IndoorLightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `indoorLightSmallMod.foo` */
  override def _to: ReactComponentClass[IndoorLightSmallProps] = default
}
