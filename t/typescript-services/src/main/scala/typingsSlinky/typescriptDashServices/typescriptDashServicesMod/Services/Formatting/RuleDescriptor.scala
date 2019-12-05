package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
@js.native
class RuleDescriptor protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor {
  def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
}

/* static members */
@JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
@js.native
object RuleDescriptor extends js.Object {
  def create1(
    left: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind,
    right: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind
  ): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create2(left: TokenRange, right: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create3(left: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind, right: TokenRange): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create4(left: TokenRange, right: TokenRange): typingsSlinky.typescriptDashServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
}

