package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.cardGroupMod.CardGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardGroup {
  
  @JSImport("semantic-ui-react", "CardGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CardGroup.type): SharedBuilder_CardGroupProps495383547 = new SharedBuilder_CardGroupProps495383547(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardGroupProps): SharedBuilder_CardGroupProps495383547 = new SharedBuilder_CardGroupProps495383547(js.Array(this.component, p.asInstanceOf[js.Any]))
}
