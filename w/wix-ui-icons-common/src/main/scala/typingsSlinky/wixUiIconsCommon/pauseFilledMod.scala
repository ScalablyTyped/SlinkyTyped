package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pauseFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PauseFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PauseFilledProps] = js.native
  
  @js.native
  trait PauseFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PauseFilledProps {
    
    @scala.inline
    def apply(): PauseFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PauseFilledProps]
    }
    
    @scala.inline
    implicit class PauseFilledPropsMutableBuilder[Self <: PauseFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PauseFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `pauseFilledMod.foo` */
  override def _to: ReactComponentClass[PauseFilledProps] = default
}
