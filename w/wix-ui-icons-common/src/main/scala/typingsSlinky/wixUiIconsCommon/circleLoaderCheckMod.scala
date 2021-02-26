package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleLoaderCheckMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CircleLoaderCheck", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CircleLoaderCheckProps] = js.native
  
  @js.native
  trait CircleLoaderCheckProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CircleLoaderCheckProps {
    
    @scala.inline
    def apply(): CircleLoaderCheckProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleLoaderCheckProps]
    }
    
    @scala.inline
    implicit class CircleLoaderCheckPropsMutableBuilder[Self <: CircleLoaderCheckProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CircleLoaderCheckProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleLoaderCheckMod.foo` */
  override def _to: ReactComponentClass[CircleLoaderCheckProps] = default
}
