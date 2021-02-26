package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DatabaseSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DatabaseSmallProps] = js.native
  
  @js.native
  trait DatabaseSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DatabaseSmallProps {
    
    @scala.inline
    def apply(): DatabaseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseSmallProps]
    }
    
    @scala.inline
    implicit class DatabaseSmallPropsMutableBuilder[Self <: DatabaseSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DatabaseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `databaseSmallMod.foo` */
  override def _to: ReactComponentClass[DatabaseSmallProps] = default
}
