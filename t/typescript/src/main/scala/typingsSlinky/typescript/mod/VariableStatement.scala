package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableStatement
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  
  var declarationList: VariableDeclarationList = js.native
  
  @JSName("kind")
  var kind_VariableStatement: typingsSlinky.typescript.mod.SyntaxKind.VariableStatement = js.native
}
