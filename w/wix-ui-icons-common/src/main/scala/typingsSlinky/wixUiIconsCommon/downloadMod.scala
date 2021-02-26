package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Download", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DownloadProps] = js.native
  
  @js.native
  trait DownloadProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DownloadProps {
    
    @scala.inline
    def apply(): DownloadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadProps]
    }
    
    @scala.inline
    implicit class DownloadPropsMutableBuilder[Self <: DownloadProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DownloadProps]
  
  /* This means you don't have to write `default`, but can instead just say `downloadMod.foo` */
  override def _to: ReactComponentClass[DownloadProps] = default
}
