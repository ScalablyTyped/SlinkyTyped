package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squareRatioSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SquareRatioSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SquareRatioSmallProps] = js.native
  
  @js.native
  trait SquareRatioSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SquareRatioSmallProps {
    
    @scala.inline
    def apply(): SquareRatioSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquareRatioSmallProps]
    }
    
    @scala.inline
    implicit class SquareRatioSmallPropsMutableBuilder[Self <: SquareRatioSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SquareRatioSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `squareRatioSmallMod.foo` */
  override def _to: ReactComponentClass[SquareRatioSmallProps] = default
}
