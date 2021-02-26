package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/InfoCircleSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InfoCircleSmallProps] = js.native
  
  @js.native
  trait InfoCircleSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object InfoCircleSmallProps {
    
    @scala.inline
    def apply(): InfoCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoCircleSmallProps]
    }
    
    @scala.inline
    implicit class InfoCircleSmallPropsMutableBuilder[Self <: InfoCircleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[InfoCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoCircleSmallMod.foo` */
  override def _to: ReactComponentClass[InfoCircleSmallProps] = default
}
