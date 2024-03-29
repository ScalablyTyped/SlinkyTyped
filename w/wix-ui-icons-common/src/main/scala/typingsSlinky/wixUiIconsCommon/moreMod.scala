package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moreMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/More", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MoreProps] = js.native
  
  @js.native
  trait MoreProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MoreProps {
    
    @scala.inline
    def apply(): MoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoreProps]
    }
    
    @scala.inline
    implicit class MorePropsMutableBuilder[Self <: MoreProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MoreProps]
  
  /* This means you don't have to write `default`, but can instead just say `moreMod.foo` */
  override def _to: ReactComponentClass[MoreProps] = default
}
