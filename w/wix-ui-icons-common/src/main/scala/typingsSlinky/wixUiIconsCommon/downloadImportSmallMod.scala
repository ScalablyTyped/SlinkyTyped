package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadImportSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DownloadImportSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DownloadImportSmallProps] = js.native
  
  @js.native
  trait DownloadImportSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DownloadImportSmallProps {
    
    @scala.inline
    def apply(): DownloadImportSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadImportSmallProps]
    }
    
    @scala.inline
    implicit class DownloadImportSmallPropsMutableBuilder[Self <: DownloadImportSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DownloadImportSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `downloadImportSmallMod.foo` */
  override def _to: ReactComponentClass[DownloadImportSmallProps] = default
}
