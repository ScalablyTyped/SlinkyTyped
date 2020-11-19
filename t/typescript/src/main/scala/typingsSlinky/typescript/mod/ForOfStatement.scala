package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForOfStatement
  extends IterationStatement
     with ForInOrOfStatement
     with HasInitializer {
  
  var awaitModifier: js.UndefOr[AwaitKeywordToken] = js.native
  
  var expression: Expression = js.native
  
  var initializer: ForInitializer = js.native
  
  @JSName("kind")
  var kind_ForOfStatement: typingsSlinky.typescript.mod.SyntaxKind.ForOfStatement = js.native
}
