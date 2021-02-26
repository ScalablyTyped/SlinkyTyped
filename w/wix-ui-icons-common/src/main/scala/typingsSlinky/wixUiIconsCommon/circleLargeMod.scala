package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CircleLarge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CircleLargeProps] = js.native
  
  @js.native
  trait CircleLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CircleLargeProps {
    
    @scala.inline
    def apply(): CircleLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleLargeProps]
    }
    
    @scala.inline
    implicit class CircleLargePropsMutableBuilder[Self <: CircleLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CircleLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleLargeMod.foo` */
  override def _to: ReactComponentClass[CircleLargeProps] = default
}
