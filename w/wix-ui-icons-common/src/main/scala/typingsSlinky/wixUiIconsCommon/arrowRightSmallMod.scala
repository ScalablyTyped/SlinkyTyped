package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowRightSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ArrowRightSmallProps] = js.native
  
  @js.native
  trait ArrowRightSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArrowRightSmallProps {
    
    @scala.inline
    def apply(): ArrowRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowRightSmallProps]
    }
    
    @scala.inline
    implicit class ArrowRightSmallPropsMutableBuilder[Self <: ArrowRightSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ArrowRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowRightSmallMod.foo` */
  override def _to: ReactComponentClass[ArrowRightSmallProps] = default
}
