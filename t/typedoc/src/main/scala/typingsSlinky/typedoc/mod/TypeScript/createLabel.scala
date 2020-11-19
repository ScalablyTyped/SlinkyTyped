package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.LabeledStatement
import typingsSlinky.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createLabel")
@js.native
object createLabel extends js.Object {
  
  def apply(label: String, statement: Statement): LabeledStatement = js.native
  def apply(label: Identifier, statement: Statement): LabeledStatement = js.native
}
