package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/IntegrationsSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IntegrationsSmallProps] = js.native
  
  @js.native
  trait IntegrationsSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object IntegrationsSmallProps {
    
    @scala.inline
    def apply(): IntegrationsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationsSmallProps]
    }
    
    @scala.inline
    implicit class IntegrationsSmallPropsMutableBuilder[Self <: IntegrationsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[IntegrationsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `integrationsSmallMod.foo` */
  override def _to: ReactComponentClass[IntegrationsSmallProps] = default
}
