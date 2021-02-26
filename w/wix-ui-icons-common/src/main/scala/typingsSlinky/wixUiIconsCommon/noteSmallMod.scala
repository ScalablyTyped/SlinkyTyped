package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/NoteSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NoteSmallProps] = js.native
  
  @js.native
  trait NoteSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object NoteSmallProps {
    
    @scala.inline
    def apply(): NoteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoteSmallProps]
    }
    
    @scala.inline
    implicit class NoteSmallPropsMutableBuilder[Self <: NoteSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[NoteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `noteSmallMod.foo` */
  override def _to: ReactComponentClass[NoteSmallProps] = default
}
