package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squareRatioCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SquareRatioChecked", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SquareRatioCheckedProps] = js.native
  
  @js.native
  trait SquareRatioCheckedProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SquareRatioCheckedProps {
    
    @scala.inline
    def apply(): SquareRatioCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquareRatioCheckedProps]
    }
    
    @scala.inline
    implicit class SquareRatioCheckedPropsMutableBuilder[Self <: SquareRatioCheckedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SquareRatioCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `squareRatioCheckedMod.foo` */
  override def _to: ReactComponentClass[SquareRatioCheckedProps] = default
}
