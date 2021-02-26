package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Redo", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RedoProps] = js.native
  
  @js.native
  trait RedoProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RedoProps {
    
    @scala.inline
    def apply(): RedoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedoProps]
    }
    
    @scala.inline
    implicit class RedoPropsMutableBuilder[Self <: RedoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RedoProps]
  
  /* This means you don't have to write `default`, but can instead just say `redoMod.foo` */
  override def _to: ReactComponentClass[RedoProps] = default
}
