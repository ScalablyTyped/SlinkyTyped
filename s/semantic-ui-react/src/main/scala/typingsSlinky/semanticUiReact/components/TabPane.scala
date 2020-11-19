package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.tabPaneMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPane {
  
  @JSImport("semantic-ui-react", "TabPane")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps1810713740 = new SharedBuilder_TabPaneProps1810713740(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TabPane.type): SharedBuilder_TabPaneProps1810713740 = new SharedBuilder_TabPaneProps1810713740(js.Array(this.component, js.Dictionary.empty))()
}
