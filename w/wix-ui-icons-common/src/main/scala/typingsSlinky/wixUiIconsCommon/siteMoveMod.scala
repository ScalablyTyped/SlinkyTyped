package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteMoveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteMove", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SiteMoveProps] = js.native
  
  @js.native
  trait SiteMoveProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SiteMoveProps {
    
    @scala.inline
    def apply(): SiteMoveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteMoveProps]
    }
    
    @scala.inline
    implicit class SiteMovePropsMutableBuilder[Self <: SiteMoveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SiteMoveProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteMoveMod.foo` */
  override def _to: ReactComponentClass[SiteMoveProps] = default
}
