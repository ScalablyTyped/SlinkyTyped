package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object duplicateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Duplicate", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DuplicateProps] = js.native
  
  @js.native
  trait DuplicateProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DuplicateProps {
    
    @scala.inline
    def apply(): DuplicateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplicateProps]
    }
    
    @scala.inline
    implicit class DuplicatePropsMutableBuilder[Self <: DuplicateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DuplicateProps]
  
  /* This means you don't have to write `default`, but can instead just say `duplicateMod.foo` */
  override def _to: ReactComponentClass[DuplicateProps] = default
}
