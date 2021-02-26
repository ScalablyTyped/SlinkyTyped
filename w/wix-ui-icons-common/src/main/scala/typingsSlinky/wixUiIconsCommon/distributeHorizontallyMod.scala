package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeHorizontallyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeHorizontally", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DistributeHorizontallyProps] = js.native
  
  @js.native
  trait DistributeHorizontallyProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DistributeHorizontallyProps {
    
    @scala.inline
    def apply(): DistributeHorizontallyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeHorizontallyProps]
    }
    
    @scala.inline
    implicit class DistributeHorizontallyPropsMutableBuilder[Self <: DistributeHorizontallyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DistributeHorizontallyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeHorizontallyMod.foo` */
  override def _to: ReactComponentClass[DistributeHorizontallyProps] = default
}
