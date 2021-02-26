package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Date", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DateProps] = js.native
  
  @js.native
  trait DateProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DateProps {
    
    @scala.inline
    def apply(): DateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateProps]
    }
    
    @scala.inline
    implicit class DatePropsMutableBuilder[Self <: DateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DateProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateMod.foo` */
  override def _to: ReactComponentClass[DateProps] = default
}
