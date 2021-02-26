package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contrastMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Contrast", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ContrastProps] = js.native
  
  @js.native
  trait ContrastProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ContrastProps {
    
    @scala.inline
    def apply(): ContrastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContrastProps]
    }
    
    @scala.inline
    implicit class ContrastPropsMutableBuilder[Self <: ContrastProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ContrastProps]
  
  /* This means you don't have to write `default`, but can instead just say `contrastMod.foo` */
  override def _to: ReactComponentClass[ContrastProps] = default
}
