package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.cardMetaMod.CardMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardMeta {
  @JSImport("semantic-ui-react", "CardMeta")
  @js.native
  object component extends js.Object
  
  def withProps(p: CardMetaProps): SharedBuilder_CardMetaProps_1971303307 = new SharedBuilder_CardMetaProps_1971303307(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardMeta.type): SharedBuilder_CardMetaProps_1971303307 = new SharedBuilder_CardMetaProps_1971303307(js.Array(this.component, js.Dictionary.empty))()
}

