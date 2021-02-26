package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinterestSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PinterestSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PinterestSmallProps] = js.native
  
  @js.native
  trait PinterestSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PinterestSmallProps {
    
    @scala.inline
    def apply(): PinterestSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinterestSmallProps]
    }
    
    @scala.inline
    implicit class PinterestSmallPropsMutableBuilder[Self <: PinterestSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PinterestSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `pinterestSmallMod.foo` */
  override def _to: ReactComponentClass[PinterestSmallProps] = default
}
