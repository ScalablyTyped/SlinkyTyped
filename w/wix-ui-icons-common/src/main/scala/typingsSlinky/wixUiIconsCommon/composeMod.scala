package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Compose", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ComposeProps] = js.native
  
  @js.native
  trait ComposeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ComposeProps {
    
    @scala.inline
    def apply(): ComposeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeProps]
    }
    
    @scala.inline
    implicit class ComposePropsMutableBuilder[Self <: ComposeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ComposeProps]
  
  /* This means you don't have to write `default`, but can instead just say `composeMod.foo` */
  override def _to: ReactComponentClass[ComposeProps] = default
}
