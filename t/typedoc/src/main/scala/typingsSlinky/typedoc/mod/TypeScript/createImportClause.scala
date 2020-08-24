package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.ImportClause
import typingsSlinky.typescript.mod.NamedImportBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createImportClause")
@js.native
object createImportClause extends js.Object {
  def apply(): ImportClause = js.native
  def apply(name: js.UndefOr[scala.Nothing], namedBindings: js.UndefOr[scala.Nothing], isTypeOnly: Boolean): ImportClause = js.native
  def apply(name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings): ImportClause = js.native
  def apply(name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings, isTypeOnly: Boolean): ImportClause = js.native
  def apply(name: Identifier): ImportClause = js.native
  def apply(name: Identifier, namedBindings: js.UndefOr[scala.Nothing], isTypeOnly: Boolean): ImportClause = js.native
  def apply(name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  def apply(name: Identifier, namedBindings: NamedImportBindings, isTypeOnly: Boolean): ImportClause = js.native
}

