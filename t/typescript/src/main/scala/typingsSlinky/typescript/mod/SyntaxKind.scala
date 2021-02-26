package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("typescript", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
  
  @js.native
  sealed trait AbstractKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 125 */ val AbstractKeyword: typingsSlinky.typescript.mod.SyntaxKind.AbstractKeyword with Double = js.native
  
  @js.native
  sealed trait AmpersandAmpersandEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 75 */ val AmpersandAmpersandEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.AmpersandAmpersandEqualsToken with Double = js.native
  
  @js.native
  sealed trait AmpersandAmpersandToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with LogicalOperator
  /* 55 */ val AmpersandAmpersandToken: typingsSlinky.typescript.mod.SyntaxKind.AmpersandAmpersandToken with Double = js.native
  
  @js.native
  sealed trait AmpersandEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 72 */ val AmpersandEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.AmpersandEqualsToken with Double = js.native
  
  @js.native
  sealed trait AmpersandToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 50 */ val AmpersandToken: typingsSlinky.typescript.mod.SyntaxKind.AmpersandToken with Double = js.native
  
  @js.native
  sealed trait AnyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 128 */ val AnyKeyword: typingsSlinky.typescript.mod.SyntaxKind.AnyKeyword with Double = js.native
  
  @js.native
  sealed trait ArrayBindingPattern extends SyntaxKind
  /* 197 */ val ArrayBindingPattern: typingsSlinky.typescript.mod.SyntaxKind.ArrayBindingPattern with Double = js.native
  
  @js.native
  sealed trait ArrayLiteralExpression extends SyntaxKind
  /* 199 */ val ArrayLiteralExpression: typingsSlinky.typescript.mod.SyntaxKind.ArrayLiteralExpression with Double = js.native
  
  @js.native
  sealed trait ArrayType extends SyntaxKind
  /* 178 */ val ArrayType: typingsSlinky.typescript.mod.SyntaxKind.ArrayType with Double = js.native
  
  @js.native
  sealed trait ArrowFunction extends SyntaxKind
  /* 209 */ val ArrowFunction: typingsSlinky.typescript.mod.SyntaxKind.ArrowFunction with Double = js.native
  
  @js.native
  sealed trait AsExpression extends SyntaxKind
  /* 224 */ val AsExpression: typingsSlinky.typescript.mod.SyntaxKind.AsExpression with Double = js.native
  
  @js.native
  sealed trait AsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 126 */ val AsKeyword: typingsSlinky.typescript.mod.SyntaxKind.AsKeyword with Double = js.native
  
  @js.native
  sealed trait AssertsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 127 */ val AssertsKeyword: typingsSlinky.typescript.mod.SyntaxKind.AssertsKeyword with Double = js.native
  
  @js.native
  sealed trait AsteriskAsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 66 */ val AsteriskAsteriskEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.AsteriskAsteriskEqualsToken with Double = js.native
  
  @js.native
  sealed trait AsteriskAsteriskToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 42 */ val AsteriskAsteriskToken: typingsSlinky.typescript.mod.SyntaxKind.AsteriskAsteriskToken with Double = js.native
  
  @js.native
  sealed trait AsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 65 */ val AsteriskEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.AsteriskEqualsToken with Double = js.native
  
  @js.native
  sealed trait AsteriskToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with MultiplicativeOperator
  /* 41 */ val AsteriskToken: typingsSlinky.typescript.mod.SyntaxKind.AsteriskToken with Double = js.native
  
  @js.native
  sealed trait AsyncKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 129 */ val AsyncKeyword: typingsSlinky.typescript.mod.SyntaxKind.AsyncKeyword with Double = js.native
  
  @js.native
  sealed trait AtToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 59 */ val AtToken: typingsSlinky.typescript.mod.SyntaxKind.AtToken with Double = js.native
  
  @js.native
  sealed trait AwaitExpression extends SyntaxKind
  /* 213 */ val AwaitExpression: typingsSlinky.typescript.mod.SyntaxKind.AwaitExpression with Double = js.native
  
  @js.native
  sealed trait AwaitKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 130 */ val AwaitKeyword: typingsSlinky.typescript.mod.SyntaxKind.AwaitKeyword with Double = js.native
  
  /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
  @js.native
  sealed trait BacktickToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 61 */ val BacktickToken: typingsSlinky.typescript.mod.SyntaxKind.BacktickToken with Double = js.native
  
  @js.native
  sealed trait BarBarEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 74 */ val BarBarEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.BarBarEqualsToken with Double = js.native
  
  @js.native
  sealed trait BarBarToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with LogicalOperator
  /* 56 */ val BarBarToken: typingsSlinky.typescript.mod.SyntaxKind.BarBarToken with Double = js.native
  
  @js.native
  sealed trait BarEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 73 */ val BarEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.BarEqualsToken with Double = js.native
  
  @js.native
  sealed trait BarToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 51 */ val BarToken: typingsSlinky.typescript.mod.SyntaxKind.BarToken with Double = js.native
  
  @js.native
  sealed trait BigIntKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 155 */ val BigIntKeyword: typingsSlinky.typescript.mod.SyntaxKind.BigIntKeyword with Double = js.native
  
  @js.native
  sealed trait BigIntLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 9 */ val BigIntLiteral: typingsSlinky.typescript.mod.SyntaxKind.BigIntLiteral with Double = js.native
  
  @js.native
  sealed trait BinaryExpression extends SyntaxKind
  /* 216 */ val BinaryExpression: typingsSlinky.typescript.mod.SyntaxKind.BinaryExpression with Double = js.native
  
  @js.native
  sealed trait BindingElement extends SyntaxKind
  /* 198 */ val BindingElement: typingsSlinky.typescript.mod.SyntaxKind.BindingElement with Double = js.native
  
  @js.native
  sealed trait Block extends SyntaxKind
  /* 230 */ val Block: typingsSlinky.typescript.mod.SyntaxKind.Block with Double = js.native
  
  @js.native
  sealed trait BooleanKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 131 */ val BooleanKeyword: typingsSlinky.typescript.mod.SyntaxKind.BooleanKeyword with Double = js.native
  
  @js.native
  sealed trait BreakKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 80 */ val BreakKeyword: typingsSlinky.typescript.mod.SyntaxKind.BreakKeyword with Double = js.native
  
  @js.native
  sealed trait BreakStatement extends SyntaxKind
  /* 241 */ val BreakStatement: typingsSlinky.typescript.mod.SyntaxKind.BreakStatement with Double = js.native
  
  @js.native
  sealed trait Bundle extends SyntaxKind
  /* 298 */ val Bundle: typingsSlinky.typescript.mod.SyntaxKind.Bundle with Double = js.native
  
  @js.native
  sealed trait CallExpression extends SyntaxKind
  /* 203 */ val CallExpression: typingsSlinky.typescript.mod.SyntaxKind.CallExpression with Double = js.native
  
  @js.native
  sealed trait CallSignature extends SyntaxKind
  /* 169 */ val CallSignature: typingsSlinky.typescript.mod.SyntaxKind.CallSignature with Double = js.native
  
  @js.native
  sealed trait CaretEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 77 */ val CaretEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.CaretEqualsToken with Double = js.native
  
  @js.native
  sealed trait CaretToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 52 */ val CaretToken: typingsSlinky.typescript.mod.SyntaxKind.CaretToken with Double = js.native
  
  @js.native
  sealed trait CaseBlock extends SyntaxKind
  /* 258 */ val CaseBlock: typingsSlinky.typescript.mod.SyntaxKind.CaseBlock with Double = js.native
  
  @js.native
  sealed trait CaseClause extends SyntaxKind
  /* 284 */ val CaseClause: typingsSlinky.typescript.mod.SyntaxKind.CaseClause with Double = js.native
  
  @js.native
  sealed trait CaseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 81 */ val CaseKeyword: typingsSlinky.typescript.mod.SyntaxKind.CaseKeyword with Double = js.native
  
  @js.native
  sealed trait CatchClause extends SyntaxKind
  /* 287 */ val CatchClause: typingsSlinky.typescript.mod.SyntaxKind.CatchClause with Double = js.native
  
  @js.native
  sealed trait CatchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 82 */ val CatchKeyword: typingsSlinky.typescript.mod.SyntaxKind.CatchKeyword with Double = js.native
  
  @js.native
  sealed trait ClassDeclaration extends SyntaxKind
  /* 252 */ val ClassDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ClassDeclaration with Double = js.native
  
  @js.native
  sealed trait ClassExpression extends SyntaxKind
  /* 221 */ val ClassExpression: typingsSlinky.typescript.mod.SyntaxKind.ClassExpression with Double = js.native
  
  @js.native
  sealed trait ClassKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 83 */ val ClassKeyword: typingsSlinky.typescript.mod.SyntaxKind.ClassKeyword with Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 19 */ val CloseBraceToken: typingsSlinky.typescript.mod.SyntaxKind.CloseBraceToken with Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 23 */ val CloseBracketToken: typingsSlinky.typescript.mod.SyntaxKind.CloseBracketToken with Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 21 */ val CloseParenToken: typingsSlinky.typescript.mod.SyntaxKind.CloseParenToken with Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 58 */ val ColonToken: typingsSlinky.typescript.mod.SyntaxKind.ColonToken with Double = js.native
  
  @js.native
  sealed trait CommaListExpression extends SyntaxKind
  /* 337 */ val CommaListExpression: typingsSlinky.typescript.mod.SyntaxKind.CommaListExpression with Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with _BinaryOperator
  /* 27 */ val CommaToken: typingsSlinky.typescript.mod.SyntaxKind.CommaToken with Double = js.native
  
  @js.native
  sealed trait ComputedPropertyName extends SyntaxKind
  /* 158 */ val ComputedPropertyName: typingsSlinky.typescript.mod.SyntaxKind.ComputedPropertyName with Double = js.native
  
  @js.native
  sealed trait ConditionalExpression extends SyntaxKind
  /* 217 */ val ConditionalExpression: typingsSlinky.typescript.mod.SyntaxKind.ConditionalExpression with Double = js.native
  
  @js.native
  sealed trait ConditionalType extends SyntaxKind
  /* 184 */ val ConditionalType: typingsSlinky.typescript.mod.SyntaxKind.ConditionalType with Double = js.native
  
  @js.native
  sealed trait ConflictMarkerTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 7 */ val ConflictMarkerTrivia: typingsSlinky.typescript.mod.SyntaxKind.ConflictMarkerTrivia with Double = js.native
  
  @js.native
  sealed trait ConstKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 84 */ val ConstKeyword: typingsSlinky.typescript.mod.SyntaxKind.ConstKeyword with Double = js.native
  
  @js.native
  sealed trait ConstructSignature extends SyntaxKind
  /* 170 */ val ConstructSignature: typingsSlinky.typescript.mod.SyntaxKind.ConstructSignature with Double = js.native
  
  @js.native
  sealed trait Constructor extends SyntaxKind
  /* 166 */ val Constructor: typingsSlinky.typescript.mod.SyntaxKind.Constructor with Double = js.native
  
  @js.native
  sealed trait ConstructorKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 132 */ val ConstructorKeyword: typingsSlinky.typescript.mod.SyntaxKind.ConstructorKeyword with Double = js.native
  
  @js.native
  sealed trait ConstructorType extends SyntaxKind
  /* 175 */ val ConstructorType: typingsSlinky.typescript.mod.SyntaxKind.ConstructorType with Double = js.native
  
  @js.native
  sealed trait ContinueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 85 */ val ContinueKeyword: typingsSlinky.typescript.mod.SyntaxKind.ContinueKeyword with Double = js.native
  
  @js.native
  sealed trait ContinueStatement extends SyntaxKind
  /* 240 */ val ContinueStatement: typingsSlinky.typescript.mod.SyntaxKind.ContinueStatement with Double = js.native
  
  @js.native
  sealed trait Count extends SyntaxKind
  /* 341 */ val Count: typingsSlinky.typescript.mod.SyntaxKind.Count with Double = js.native
  
  @js.native
  sealed trait DebuggerKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 86 */ val DebuggerKeyword: typingsSlinky.typescript.mod.SyntaxKind.DebuggerKeyword with Double = js.native
  
  @js.native
  sealed trait DebuggerStatement extends SyntaxKind
  /* 248 */ val DebuggerStatement: typingsSlinky.typescript.mod.SyntaxKind.DebuggerStatement with Double = js.native
  
  @js.native
  sealed trait DeclareKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 133 */ val DeclareKeyword: typingsSlinky.typescript.mod.SyntaxKind.DeclareKeyword with Double = js.native
  
  @js.native
  sealed trait Decorator extends SyntaxKind
  /* 161 */ val Decorator: typingsSlinky.typescript.mod.SyntaxKind.Decorator with Double = js.native
  
  @js.native
  sealed trait DefaultClause extends SyntaxKind
  /* 285 */ val DefaultClause: typingsSlinky.typescript.mod.SyntaxKind.DefaultClause with Double = js.native
  
  @js.native
  sealed trait DefaultKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 87 */ val DefaultKeyword: typingsSlinky.typescript.mod.SyntaxKind.DefaultKeyword with Double = js.native
  
  @js.native
  sealed trait DeleteExpression extends SyntaxKind
  /* 210 */ val DeleteExpression: typingsSlinky.typescript.mod.SyntaxKind.DeleteExpression with Double = js.native
  
  @js.native
  sealed trait DeleteKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 88 */ val DeleteKeyword: typingsSlinky.typescript.mod.SyntaxKind.DeleteKeyword with Double = js.native
  
  @js.native
  sealed trait DoKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 89 */ val DoKeyword: typingsSlinky.typescript.mod.SyntaxKind.DoKeyword with Double = js.native
  
  @js.native
  sealed trait DoStatement extends SyntaxKind
  /* 235 */ val DoStatement: typingsSlinky.typescript.mod.SyntaxKind.DoStatement with Double = js.native
  
  @js.native
  sealed trait DotDotDotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 25 */ val DotDotDotToken: typingsSlinky.typescript.mod.SyntaxKind.DotDotDotToken with Double = js.native
  
  @js.native
  sealed trait DotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 24 */ val DotToken: typingsSlinky.typescript.mod.SyntaxKind.DotToken with Double = js.native
  
  @js.native
  sealed trait ElementAccessExpression extends SyntaxKind
  /* 202 */ val ElementAccessExpression: typingsSlinky.typescript.mod.SyntaxKind.ElementAccessExpression with Double = js.native
  
  @js.native
  sealed trait ElseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 90 */ val ElseKeyword: typingsSlinky.typescript.mod.SyntaxKind.ElseKeyword with Double = js.native
  
  @js.native
  sealed trait EmptyStatement extends SyntaxKind
  /* 231 */ val EmptyStatement: typingsSlinky.typescript.mod.SyntaxKind.EmptyStatement with Double = js.native
  
  @js.native
  sealed trait EndOfDeclarationMarker extends SyntaxKind
  /* 339 */ val EndOfDeclarationMarker: typingsSlinky.typescript.mod.SyntaxKind.EndOfDeclarationMarker with Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with TokenSyntaxKind
  /* 1 */ val EndOfFileToken: typingsSlinky.typescript.mod.SyntaxKind.EndOfFileToken with Double = js.native
  
  @js.native
  sealed trait EnumDeclaration extends SyntaxKind
  /* 255 */ val EnumDeclaration: typingsSlinky.typescript.mod.SyntaxKind.EnumDeclaration with Double = js.native
  
  @js.native
  sealed trait EnumKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 91 */ val EnumKeyword: typingsSlinky.typescript.mod.SyntaxKind.EnumKeyword with Double = js.native
  
  @js.native
  sealed trait EnumMember extends SyntaxKind
  /* 291 */ val EnumMember: typingsSlinky.typescript.mod.SyntaxKind.EnumMember with Double = js.native
  
  @js.native
  sealed trait EqualsEqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 36 */ val EqualsEqualsEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.EqualsEqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 34 */ val EqualsEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.EqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait EqualsGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 38 */ val EqualsGreaterThanToken: typingsSlinky.typescript.mod.SyntaxKind.EqualsGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends AssignmentOperator
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 62 */ val EqualsToken: typingsSlinky.typescript.mod.SyntaxKind.EqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 37 */ val ExclamationEqualsEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.ExclamationEqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 35 */ val ExclamationEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.ExclamationEqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PrefixUnaryOperator
  /* 53 */ val ExclamationToken: typingsSlinky.typescript.mod.SyntaxKind.ExclamationToken with Double = js.native
  
  @js.native
  sealed trait ExportAssignment extends SyntaxKind
  /* 266 */ val ExportAssignment: typingsSlinky.typescript.mod.SyntaxKind.ExportAssignment with Double = js.native
  
  @js.native
  sealed trait ExportDeclaration extends SyntaxKind
  /* 267 */ val ExportDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ExportDeclaration with Double = js.native
  
  @js.native
  sealed trait ExportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 92 */ val ExportKeyword: typingsSlinky.typescript.mod.SyntaxKind.ExportKeyword with Double = js.native
  
  @js.native
  sealed trait ExportSpecifier extends SyntaxKind
  /* 270 */ val ExportSpecifier: typingsSlinky.typescript.mod.SyntaxKind.ExportSpecifier with Double = js.native
  
  @js.native
  sealed trait ExpressionStatement extends SyntaxKind
  /* 233 */ val ExpressionStatement: typingsSlinky.typescript.mod.SyntaxKind.ExpressionStatement with Double = js.native
  
  @js.native
  sealed trait ExpressionWithTypeArguments extends SyntaxKind
  /* 223 */ val ExpressionWithTypeArguments: typingsSlinky.typescript.mod.SyntaxKind.ExpressionWithTypeArguments with Double = js.native
  
  @js.native
  sealed trait ExtendsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 93 */ val ExtendsKeyword: typingsSlinky.typescript.mod.SyntaxKind.ExtendsKeyword with Double = js.native
  
  @js.native
  sealed trait ExternalModuleReference extends SyntaxKind
  /* 272 */ val ExternalModuleReference: typingsSlinky.typescript.mod.SyntaxKind.ExternalModuleReference with Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 94 */ val FalseKeyword: typingsSlinky.typescript.mod.SyntaxKind.FalseKeyword with Double = js.native
  
  @js.native
  sealed trait FinallyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 95 */ val FinallyKeyword: typingsSlinky.typescript.mod.SyntaxKind.FinallyKeyword with Double = js.native
  
  @js.native
  sealed trait FirstAssignment extends SyntaxKind
  /* 62 */ val FirstAssignment: typingsSlinky.typescript.mod.SyntaxKind.FirstAssignment with Double = js.native
  
  @js.native
  sealed trait FirstBinaryOperator extends SyntaxKind
  /* 29 */ val FirstBinaryOperator: typingsSlinky.typescript.mod.SyntaxKind.FirstBinaryOperator with Double = js.native
  
  @js.native
  sealed trait FirstCompoundAssignment extends SyntaxKind
  /* 63 */ val FirstCompoundAssignment: typingsSlinky.typescript.mod.SyntaxKind.FirstCompoundAssignment with Double = js.native
  
  @js.native
  sealed trait FirstFutureReservedWord extends SyntaxKind
  /* 116 */ val FirstFutureReservedWord: typingsSlinky.typescript.mod.SyntaxKind.FirstFutureReservedWord with Double = js.native
  
  @js.native
  sealed trait FirstJSDocNode extends SyntaxKind
  /* 301 */ val FirstJSDocNode: typingsSlinky.typescript.mod.SyntaxKind.FirstJSDocNode with Double = js.native
  
  @js.native
  sealed trait FirstJSDocTagNode extends SyntaxKind
  /* 314 */ val FirstJSDocTagNode: typingsSlinky.typescript.mod.SyntaxKind.FirstJSDocTagNode with Double = js.native
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  /* 80 */ val FirstKeyword: typingsSlinky.typescript.mod.SyntaxKind.FirstKeyword with Double = js.native
  
  @js.native
  sealed trait FirstLiteralToken extends SyntaxKind
  /* 8 */ val FirstLiteralToken: typingsSlinky.typescript.mod.SyntaxKind.FirstLiteralToken with Double = js.native
  
  @js.native
  sealed trait FirstNode extends SyntaxKind
  /* 157 */ val FirstNode: typingsSlinky.typescript.mod.SyntaxKind.FirstNode with Double = js.native
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  /* 18 */ val FirstPunctuation: typingsSlinky.typescript.mod.SyntaxKind.FirstPunctuation with Double = js.native
  
  @js.native
  sealed trait FirstReservedWord extends SyntaxKind
  /* 80 */ val FirstReservedWord: typingsSlinky.typescript.mod.SyntaxKind.FirstReservedWord with Double = js.native
  
  @js.native
  sealed trait FirstStatement extends SyntaxKind
  /* 232 */ val FirstStatement: typingsSlinky.typescript.mod.SyntaxKind.FirstStatement with Double = js.native
  
  @js.native
  sealed trait FirstTemplateToken extends SyntaxKind
  /* 14 */ val FirstTemplateToken: typingsSlinky.typescript.mod.SyntaxKind.FirstTemplateToken with Double = js.native
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  /* 0 */ val FirstToken: typingsSlinky.typescript.mod.SyntaxKind.FirstToken with Double = js.native
  
  @js.native
  sealed trait FirstTriviaToken extends SyntaxKind
  /* 2 */ val FirstTriviaToken: typingsSlinky.typescript.mod.SyntaxKind.FirstTriviaToken with Double = js.native
  
  @js.native
  sealed trait FirstTypeNode extends SyntaxKind
  /* 172 */ val FirstTypeNode: typingsSlinky.typescript.mod.SyntaxKind.FirstTypeNode with Double = js.native
  
  @js.native
  sealed trait ForInStatement extends SyntaxKind
  /* 238 */ val ForInStatement: typingsSlinky.typescript.mod.SyntaxKind.ForInStatement with Double = js.native
  
  @js.native
  sealed trait ForKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 96 */ val ForKeyword: typingsSlinky.typescript.mod.SyntaxKind.ForKeyword with Double = js.native
  
  @js.native
  sealed trait ForOfStatement extends SyntaxKind
  /* 239 */ val ForOfStatement: typingsSlinky.typescript.mod.SyntaxKind.ForOfStatement with Double = js.native
  
  @js.native
  sealed trait ForStatement extends SyntaxKind
  /* 237 */ val ForStatement: typingsSlinky.typescript.mod.SyntaxKind.ForStatement with Double = js.native
  
  @js.native
  sealed trait FromKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 153 */ val FromKeyword: typingsSlinky.typescript.mod.SyntaxKind.FromKeyword with Double = js.native
  
  @js.native
  sealed trait FunctionDeclaration extends SyntaxKind
  /* 251 */ val FunctionDeclaration: typingsSlinky.typescript.mod.SyntaxKind.FunctionDeclaration with Double = js.native
  
  @js.native
  sealed trait FunctionExpression extends SyntaxKind
  /* 208 */ val FunctionExpression: typingsSlinky.typescript.mod.SyntaxKind.FunctionExpression with Double = js.native
  
  @js.native
  sealed trait FunctionKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 97 */ val FunctionKeyword: typingsSlinky.typescript.mod.SyntaxKind.FunctionKeyword with Double = js.native
  
  @js.native
  sealed trait FunctionType extends SyntaxKind
  /* 174 */ val FunctionType: typingsSlinky.typescript.mod.SyntaxKind.FunctionType with Double = js.native
  
  @js.native
  sealed trait GetAccessor extends SyntaxKind
  /* 167 */ val GetAccessor: typingsSlinky.typescript.mod.SyntaxKind.GetAccessor with Double = js.native
  
  @js.native
  sealed trait GetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 134 */ val GetKeyword: typingsSlinky.typescript.mod.SyntaxKind.GetKeyword with Double = js.native
  
  @js.native
  sealed trait GlobalKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 154 */ val GlobalKeyword: typingsSlinky.typescript.mod.SyntaxKind.GlobalKeyword with Double = js.native
  
  @js.native
  sealed trait GreaterThanEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 33 */ val GreaterThanEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.GreaterThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 70 */ val GreaterThanGreaterThanEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 71 */ val GreaterThanGreaterThanGreaterThanEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 49 */ val GreaterThanGreaterThanGreaterThanToken: typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 48 */ val GreaterThanGreaterThanToken: typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with RelationalOperator
  /* 31 */ val GreaterThanToken: typingsSlinky.typescript.mod.SyntaxKind.GreaterThanToken with Double = js.native
  
  @js.native
  sealed trait HeritageClause extends SyntaxKind
  /* 286 */ val HeritageClause: typingsSlinky.typescript.mod.SyntaxKind.HeritageClause with Double = js.native
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 78 */ val Identifier: typingsSlinky.typescript.mod.SyntaxKind.Identifier with Double = js.native
  
  @js.native
  sealed trait IfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 98 */ val IfKeyword: typingsSlinky.typescript.mod.SyntaxKind.IfKeyword with Double = js.native
  
  @js.native
  sealed trait IfStatement extends SyntaxKind
  /* 234 */ val IfStatement: typingsSlinky.typescript.mod.SyntaxKind.IfStatement with Double = js.native
  
  @js.native
  sealed trait ImplementsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 116 */ val ImplementsKeyword: typingsSlinky.typescript.mod.SyntaxKind.ImplementsKeyword with Double = js.native
  
  @js.native
  sealed trait ImportClause extends SyntaxKind
  /* 262 */ val ImportClause: typingsSlinky.typescript.mod.SyntaxKind.ImportClause with Double = js.native
  
  @js.native
  sealed trait ImportDeclaration extends SyntaxKind
  /* 261 */ val ImportDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ImportDeclaration with Double = js.native
  
  @js.native
  sealed trait ImportEqualsDeclaration extends SyntaxKind
  /* 260 */ val ImportEqualsDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ImportEqualsDeclaration with Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 99 */ val ImportKeyword: typingsSlinky.typescript.mod.SyntaxKind.ImportKeyword with Double = js.native
  
  @js.native
  sealed trait ImportSpecifier extends SyntaxKind
  /* 265 */ val ImportSpecifier: typingsSlinky.typescript.mod.SyntaxKind.ImportSpecifier with Double = js.native
  
  @js.native
  sealed trait ImportType extends SyntaxKind
  /* 195 */ val ImportType: typingsSlinky.typescript.mod.SyntaxKind.ImportType with Double = js.native
  
  @js.native
  sealed trait InKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 100 */ val InKeyword: typingsSlinky.typescript.mod.SyntaxKind.InKeyword with Double = js.native
  
  @js.native
  sealed trait IndexSignature extends SyntaxKind
  /* 171 */ val IndexSignature: typingsSlinky.typescript.mod.SyntaxKind.IndexSignature with Double = js.native
  
  @js.native
  sealed trait IndexedAccessType extends SyntaxKind
  /* 189 */ val IndexedAccessType: typingsSlinky.typescript.mod.SyntaxKind.IndexedAccessType with Double = js.native
  
  @js.native
  sealed trait InferKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 135 */ val InferKeyword: typingsSlinky.typescript.mod.SyntaxKind.InferKeyword with Double = js.native
  
  @js.native
  sealed trait InferType extends SyntaxKind
  /* 185 */ val InferType: typingsSlinky.typescript.mod.SyntaxKind.InferType with Double = js.native
  
  @js.native
  sealed trait InputFiles extends SyntaxKind
  /* 300 */ val InputFiles: typingsSlinky.typescript.mod.SyntaxKind.InputFiles with Double = js.native
  
  @js.native
  sealed trait InstanceOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 101 */ val InstanceOfKeyword: typingsSlinky.typescript.mod.SyntaxKind.InstanceOfKeyword with Double = js.native
  
  @js.native
  sealed trait InterfaceDeclaration extends SyntaxKind
  /* 253 */ val InterfaceDeclaration: typingsSlinky.typescript.mod.SyntaxKind.InterfaceDeclaration with Double = js.native
  
  @js.native
  sealed trait InterfaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 117 */ val InterfaceKeyword: typingsSlinky.typescript.mod.SyntaxKind.InterfaceKeyword with Double = js.native
  
  @js.native
  sealed trait IntersectionType extends SyntaxKind
  /* 183 */ val IntersectionType: typingsSlinky.typescript.mod.SyntaxKind.IntersectionType with Double = js.native
  
  @js.native
  sealed trait IntrinsicKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 136 */ val IntrinsicKeyword: typingsSlinky.typescript.mod.SyntaxKind.IntrinsicKeyword with Double = js.native
  
  @js.native
  sealed trait IsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 137 */ val IsKeyword: typingsSlinky.typescript.mod.SyntaxKind.IsKeyword with Double = js.native
  
  @js.native
  sealed trait JSDocAllType extends SyntaxKind
  /* 303 */ val JSDocAllType: typingsSlinky.typescript.mod.SyntaxKind.JSDocAllType with Double = js.native
  
  @js.native
  sealed trait JSDocAugmentsTag extends SyntaxKind
  /* 315 */ val JSDocAugmentsTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocAugmentsTag with Double = js.native
  
  @js.native
  sealed trait JSDocAuthorTag extends SyntaxKind
  /* 317 */ val JSDocAuthorTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocAuthorTag with Double = js.native
  
  @js.native
  sealed trait JSDocCallbackTag extends SyntaxKind
  /* 324 */ val JSDocCallbackTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocCallbackTag with Double = js.native
  
  @js.native
  sealed trait JSDocClassTag extends SyntaxKind
  /* 319 */ val JSDocClassTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocClassTag with Double = js.native
  
  @js.native
  sealed trait JSDocComment extends SyntaxKind
  /* 311 */ val JSDocComment: typingsSlinky.typescript.mod.SyntaxKind.JSDocComment with Double = js.native
  
  @js.native
  sealed trait JSDocDeprecatedTag extends SyntaxKind
  /* 318 */ val JSDocDeprecatedTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocDeprecatedTag with Double = js.native
  
  @js.native
  sealed trait JSDocEnumTag extends SyntaxKind
  /* 325 */ val JSDocEnumTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocEnumTag with Double = js.native
  
  @js.native
  sealed trait JSDocFunctionType extends SyntaxKind
  /* 308 */ val JSDocFunctionType: typingsSlinky.typescript.mod.SyntaxKind.JSDocFunctionType with Double = js.native
  
  @js.native
  sealed trait JSDocImplementsTag extends SyntaxKind
  /* 316 */ val JSDocImplementsTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocImplementsTag with Double = js.native
  
  @js.native
  sealed trait JSDocNameReference extends SyntaxKind
  /* 302 */ val JSDocNameReference: typingsSlinky.typescript.mod.SyntaxKind.JSDocNameReference with Double = js.native
  
  @js.native
  sealed trait JSDocNamepathType extends SyntaxKind
  /* 310 */ val JSDocNamepathType: typingsSlinky.typescript.mod.SyntaxKind.JSDocNamepathType with Double = js.native
  
  @js.native
  sealed trait JSDocNonNullableType extends SyntaxKind
  /* 306 */ val JSDocNonNullableType: typingsSlinky.typescript.mod.SyntaxKind.JSDocNonNullableType with Double = js.native
  
  @js.native
  sealed trait JSDocNullableType extends SyntaxKind
  /* 305 */ val JSDocNullableType: typingsSlinky.typescript.mod.SyntaxKind.JSDocNullableType with Double = js.native
  
  @js.native
  sealed trait JSDocOptionalType extends SyntaxKind
  /* 307 */ val JSDocOptionalType: typingsSlinky.typescript.mod.SyntaxKind.JSDocOptionalType with Double = js.native
  
  @js.native
  sealed trait JSDocParameterTag extends SyntaxKind
  /* 326 */ val JSDocParameterTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocParameterTag with Double = js.native
  
  @js.native
  sealed trait JSDocPrivateTag extends SyntaxKind
  /* 321 */ val JSDocPrivateTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocPrivateTag with Double = js.native
  
  @js.native
  sealed trait JSDocPropertyTag extends SyntaxKind
  /* 333 */ val JSDocPropertyTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocPropertyTag with Double = js.native
  
  @js.native
  sealed trait JSDocProtectedTag extends SyntaxKind
  /* 322 */ val JSDocProtectedTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocProtectedTag with Double = js.native
  
  @js.native
  sealed trait JSDocPublicTag extends SyntaxKind
  /* 320 */ val JSDocPublicTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocPublicTag with Double = js.native
  
  @js.native
  sealed trait JSDocReadonlyTag extends SyntaxKind
  /* 323 */ val JSDocReadonlyTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocReadonlyTag with Double = js.native
  
  @js.native
  sealed trait JSDocReturnTag extends SyntaxKind
  /* 327 */ val JSDocReturnTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocReturnTag with Double = js.native
  
  @js.native
  sealed trait JSDocSeeTag extends SyntaxKind
  /* 332 */ val JSDocSeeTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocSeeTag with Double = js.native
  
  @js.native
  sealed trait JSDocSignature extends SyntaxKind
  /* 313 */ val JSDocSignature: typingsSlinky.typescript.mod.SyntaxKind.JSDocSignature with Double = js.native
  
  @js.native
  sealed trait JSDocTag extends SyntaxKind
  /* 314 */ val JSDocTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocTag with Double = js.native
  
  @js.native
  sealed trait JSDocTemplateTag extends SyntaxKind
  /* 330 */ val JSDocTemplateTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocTemplateTag with Double = js.native
  
  @js.native
  sealed trait JSDocThisTag extends SyntaxKind
  /* 328 */ val JSDocThisTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocThisTag with Double = js.native
  
  @js.native
  sealed trait JSDocTypeExpression extends SyntaxKind
  /* 301 */ val JSDocTypeExpression: typingsSlinky.typescript.mod.SyntaxKind.JSDocTypeExpression with Double = js.native
  
  @js.native
  sealed trait JSDocTypeLiteral extends SyntaxKind
  /* 312 */ val JSDocTypeLiteral: typingsSlinky.typescript.mod.SyntaxKind.JSDocTypeLiteral with Double = js.native
  
  @js.native
  sealed trait JSDocTypeTag extends SyntaxKind
  /* 329 */ val JSDocTypeTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocTypeTag with Double = js.native
  
  @js.native
  sealed trait JSDocTypedefTag extends SyntaxKind
  /* 331 */ val JSDocTypedefTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocTypedefTag with Double = js.native
  
  @js.native
  sealed trait JSDocUnknownType extends SyntaxKind
  /* 304 */ val JSDocUnknownType: typingsSlinky.typescript.mod.SyntaxKind.JSDocUnknownType with Double = js.native
  
  @js.native
  sealed trait JSDocVariadicType extends SyntaxKind
  /* 309 */ val JSDocVariadicType: typingsSlinky.typescript.mod.SyntaxKind.JSDocVariadicType with Double = js.native
  
  @js.native
  sealed trait JsxAttribute extends SyntaxKind
  /* 280 */ val JsxAttribute: typingsSlinky.typescript.mod.SyntaxKind.JsxAttribute with Double = js.native
  
  @js.native
  sealed trait JsxAttributes extends SyntaxKind
  /* 281 */ val JsxAttributes: typingsSlinky.typescript.mod.SyntaxKind.JsxAttributes with Double = js.native
  
  @js.native
  sealed trait JsxClosingElement extends SyntaxKind
  /* 276 */ val JsxClosingElement: typingsSlinky.typescript.mod.SyntaxKind.JsxClosingElement with Double = js.native
  
  @js.native
  sealed trait JsxClosingFragment extends SyntaxKind
  /* 279 */ val JsxClosingFragment: typingsSlinky.typescript.mod.SyntaxKind.JsxClosingFragment with Double = js.native
  
  @js.native
  sealed trait JsxElement extends SyntaxKind
  /* 273 */ val JsxElement: typingsSlinky.typescript.mod.SyntaxKind.JsxElement with Double = js.native
  
  @js.native
  sealed trait JsxExpression extends SyntaxKind
  /* 283 */ val JsxExpression: typingsSlinky.typescript.mod.SyntaxKind.JsxExpression with Double = js.native
  
  @js.native
  sealed trait JsxFragment extends SyntaxKind
  /* 277 */ val JsxFragment: typingsSlinky.typescript.mod.SyntaxKind.JsxFragment with Double = js.native
  
  @js.native
  sealed trait JsxOpeningElement extends SyntaxKind
  /* 275 */ val JsxOpeningElement: typingsSlinky.typescript.mod.SyntaxKind.JsxOpeningElement with Double = js.native
  
  @js.native
  sealed trait JsxOpeningFragment extends SyntaxKind
  /* 278 */ val JsxOpeningFragment: typingsSlinky.typescript.mod.SyntaxKind.JsxOpeningFragment with Double = js.native
  
  @js.native
  sealed trait JsxSelfClosingElement extends SyntaxKind
  /* 274 */ val JsxSelfClosingElement: typingsSlinky.typescript.mod.SyntaxKind.JsxSelfClosingElement with Double = js.native
  
  @js.native
  sealed trait JsxSpreadAttribute extends SyntaxKind
  /* 282 */ val JsxSpreadAttribute: typingsSlinky.typescript.mod.SyntaxKind.JsxSpreadAttribute with Double = js.native
  
  @js.native
  sealed trait JsxText
    extends LiteralSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 11 */ val JsxText: typingsSlinky.typescript.mod.SyntaxKind.JsxText with Double = js.native
  
  @js.native
  sealed trait JsxTextAllWhiteSpaces
    extends LiteralSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 12 */ val JsxTextAllWhiteSpaces: typingsSlinky.typescript.mod.SyntaxKind.JsxTextAllWhiteSpaces with Double = js.native
  
  @js.native
  sealed trait KeyOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 138 */ val KeyOfKeyword: typingsSlinky.typescript.mod.SyntaxKind.KeyOfKeyword with Double = js.native
  
  @js.native
  sealed trait LabeledStatement extends SyntaxKind
  /* 245 */ val LabeledStatement: typingsSlinky.typescript.mod.SyntaxKind.LabeledStatement with Double = js.native
  
  @js.native
  sealed trait LastAssignment extends SyntaxKind
  /* 77 */ val LastAssignment: typingsSlinky.typescript.mod.SyntaxKind.LastAssignment with Double = js.native
  
  @js.native
  sealed trait LastBinaryOperator extends SyntaxKind
  /* 77 */ val LastBinaryOperator: typingsSlinky.typescript.mod.SyntaxKind.LastBinaryOperator with Double = js.native
  
  @js.native
  sealed trait LastCompoundAssignment extends SyntaxKind
  /* 77 */ val LastCompoundAssignment: typingsSlinky.typescript.mod.SyntaxKind.LastCompoundAssignment with Double = js.native
  
  @js.native
  sealed trait LastFutureReservedWord extends SyntaxKind
  /* 124 */ val LastFutureReservedWord: typingsSlinky.typescript.mod.SyntaxKind.LastFutureReservedWord with Double = js.native
  
  @js.native
  sealed trait LastJSDocNode extends SyntaxKind
  /* 333 */ val LastJSDocNode: typingsSlinky.typescript.mod.SyntaxKind.LastJSDocNode with Double = js.native
  
  @js.native
  sealed trait LastJSDocTagNode extends SyntaxKind
  /* 333 */ val LastJSDocTagNode: typingsSlinky.typescript.mod.SyntaxKind.LastJSDocTagNode with Double = js.native
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  /* 156 */ val LastKeyword: typingsSlinky.typescript.mod.SyntaxKind.LastKeyword with Double = js.native
  
  @js.native
  sealed trait LastLiteralToken extends SyntaxKind
  /* 14 */ val LastLiteralToken: typingsSlinky.typescript.mod.SyntaxKind.LastLiteralToken with Double = js.native
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  /* 77 */ val LastPunctuation: typingsSlinky.typescript.mod.SyntaxKind.LastPunctuation with Double = js.native
  
  @js.native
  sealed trait LastReservedWord extends SyntaxKind
  /* 115 */ val LastReservedWord: typingsSlinky.typescript.mod.SyntaxKind.LastReservedWord with Double = js.native
  
  @js.native
  sealed trait LastStatement extends SyntaxKind
  /* 248 */ val LastStatement: typingsSlinky.typescript.mod.SyntaxKind.LastStatement with Double = js.native
  
  @js.native
  sealed trait LastTemplateToken extends SyntaxKind
  /* 17 */ val LastTemplateToken: typingsSlinky.typescript.mod.SyntaxKind.LastTemplateToken with Double = js.native
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  /* 156 */ val LastToken: typingsSlinky.typescript.mod.SyntaxKind.LastToken with Double = js.native
  
  @js.native
  sealed trait LastTriviaToken extends SyntaxKind
  /* 7 */ val LastTriviaToken: typingsSlinky.typescript.mod.SyntaxKind.LastTriviaToken with Double = js.native
  
  @js.native
  sealed trait LastTypeNode extends SyntaxKind
  /* 195 */ val LastTypeNode: typingsSlinky.typescript.mod.SyntaxKind.LastTypeNode with Double = js.native
  
  @js.native
  sealed trait LessThanEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 32 */ val LessThanEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.LessThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait LessThanLessThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 69 */ val LessThanLessThanEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.LessThanLessThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait LessThanLessThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 47 */ val LessThanLessThanToken: typingsSlinky.typescript.mod.SyntaxKind.LessThanLessThanToken with Double = js.native
  
  @js.native
  sealed trait LessThanSlashToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 30 */ val LessThanSlashToken: typingsSlinky.typescript.mod.SyntaxKind.LessThanSlashToken with Double = js.native
  
  @js.native
  sealed trait LessThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with RelationalOperator
  /* 29 */ val LessThanToken: typingsSlinky.typescript.mod.SyntaxKind.LessThanToken with Double = js.native
  
  @js.native
  sealed trait LetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 118 */ val LetKeyword: typingsSlinky.typescript.mod.SyntaxKind.LetKeyword with Double = js.native
  
  @js.native
  sealed trait LiteralType extends SyntaxKind
  /* 191 */ val LiteralType: typingsSlinky.typescript.mod.SyntaxKind.LiteralType with Double = js.native
  
  @js.native
  sealed trait MappedType extends SyntaxKind
  /* 190 */ val MappedType: typingsSlinky.typescript.mod.SyntaxKind.MappedType with Double = js.native
  
  @js.native
  sealed trait MergeDeclarationMarker extends SyntaxKind
  /* 338 */ val MergeDeclarationMarker: typingsSlinky.typescript.mod.SyntaxKind.MergeDeclarationMarker with Double = js.native
  
  @js.native
  sealed trait MetaProperty extends SyntaxKind
  /* 226 */ val MetaProperty: typingsSlinky.typescript.mod.SyntaxKind.MetaProperty with Double = js.native
  
  @js.native
  sealed trait MethodDeclaration extends SyntaxKind
  /* 165 */ val MethodDeclaration: typingsSlinky.typescript.mod.SyntaxKind.MethodDeclaration with Double = js.native
  
  @js.native
  sealed trait MethodSignature extends SyntaxKind
  /* 164 */ val MethodSignature: typingsSlinky.typescript.mod.SyntaxKind.MethodSignature with Double = js.native
  
  @js.native
  sealed trait MinusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 64 */ val MinusEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.MinusEqualsToken with Double = js.native
  
  @js.native
  sealed trait MinusMinusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  /* 46 */ val MinusMinusToken: typingsSlinky.typescript.mod.SyntaxKind.MinusMinusToken with Double = js.native
  
  @js.native
  sealed trait MinusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  /* 40 */ val MinusToken: typingsSlinky.typescript.mod.SyntaxKind.MinusToken with Double = js.native
  
  @js.native
  sealed trait MissingDeclaration extends SyntaxKind
  /* 271 */ val MissingDeclaration: typingsSlinky.typescript.mod.SyntaxKind.MissingDeclaration with Double = js.native
  
  @js.native
  sealed trait ModuleBlock extends SyntaxKind
  /* 257 */ val ModuleBlock: typingsSlinky.typescript.mod.SyntaxKind.ModuleBlock with Double = js.native
  
  @js.native
  sealed trait ModuleDeclaration extends SyntaxKind
  /* 256 */ val ModuleDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ModuleDeclaration with Double = js.native
  
  @js.native
  sealed trait ModuleKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 139 */ val ModuleKeyword: typingsSlinky.typescript.mod.SyntaxKind.ModuleKeyword with Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with CommentKind
  /* 3 */ val MultiLineCommentTrivia: typingsSlinky.typescript.mod.SyntaxKind.MultiLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait NamedExports extends SyntaxKind
  /* 268 */ val NamedExports: typingsSlinky.typescript.mod.SyntaxKind.NamedExports with Double = js.native
  
  @js.native
  sealed trait NamedImports extends SyntaxKind
  /* 264 */ val NamedImports: typingsSlinky.typescript.mod.SyntaxKind.NamedImports with Double = js.native
  
  @js.native
  sealed trait NamedTupleMember extends SyntaxKind
  /* 192 */ val NamedTupleMember: typingsSlinky.typescript.mod.SyntaxKind.NamedTupleMember with Double = js.native
  
  @js.native
  sealed trait NamespaceExport extends SyntaxKind
  /* 269 */ val NamespaceExport: typingsSlinky.typescript.mod.SyntaxKind.NamespaceExport with Double = js.native
  
  @js.native
  sealed trait NamespaceExportDeclaration extends SyntaxKind
  /* 259 */ val NamespaceExportDeclaration: typingsSlinky.typescript.mod.SyntaxKind.NamespaceExportDeclaration with Double = js.native
  
  @js.native
  sealed trait NamespaceImport extends SyntaxKind
  /* 263 */ val NamespaceImport: typingsSlinky.typescript.mod.SyntaxKind.NamespaceImport with Double = js.native
  
  @js.native
  sealed trait NamespaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 140 */ val NamespaceKeyword: typingsSlinky.typescript.mod.SyntaxKind.NamespaceKeyword with Double = js.native
  
  @js.native
  sealed trait NeverKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 141 */ val NeverKeyword: typingsSlinky.typescript.mod.SyntaxKind.NeverKeyword with Double = js.native
  
  @js.native
  sealed trait NewExpression extends SyntaxKind
  /* 204 */ val NewExpression: typingsSlinky.typescript.mod.SyntaxKind.NewExpression with Double = js.native
  
  @js.native
  sealed trait NewKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 102 */ val NewKeyword: typingsSlinky.typescript.mod.SyntaxKind.NewKeyword with Double = js.native
  
  @js.native
  sealed trait NewLineTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 4 */ val NewLineTrivia: typingsSlinky.typescript.mod.SyntaxKind.NewLineTrivia with Double = js.native
  
  @js.native
  sealed trait NoSubstitutionTemplateLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 14 */ val NoSubstitutionTemplateLiteral: typingsSlinky.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral with Double = js.native
  
  @js.native
  sealed trait NonNullExpression extends SyntaxKind
  /* 225 */ val NonNullExpression: typingsSlinky.typescript.mod.SyntaxKind.NonNullExpression with Double = js.native
  
  @js.native
  sealed trait NotEmittedStatement extends SyntaxKind
  /* 335 */ val NotEmittedStatement: typingsSlinky.typescript.mod.SyntaxKind.NotEmittedStatement with Double = js.native
  
  @js.native
  sealed trait NullKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 103 */ val NullKeyword: typingsSlinky.typescript.mod.SyntaxKind.NullKeyword with Double = js.native
  
  @js.native
  sealed trait NumberKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 144 */ val NumberKeyword: typingsSlinky.typescript.mod.SyntaxKind.NumberKeyword with Double = js.native
  
  @js.native
  sealed trait NumericLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 8 */ val NumericLiteral: typingsSlinky.typescript.mod.SyntaxKind.NumericLiteral with Double = js.native
  
  @js.native
  sealed trait ObjectBindingPattern extends SyntaxKind
  /* 196 */ val ObjectBindingPattern: typingsSlinky.typescript.mod.SyntaxKind.ObjectBindingPattern with Double = js.native
  
  @js.native
  sealed trait ObjectKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 145 */ val ObjectKeyword: typingsSlinky.typescript.mod.SyntaxKind.ObjectKeyword with Double = js.native
  
  @js.native
  sealed trait ObjectLiteralExpression extends SyntaxKind
  /* 200 */ val ObjectLiteralExpression: typingsSlinky.typescript.mod.SyntaxKind.ObjectLiteralExpression with Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 156 */ val OfKeyword: typingsSlinky.typescript.mod.SyntaxKind.OfKeyword with Double = js.native
  
  @js.native
  sealed trait OmittedExpression extends SyntaxKind
  /* 222 */ val OmittedExpression: typingsSlinky.typescript.mod.SyntaxKind.OmittedExpression with Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
  /* 18 */ val OpenBraceToken: typingsSlinky.typescript.mod.SyntaxKind.OpenBraceToken with Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 22 */ val OpenBracketToken: typingsSlinky.typescript.mod.SyntaxKind.OpenBracketToken with Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 20 */ val OpenParenToken: typingsSlinky.typescript.mod.SyntaxKind.OpenParenToken with Double = js.native
  
  @js.native
  sealed trait OptionalType extends SyntaxKind
  /* 180 */ val OptionalType: typingsSlinky.typescript.mod.SyntaxKind.OptionalType with Double = js.native
  
  @js.native
  sealed trait PackageKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 119 */ val PackageKeyword: typingsSlinky.typescript.mod.SyntaxKind.PackageKeyword with Double = js.native
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  /* 160 */ val Parameter: typingsSlinky.typescript.mod.SyntaxKind.Parameter with Double = js.native
  
  @js.native
  sealed trait ParenthesizedExpression extends SyntaxKind
  /* 207 */ val ParenthesizedExpression: typingsSlinky.typescript.mod.SyntaxKind.ParenthesizedExpression with Double = js.native
  
  @js.native
  sealed trait ParenthesizedType extends SyntaxKind
  /* 186 */ val ParenthesizedType: typingsSlinky.typescript.mod.SyntaxKind.ParenthesizedType with Double = js.native
  
  @js.native
  sealed trait PartiallyEmittedExpression extends SyntaxKind
  /* 336 */ val PartiallyEmittedExpression: typingsSlinky.typescript.mod.SyntaxKind.PartiallyEmittedExpression with Double = js.native
  
  @js.native
  sealed trait PercentEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 68 */ val PercentEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.PercentEqualsToken with Double = js.native
  
  @js.native
  sealed trait PercentToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with MultiplicativeOperator
  /* 44 */ val PercentToken: typingsSlinky.typescript.mod.SyntaxKind.PercentToken with Double = js.native
  
  @js.native
  sealed trait PlusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 63 */ val PlusEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.PlusEqualsToken with Double = js.native
  
  @js.native
  sealed trait PlusPlusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  /* 45 */ val PlusPlusToken: typingsSlinky.typescript.mod.SyntaxKind.PlusPlusToken with Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  /* 39 */ val PlusToken: typingsSlinky.typescript.mod.SyntaxKind.PlusToken with Double = js.native
  
  @js.native
  sealed trait PostfixUnaryExpression extends SyntaxKind
  /* 215 */ val PostfixUnaryExpression: typingsSlinky.typescript.mod.SyntaxKind.PostfixUnaryExpression with Double = js.native
  
  @js.native
  sealed trait PrefixUnaryExpression extends SyntaxKind
  /* 214 */ val PrefixUnaryExpression: typingsSlinky.typescript.mod.SyntaxKind.PrefixUnaryExpression with Double = js.native
  
  @js.native
  sealed trait PrivateIdentifier extends SyntaxKind
  /* 79 */ val PrivateIdentifier: typingsSlinky.typescript.mod.SyntaxKind.PrivateIdentifier with Double = js.native
  
  @js.native
  sealed trait PrivateKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 120 */ val PrivateKeyword: typingsSlinky.typescript.mod.SyntaxKind.PrivateKeyword with Double = js.native
  
  @js.native
  sealed trait PropertyAccessExpression extends SyntaxKind
  /* 201 */ val PropertyAccessExpression: typingsSlinky.typescript.mod.SyntaxKind.PropertyAccessExpression with Double = js.native
  
  @js.native
  sealed trait PropertyAssignment extends SyntaxKind
  /* 288 */ val PropertyAssignment: typingsSlinky.typescript.mod.SyntaxKind.PropertyAssignment with Double = js.native
  
  @js.native
  sealed trait PropertyDeclaration extends SyntaxKind
  /* 163 */ val PropertyDeclaration: typingsSlinky.typescript.mod.SyntaxKind.PropertyDeclaration with Double = js.native
  
  @js.native
  sealed trait PropertySignature extends SyntaxKind
  /* 162 */ val PropertySignature: typingsSlinky.typescript.mod.SyntaxKind.PropertySignature with Double = js.native
  
  @js.native
  sealed trait ProtectedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 121 */ val ProtectedKeyword: typingsSlinky.typescript.mod.SyntaxKind.ProtectedKeyword with Double = js.native
  
  @js.native
  sealed trait PublicKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 122 */ val PublicKeyword: typingsSlinky.typescript.mod.SyntaxKind.PublicKeyword with Double = js.native
  
  @js.native
  sealed trait QualifiedName extends SyntaxKind
  /* 157 */ val QualifiedName: typingsSlinky.typescript.mod.SyntaxKind.QualifiedName with Double = js.native
  
  @js.native
  sealed trait QuestionDotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 28 */ val QuestionDotToken: typingsSlinky.typescript.mod.SyntaxKind.QuestionDotToken with Double = js.native
  
  @js.native
  sealed trait QuestionQuestionEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 76 */ val QuestionQuestionEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.QuestionQuestionEqualsToken with Double = js.native
  
  @js.native
  sealed trait QuestionQuestionToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with _AssignmentOperatorOrHigher
  /* 60 */ val QuestionQuestionToken: typingsSlinky.typescript.mod.SyntaxKind.QuestionQuestionToken with Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 57 */ val QuestionToken: typingsSlinky.typescript.mod.SyntaxKind.QuestionToken with Double = js.native
  
  @js.native
  sealed trait ReadonlyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 142 */ val ReadonlyKeyword: typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword with Double = js.native
  
  @js.native
  sealed trait RegularExpressionLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 13 */ val RegularExpressionLiteral: typingsSlinky.typescript.mod.SyntaxKind.RegularExpressionLiteral with Double = js.native
  
  @js.native
  sealed trait RequireKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 143 */ val RequireKeyword: typingsSlinky.typescript.mod.SyntaxKind.RequireKeyword with Double = js.native
  
  @js.native
  sealed trait RestType extends SyntaxKind
  /* 181 */ val RestType: typingsSlinky.typescript.mod.SyntaxKind.RestType with Double = js.native
  
  @js.native
  sealed trait ReturnKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 104 */ val ReturnKeyword: typingsSlinky.typescript.mod.SyntaxKind.ReturnKeyword with Double = js.native
  
  @js.native
  sealed trait ReturnStatement extends SyntaxKind
  /* 242 */ val ReturnStatement: typingsSlinky.typescript.mod.SyntaxKind.ReturnStatement with Double = js.native
  
  @js.native
  sealed trait SemicolonClassElement extends SyntaxKind
  /* 229 */ val SemicolonClassElement: typingsSlinky.typescript.mod.SyntaxKind.SemicolonClassElement with Double = js.native
  
  @js.native
  sealed trait SemicolonToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 26 */ val SemicolonToken: typingsSlinky.typescript.mod.SyntaxKind.SemicolonToken with Double = js.native
  
  @js.native
  sealed trait SetAccessor extends SyntaxKind
  /* 168 */ val SetAccessor: typingsSlinky.typescript.mod.SyntaxKind.SetAccessor with Double = js.native
  
  @js.native
  sealed trait SetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 146 */ val SetKeyword: typingsSlinky.typescript.mod.SyntaxKind.SetKeyword with Double = js.native
  
  @js.native
  sealed trait ShebangTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
  /* 6 */ val ShebangTrivia: typingsSlinky.typescript.mod.SyntaxKind.ShebangTrivia with Double = js.native
  
  @js.native
  sealed trait ShorthandPropertyAssignment extends SyntaxKind
  /* 289 */ val ShorthandPropertyAssignment: typingsSlinky.typescript.mod.SyntaxKind.ShorthandPropertyAssignment with Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with CommentKind
  /* 2 */ val SingleLineCommentTrivia: typingsSlinky.typescript.mod.SyntaxKind.SingleLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait SlashEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 67 */ val SlashEqualsToken: typingsSlinky.typescript.mod.SyntaxKind.SlashEqualsToken with Double = js.native
  
  @js.native
  sealed trait SlashToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with MultiplicativeOperator
  /* 43 */ val SlashToken: typingsSlinky.typescript.mod.SyntaxKind.SlashToken with Double = js.native
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  /* 297 */ val SourceFile: typingsSlinky.typescript.mod.SyntaxKind.SourceFile with Double = js.native
  
  @js.native
  sealed trait SpreadAssignment extends SyntaxKind
  /* 290 */ val SpreadAssignment: typingsSlinky.typescript.mod.SyntaxKind.SpreadAssignment with Double = js.native
  
  @js.native
  sealed trait SpreadElement extends SyntaxKind
  /* 220 */ val SpreadElement: typingsSlinky.typescript.mod.SyntaxKind.SpreadElement with Double = js.native
  
  @js.native
  sealed trait StaticKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 123 */ val StaticKeyword: typingsSlinky.typescript.mod.SyntaxKind.StaticKeyword with Double = js.native
  
  @js.native
  sealed trait StringKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 147 */ val StringKeyword: typingsSlinky.typescript.mod.SyntaxKind.StringKeyword with Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 10 */ val StringLiteral: typingsSlinky.typescript.mod.SyntaxKind.StringLiteral with Double = js.native
  
  @js.native
  sealed trait SuperKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 105 */ val SuperKeyword: typingsSlinky.typescript.mod.SyntaxKind.SuperKeyword with Double = js.native
  
  @js.native
  sealed trait SwitchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 106 */ val SwitchKeyword: typingsSlinky.typescript.mod.SyntaxKind.SwitchKeyword with Double = js.native
  
  @js.native
  sealed trait SwitchStatement extends SyntaxKind
  /* 244 */ val SwitchStatement: typingsSlinky.typescript.mod.SyntaxKind.SwitchStatement with Double = js.native
  
  @js.native
  sealed trait SymbolKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 148 */ val SymbolKeyword: typingsSlinky.typescript.mod.SyntaxKind.SymbolKeyword with Double = js.native
  
  @js.native
  sealed trait SyntaxList extends SyntaxKind
  /* 334 */ val SyntaxList: typingsSlinky.typescript.mod.SyntaxKind.SyntaxList with Double = js.native
  
  @js.native
  sealed trait SyntheticExpression extends SyntaxKind
  /* 227 */ val SyntheticExpression: typingsSlinky.typescript.mod.SyntaxKind.SyntheticExpression with Double = js.native
  
  @js.native
  sealed trait SyntheticReferenceExpression extends SyntaxKind
  /* 340 */ val SyntheticReferenceExpression: typingsSlinky.typescript.mod.SyntaxKind.SyntheticReferenceExpression with Double = js.native
  
  @js.native
  sealed trait TaggedTemplateExpression extends SyntaxKind
  /* 205 */ val TaggedTemplateExpression: typingsSlinky.typescript.mod.SyntaxKind.TaggedTemplateExpression with Double = js.native
  
  @js.native
  sealed trait TemplateExpression extends SyntaxKind
  /* 218 */ val TemplateExpression: typingsSlinky.typescript.mod.SyntaxKind.TemplateExpression with Double = js.native
  
  @js.native
  sealed trait TemplateHead
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 15 */ val TemplateHead: typingsSlinky.typescript.mod.SyntaxKind.TemplateHead with Double = js.native
  
  @js.native
  sealed trait TemplateLiteralType extends SyntaxKind
  /* 193 */ val TemplateLiteralType: typingsSlinky.typescript.mod.SyntaxKind.TemplateLiteralType with Double = js.native
  
  @js.native
  sealed trait TemplateLiteralTypeSpan extends SyntaxKind
  /* 194 */ val TemplateLiteralTypeSpan: typingsSlinky.typescript.mod.SyntaxKind.TemplateLiteralTypeSpan with Double = js.native
  
  @js.native
  sealed trait TemplateMiddle
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 16 */ val TemplateMiddle: typingsSlinky.typescript.mod.SyntaxKind.TemplateMiddle with Double = js.native
  
  @js.native
  sealed trait TemplateSpan extends SyntaxKind
  /* 228 */ val TemplateSpan: typingsSlinky.typescript.mod.SyntaxKind.TemplateSpan with Double = js.native
  
  @js.native
  sealed trait TemplateTail
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 17 */ val TemplateTail: typingsSlinky.typescript.mod.SyntaxKind.TemplateTail with Double = js.native
  
  @js.native
  sealed trait ThisKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 107 */ val ThisKeyword: typingsSlinky.typescript.mod.SyntaxKind.ThisKeyword with Double = js.native
  
  @js.native
  sealed trait ThisType extends SyntaxKind
  /* 187 */ val ThisType: typingsSlinky.typescript.mod.SyntaxKind.ThisType with Double = js.native
  
  @js.native
  sealed trait ThrowKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 108 */ val ThrowKeyword: typingsSlinky.typescript.mod.SyntaxKind.ThrowKeyword with Double = js.native
  
  @js.native
  sealed trait ThrowStatement extends SyntaxKind
  /* 246 */ val ThrowStatement: typingsSlinky.typescript.mod.SyntaxKind.ThrowStatement with Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PrefixUnaryOperator
  /* 54 */ val TildeToken: typingsSlinky.typescript.mod.SyntaxKind.TildeToken with Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 109 */ val TrueKeyword: typingsSlinky.typescript.mod.SyntaxKind.TrueKeyword with Double = js.native
  
  @js.native
  sealed trait TryKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 110 */ val TryKeyword: typingsSlinky.typescript.mod.SyntaxKind.TryKeyword with Double = js.native
  
  @js.native
  sealed trait TryStatement extends SyntaxKind
  /* 247 */ val TryStatement: typingsSlinky.typescript.mod.SyntaxKind.TryStatement with Double = js.native
  
  @js.native
  sealed trait TupleType extends SyntaxKind
  /* 179 */ val TupleType: typingsSlinky.typescript.mod.SyntaxKind.TupleType with Double = js.native
  
  @js.native
  sealed trait TypeAliasDeclaration extends SyntaxKind
  /* 254 */ val TypeAliasDeclaration: typingsSlinky.typescript.mod.SyntaxKind.TypeAliasDeclaration with Double = js.native
  
  @js.native
  sealed trait TypeAssertionExpression extends SyntaxKind
  /* 206 */ val TypeAssertionExpression: typingsSlinky.typescript.mod.SyntaxKind.TypeAssertionExpression with Double = js.native
  
  @js.native
  sealed trait TypeKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 149 */ val TypeKeyword: typingsSlinky.typescript.mod.SyntaxKind.TypeKeyword with Double = js.native
  
  @js.native
  sealed trait TypeLiteral extends SyntaxKind
  /* 177 */ val TypeLiteral: typingsSlinky.typescript.mod.SyntaxKind.TypeLiteral with Double = js.native
  
  @js.native
  sealed trait TypeOfExpression extends SyntaxKind
  /* 211 */ val TypeOfExpression: typingsSlinky.typescript.mod.SyntaxKind.TypeOfExpression with Double = js.native
  
  @js.native
  sealed trait TypeOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 111 */ val TypeOfKeyword: typingsSlinky.typescript.mod.SyntaxKind.TypeOfKeyword with Double = js.native
  
  @js.native
  sealed trait TypeOperator extends SyntaxKind
  /* 188 */ val TypeOperator: typingsSlinky.typescript.mod.SyntaxKind.TypeOperator with Double = js.native
  
  @js.native
  sealed trait TypeParameter extends SyntaxKind
  /* 159 */ val TypeParameter: typingsSlinky.typescript.mod.SyntaxKind.TypeParameter with Double = js.native
  
  @js.native
  sealed trait TypePredicate extends SyntaxKind
  /* 172 */ val TypePredicate: typingsSlinky.typescript.mod.SyntaxKind.TypePredicate with Double = js.native
  
  @js.native
  sealed trait TypeQuery extends SyntaxKind
  /* 176 */ val TypeQuery: typingsSlinky.typescript.mod.SyntaxKind.TypeQuery with Double = js.native
  
  @js.native
  sealed trait TypeReference extends SyntaxKind
  /* 173 */ val TypeReference: typingsSlinky.typescript.mod.SyntaxKind.TypeReference with Double = js.native
  
  @js.native
  sealed trait UndefinedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 150 */ val UndefinedKeyword: typingsSlinky.typescript.mod.SyntaxKind.UndefinedKeyword with Double = js.native
  
  @js.native
  sealed trait UnionType extends SyntaxKind
  /* 182 */ val UnionType: typingsSlinky.typescript.mod.SyntaxKind.UnionType with Double = js.native
  
  @js.native
  sealed trait UniqueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 151 */ val UniqueKeyword: typingsSlinky.typescript.mod.SyntaxKind.UniqueKeyword with Double = js.native
  
  @js.native
  sealed trait Unknown
    extends SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 0 */ val Unknown: typingsSlinky.typescript.mod.SyntaxKind.Unknown with Double = js.native
  
  @js.native
  sealed trait UnknownKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 152 */ val UnknownKeyword: typingsSlinky.typescript.mod.SyntaxKind.UnknownKeyword with Double = js.native
  
  @js.native
  sealed trait UnparsedInternalText extends SyntaxKind
  /* 295 */ val UnparsedInternalText: typingsSlinky.typescript.mod.SyntaxKind.UnparsedInternalText with Double = js.native
  
  @js.native
  sealed trait UnparsedPrepend extends SyntaxKind
  /* 293 */ val UnparsedPrepend: typingsSlinky.typescript.mod.SyntaxKind.UnparsedPrepend with Double = js.native
  
  @js.native
  sealed trait UnparsedPrologue extends SyntaxKind
  /* 292 */ val UnparsedPrologue: typingsSlinky.typescript.mod.SyntaxKind.UnparsedPrologue with Double = js.native
  
  @js.native
  sealed trait UnparsedSource extends SyntaxKind
  /* 299 */ val UnparsedSource: typingsSlinky.typescript.mod.SyntaxKind.UnparsedSource with Double = js.native
  
  @js.native
  sealed trait UnparsedSyntheticReference extends SyntaxKind
  /* 296 */ val UnparsedSyntheticReference: typingsSlinky.typescript.mod.SyntaxKind.UnparsedSyntheticReference with Double = js.native
  
  @js.native
  sealed trait UnparsedText extends SyntaxKind
  /* 294 */ val UnparsedText: typingsSlinky.typescript.mod.SyntaxKind.UnparsedText with Double = js.native
  
  @js.native
  sealed trait VarKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 112 */ val VarKeyword: typingsSlinky.typescript.mod.SyntaxKind.VarKeyword with Double = js.native
  
  @js.native
  sealed trait VariableDeclaration extends SyntaxKind
  /* 249 */ val VariableDeclaration: typingsSlinky.typescript.mod.SyntaxKind.VariableDeclaration with Double = js.native
  
  @js.native
  sealed trait VariableDeclarationList extends SyntaxKind
  /* 250 */ val VariableDeclarationList: typingsSlinky.typescript.mod.SyntaxKind.VariableDeclarationList with Double = js.native
  
  @js.native
  sealed trait VariableStatement extends SyntaxKind
  /* 232 */ val VariableStatement: typingsSlinky.typescript.mod.SyntaxKind.VariableStatement with Double = js.native
  
  @js.native
  sealed trait VoidExpression extends SyntaxKind
  /* 212 */ val VoidExpression: typingsSlinky.typescript.mod.SyntaxKind.VoidExpression with Double = js.native
  
  @js.native
  sealed trait VoidKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 113 */ val VoidKeyword: typingsSlinky.typescript.mod.SyntaxKind.VoidKeyword with Double = js.native
  
  @js.native
  sealed trait WhileKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 114 */ val WhileKeyword: typingsSlinky.typescript.mod.SyntaxKind.WhileKeyword with Double = js.native
  
  @js.native
  sealed trait WhileStatement extends SyntaxKind
  /* 236 */ val WhileStatement: typingsSlinky.typescript.mod.SyntaxKind.WhileStatement with Double = js.native
  
  @js.native
  sealed trait WhitespaceTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 5 */ val WhitespaceTrivia: typingsSlinky.typescript.mod.SyntaxKind.WhitespaceTrivia with Double = js.native
  
  @js.native
  sealed trait WithKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 115 */ val WithKeyword: typingsSlinky.typescript.mod.SyntaxKind.WithKeyword with Double = js.native
  
  @js.native
  sealed trait WithStatement extends SyntaxKind
  /* 243 */ val WithStatement: typingsSlinky.typescript.mod.SyntaxKind.WithStatement with Double = js.native
  
  @js.native
  sealed trait YieldExpression extends SyntaxKind
  /* 219 */ val YieldExpression: typingsSlinky.typescript.mod.SyntaxKind.YieldExpression with Double = js.native
  
  @js.native
  sealed trait YieldKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 124 */ val YieldKeyword: typingsSlinky.typescript.mod.SyntaxKind.YieldKeyword with Double = js.native
}
