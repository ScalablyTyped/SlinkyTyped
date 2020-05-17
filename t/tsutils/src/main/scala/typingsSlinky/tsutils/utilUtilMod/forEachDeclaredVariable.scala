package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.tsutils.anon.Name
import typingsSlinky.typescript.mod.BindingElement
import typingsSlinky.typescript.mod.VariableDeclaration
import typingsSlinky.typescript.mod.VariableDeclarationList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "forEachDeclaredVariable")
@js.native
object forEachDeclaredVariable extends js.Object {
  def apply[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ (VariableDeclaration | BindingElement) with Name, T]
  ): js.UndefOr[T] = js.native
}

