package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentenceCaseSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SentenceCaseSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SentenceCaseSmallProps] = js.native
  
  @js.native
  trait SentenceCaseSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SentenceCaseSmallProps {
    
    @scala.inline
    def apply(): SentenceCaseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentenceCaseSmallProps]
    }
    
    @scala.inline
    implicit class SentenceCaseSmallPropsMutableBuilder[Self <: SentenceCaseSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SentenceCaseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sentenceCaseSmallMod.foo` */
  override def _to: ReactComponentClass[SentenceCaseSmallProps] = default
}
