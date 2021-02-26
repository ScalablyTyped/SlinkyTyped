package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.cardContentMod.CardContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardContent {
  
  @JSImport("semantic-ui-react", "CardContent")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CardContent.type): SharedBuilder_CardContentProps516196698 = new SharedBuilder_CardContentProps516196698(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardContentProps): SharedBuilder_CardContentProps516196698 = new SharedBuilder_CardContentProps516196698(js.Array(this.component, p.asInstanceOf[js.Any]))
}
