package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleSmallFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CircleSmallFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CircleSmallFilledProps] = js.native
  
  @js.native
  trait CircleSmallFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CircleSmallFilledProps {
    
    @scala.inline
    def apply(): CircleSmallFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleSmallFilledProps]
    }
    
    @scala.inline
    implicit class CircleSmallFilledPropsMutableBuilder[Self <: CircleSmallFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CircleSmallFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleSmallFilledMod.foo` */
  override def _to: ReactComponentClass[CircleSmallFilledProps] = default
}
