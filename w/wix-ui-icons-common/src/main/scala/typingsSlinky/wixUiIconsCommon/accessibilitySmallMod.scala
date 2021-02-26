package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibilitySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AccessibilitySmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AccessibilitySmallProps] = js.native
  
  @js.native
  trait AccessibilitySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AccessibilitySmallProps {
    
    @scala.inline
    def apply(): AccessibilitySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessibilitySmallProps]
    }
    
    @scala.inline
    implicit class AccessibilitySmallPropsMutableBuilder[Self <: AccessibilitySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AccessibilitySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `accessibilitySmallMod.foo` */
  override def _to: ReactComponentClass[AccessibilitySmallProps] = default
}
