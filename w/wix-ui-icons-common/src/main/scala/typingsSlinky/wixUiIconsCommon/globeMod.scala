package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Globe", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GlobeProps] = js.native
  
  @js.native
  trait GlobeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object GlobeProps {
    
    @scala.inline
    def apply(): GlobeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobeProps]
    }
    
    @scala.inline
    implicit class GlobePropsMutableBuilder[Self <: GlobeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GlobeProps]
  
  /* This means you don't have to write `default`, but can instead just say `globeMod.foo` */
  override def _to: ReactComponentClass[GlobeProps] = default
}
