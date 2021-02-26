package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateAdd", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DateAddProps] = js.native
  
  @js.native
  trait DateAddProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DateAddProps {
    
    @scala.inline
    def apply(): DateAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateAddProps]
    }
    
    @scala.inline
    implicit class DateAddPropsMutableBuilder[Self <: DateAddProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DateAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateAddMod.foo` */
  override def _to: ReactComponentClass[DateAddProps] = default
}
