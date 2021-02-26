package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.tableHeaderMod.StrictTableHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableFooterMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableFooter", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TableFooterProps] = js.native
  
  @js.native
  trait StrictTableFooterProps extends StrictTableHeaderProps
  object StrictTableFooterProps {
    
    @scala.inline
    def apply(): StrictTableFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableFooterProps]
    }
  }
  
  @js.native
  trait TableFooterProps
    extends StrictTableFooterProps
       with /* key */ StringDictionary[js.Any]
  object TableFooterProps {
    
    @scala.inline
    def apply(): TableFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableFooterProps]
    }
  }
  
  type _To = ReactComponentClass[TableFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableFooterMod.foo` */
  override def _to: ReactComponentClass[TableFooterProps] = default
}
