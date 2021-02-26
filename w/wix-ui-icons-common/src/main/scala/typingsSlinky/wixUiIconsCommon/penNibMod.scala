package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object penNibMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PenNib", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PenNibProps] = js.native
  
  @js.native
  trait PenNibProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PenNibProps {
    
    @scala.inline
    def apply(): PenNibProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PenNibProps]
    }
    
    @scala.inline
    implicit class PenNibPropsMutableBuilder[Self <: PenNibProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PenNibProps]
  
  /* This means you don't have to write `default`, but can instead just say `penNibMod.foo` */
  override def _to: ReactComponentClass[PenNibProps] = default
}
