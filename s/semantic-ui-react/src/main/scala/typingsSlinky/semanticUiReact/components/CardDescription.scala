package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardDescription {
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/CardDescription", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CardDescriptionProps): SharedBuilder_CardDescriptionProps1426981333 = new SharedBuilder_CardDescriptionProps1426981333(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardDescription.type): SharedBuilder_CardDescriptionProps1426981333 = new SharedBuilder_CardDescriptionProps1426981333(js.Array(this.component, js.Dictionary.empty))()
}

