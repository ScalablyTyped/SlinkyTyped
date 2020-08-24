package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.cardHeaderMod.CardHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardHeader {
  @JSImport("semantic-ui-react", "CardHeader")
  @js.native
  object component extends js.Object
  
  def withProps(p: CardHeaderProps): SharedBuilder_CardHeaderProps899634192 = new SharedBuilder_CardHeaderProps899634192(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardHeader.type): SharedBuilder_CardHeaderProps899634192 = new SharedBuilder_CardHeaderProps899634192(js.Array(this.component, js.Dictionary.empty))()
}

