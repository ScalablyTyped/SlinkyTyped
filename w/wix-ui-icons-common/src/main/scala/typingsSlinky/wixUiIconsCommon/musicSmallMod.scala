package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MusicSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MusicSmallProps] = js.native
  
  @js.native
  trait MusicSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MusicSmallProps {
    
    @scala.inline
    def apply(): MusicSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MusicSmallProps]
    }
    
    @scala.inline
    implicit class MusicSmallPropsMutableBuilder[Self <: MusicSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MusicSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `musicSmallMod.foo` */
  override def _to: ReactComponentClass[MusicSmallProps] = default
}
