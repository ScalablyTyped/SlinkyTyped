package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignCenterVerticallySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignCenterVerticallySmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AlignCenterVerticallySmallProps] = js.native
  
  @js.native
  trait AlignCenterVerticallySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignCenterVerticallySmallProps {
    
    @scala.inline
    def apply(): AlignCenterVerticallySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignCenterVerticallySmallProps]
    }
    
    @scala.inline
    implicit class AlignCenterVerticallySmallPropsMutableBuilder[Self <: AlignCenterVerticallySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AlignCenterVerticallySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignCenterVerticallySmallMod.foo` */
  override def _to: ReactComponentClass[AlignCenterVerticallySmallProps] = default
}
