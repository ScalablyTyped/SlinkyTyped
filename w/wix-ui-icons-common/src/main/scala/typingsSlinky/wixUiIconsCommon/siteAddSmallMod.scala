package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteAddSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SiteAddSmallProps] = js.native
  
  @js.native
  trait SiteAddSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SiteAddSmallProps {
    
    @scala.inline
    def apply(): SiteAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteAddSmallProps]
    }
    
    @scala.inline
    implicit class SiteAddSmallPropsMutableBuilder[Self <: SiteAddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SiteAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteAddSmallMod.foo` */
  override def _to: ReactComponentClass[SiteAddSmallProps] = default
}
