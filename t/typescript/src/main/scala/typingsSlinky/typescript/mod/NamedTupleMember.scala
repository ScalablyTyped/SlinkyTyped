package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedTupleMember
  extends TypeNode
     with JSDocContainer
     with Declaration
     with _HasJSDoc {
  
  val dotDotDotToken: js.UndefOr[Token[typingsSlinky.typescript.mod.SyntaxKind.DotDotDotToken]] = js.native
  
  @JSName("kind")
  val kind_NamedTupleMember: typingsSlinky.typescript.mod.SyntaxKind.NamedTupleMember = js.native
  
  val name: Identifier = js.native
  
  val questionToken: js.UndefOr[Token[typingsSlinky.typescript.mod.SyntaxKind.QuestionToken]] = js.native
  
  val `type`: TypeNode = js.native
}
