package typingsSlinky.typescriptServices.mod.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Rules")
@js.native
class Rules ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rules

/* static members */
@JSImport("typescript-services", "Services.Formatting.Rules")
@js.native
object Rules extends js.Object {
  def IsAfterCodeBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBeforeBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBeforeMultilineBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBinaryOpContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsControlDeclContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsForContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionCallContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionCallOrNewContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionDeclContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsModuleDeclContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsMultilineBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNewContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotBinaryOpContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotForContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotFormatOnEnter(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsObjectContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsObjectTypeContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSameLineTokenContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSameLineTokenOrBeforeMultilineBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSingleLineBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsTypeArgumentOrParameter(tokenKind: SyntaxKind, parentKind: SyntaxKind): Boolean = js.native
  def IsTypeArgumentOrParameterContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsTypeScriptDeclWithBlockContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsVoidOpContext(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def NodeIsBlockContext(node: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  def NodeIsTypeScriptDeclWithBlockContext(node: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
}

