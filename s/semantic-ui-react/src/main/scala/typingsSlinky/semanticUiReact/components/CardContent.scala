package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.cardContentMod.CardContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardContent {
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/CardContent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CardContentProps): SharedBuilder_CardContentProps516196698 = new SharedBuilder_CardContentProps516196698(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardContent.type): SharedBuilder_CardContentProps516196698 = new SharedBuilder_CardContentProps516196698(js.Array(this.component, js.Dictionary.empty))()
}

