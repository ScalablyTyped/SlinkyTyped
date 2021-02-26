package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Upload", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UploadProps] = js.native
  
  @js.native
  trait UploadProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UploadProps {
    
    @scala.inline
    def apply(): UploadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadProps]
    }
    
    @scala.inline
    implicit class UploadPropsMutableBuilder[Self <: UploadProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UploadProps]
  
  /* This means you don't have to write `default`, but can instead just say `uploadMod.foo` */
  override def _to: ReactComponentClass[UploadProps] = default
}
