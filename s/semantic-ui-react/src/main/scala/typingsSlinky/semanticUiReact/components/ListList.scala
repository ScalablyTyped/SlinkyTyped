package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.listListListMod.ListListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListList {
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ListListProps): SharedBuilder_ListListProps15365399 = new SharedBuilder_ListListProps15365399(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListList.type): SharedBuilder_ListListProps15365399 = new SharedBuilder_ListListProps15365399(js.Array(this.component, js.Dictionary.empty))()
}

