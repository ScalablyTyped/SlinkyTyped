package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbsUpFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ThumbsUpFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ThumbsUpFilledSmallProps] = js.native
  
  @js.native
  trait ThumbsUpFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ThumbsUpFilledSmallProps {
    
    @scala.inline
    def apply(): ThumbsUpFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsUpFilledSmallProps]
    }
    
    @scala.inline
    implicit class ThumbsUpFilledSmallPropsMutableBuilder[Self <: ThumbsUpFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ThumbsUpFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `thumbsUpFilledSmallMod.foo` */
  override def _to: ReactComponentClass[ThumbsUpFilledSmallProps] = default
}
