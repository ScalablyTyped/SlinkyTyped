package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadExportSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UploadExportSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UploadExportSmallProps] = js.native
  
  @js.native
  trait UploadExportSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UploadExportSmallProps {
    
    @scala.inline
    def apply(): UploadExportSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadExportSmallProps]
    }
    
    @scala.inline
    implicit class UploadExportSmallPropsMutableBuilder[Self <: UploadExportSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UploadExportSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `uploadExportSmallMod.foo` */
  override def _to: ReactComponentClass[UploadExportSmallProps] = default
}
