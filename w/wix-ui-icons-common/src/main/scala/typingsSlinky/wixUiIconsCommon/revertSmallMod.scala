package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revertSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RevertSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RevertSmallProps] = js.native
  
  @js.native
  trait RevertSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RevertSmallProps {
    
    @scala.inline
    def apply(): RevertSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevertSmallProps]
    }
    
    @scala.inline
    implicit class RevertSmallPropsMutableBuilder[Self <: RevertSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RevertSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `revertSmallMod.foo` */
  override def _to: ReactComponentClass[RevertSmallProps] = default
}
