package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DistributeSmallProps] = js.native
  
  @js.native
  trait DistributeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DistributeSmallProps {
    
    @scala.inline
    def apply(): DistributeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeSmallProps]
    }
    
    @scala.inline
    implicit class DistributeSmallPropsMutableBuilder[Self <: DistributeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DistributeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeSmallMod.foo` */
  override def _to: ReactComponentClass[DistributeSmallProps] = default
}
