package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntheticExpression extends Expression {
  
  val isSpread: Boolean = js.native
  
  @JSName("kind")
  val kind_SyntheticExpression: typingsSlinky.typescript.mod.SyntaxKind.SyntheticExpression = js.native
  
  val tupleNameSource: js.UndefOr[ParameterDeclaration | NamedTupleMember] = js.native
  
  val `type`: Type = js.native
}
