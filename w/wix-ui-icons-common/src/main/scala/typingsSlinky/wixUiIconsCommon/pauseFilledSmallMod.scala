package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pauseFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PauseFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PauseFilledSmallProps] = js.native
  
  @js.native
  trait PauseFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PauseFilledSmallProps {
    
    @scala.inline
    def apply(): PauseFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PauseFilledSmallProps]
    }
    
    @scala.inline
    implicit class PauseFilledSmallPropsMutableBuilder[Self <: PauseFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PauseFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `pauseFilledSmallMod.foo` */
  override def _to: ReactComponentClass[PauseFilledSmallProps] = default
}
