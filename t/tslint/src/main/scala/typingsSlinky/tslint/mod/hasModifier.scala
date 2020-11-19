package typingsSlinky.tslint.mod

import typingsSlinky.typescript.mod.ModifiersArray
import typingsSlinky.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "hasModifier")
@js.native
object hasModifier extends js.Object {
  
  def apply(modifiers: js.UndefOr[scala.Nothing], modifierKinds: SyntaxKind*): Boolean = js.native
  def apply(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = js.native
}
