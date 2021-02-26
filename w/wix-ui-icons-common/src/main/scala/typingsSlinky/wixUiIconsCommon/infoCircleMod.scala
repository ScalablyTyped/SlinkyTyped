package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/InfoCircle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InfoCircleProps] = js.native
  
  @js.native
  trait InfoCircleProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object InfoCircleProps {
    
    @scala.inline
    def apply(): InfoCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoCircleProps]
    }
    
    @scala.inline
    implicit class InfoCirclePropsMutableBuilder[Self <: InfoCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[InfoCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoCircleMod.foo` */
  override def _to: ReactComponentClass[InfoCircleProps] = default
}
