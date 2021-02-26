package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TagSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TagSmallProps] = js.native
  
  @js.native
  trait TagSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TagSmallProps {
    
    @scala.inline
    def apply(): TagSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagSmallProps]
    }
    
    @scala.inline
    implicit class TagSmallPropsMutableBuilder[Self <: TagSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TagSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `tagSmallMod.foo` */
  override def _to: ReactComponentClass[TagSmallProps] = default
}
