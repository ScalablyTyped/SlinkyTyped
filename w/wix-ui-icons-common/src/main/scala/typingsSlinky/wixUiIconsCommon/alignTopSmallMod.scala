package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignTopSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignTopSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AlignTopSmallProps] = js.native
  
  @js.native
  trait AlignTopSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignTopSmallProps {
    
    @scala.inline
    def apply(): AlignTopSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignTopSmallProps]
    }
    
    @scala.inline
    implicit class AlignTopSmallPropsMutableBuilder[Self <: AlignTopSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AlignTopSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignTopSmallMod.foo` */
  override def _to: ReactComponentClass[AlignTopSmallProps] = default
}
