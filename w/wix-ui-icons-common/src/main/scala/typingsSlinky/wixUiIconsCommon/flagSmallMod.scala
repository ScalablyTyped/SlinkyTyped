package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FlagSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FlagSmallProps] = js.native
  
  @js.native
  trait FlagSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FlagSmallProps {
    
    @scala.inline
    def apply(): FlagSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagSmallProps]
    }
    
    @scala.inline
    implicit class FlagSmallPropsMutableBuilder[Self <: FlagSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FlagSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `flagSmallMod.foo` */
  override def _to: ReactComponentClass[FlagSmallProps] = default
}
