package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabeledStatement
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  
  @JSName("kind")
  val kind_LabeledStatement: typingsSlinky.typescript.mod.SyntaxKind.LabeledStatement = js.native
  
  val label: Identifier = js.native
  
  val statement: Statement = js.native
}
