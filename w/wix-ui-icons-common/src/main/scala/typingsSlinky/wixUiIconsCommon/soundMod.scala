package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Sound", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SoundProps] = js.native
  
  @js.native
  trait SoundProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SoundProps {
    
    @scala.inline
    def apply(): SoundProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundProps]
    }
    
    @scala.inline
    implicit class SoundPropsMutableBuilder[Self <: SoundProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SoundProps]
  
  /* This means you don't have to write `default`, but can instead just say `soundMod.foo` */
  override def _to: ReactComponentClass[SoundProps] = default
}
