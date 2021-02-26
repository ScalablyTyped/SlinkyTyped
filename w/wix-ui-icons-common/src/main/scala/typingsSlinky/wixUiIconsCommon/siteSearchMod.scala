package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteSearchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteSearch", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SiteSearchProps] = js.native
  
  @js.native
  trait SiteSearchProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SiteSearchProps {
    
    @scala.inline
    def apply(): SiteSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteSearchProps]
    }
    
    @scala.inline
    implicit class SiteSearchPropsMutableBuilder[Self <: SiteSearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SiteSearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteSearchMod.foo` */
  override def _to: ReactComponentClass[SiteSearchProps] = default
}
