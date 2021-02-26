package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaBulletListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaBulletList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextAreaBulletListProps] = js.native
  
  @js.native
  trait TextAreaBulletListProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TextAreaBulletListProps {
    
    @scala.inline
    def apply(): TextAreaBulletListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaBulletListProps]
    }
    
    @scala.inline
    implicit class TextAreaBulletListPropsMutableBuilder[Self <: TextAreaBulletListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TextAreaBulletListProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaBulletListMod.foo` */
  override def _to: ReactComponentClass[TextAreaBulletListProps] = default
}
