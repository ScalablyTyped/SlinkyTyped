package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Play", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PlayProps] = js.native
  
  @js.native
  trait PlayProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PlayProps {
    
    @scala.inline
    def apply(): PlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayProps]
    }
    
    @scala.inline
    implicit class PlayPropsMutableBuilder[Self <: PlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PlayProps]
  
  /* This means you don't have to write `default`, but can instead just say `playMod.foo` */
  override def _to: ReactComponentClass[PlayProps] = default
}
