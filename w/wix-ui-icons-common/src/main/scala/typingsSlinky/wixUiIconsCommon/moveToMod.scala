package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveToMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MoveTo", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MoveToProps] = js.native
  
  @js.native
  trait MoveToProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MoveToProps {
    
    @scala.inline
    def apply(): MoveToProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveToProps]
    }
    
    @scala.inline
    implicit class MoveToPropsMutableBuilder[Self <: MoveToProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MoveToProps]
  
  /* This means you don't have to write `default`, but can instead just say `moveToMod.foo` */
  override def _to: ReactComponentClass[MoveToProps] = default
}
