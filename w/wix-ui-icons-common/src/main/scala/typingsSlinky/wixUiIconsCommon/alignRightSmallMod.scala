package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignRightSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AlignRightSmallProps] = js.native
  
  @js.native
  trait AlignRightSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignRightSmallProps {
    
    @scala.inline
    def apply(): AlignRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignRightSmallProps]
    }
    
    @scala.inline
    implicit class AlignRightSmallPropsMutableBuilder[Self <: AlignRightSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AlignRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignRightSmallMod.foo` */
  override def _to: ReactComponentClass[AlignRightSmallProps] = default
}
