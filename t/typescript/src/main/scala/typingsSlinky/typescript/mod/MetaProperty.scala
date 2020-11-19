package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ImportKeyword
import typingsSlinky.typescript.mod.SyntaxKind.NewKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaProperty extends PrimaryExpression {
  
  var keywordToken: NewKeyword | ImportKeyword = js.native
  
  @JSName("kind")
  var kind_MetaProperty: typingsSlinky.typescript.mod.SyntaxKind.MetaProperty = js.native
  
  var name: Identifier = js.native
}
