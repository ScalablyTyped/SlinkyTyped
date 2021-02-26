package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TransformSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TransformSmallProps] = js.native
  
  @js.native
  trait TransformSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TransformSmallProps {
    
    @scala.inline
    def apply(): TransformSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformSmallProps]
    }
    
    @scala.inline
    implicit class TransformSmallPropsMutableBuilder[Self <: TransformSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TransformSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `transformSmallMod.foo` */
  override def _to: ReactComponentClass[TransformSmallProps] = default
}
