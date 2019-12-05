package typingsSlinky.tslint.tslintMod

import typingsSlinky.typescript.typescriptMod.ModifiersArray
import typingsSlinky.typescript.typescriptMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "hasModifier")
@js.native
object hasModifier extends js.Object {
  def apply(modifierKinds: SyntaxKind*): Boolean = js.native
  def apply(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = js.native
}

