package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceSmiling30Mod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FaceSmiling30", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FaceSmiling30Props] = js.native
  
  @js.native
  trait FaceSmiling30Props extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceSmiling30Props {
    
    @scala.inline
    def apply(): FaceSmiling30Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceSmiling30Props]
    }
    
    @scala.inline
    implicit class FaceSmiling30PropsMutableBuilder[Self <: FaceSmiling30Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FaceSmiling30Props]
  
  /* This means you don't have to write `default`, but can instead just say `faceSmiling30Mod.foo` */
  override def _to: ReactComponentClass[FaceSmiling30Props] = default
}
