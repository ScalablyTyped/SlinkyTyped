package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PlayFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PlayFilledProps] = js.native
  
  @js.native
  trait PlayFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PlayFilledProps {
    
    @scala.inline
    def apply(): PlayFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayFilledProps]
    }
    
    @scala.inline
    implicit class PlayFilledPropsMutableBuilder[Self <: PlayFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PlayFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `playFilledMod.foo` */
  override def _to: ReactComponentClass[PlayFilledProps] = default
}
