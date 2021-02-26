package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceFemaleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceFemale", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FaceFemaleProps] = js.native
  
  @js.native
  trait FaceFemaleProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceFemaleProps {
    
    @scala.inline
    def apply(): FaceFemaleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceFemaleProps]
    }
    
    @scala.inline
    implicit class FaceFemalePropsMutableBuilder[Self <: FaceFemaleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FaceFemaleProps]
  
  /* This means you don't have to write `default`, but can instead just say `faceFemaleMod.foo` */
  override def _to: ReactComponentClass[FaceFemaleProps] = default
}
