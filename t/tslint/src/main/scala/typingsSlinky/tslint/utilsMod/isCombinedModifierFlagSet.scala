package typingsSlinky.tslint.utilsMod

import typingsSlinky.typescript.mod.Declaration
import typingsSlinky.typescript.mod.ModifierFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "isCombinedModifierFlagSet")
@js.native
object isCombinedModifierFlagSet extends js.Object {
  def apply(node: Declaration, flagToCheck: ModifierFlags): Boolean = js.native
}

