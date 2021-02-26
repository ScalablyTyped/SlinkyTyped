package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleLoaderCheckSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CircleLoaderCheckSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CircleLoaderCheckSmallProps] = js.native
  
  @js.native
  trait CircleLoaderCheckSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CircleLoaderCheckSmallProps {
    
    @scala.inline
    def apply(): CircleLoaderCheckSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleLoaderCheckSmallProps]
    }
    
    @scala.inline
    implicit class CircleLoaderCheckSmallPropsMutableBuilder[Self <: CircleLoaderCheckSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CircleLoaderCheckSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleLoaderCheckSmallMod.foo` */
  override def _to: ReactComponentClass[CircleLoaderCheckSmallProps] = default
}
