package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceFrowningMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceFrowning", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FaceFrowningProps] = js.native
  
  @js.native
  trait FaceFrowningProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceFrowningProps {
    
    @scala.inline
    def apply(): FaceFrowningProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceFrowningProps]
    }
    
    @scala.inline
    implicit class FaceFrowningPropsMutableBuilder[Self <: FaceFrowningProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FaceFrowningProps]
  
  /* This means you don't have to write `default`, but can instead just say `faceFrowningMod.foo` */
  override def _to: ReactComponentClass[FaceFrowningProps] = default
}
