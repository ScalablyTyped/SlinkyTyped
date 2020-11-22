package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.EntityName
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.QualifiedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createQualifiedName")
@js.native
object createQualifiedName extends js.Object {
  
  /** @deprecated Use `factory.createQualifiedName` or the factory supplied by your transformation context instead. */
  def apply(left: EntityName, right: String): QualifiedName = js.native
  def apply(left: EntityName, right: Identifier): QualifiedName = js.native
}
