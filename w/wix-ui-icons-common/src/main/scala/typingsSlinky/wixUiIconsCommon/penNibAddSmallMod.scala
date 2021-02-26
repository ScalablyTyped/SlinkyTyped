package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object penNibAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PenNibAddSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PenNibAddSmallProps] = js.native
  
  @js.native
  trait PenNibAddSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PenNibAddSmallProps {
    
    @scala.inline
    def apply(): PenNibAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PenNibAddSmallProps]
    }
    
    @scala.inline
    implicit class PenNibAddSmallPropsMutableBuilder[Self <: PenNibAddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PenNibAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `penNibAddSmallMod.foo` */
  override def _to: ReactComponentClass[PenNibAddSmallProps] = default
}
