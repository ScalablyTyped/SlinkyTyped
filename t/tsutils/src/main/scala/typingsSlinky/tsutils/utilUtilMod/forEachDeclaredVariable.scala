package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.tsutils.Anon_Name
import typingsSlinky.typescript.typescriptMod.BindingElement
import typingsSlinky.typescript.typescriptMod.VariableDeclaration
import typingsSlinky.typescript.typescriptMod.VariableDeclarationList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "forEachDeclaredVariable")
@js.native
object forEachDeclaredVariable extends js.Object {
  def apply[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ (VariableDeclaration | BindingElement) with Anon_Name, T]
  ): js.UndefOr[T] = js.native
}

