package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForStatement
  extends IterationStatement
     with HasInitializer {
  
  var condition: js.UndefOr[Expression] = js.native
  
  var incrementor: js.UndefOr[Expression] = js.native
  
  var initializer: js.UndefOr[ForInitializer] = js.native
  
  @JSName("kind")
  var kind_ForStatement: typingsSlinky.typescript.mod.SyntaxKind.ForStatement = js.native
}
