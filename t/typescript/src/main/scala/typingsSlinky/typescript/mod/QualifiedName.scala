package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualifiedName
  extends EntityName
     with Node {
  
  @JSName("kind")
  val kind_QualifiedName: typingsSlinky.typescript.mod.SyntaxKind.QualifiedName = js.native
  
  val left: EntityName = js.native
  
  val right: Identifier = js.native
}
