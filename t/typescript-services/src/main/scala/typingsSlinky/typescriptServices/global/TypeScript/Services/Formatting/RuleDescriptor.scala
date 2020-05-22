package typingsSlinky.typescriptServices.global.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
@js.native
class RuleDescriptor protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor {
  def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
  /* CompleteClass */
  override var LeftTokenRange: TokenRange = js.native
  /* CompleteClass */
  override var RightTokenRange: TokenRange = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
@js.native
object RuleDescriptor extends js.Object {
  def create1(left: SyntaxKind, right: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create2(left: TokenRange, right: SyntaxKind): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create3(left: SyntaxKind, right: TokenRange): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create4(left: TokenRange, right: TokenRange): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
}

