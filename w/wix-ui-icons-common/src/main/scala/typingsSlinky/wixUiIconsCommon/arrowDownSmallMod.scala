package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowDownSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowDownSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ArrowDownSmallProps] = js.native
  
  @js.native
  trait ArrowDownSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArrowDownSmallProps {
    
    @scala.inline
    def apply(): ArrowDownSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownSmallProps]
    }
    
    @scala.inline
    implicit class ArrowDownSmallPropsMutableBuilder[Self <: ArrowDownSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ArrowDownSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowDownSmallMod.foo` */
  override def _to: ReactComponentClass[ArrowDownSmallProps] = default
}
