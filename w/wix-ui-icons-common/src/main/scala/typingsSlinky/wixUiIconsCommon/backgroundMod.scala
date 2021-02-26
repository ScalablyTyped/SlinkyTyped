package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Background", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BackgroundProps] = js.native
  
  @js.native
  trait BackgroundProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BackgroundProps {
    
    @scala.inline
    def apply(): BackgroundProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundProps]
    }
    
    @scala.inline
    implicit class BackgroundPropsMutableBuilder[Self <: BackgroundProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BackgroundProps]
  
  /* This means you don't have to write `default`, but can instead just say `backgroundMod.foo` */
  override def _to: ReactComponentClass[BackgroundProps] = default
}
