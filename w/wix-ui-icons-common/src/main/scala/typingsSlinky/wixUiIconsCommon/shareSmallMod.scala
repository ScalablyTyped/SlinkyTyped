package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shareSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ShareSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ShareSmallProps] = js.native
  
  @js.native
  trait ShareSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ShareSmallProps {
    
    @scala.inline
    def apply(): ShareSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareSmallProps]
    }
    
    @scala.inline
    implicit class ShareSmallPropsMutableBuilder[Self <: ShareSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ShareSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `shareSmallMod.foo` */
  override def _to: ReactComponentClass[ShareSmallProps] = default
}
