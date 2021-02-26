package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unionSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UnionSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UnionSmallProps] = js.native
  
  @js.native
  trait UnionSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UnionSmallProps {
    
    @scala.inline
    def apply(): UnionSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnionSmallProps]
    }
    
    @scala.inline
    implicit class UnionSmallPropsMutableBuilder[Self <: UnionSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UnionSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `unionSmallMod.foo` */
  override def _to: ReactComponentClass[UnionSmallProps] = default
}
