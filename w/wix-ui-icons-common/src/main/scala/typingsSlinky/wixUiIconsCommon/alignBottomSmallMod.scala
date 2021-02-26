package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignBottomSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignBottomSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AlignBottomSmallProps] = js.native
  
  @js.native
  trait AlignBottomSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignBottomSmallProps {
    
    @scala.inline
    def apply(): AlignBottomSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignBottomSmallProps]
    }
    
    @scala.inline
    implicit class AlignBottomSmallPropsMutableBuilder[Self <: AlignBottomSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AlignBottomSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignBottomSmallMod.foo` */
  override def _to: ReactComponentClass[AlignBottomSmallProps] = default
}
