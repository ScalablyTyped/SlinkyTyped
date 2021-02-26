package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorHorizontalSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MirrorHorizontalSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MirrorHorizontalSmallProps] = js.native
  
  @js.native
  trait MirrorHorizontalSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MirrorHorizontalSmallProps {
    
    @scala.inline
    def apply(): MirrorHorizontalSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MirrorHorizontalSmallProps]
    }
    
    @scala.inline
    implicit class MirrorHorizontalSmallPropsMutableBuilder[Self <: MirrorHorizontalSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MirrorHorizontalSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `mirrorHorizontalSmallMod.foo` */
  override def _to: ReactComponentClass[MirrorHorizontalSmallProps] = default
}
