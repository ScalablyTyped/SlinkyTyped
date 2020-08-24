package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.cardGroupMod.CardGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardGroup {
  @JSImport("semantic-ui-react", "CardGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: CardGroupProps): SharedBuilder_CardGroupProps495383547 = new SharedBuilder_CardGroupProps495383547(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardGroup.type): SharedBuilder_CardGroupProps495383547 = new SharedBuilder_CardGroupProps495383547(js.Array(this.component, js.Dictionary.empty))()
}

