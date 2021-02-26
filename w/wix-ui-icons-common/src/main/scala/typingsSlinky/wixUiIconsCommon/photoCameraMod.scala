package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object photoCameraMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PhotoCamera", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PhotoCameraProps] = js.native
  
  @js.native
  trait PhotoCameraProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PhotoCameraProps {
    
    @scala.inline
    def apply(): PhotoCameraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhotoCameraProps]
    }
    
    @scala.inline
    implicit class PhotoCameraPropsMutableBuilder[Self <: PhotoCameraProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PhotoCameraProps]
  
  /* This means you don't have to write `default`, but can instead just say `photoCameraMod.foo` */
  override def _to: ReactComponentClass[PhotoCameraProps] = default
}
