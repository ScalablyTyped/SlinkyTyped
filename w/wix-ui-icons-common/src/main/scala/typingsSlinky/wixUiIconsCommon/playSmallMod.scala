package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PlaySmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PlaySmallProps] = js.native
  
  @js.native
  trait PlaySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PlaySmallProps {
    
    @scala.inline
    def apply(): PlaySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaySmallProps]
    }
    
    @scala.inline
    implicit class PlaySmallPropsMutableBuilder[Self <: PlaySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PlaySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `playSmallMod.foo` */
  override def _to: ReactComponentClass[PlaySmallProps] = default
}
