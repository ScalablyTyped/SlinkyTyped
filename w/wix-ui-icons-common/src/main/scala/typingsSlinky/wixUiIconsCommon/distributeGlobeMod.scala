package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeGlobeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeGlobe", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DistributeGlobeProps] = js.native
  
  @js.native
  trait DistributeGlobeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DistributeGlobeProps {
    
    @scala.inline
    def apply(): DistributeGlobeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeGlobeProps]
    }
    
    @scala.inline
    implicit class DistributeGlobePropsMutableBuilder[Self <: DistributeGlobeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DistributeGlobeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeGlobeMod.foo` */
  override def _to: ReactComponentClass[DistributeGlobeProps] = default
}
