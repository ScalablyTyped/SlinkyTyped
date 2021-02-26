package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pauseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Pause", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PauseProps] = js.native
  
  @js.native
  trait PauseProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PauseProps {
    
    @scala.inline
    def apply(): PauseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PauseProps]
    }
    
    @scala.inline
    implicit class PausePropsMutableBuilder[Self <: PauseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PauseProps]
  
  /* This means you don't have to write `default`, but can instead just say `pauseMod.foo` */
  override def _to: ReactComponentClass[PauseProps] = default
}
