package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.listIconMod.ListIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListIcon {
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListIcon", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ListIconProps): SharedBuilder_ListIconProps56449996 = new SharedBuilder_ListIconProps56449996(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListIcon.type): SharedBuilder_ListIconProps56449996 = new SharedBuilder_ListIconProps56449996(js.Array(this.component, js.Dictionary.empty))()
}

