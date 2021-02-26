package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upperCaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UpperCase", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UpperCaseProps] = js.native
  
  @js.native
  trait UpperCaseProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UpperCaseProps {
    
    @scala.inline
    def apply(): UpperCaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpperCaseProps]
    }
    
    @scala.inline
    implicit class UpperCasePropsMutableBuilder[Self <: UpperCaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UpperCaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `upperCaseMod.foo` */
  override def _to: ReactComponentClass[UpperCaseProps] = default
}
