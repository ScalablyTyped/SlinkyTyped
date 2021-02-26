package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowLeftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowLeftSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ArrowLeftSmallProps] = js.native
  
  @js.native
  trait ArrowLeftSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArrowLeftSmallProps {
    
    @scala.inline
    def apply(): ArrowLeftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowLeftSmallProps]
    }
    
    @scala.inline
    implicit class ArrowLeftSmallPropsMutableBuilder[Self <: ArrowLeftSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ArrowLeftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowLeftSmallMod.foo` */
  override def _to: ReactComponentClass[ArrowLeftSmallProps] = default
}
