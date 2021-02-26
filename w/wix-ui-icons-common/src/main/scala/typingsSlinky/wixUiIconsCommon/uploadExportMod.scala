package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadExportMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UploadExport", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UploadExportProps] = js.native
  
  @js.native
  trait UploadExportProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UploadExportProps {
    
    @scala.inline
    def apply(): UploadExportProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadExportProps]
    }
    
    @scala.inline
    implicit class UploadExportPropsMutableBuilder[Self <: UploadExportProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UploadExportProps]
  
  /* This means you don't have to write `default`, but can instead just say `uploadExportMod.foo` */
  override def _to: ReactComponentClass[UploadExportProps] = default
}
