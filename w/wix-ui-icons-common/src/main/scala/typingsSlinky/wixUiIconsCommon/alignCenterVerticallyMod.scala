package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignCenterVerticallyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignCenterVertically", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AlignCenterVerticallyProps] = js.native
  
  @js.native
  trait AlignCenterVerticallyProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignCenterVerticallyProps {
    
    @scala.inline
    def apply(): AlignCenterVerticallyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignCenterVerticallyProps]
    }
    
    @scala.inline
    implicit class AlignCenterVerticallyPropsMutableBuilder[Self <: AlignCenterVerticallyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AlignCenterVerticallyProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignCenterVerticallyMod.foo` */
  override def _to: ReactComponentClass[AlignCenterVerticallyProps] = default
}
