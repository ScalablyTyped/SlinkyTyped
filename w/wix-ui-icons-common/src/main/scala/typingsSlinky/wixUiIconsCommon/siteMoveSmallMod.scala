package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteMoveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteMoveSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SiteMoveSmallProps] = js.native
  
  @js.native
  trait SiteMoveSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SiteMoveSmallProps {
    
    @scala.inline
    def apply(): SiteMoveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteMoveSmallProps]
    }
    
    @scala.inline
    implicit class SiteMoveSmallPropsMutableBuilder[Self <: SiteMoveSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SiteMoveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteMoveSmallMod.foo` */
  override def _to: ReactComponentClass[SiteMoveSmallProps] = default
}
