package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Time", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TimeProps] = js.native
  
  @js.native
  trait TimeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TimeProps {
    
    @scala.inline
    def apply(): TimeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeProps]
    }
    
    @scala.inline
    implicit class TimePropsMutableBuilder[Self <: TimeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TimeProps]
  
  /* This means you don't have to write `default`, but can instead just say `timeMod.foo` */
  override def _to: ReactComponentClass[TimeProps] = default
}
