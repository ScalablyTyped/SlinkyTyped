package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Tag", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TagProps] = js.native
  
  @js.native
  trait TagProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TagProps {
    
    @scala.inline
    def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    @scala.inline
    implicit class TagPropsMutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TagProps]
  
  /* This means you don't have to write `default`, but can instead just say `tagMod.foo` */
  override def _to: ReactComponentClass[TagProps] = default
}
