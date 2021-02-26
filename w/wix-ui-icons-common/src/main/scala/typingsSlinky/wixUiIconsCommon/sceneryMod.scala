package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneryMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Scenery", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SceneryProps] = js.native
  
  @js.native
  trait SceneryProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SceneryProps {
    
    @scala.inline
    def apply(): SceneryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SceneryProps]
    }
    
    @scala.inline
    implicit class SceneryPropsMutableBuilder[Self <: SceneryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SceneryProps]
  
  /* This means you don't have to write `default`, but can instead just say `sceneryMod.foo` */
  override def _to: ReactComponentClass[SceneryProps] = default
}
