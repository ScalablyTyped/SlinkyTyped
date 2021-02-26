package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceNeutral30Mod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FaceNeutral30", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FaceNeutral30Props] = js.native
  
  @js.native
  trait FaceNeutral30Props extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceNeutral30Props {
    
    @scala.inline
    def apply(): FaceNeutral30Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceNeutral30Props]
    }
    
    @scala.inline
    implicit class FaceNeutral30PropsMutableBuilder[Self <: FaceNeutral30Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FaceNeutral30Props]
  
  /* This means you don't have to write `default`, but can instead just say `faceNeutral30Mod.foo` */
  override def _to: ReactComponentClass[FaceNeutral30Props] = default
}
