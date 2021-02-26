package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowUpSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowUpSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ArrowUpSmallProps] = js.native
  
  @js.native
  trait ArrowUpSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArrowUpSmallProps {
    
    @scala.inline
    def apply(): ArrowUpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowUpSmallProps]
    }
    
    @scala.inline
    implicit class ArrowUpSmallPropsMutableBuilder[Self <: ArrowUpSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ArrowUpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowUpSmallMod.foo` */
  override def _to: ReactComponentClass[ArrowUpSmallProps] = default
}
