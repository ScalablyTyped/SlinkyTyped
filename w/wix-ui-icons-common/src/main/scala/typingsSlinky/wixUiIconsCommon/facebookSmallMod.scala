package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebookSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FacebookSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FacebookSmallProps] = js.native
  
  @js.native
  trait FacebookSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FacebookSmallProps {
    
    @scala.inline
    def apply(): FacebookSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacebookSmallProps]
    }
    
    @scala.inline
    implicit class FacebookSmallPropsMutableBuilder[Self <: FacebookSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FacebookSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `facebookSmallMod.foo` */
  override def _to: ReactComponentClass[FacebookSmallProps] = default
}
