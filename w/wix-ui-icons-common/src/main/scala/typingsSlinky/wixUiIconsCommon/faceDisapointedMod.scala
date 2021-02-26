package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceDisapointedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceDisapointed", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FaceDisapointedProps] = js.native
  
  @js.native
  trait FaceDisapointedProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceDisapointedProps {
    
    @scala.inline
    def apply(): FaceDisapointedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceDisapointedProps]
    }
    
    @scala.inline
    implicit class FaceDisapointedPropsMutableBuilder[Self <: FaceDisapointedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FaceDisapointedProps]
  
  /* This means you don't have to write `default`, but can instead just say `faceDisapointedMod.foo` */
  override def _to: ReactComponentClass[FaceDisapointedProps] = default
}
