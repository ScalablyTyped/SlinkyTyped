package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contrastSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ContrastSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ContrastSmallProps] = js.native
  
  @js.native
  trait ContrastSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ContrastSmallProps {
    
    @scala.inline
    def apply(): ContrastSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContrastSmallProps]
    }
    
    @scala.inline
    implicit class ContrastSmallPropsMutableBuilder[Self <: ContrastSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ContrastSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `contrastSmallMod.foo` */
  override def _to: ReactComponentClass[ContrastSmallProps] = default
}
