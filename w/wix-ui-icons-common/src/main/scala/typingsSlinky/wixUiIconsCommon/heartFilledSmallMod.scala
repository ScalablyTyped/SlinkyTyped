package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heartFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HeartFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HeartFilledSmallProps] = js.native
  
  @js.native
  trait HeartFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HeartFilledSmallProps {
    
    @scala.inline
    def apply(): HeartFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeartFilledSmallProps]
    }
    
    @scala.inline
    implicit class HeartFilledSmallPropsMutableBuilder[Self <: HeartFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HeartFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `heartFilledSmallMod.foo` */
  override def _to: ReactComponentClass[HeartFilledSmallProps] = default
}
