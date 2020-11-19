package typingsSlinky.typescriptServices.mod.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
@js.native
class RuleDescriptor protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor {
  def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
}
/* static members */
@JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
@js.native
object RuleDescriptor extends js.Object {
  
  def create1(left: SyntaxKind, right: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  
  def create2(left: TokenRange, right: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  
  def create3(left: SyntaxKind, right: TokenRange): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  
  def create4(left: TokenRange, right: TokenRange): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
}
