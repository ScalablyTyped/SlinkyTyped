package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignRight", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AlignRightProps] = js.native
  
  @js.native
  trait AlignRightProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignRightProps {
    
    @scala.inline
    def apply(): AlignRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignRightProps]
    }
    
    @scala.inline
    implicit class AlignRightPropsMutableBuilder[Self <: AlignRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AlignRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignRightMod.foo` */
  override def _to: ReactComponentClass[AlignRightProps] = default
}
