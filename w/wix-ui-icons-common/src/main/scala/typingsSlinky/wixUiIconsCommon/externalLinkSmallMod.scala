package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalLinkSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ExternalLinkSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ExternalLinkSmallProps] = js.native
  
  @js.native
  trait ExternalLinkSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ExternalLinkSmallProps {
    
    @scala.inline
    def apply(): ExternalLinkSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalLinkSmallProps]
    }
    
    @scala.inline
    implicit class ExternalLinkSmallPropsMutableBuilder[Self <: ExternalLinkSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ExternalLinkSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `externalLinkSmallMod.foo` */
  override def _to: ReactComponentClass[ExternalLinkSmallProps] = default
}
