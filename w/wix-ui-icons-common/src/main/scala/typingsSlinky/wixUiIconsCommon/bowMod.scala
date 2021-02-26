package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Bow", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BowProps] = js.native
  
  @js.native
  trait BowProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BowProps {
    
    @scala.inline
    def apply(): BowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BowProps]
    }
    
    @scala.inline
    implicit class BowPropsMutableBuilder[Self <: BowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BowProps]
  
  /* This means you don't have to write `default`, but can instead just say `bowMod.foo` */
  override def _to: ReactComponentClass[BowProps] = default
}
