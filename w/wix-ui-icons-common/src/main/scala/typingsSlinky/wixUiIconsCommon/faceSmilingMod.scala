package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceSmilingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceSmiling", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FaceSmilingProps] = js.native
  
  @js.native
  trait FaceSmilingProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceSmilingProps {
    
    @scala.inline
    def apply(): FaceSmilingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceSmilingProps]
    }
    
    @scala.inline
    implicit class FaceSmilingPropsMutableBuilder[Self <: FaceSmilingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FaceSmilingProps]
  
  /* This means you don't have to write `default`, but can instead just say `faceSmilingMod.foo` */
  override def _to: ReactComponentClass[FaceSmilingProps] = default
}
