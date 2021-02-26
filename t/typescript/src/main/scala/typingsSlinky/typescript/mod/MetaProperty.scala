package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.ImportKeyword
import typingsSlinky.typescript.mod.SyntaxKind.NewKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaProperty extends PrimaryExpression {
  
  val keywordToken: NewKeyword | ImportKeyword = js.native
  
  @JSName("kind")
  val kind_MetaProperty: typingsSlinky.typescript.mod.SyntaxKind.MetaProperty = js.native
  
  val name: Identifier = js.native
}
