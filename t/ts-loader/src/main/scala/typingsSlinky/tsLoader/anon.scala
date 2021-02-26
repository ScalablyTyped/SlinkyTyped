package typingsSlinky.tsLoader

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tsLoader.interfacesMod.TSInstance
import typingsSlinky.tsLoader.interfacesMod.WebpackError
import typingsSlinky.tsLoader.interfacesMod.WebpackModule
import typingsSlinky.tsLoader.tsLoaderBooleans.`false`
import typingsSlinky.tsLoader.tsLoaderStrings.dts
import typingsSlinky.tsLoader.tsLoaderStrings.js_
import typingsSlinky.tsLoader.tsLoaderStrings.quit
import typingsSlinky.typescript.anon.Config
import typingsSlinky.typescript.anon.Errors
import typingsSlinky.typescript.anon.ExpressionWithTypeArgumen
import typingsSlinky.typescript.anon.FileExists
import typingsSlinky.typescript.anon.Options
import typingsSlinky.typescript.mod.AccessExpression
import typingsSlinky.typescript.mod.ArrayBindingElement
import typingsSlinky.typescript.mod.ArrayBindingPattern
import typingsSlinky.typescript.mod.ArrayLiteralExpression
import typingsSlinky.typescript.mod.ArrayTypeNode
import typingsSlinky.typescript.mod.ArrowFunction
import typingsSlinky.typescript.mod.AsExpression
import typingsSlinky.typescript.mod.AssertsKeyword
import typingsSlinky.typescript.mod.AwaitExpression
import typingsSlinky.typescript.mod.AwaitKeyword
import typingsSlinky.typescript.mod.BigIntLiteral
import typingsSlinky.typescript.mod.BinaryExpression
import typingsSlinky.typescript.mod.BinaryOperator
import typingsSlinky.typescript.mod.BinaryOperatorToken
import typingsSlinky.typescript.mod.BindingElement
import typingsSlinky.typescript.mod.BindingName
import typingsSlinky.typescript.mod.Block
import typingsSlinky.typescript.mod.BooleanLiteral
import typingsSlinky.typescript.mod.BreakStatement
import typingsSlinky.typescript.mod.BuildOptions
import typingsSlinky.typescript.mod.BuilderProgram
import typingsSlinky.typescript.mod.BuilderProgramHost
import typingsSlinky.typescript.mod.Bundle
import typingsSlinky.typescript.mod.CallChain
import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.CallSignatureDeclaration
import typingsSlinky.typescript.mod.CancellationToken
import typingsSlinky.typescript.mod.CaseBlock
import typingsSlinky.typescript.mod.CaseClause
import typingsSlinky.typescript.mod.CaseOrDefaultClause
import typingsSlinky.typescript.mod.CatchClause
import typingsSlinky.typescript.mod.ClassDeclaration
import typingsSlinky.typescript.mod.ClassElement
import typingsSlinky.typescript.mod.ClassExpression
import typingsSlinky.typescript.mod.Classifier
import typingsSlinky.typescript.mod.ColonToken
import typingsSlinky.typescript.mod.CommaListExpression
import typingsSlinky.typescript.mod.CommentKind
import typingsSlinky.typescript.mod.CommentRange
import typingsSlinky.typescript.mod.CompilerHost
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ComputedPropertyName
import typingsSlinky.typescript.mod.ConciseBody
import typingsSlinky.typescript.mod.ConditionalExpression
import typingsSlinky.typescript.mod.ConditionalTypeNode
import typingsSlinky.typescript.mod.ConstructSignatureDeclaration
import typingsSlinky.typescript.mod.ConstructorDeclaration
import typingsSlinky.typescript.mod.ConstructorTypeNode
import typingsSlinky.typescript.mod.ContinueStatement
import typingsSlinky.typescript.mod.CreateProgramOptions
import typingsSlinky.typescript.mod.CreateProgram_
import typingsSlinky.typescript.mod.DebuggerStatement
import typingsSlinky.typescript.mod.Declaration
import typingsSlinky.typescript.mod.DeclarationName
import typingsSlinky.typescript.mod.DeclarationWithTypeParameters
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.DefaultClause
import typingsSlinky.typescript.mod.DeleteExpression
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.DiagnosticMessageChain
import typingsSlinky.typescript.mod.DiagnosticReporter
import typingsSlinky.typescript.mod.DoStatement
import typingsSlinky.typescript.mod.DocumentRegistry
import typingsSlinky.typescript.mod.DotDotDotToken
import typingsSlinky.typescript.mod.EditorOptions
import typingsSlinky.typescript.mod.EditorSettings
import typingsSlinky.typescript.mod.ElementAccessChain
import typingsSlinky.typescript.mod.ElementAccessExpression
import typingsSlinky.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typingsSlinky.typescript.mod.EmitFlags
import typingsSlinky.typescript.mod.EmitHelper
import typingsSlinky.typescript.mod.EmptyStatement
import typingsSlinky.typescript.mod.EntityName
import typingsSlinky.typescript.mod.EnumDeclaration
import typingsSlinky.typescript.mod.EnumMember
import typingsSlinky.typescript.mod.EqualsGreaterThanToken
import typingsSlinky.typescript.mod.ErrorCallback
import typingsSlinky.typescript.mod.ExclamationToken
import typingsSlinky.typescript.mod.ExportAssignment
import typingsSlinky.typescript.mod.ExportDeclaration
import typingsSlinky.typescript.mod.ExportSpecifier
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ExpressionStatement
import typingsSlinky.typescript.mod.ExpressionWithTypeArguments
import typingsSlinky.typescript.mod.ExtendedConfigCacheEntry
import typingsSlinky.typescript.mod.ExternalModuleReference
import typingsSlinky.typescript.mod.FalseLiteral
import typingsSlinky.typescript.mod.FileExtensionInfo
import typingsSlinky.typescript.mod.FileReference
import typingsSlinky.typescript.mod.ForInStatement
import typingsSlinky.typescript.mod.ForInitializer
import typingsSlinky.typescript.mod.ForOfStatement
import typingsSlinky.typescript.mod.ForStatement
import typingsSlinky.typescript.mod.FormatCodeSettings
import typingsSlinky.typescript.mod.FormatDiagnosticsHost
import typingsSlinky.typescript.mod.FunctionBody
import typingsSlinky.typescript.mod.FunctionDeclaration
import typingsSlinky.typescript.mod.FunctionExpression
import typingsSlinky.typescript.mod.FunctionLikeDeclaration
import typingsSlinky.typescript.mod.FunctionTypeNode
import typingsSlinky.typescript.mod.GeneratedIdentifierFlags
import typingsSlinky.typescript.mod.GetAccessorDeclaration
import typingsSlinky.typescript.mod.GetEffectiveTypeRootsHost
import typingsSlinky.typescript.mod.HeritageClause
import typingsSlinky.typescript.mod.IScriptSnapshot
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.IfStatement
import typingsSlinky.typescript.mod.ImportClause
import typingsSlinky.typescript.mod.ImportDeclaration
import typingsSlinky.typescript.mod.ImportEqualsDeclaration
import typingsSlinky.typescript.mod.ImportSpecifier
import typingsSlinky.typescript.mod.ImportTypeNode
import typingsSlinky.typescript.mod.IncrementalProgramOptions
import typingsSlinky.typescript.mod.IndexSignatureDeclaration
import typingsSlinky.typescript.mod.IndexedAccessTypeNode
import typingsSlinky.typescript.mod.InferTypeNode
import typingsSlinky.typescript.mod.InputFiles
import typingsSlinky.typescript.mod.InterfaceDeclaration
import typingsSlinky.typescript.mod.IntersectionTypeNode
import typingsSlinky.typescript.mod.JSDoc
import typingsSlinky.typescript.mod.JSDocAugmentsTag
import typingsSlinky.typescript.mod.JSDocAuthorTag
import typingsSlinky.typescript.mod.JSDocCallbackTag
import typingsSlinky.typescript.mod.JSDocClassTag
import typingsSlinky.typescript.mod.JSDocDeprecatedTag
import typingsSlinky.typescript.mod.JSDocEnumTag
import typingsSlinky.typescript.mod.JSDocImplementsTag
import typingsSlinky.typescript.mod.JSDocNamespaceDeclaration
import typingsSlinky.typescript.mod.JSDocParameterTag
import typingsSlinky.typescript.mod.JSDocPrivateTag
import typingsSlinky.typescript.mod.JSDocPropertyLikeTag
import typingsSlinky.typescript.mod.JSDocPropertyTag
import typingsSlinky.typescript.mod.JSDocProtectedTag
import typingsSlinky.typescript.mod.JSDocPublicTag
import typingsSlinky.typescript.mod.JSDocReadonlyTag
import typingsSlinky.typescript.mod.JSDocReturnTag
import typingsSlinky.typescript.mod.JSDocSignature
import typingsSlinky.typescript.mod.JSDocTag
import typingsSlinky.typescript.mod.JSDocTemplateTag
import typingsSlinky.typescript.mod.JSDocThisTag
import typingsSlinky.typescript.mod.JSDocTypeExpression
import typingsSlinky.typescript.mod.JSDocTypeLiteral
import typingsSlinky.typescript.mod.JSDocTypeTag
import typingsSlinky.typescript.mod.JSDocTypedefTag
import typingsSlinky.typescript.mod.JSDocUnknownTag
import typingsSlinky.typescript.mod.JsonSourceFile
import typingsSlinky.typescript.mod.JsxAttribute
import typingsSlinky.typescript.mod.JsxAttributeLike
import typingsSlinky.typescript.mod.JsxAttributes
import typingsSlinky.typescript.mod.JsxChild
import typingsSlinky.typescript.mod.JsxClosingElement
import typingsSlinky.typescript.mod.JsxClosingFragment
import typingsSlinky.typescript.mod.JsxElement
import typingsSlinky.typescript.mod.JsxExpression
import typingsSlinky.typescript.mod.JsxFragment
import typingsSlinky.typescript.mod.JsxOpeningElement
import typingsSlinky.typescript.mod.JsxOpeningFragment
import typingsSlinky.typescript.mod.JsxSelfClosingElement
import typingsSlinky.typescript.mod.JsxSpreadAttribute
import typingsSlinky.typescript.mod.JsxTagNameExpression
import typingsSlinky.typescript.mod.JsxText
import typingsSlinky.typescript.mod.KeywordTypeNode
import typingsSlinky.typescript.mod.KeywordTypeSyntaxKind
import typingsSlinky.typescript.mod.LabeledStatement
import typingsSlinky.typescript.mod.LanguageService
import typingsSlinky.typescript.mod.LanguageServiceHost
import typingsSlinky.typescript.mod.LanguageServiceMode
import typingsSlinky.typescript.mod.LanguageVariant
import typingsSlinky.typescript.mod.LineAndCharacter
import typingsSlinky.typescript.mod.LiteralExpression
import typingsSlinky.typescript.mod.LiteralTypeNode
import typingsSlinky.typescript.mod.Map
import typingsSlinky.typescript.mod.MappedTypeNode
import typingsSlinky.typescript.mod.MetaProperty
import typingsSlinky.typescript.mod.MethodDeclaration
import typingsSlinky.typescript.mod.MethodSignature
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.ModifierFlags
import typingsSlinky.typescript.mod.ModifierSyntaxKind
import typingsSlinky.typescript.mod.ModifierToken
import typingsSlinky.typescript.mod.ModuleBlock
import typingsSlinky.typescript.mod.ModuleDeclaration
import typingsSlinky.typescript.mod.ModuleName
import typingsSlinky.typescript.mod.ModuleReference
import typingsSlinky.typescript.mod.ModuleResolutionCache
import typingsSlinky.typescript.mod.ModuleResolutionHost
import typingsSlinky.typescript.mod.NamedExportBindings
import typingsSlinky.typescript.mod.NamedExports
import typingsSlinky.typescript.mod.NamedImportBindings
import typingsSlinky.typescript.mod.NamedImports
import typingsSlinky.typescript.mod.NamedTupleMember
import typingsSlinky.typescript.mod.NamespaceDeclaration
import typingsSlinky.typescript.mod.NamespaceExport
import typingsSlinky.typescript.mod.NamespaceExportDeclaration
import typingsSlinky.typescript.mod.NamespaceImport
import typingsSlinky.typescript.mod.NewExpression
import typingsSlinky.typescript.mod.NoSubstitutionTemplateLiteral
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.NodeFactory
import typingsSlinky.typescript.mod.NodeFlags
import typingsSlinky.typescript.mod.NodesVisitor
import typingsSlinky.typescript.mod.NonNullChain
import typingsSlinky.typescript.mod.NonNullExpression
import typingsSlinky.typescript.mod.NonRelativeModuleNameResolutionCache
import typingsSlinky.typescript.mod.NotEmittedStatement
import typingsSlinky.typescript.mod.NullLiteral
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.ObjectBindingPattern
import typingsSlinky.typescript.mod.ObjectLiteralElementLike
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import typingsSlinky.typescript.mod.OmittedExpression
import typingsSlinky.typescript.mod.OptionalTypeNode
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.ParenthesizedExpression
import typingsSlinky.typescript.mod.ParenthesizedTypeNode
import typingsSlinky.typescript.mod.ParseConfigFileHost
import typingsSlinky.typescript.mod.ParseConfigHost
import typingsSlinky.typescript.mod.ParsedCommandLine
import typingsSlinky.typescript.mod.PartiallyEmittedExpression
import typingsSlinky.typescript.mod.Path
import typingsSlinky.typescript.mod.PostfixUnaryExpression
import typingsSlinky.typescript.mod.PostfixUnaryOperator
import typingsSlinky.typescript.mod.PreProcessedFileInfo
import typingsSlinky.typescript.mod.PrefixUnaryExpression
import typingsSlinky.typescript.mod.PrefixUnaryOperator
import typingsSlinky.typescript.mod.PrimaryExpression
import typingsSlinky.typescript.mod.PrintHandlers
import typingsSlinky.typescript.mod.Printer
import typingsSlinky.typescript.mod.PrinterOptions
import typingsSlinky.typescript.mod.PrivateIdentifier
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.ProjectReference
import typingsSlinky.typescript.mod.PropertyAccessChain
import typingsSlinky.typescript.mod.PropertyAccessExpression
import typingsSlinky.typescript.mod.PropertyAssignment
import typingsSlinky.typescript.mod.PropertyDeclaration
import typingsSlinky.typescript.mod.PropertyName
import typingsSlinky.typescript.mod.PropertySignature
import typingsSlinky.typescript.mod.PseudoBigInt
import typingsSlinky.typescript.mod.Push
import typingsSlinky.typescript.mod.QualifiedName
import typingsSlinky.typescript.mod.QuestionDotToken
import typingsSlinky.typescript.mod.QuestionToken
import typingsSlinky.typescript.mod.ReadBuildProgramHost
import typingsSlinky.typescript.mod.ReadonlyKeyword
import typingsSlinky.typescript.mod.RegularExpressionLiteral
import typingsSlinky.typescript.mod.ReportEmitErrorSummary
import typingsSlinky.typescript.mod.ResolveProjectReferencePathHost
import typingsSlinky.typescript.mod.ResolvedConfigFileName
import typingsSlinky.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsSlinky.typescript.mod.ResolvedProjectReference
import typingsSlinky.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import typingsSlinky.typescript.mod.RestTypeNode
import typingsSlinky.typescript.mod.ReturnStatement
import typingsSlinky.typescript.mod.Scanner
import typingsSlinky.typescript.mod.ScriptKind
import typingsSlinky.typescript.mod.ScriptTarget
import typingsSlinky.typescript.mod.SemanticDiagnosticsBuilderProgram
import typingsSlinky.typescript.mod.SemicolonClassElement
import typingsSlinky.typescript.mod.SetAccessorDeclaration
import typingsSlinky.typescript.mod.ShorthandPropertyAssignment
import typingsSlinky.typescript.mod.SignatureDeclaration
import typingsSlinky.typescript.mod.SolutionBuilder
import typingsSlinky.typescript.mod.SolutionBuilderHost
import typingsSlinky.typescript.mod.SolutionBuilderWithWatchHost
import typingsSlinky.typescript.mod.SortedReadonlyArray
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.SourceFileLike
import typingsSlinky.typescript.mod.SourceMapRange
import typingsSlinky.typescript.mod.SourceMapSource
import typingsSlinky.typescript.mod.SpreadAssignment
import typingsSlinky.typescript.mod.SpreadElement
import typingsSlinky.typescript.mod.Statement
import typingsSlinky.typescript.mod.StringLiteral
import typingsSlinky.typescript.mod.SuperExpression
import typingsSlinky.typescript.mod.SwitchStatement
import typingsSlinky.typescript.mod.Symbol
import typingsSlinky.typescript.mod.SymbolDisplayPart
import typingsSlinky.typescript.mod.SyntaxKind
import typingsSlinky.typescript.mod.SyntaxKind.AmpersandAmpersandEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.AmpersandAmpersandToken
import typingsSlinky.typescript.mod.SyntaxKind.AmpersandEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.AmpersandToken
import typingsSlinky.typescript.mod.SyntaxKind.AsteriskAsteriskEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.AsteriskAsteriskToken
import typingsSlinky.typescript.mod.SyntaxKind.AsteriskEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.AsteriskToken
import typingsSlinky.typescript.mod.SyntaxKind.BarBarEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.BarBarToken
import typingsSlinky.typescript.mod.SyntaxKind.BarEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.BarToken
import typingsSlinky.typescript.mod.SyntaxKind.CaretEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.CaretToken
import typingsSlinky.typescript.mod.SyntaxKind.CommaToken
import typingsSlinky.typescript.mod.SyntaxKind.EqualsEqualsEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.EqualsEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.EqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.ExclamationEqualsEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.ExclamationEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.ExtendsKeyword
import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken
import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanGreaterThanToken
import typingsSlinky.typescript.mod.SyntaxKind.GreaterThanToken
import typingsSlinky.typescript.mod.SyntaxKind.ImplementsKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ImportKeyword
import typingsSlinky.typescript.mod.SyntaxKind.InKeyword
import typingsSlinky.typescript.mod.SyntaxKind.InstanceOfKeyword
import typingsSlinky.typescript.mod.SyntaxKind.KeyOfKeyword
import typingsSlinky.typescript.mod.SyntaxKind.LessThanEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.LessThanLessThanEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.LessThanLessThanToken
import typingsSlinky.typescript.mod.SyntaxKind.LessThanToken
import typingsSlinky.typescript.mod.SyntaxKind.MinusEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.MinusToken
import typingsSlinky.typescript.mod.SyntaxKind.MultiLineCommentTrivia
import typingsSlinky.typescript.mod.SyntaxKind.NewKeyword
import typingsSlinky.typescript.mod.SyntaxKind.PercentEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.PercentToken
import typingsSlinky.typescript.mod.SyntaxKind.PlusEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.PlusToken
import typingsSlinky.typescript.mod.SyntaxKind.QuestionQuestionEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.QuestionQuestionToken
import typingsSlinky.typescript.mod.SyntaxKind.SingleLineCommentTrivia
import typingsSlinky.typescript.mod.SyntaxKind.SlashEqualsToken
import typingsSlinky.typescript.mod.SyntaxKind.SlashToken
import typingsSlinky.typescript.mod.SyntaxKind.UniqueKeyword
import typingsSlinky.typescript.mod.SynthesizedComment
import typingsSlinky.typescript.mod.System
import typingsSlinky.typescript.mod.TaggedTemplateExpression
import typingsSlinky.typescript.mod.TemplateExpression
import typingsSlinky.typescript.mod.TemplateHead
import typingsSlinky.typescript.mod.TemplateLiteral
import typingsSlinky.typescript.mod.TemplateMiddle
import typingsSlinky.typescript.mod.TemplateSpan
import typingsSlinky.typescript.mod.TemplateTail
import typingsSlinky.typescript.mod.TextChangeRange
import typingsSlinky.typescript.mod.TextRange
import typingsSlinky.typescript.mod.TextSpan
import typingsSlinky.typescript.mod.ThisExpression
import typingsSlinky.typescript.mod.ThisTypeNode
import typingsSlinky.typescript.mod.ThrowStatement
import typingsSlinky.typescript.mod.Token
import typingsSlinky.typescript.mod.TokenFlags
import typingsSlinky.typescript.mod.TransformationContext
import typingsSlinky.typescript.mod.TransformationResult
import typingsSlinky.typescript.mod.TransformerFactory
import typingsSlinky.typescript.mod.TranspileOptions
import typingsSlinky.typescript.mod.TranspileOutput
import typingsSlinky.typescript.mod.TrueLiteral
import typingsSlinky.typescript.mod.TryStatement
import typingsSlinky.typescript.mod.TsConfigSourceFile
import typingsSlinky.typescript.mod.TupleTypeNode
import typingsSlinky.typescript.mod.TypeAliasDeclaration
import typingsSlinky.typescript.mod.TypeAssertion
import typingsSlinky.typescript.mod.TypeElement
import typingsSlinky.typescript.mod.TypeLiteralNode
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeOfExpression
import typingsSlinky.typescript.mod.TypeOperatorNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import typingsSlinky.typescript.mod.TypePredicateNode
import typingsSlinky.typescript.mod.TypeQueryNode
import typingsSlinky.typescript.mod.TypeReferenceNode
import typingsSlinky.typescript.mod.UnionTypeNode
import typingsSlinky.typescript.mod.UnparsedSource
import typingsSlinky.typescript.mod.VariableDeclaration
import typingsSlinky.typescript.mod.VariableDeclarationList
import typingsSlinky.typescript.mod.VariableStatement
import typingsSlinky.typescript.mod.Visitor
import typingsSlinky.typescript.mod.VoidExpression
import typingsSlinky.typescript.mod.WatchCompilerHostOfConfigFile
import typingsSlinky.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import typingsSlinky.typescript.mod.WatchOfConfigFile
import typingsSlinky.typescript.mod.WatchOfFilesAndCompilerOptions
import typingsSlinky.typescript.mod.WatchOptions
import typingsSlinky.typescript.mod.WatchStatusReporter
import typingsSlinky.typescript.mod.WhileStatement
import typingsSlinky.typescript.mod.WithStatement
import typingsSlinky.typescript.mod.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Character extends StObject {
    
    var character: Double = js.native
    
    var line: Double = js.native
  }
  object Character {
    
    @scala.inline
    def apply(character: Double, line: Double): Character = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Character]
    }
    
    @scala.inline
    implicit class CharacterMutableBuilder[Self <: Character] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Compiler extends StObject {
    
    var compiler: js.UndefOr[Typeoftypescript] = js.native
    
    var compilerCompatible: Boolean = js.native
    
    var compilerDetailsLogMessage: js.UndefOr[String] = js.native
    
    var errorMessage: js.UndefOr[String] = js.native
  }
  object Compiler {
    
    @scala.inline
    def apply(compilerCompatible: Boolean): Compiler = {
      val __obj = js.Dynamic.literal(compilerCompatible = compilerCompatible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compiler]
    }
    
    @scala.inline
    implicit class CompilerMutableBuilder[Self <: Compiler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiler(value: Typeoftypescript): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerCompatible(value: Boolean): Self = StObject.set(x, "compilerCompatible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerDetailsLogMessage(value: String): Self = StObject.set(x, "compilerDetailsLogMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerDetailsLogMessageUndefined: Self = StObject.set(x, "compilerDetailsLogMessage", js.undefined)
      
      @scala.inline
      def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    }
  }
  
  @js.native
  trait ConfigFile extends StObject {
    
    var configFile: typingsSlinky.tsLoader.configMod.ConfigFile = js.native
    
    var configFileError: js.UndefOr[WebpackError] = js.native
    
    var configFilePath: js.UndefOr[String] = js.native
  }
  object ConfigFile {
    
    @scala.inline
    def apply(configFile: typingsSlinky.tsLoader.configMod.ConfigFile): ConfigFile = {
      val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigFile]
    }
    
    @scala.inline
    implicit class ConfigFileMutableBuilder[Self <: ConfigFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigFile(value: typingsSlinky.tsLoader.configMod.ConfigFile): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileError(value: WebpackError): Self = StObject.set(x, "configFileError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileErrorUndefined: Self = StObject.set(x, "configFileError", js.undefined)
      
      @scala.inline
      def setConfigFilePath(value: String): Self = StObject.set(x, "configFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFilePathUndefined: Self = StObject.set(x, "configFilePath", js.undefined)
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var error: js.UndefOr[WebpackError] = js.native
    
    var instance: js.UndefOr[TSInstance] = js.native
  }
  object Error {
    
    @scala.inline
    def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: WebpackError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInstance(value: TSInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    }
  }
  
  @js.native
  trait File extends StObject {
    
    var file: js.UndefOr[String] = js.native
    
    var module: js.UndefOr[WebpackModule] = js.native
  }
  object File {
    
    @scala.inline
    def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setModule(value: WebpackModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(
      typeReferenceDirectiveName: String,
      containingFile: js.UndefOr[scala.Nothing],
      options: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
    def apply(
      typeReferenceDirectiveName: String,
      containingFile: js.UndefOr[scala.Nothing],
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
    def apply(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
    def apply(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  }
  
  @js.native
  trait OutputFileName extends StObject {
    
    var outputFileName: js.UndefOr[String] = js.native
    
    /**
      * Undefined here means we’ve already checked and confirmed there is no
      * project reference for the file. Don’t bother checking again.
      */
    var project: js.UndefOr[ResolvedProjectReference] = js.native
  }
  object OutputFileName {
    
    @scala.inline
    def apply(): OutputFileName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputFileName]
    }
    
    @scala.inline
    implicit class OutputFileNameMutableBuilder[Self <: OutputFileName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputFileName(value: String): Self = StObject.set(x, "outputFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFileNameUndefined: Self = StObject.set(x, "outputFileName", js.undefined)
      
      @scala.inline
      def setProject(value: ResolvedProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    }
  }
  
  @js.native
  trait TsLoaderDefinitionFileVersions extends StObject {
    
    var tsLoaderDefinitionFileVersions: js.Array[String] = js.native
    
    var tsLoaderFileVersion: Double = js.native
  }
  object TsLoaderDefinitionFileVersions {
    
    @scala.inline
    def apply(tsLoaderDefinitionFileVersions: js.Array[String], tsLoaderFileVersion: Double): TsLoaderDefinitionFileVersions = {
      val __obj = js.Dynamic.literal(tsLoaderDefinitionFileVersions = tsLoaderDefinitionFileVersions.asInstanceOf[js.Any], tsLoaderFileVersion = tsLoaderFileVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[TsLoaderDefinitionFileVersions]
    }
    
    @scala.inline
    implicit class TsLoaderDefinitionFileVersionsMutableBuilder[Self <: TsLoaderDefinitionFileVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTsLoaderDefinitionFileVersions(value: js.Array[String]): Self = StObject.set(x, "tsLoaderDefinitionFileVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsLoaderDefinitionFileVersionsVarargs(value: String*): Self = StObject.set(x, "tsLoaderDefinitionFileVersions", js.Array(value :_*))
      
      @scala.inline
      def setTsLoaderFileVersion(value: Double): Self = StObject.set(x, "tsLoaderFileVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofScriptSnapshot extends StObject {
    
    def fromString(text: String): IScriptSnapshot = js.native
  }
  object TypeofScriptSnapshot {
    
    @scala.inline
    def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshot = {
      val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
      __obj.asInstanceOf[TypeofScriptSnapshot]
    }
    
    @scala.inline
    implicit class TypeofScriptSnapshotMutableBuilder[Self <: TypeofScriptSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromString(value: String => IScriptSnapshot): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Typeoftypescript extends StObject {
    
    var OperationCanceledException: Instantiable0[typingsSlinky.typescript.mod.OperationCanceledException] = js.native
    
    val ScriptSnapshot: TypeofScriptSnapshot = js.native
    
    /**
      * Adds an EmitHelper to a node.
      */
    def addEmitHelper[T /* <: Node */](node: T, helper: EmitHelper): T = js.native
    
    /**
      * Add EmitHelpers to a node.
      */
    def addEmitHelpers[T /* <: Node */](node: T): T = js.native
    def addEmitHelpers[T /* <: Node */](node: T, helpers: js.Array[EmitHelper]): T = js.native
    
    def addSyntheticLeadingComment[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: String): T = js.native
    def addSyntheticLeadingComment[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: String, hasTrailingNewLine: Boolean): T = js.native
    def addSyntheticLeadingComment[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: String): T = js.native
    def addSyntheticLeadingComment[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: String, hasTrailingNewLine: Boolean): T = js.native
    
    def addSyntheticTrailingComment[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: String): T = js.native
    def addSyntheticTrailingComment[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: String, hasTrailingNewLine: Boolean): T = js.native
    def addSyntheticTrailingComment[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: String): T = js.native
    def addSyntheticTrailingComment[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: String, hasTrailingNewLine: Boolean): T = js.native
    
    def classicNameResolver(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def classicNameResolver(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: js.UndefOr[scala.Nothing],
      redirectedReference: ResolvedProjectReference
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def classicNameResolver(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: NonRelativeModuleNameResolutionCache
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def classicNameResolver(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: NonRelativeModuleNameResolutionCache,
      redirectedReference: ResolvedProjectReference
    ): ResolvedModuleWithFailedLookupLocations = js.native
    
    /**
      * Called to merge all the changes that occurred across several versions of a script snapshot
      * into a single change.  i.e. if a user keeps making successive edits to a script we will
      * have a text change from V1 to V2, V2 to V3, ..., Vn.
      *
      * This function will then merge those changes into a single change range valid between V1 and
      * Vn.
      */
    def collapseTextChangeRangesAcrossMultipleVersions(changes: js.Array[TextChangeRange]): TextChangeRange = js.native
    
    def convertCompilerOptionsFromJson(jsonOptions: js.Any, basePath: String): Errors = js.native
    def convertCompilerOptionsFromJson(jsonOptions: js.Any, basePath: String, configFileName: String): Errors = js.native
    
    def convertToObject(sourceFile: JsonSourceFile, errors: Push[Diagnostic]): js.Any = js.native
    
    def convertTypeAcquisitionFromJson(jsonOptions: js.Any, basePath: String): Options = js.native
    def convertTypeAcquisitionFromJson(jsonOptions: js.Any, basePath: String, configFileName: String): Options = js.native
    
    def couldStartTrivia(text: String, pos: Double): Boolean = js.native
    
    /**
      * Creates a builder thats just abstraction over program and can be used with watch
      */
    def createAbstractBuilder(newProgram: Program, host: BuilderProgramHost): BuilderProgram = js.native
    def createAbstractBuilder(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: js.UndefOr[scala.Nothing],
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): BuilderProgram = js.native
    def createAbstractBuilder(newProgram: Program, host: BuilderProgramHost, oldProgram: BuilderProgram): BuilderProgram = js.native
    def createAbstractBuilder(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: BuilderProgram,
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): BuilderProgram = js.native
    def createAbstractBuilder(
      rootNames: js.UndefOr[js.Array[String]],
      options: js.UndefOr[CompilerOptions],
      host: js.UndefOr[CompilerHost],
      oldProgram: js.UndefOr[BuilderProgram],
      configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
      projectReferences: js.UndefOr[js.Array[ProjectReference]]
    ): BuilderProgram = js.native
    
    /** @deprecated Use `factory.createAdd` or the factory supplied by your transformation context instead. */
    def createAdd(left: Expression, right: Expression): BinaryExpression = js.native
    
    /** @deprecated Use `factory.createArrayBindingPattern` or the factory supplied by your transformation context instead. */
    def createArrayBindingPattern(elements: js.Array[ArrayBindingElement]): ArrayBindingPattern = js.native
    
    /** @deprecated Use `factory.createArrayLiteral` or the factory supplied by your transformation context instead. */
    def createArrayLiteral(): ArrayLiteralExpression = js.native
    def createArrayLiteral(elements: js.UndefOr[scala.Nothing], multiLine: Boolean): ArrayLiteralExpression = js.native
    def createArrayLiteral(elements: js.Array[Expression]): ArrayLiteralExpression = js.native
    def createArrayLiteral(elements: js.Array[Expression], multiLine: Boolean): ArrayLiteralExpression = js.native
    
    /** @deprecated Use `factory.createArrayTypeNode` or the factory supplied by your transformation context instead. */
    def createArrayTypeNode(elementType: TypeNode): ArrayTypeNode = js.native
    
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    /** @deprecated Use `factory.createArrowFunction` or the factory supplied by your transformation context instead. */
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: ConciseBody
    ): ArrowFunction = js.native
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    /** @deprecated Use `factory.createArrowFunction` or the factory supplied by your transformation context instead. */
    def createArrowFunction(
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    
    /** @deprecated Use `factory.createAsExpression` or the factory supplied by your transformation context instead. */
    def createAsExpression(expression: Expression, `type`: TypeNode): AsExpression = js.native
    
    /** @deprecated Use `factory.createAssignment` or the factory supplied by your transformation context instead. */
    def createAssignment(left: Expression, right: Expression): BinaryExpression = js.native
    
    /** @deprecated Use `factory.createAwait` or the factory supplied by your transformation context instead. */
    def createAwait(expression: Expression): AwaitExpression = js.native
    
    /** @deprecated Use `factory.createBigIntLiteral` or the factory supplied by your transformation context instead. */
    def createBigIntLiteral(value: String): BigIntLiteral = js.native
    def createBigIntLiteral(value: PseudoBigInt): BigIntLiteral = js.native
    
    def createBinary(left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: AmpersandAmpersandEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: AmpersandAmpersandToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: AmpersandEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: AmpersandToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: AsteriskAsteriskEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: AsteriskAsteriskToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: AsteriskEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: AsteriskToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: BarBarEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: BarBarToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: BarEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: BarToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: CaretEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: CaretToken, right: Expression): BinaryExpression = js.native
    /** @deprecated Use `factory.createBinary` or the factory supplied by your transformation context instead. */
    def createBinary(left: Expression, operator: CommaToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: EqualsEqualsEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: EqualsEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: EqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: ExclamationEqualsEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: ExclamationEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: GreaterThanEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: GreaterThanGreaterThanEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: GreaterThanGreaterThanGreaterThanEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: GreaterThanGreaterThanGreaterThanToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: GreaterThanGreaterThanToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: GreaterThanToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: InKeyword, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: InstanceOfKeyword, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: LessThanEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: LessThanLessThanEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: LessThanLessThanToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: LessThanToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: MinusEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: MinusToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: PercentEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: PercentToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: PlusEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: PlusToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: QuestionQuestionEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: QuestionQuestionToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: SlashEqualsToken, right: Expression): BinaryExpression = js.native
    def createBinary(left: Expression, operator: SlashToken, right: Expression): BinaryExpression = js.native
    
    /** @deprecated Use `factory.createBindingElement` or the factory supplied by your transformation context instead. */
    def createBindingElement(
      dotDotDotToken: js.UndefOr[DotDotDotToken],
      propertyName: js.UndefOr[
          String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier
        ],
      name: String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
      initializer: js.UndefOr[Expression]
    ): BindingElement = js.native
    
    /** @deprecated Use `factory.createBlock` or the factory supplied by your transformation context instead. */
    def createBlock(statements: js.Array[Statement]): Block = js.native
    def createBlock(statements: js.Array[Statement], multiLine: Boolean): Block = js.native
    
    /** @deprecated Use `factory.createBreak` or the factory supplied by your transformation context instead. */
    def createBreak(): BreakStatement = js.native
    def createBreak(label: String): BreakStatement = js.native
    def createBreak(label: Identifier): BreakStatement = js.native
    
    /**
      * Create a function that reports watch status by writing to the system and handles the formating of the diagnostic
      */
    def createBuilderStatusReporter(system: System): DiagnosticReporter = js.native
    def createBuilderStatusReporter(system: System, pretty: Boolean): DiagnosticReporter = js.native
    
    /** @deprecated Use `factory.createBundle` or the factory supplied by your transformation context instead. */
    def createBundle(sourceFiles: js.Array[SourceFile]): Bundle = js.native
    def createBundle(sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
    
    /** @deprecated Use `factory.createCall` or the factory supplied by your transformation context instead. */
    def createCall(expression: Expression): CallExpression = js.native
    def createCall(
      expression: Expression,
      typeArguments: js.UndefOr[scala.Nothing],
      argumentsArray: js.Array[Expression]
    ): CallExpression = js.native
    def createCall(expression: Expression, typeArguments: js.Array[TypeNode]): CallExpression = js.native
    def createCall(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): CallExpression = js.native
    
    /** @deprecated Use `factory.createCallChain` or the factory supplied by your transformation context instead. */
    def createCallChain(expression: Expression): CallChain = js.native
    def createCallChain(
      expression: Expression,
      questionDotToken: js.UndefOr[scala.Nothing],
      typeArguments: js.UndefOr[scala.Nothing],
      argumentsArray: js.Array[Expression]
    ): CallChain = js.native
    def createCallChain(
      expression: Expression,
      questionDotToken: js.UndefOr[scala.Nothing],
      typeArguments: js.Array[TypeNode]
    ): CallChain = js.native
    def createCallChain(
      expression: Expression,
      questionDotToken: js.UndefOr[scala.Nothing],
      typeArguments: js.Array[TypeNode],
      argumentsArray: js.Array[Expression]
    ): CallChain = js.native
    def createCallChain(expression: Expression, questionDotToken: QuestionDotToken): CallChain = js.native
    def createCallChain(
      expression: Expression,
      questionDotToken: QuestionDotToken,
      typeArguments: js.UndefOr[scala.Nothing],
      argumentsArray: js.Array[Expression]
    ): CallChain = js.native
    def createCallChain(expression: Expression, questionDotToken: QuestionDotToken, typeArguments: js.Array[TypeNode]): CallChain = js.native
    def createCallChain(
      expression: Expression,
      questionDotToken: QuestionDotToken,
      typeArguments: js.Array[TypeNode],
      argumentsArray: js.Array[Expression]
    ): CallChain = js.native
    
    def createCallSignature(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
    def createCallSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): CallSignatureDeclaration = js.native
    /** @deprecated Use `factory.createCallSignature` or the factory supplied by your transformation context instead. */
    def createCallSignature(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
    def createCallSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): CallSignatureDeclaration = js.native
    
    /** @deprecated Use `factory.createCaseBlock` or the factory supplied by your transformation context instead. */
    def createCaseBlock(clauses: js.Array[CaseOrDefaultClause]): CaseBlock = js.native
    
    /** @deprecated Use `factory.createCaseClause` or the factory supplied by your transformation context instead. */
    def createCaseClause(expression: Expression, statements: js.Array[Statement]): CaseClause = js.native
    
    def createCatchClause(variableDeclaration: js.UndefOr[scala.Nothing], block: Block): CatchClause = js.native
    /** @deprecated Use `factory.createCatchClause` or the factory supplied by your transformation context instead. */
    def createCatchClause(variableDeclaration: String, block: Block): CatchClause = js.native
    def createCatchClause(variableDeclaration: VariableDeclaration, block: Block): CatchClause = js.native
    
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    /** @deprecated Use `factory.createClassDeclaration` or the factory supplied by your transformation context instead. */
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def createClassDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    /** @deprecated Use `factory.createClassExpression` or the factory supplied by your transformation context instead. */
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def createClassExpression(
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    
    /** The classifier is used for syntactic highlighting in editors via the TSServer */
    def createClassifier(): Classifier = js.native
    
    /** @deprecated Use `factory.createComma` or the factory supplied by your transformation context instead. */
    def createComma(left: Expression, right: Expression): Expression = js.native
    
    /** @deprecated Use `factory.createCommaList` or the factory supplied by your transformation context instead. */
    def createCommaList(elements: js.Array[Expression]): CommaListExpression = js.native
    
    def createCompilerHost(options: CompilerOptions): CompilerHost = js.native
    def createCompilerHost(options: CompilerOptions, setParentNodes: Boolean): CompilerHost = js.native
    
    /** @deprecated Use `factory.createComputedPropertyName` or the factory supplied by your transformation context instead. */
    def createComputedPropertyName(expression: Expression): ComputedPropertyName = js.native
    
    /** @deprecated Use `factory.createConditional` or the factory supplied by your transformation context instead. */
    def createConditional(
      condition: Expression,
      questionToken: QuestionToken,
      whenTrue: Expression,
      colonToken: ColonToken,
      whenFalse: Expression
    ): ConditionalExpression = js.native
    /** @deprecated Use `factory.createConditional` or the factory supplied by your transformation context instead. */
    def createConditional(condition: Expression, whenTrue: Expression, whenFalse: Expression): ConditionalExpression = js.native
    
    /** @deprecated Use `factory.createConditionalTypeNode` or the factory supplied by your transformation context instead. */
    def createConditionalTypeNode(checkType: TypeNode, extendsType: TypeNode, trueType: TypeNode, falseType: TypeNode): ConditionalTypeNode = js.native
    
    def createConstructSignature(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
    def createConstructSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): ConstructSignatureDeclaration = js.native
    /** @deprecated Use `factory.createConstructSignature` or the factory supplied by your transformation context instead. */
    def createConstructSignature(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
    def createConstructSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): ConstructSignatureDeclaration = js.native
    
    def createConstructor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration]
    ): ConstructorDeclaration = js.native
    def createConstructor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): ConstructorDeclaration = js.native
    def createConstructor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration]
    ): ConstructorDeclaration = js.native
    def createConstructor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): ConstructorDeclaration = js.native
    def createConstructor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration]
    ): ConstructorDeclaration = js.native
    def createConstructor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): ConstructorDeclaration = js.native
    /** @deprecated Use `factory.createConstructorDeclaration` or the factory supplied by your transformation context instead. */
    def createConstructor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration]
    ): ConstructorDeclaration = js.native
    def createConstructor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): ConstructorDeclaration = js.native
    
    def createConstructorTypeNode(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): ConstructorTypeNode = js.native
    /** @deprecated Use `factory.createConstructorTypeNode` or the factory supplied by your transformation context instead. */
    def createConstructorTypeNode(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): ConstructorTypeNode = js.native
    
    /** @deprecated Use `factory.createContinue` or the factory supplied by your transformation context instead. */
    def createContinue(): ContinueStatement = js.native
    def createContinue(label: String): ContinueStatement = js.native
    def createContinue(label: Identifier): ContinueStatement = js.native
    
    /** @deprecated Use `factory.createDebuggerStatement` or the factory supplied by your transformation context instead. */
    def createDebuggerStatement(): DebuggerStatement = js.native
    
    /** @deprecated Use `factory.createDecorator` or the factory supplied by your transformation context instead. */
    def createDecorator(expression: Expression): Decorator = js.native
    
    /** @deprecated Use `factory.createDefaultClause` or the factory supplied by your transformation context instead. */
    def createDefaultClause(statements: js.Array[Statement]): DefaultClause = js.native
    
    /** @deprecated Use `factory.createDelete` or the factory supplied by your transformation context instead. */
    def createDelete(expression: Expression): DeleteExpression = js.native
    
    /** @deprecated Use `factory.createDo` or the factory supplied by your transformation context instead. */
    def createDo(statement: Statement, expression: Expression): DoStatement = js.native
    
    def createDocumentRegistry(): DocumentRegistry = js.native
    def createDocumentRegistry(useCaseSensitiveFileNames: js.UndefOr[scala.Nothing], currentDirectory: String): DocumentRegistry = js.native
    def createDocumentRegistry(useCaseSensitiveFileNames: Boolean): DocumentRegistry = js.native
    def createDocumentRegistry(useCaseSensitiveFileNames: Boolean, currentDirectory: String): DocumentRegistry = js.native
    
    /** @deprecated Use `factory.createElementAccess` or the factory supplied by your transformation context instead. */
    def createElementAccess(expression: Expression, index: Double): ElementAccessExpression = js.native
    def createElementAccess(expression: Expression, index: Expression): ElementAccessExpression = js.native
    
    def createElementAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], index: Double): ElementAccessChain = js.native
    def createElementAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], index: Expression): ElementAccessChain = js.native
    /** @deprecated Use `factory.createElementAccessChain` or the factory supplied by your transformation context instead. */
    def createElementAccessChain(expression: Expression, questionDotToken: QuestionDotToken, index: Double): ElementAccessChain = js.native
    def createElementAccessChain(expression: Expression, questionDotToken: QuestionDotToken, index: Expression): ElementAccessChain = js.native
    
    /**
      * Create the builder that can handle the changes in program and iterate through changed files
      * to emit the those files and manage semantic diagnostics cache as well
      */
    def createEmitAndSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
    def createEmitAndSemanticDiagnosticsBuilderProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: js.UndefOr[scala.Nothing],
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
    def createEmitAndSemanticDiagnosticsBuilderProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
    ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
    def createEmitAndSemanticDiagnosticsBuilderProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
    def createEmitAndSemanticDiagnosticsBuilderProgram(
      rootNames: js.UndefOr[js.Array[String]],
      options: js.UndefOr[CompilerOptions],
      host: js.UndefOr[CompilerHost],
      oldProgram: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram],
      configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
      projectReferences: js.UndefOr[js.Array[ProjectReference]]
    ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
    
    /** @deprecated Use `factory.createEmptyStatement` or the factory supplied by your transformation context instead. */
    def createEmptyStatement(): EmptyStatement = js.native
    
    def createEnumDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    def createEnumDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    def createEnumDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    def createEnumDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    def createEnumDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    def createEnumDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    /** @deprecated Use `factory.createEnumDeclaration` or the factory supplied by your transformation context instead. */
    def createEnumDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    def createEnumDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    
    /** @deprecated Use `factory.createEnumMember` or the factory supplied by your transformation context instead. */
    def createEnumMember(name: String): EnumMember = js.native
    def createEnumMember(name: String, initializer: Expression): EnumMember = js.native
    def createEnumMember(name: ComputedPropertyName): EnumMember = js.native
    def createEnumMember(name: ComputedPropertyName, initializer: Expression): EnumMember = js.native
    def createEnumMember(name: Identifier): EnumMember = js.native
    def createEnumMember(name: Identifier, initializer: Expression): EnumMember = js.native
    def createEnumMember(name: NumericLiteral): EnumMember = js.native
    def createEnumMember(name: NumericLiteral, initializer: Expression): EnumMember = js.native
    def createEnumMember(name: PrivateIdentifier): EnumMember = js.native
    def createEnumMember(name: PrivateIdentifier, initializer: Expression): EnumMember = js.native
    def createEnumMember(name: StringLiteral): EnumMember = js.native
    def createEnumMember(name: StringLiteral, initializer: Expression): EnumMember = js.native
    
    def createExportAssignment(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      isExportEquals: js.UndefOr[scala.Nothing],
      expression: Expression
    ): ExportAssignment = js.native
    def createExportAssignment(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      isExportEquals: Boolean,
      expression: Expression
    ): ExportAssignment = js.native
    def createExportAssignment(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      isExportEquals: js.UndefOr[scala.Nothing],
      expression: Expression
    ): ExportAssignment = js.native
    def createExportAssignment(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      isExportEquals: Boolean,
      expression: Expression
    ): ExportAssignment = js.native
    def createExportAssignment(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      isExportEquals: js.UndefOr[scala.Nothing],
      expression: Expression
    ): ExportAssignment = js.native
    def createExportAssignment(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      isExportEquals: Boolean,
      expression: Expression
    ): ExportAssignment = js.native
    def createExportAssignment(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      isExportEquals: js.UndefOr[scala.Nothing],
      expression: Expression
    ): ExportAssignment = js.native
    /** @deprecated Use `factory.createExportAssignment` or the factory supplied by your transformation context instead. */
    def createExportAssignment(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      isExportEquals: Boolean,
      expression: Expression
    ): ExportAssignment = js.native
    
    /** @deprecated Use `factory.createExportDeclaration` or the factory supplied by your transformation context instead. */
    def createExportDeclaration(): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression,
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression,
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.Array[Modifier]): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression,
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression,
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(decorators: js.Array[Decorator]): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression,
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression,
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier]): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression,
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], exportClause: NamedExportBindings): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression
    ): ExportDeclaration = js.native
    def createExportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression,
      isTypeOnly: js.Any
    ): ExportDeclaration = js.native
    
    /** @deprecated Use `factory.createExportDefault` or the factory supplied by your transformation context instead. */
    def createExportDefault(expression: Expression): ExportAssignment = js.native
    
    def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: String): ExportSpecifier = js.native
    def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
    /** @deprecated Use `factory.createExportSpecifier` or the factory supplied by your transformation context instead. */
    def createExportSpecifier(propertyName: String, name: String): ExportSpecifier = js.native
    def createExportSpecifier(propertyName: String, name: Identifier): ExportSpecifier = js.native
    def createExportSpecifier(propertyName: Identifier, name: String): ExportSpecifier = js.native
    def createExportSpecifier(propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
    
    /** @deprecated Use `factory.createExpressionStatement` or the factory supplied by your transformation context instead. */
    def createExpressionStatement(expression: Expression): ExpressionStatement = js.native
    
    def createExpressionWithTypeArguments(typeArguments: js.UndefOr[scala.Nothing], expression: Expression): ExpressionWithTypeArguments = js.native
    /** @deprecated Use `factory.createExpressionWithTypeArguments` or the factory supplied by your transformation context instead. */
    def createExpressionWithTypeArguments(typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
    
    /** @deprecated Use `factory.createExternalModuleExport` or the factory supplied by your transformation context instead. */
    def createExternalModuleExport(exportName: Identifier): ExportDeclaration = js.native
    
    /** @deprecated Use `factory.createExternalModuleReference` or the factory supplied by your transformation context instead. */
    def createExternalModuleReference(expression: Expression): ExternalModuleReference = js.native
    
    /** @deprecated Use `factory.createFalse` or the factory supplied by your transformation context instead. */
    def createFalse(): FalseLiteral = js.native
    
    /** @deprecated Use `factory.createUniqueName(text, GeneratedIdentifierFlags.Optimistic | GeneratedIdentifierFlags.FileLevel)` or the factory supplied by your transformation context instead. */
    def createFileLevelUniqueName(text: String): Identifier = js.native
    
    def createFor(
      initializer: js.UndefOr[scala.Nothing],
      condition: js.UndefOr[scala.Nothing],
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: js.UndefOr[scala.Nothing],
      condition: js.UndefOr[scala.Nothing],
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: js.UndefOr[scala.Nothing],
      condition: Expression,
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: js.UndefOr[scala.Nothing],
      condition: Expression,
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: Expression,
      condition: js.UndefOr[scala.Nothing],
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: Expression,
      condition: js.UndefOr[scala.Nothing],
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: Expression,
      condition: Expression,
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    /** @deprecated Use `factory.createFor` or the factory supplied by your transformation context instead. */
    def createFor(initializer: Expression, condition: Expression, incrementor: Expression, statement: Statement): ForStatement = js.native
    def createFor(
      initializer: VariableDeclarationList,
      condition: js.UndefOr[scala.Nothing],
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: VariableDeclarationList,
      condition: js.UndefOr[scala.Nothing],
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: VariableDeclarationList,
      condition: Expression,
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def createFor(
      initializer: VariableDeclarationList,
      condition: Expression,
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    
    /** @deprecated Use `factory.createForIn` or the factory supplied by your transformation context instead. */
    def createForIn(initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
    
    def createForOf(
      awaitModifier: js.UndefOr[scala.Nothing],
      initializer: ForInitializer,
      expression: Expression,
      statement: Statement
    ): ForOfStatement = js.native
    /** @deprecated Use `factory.createForOf` or the factory supplied by your transformation context instead. */
    def createForOf(
      awaitModifier: AwaitKeyword,
      initializer: ForInitializer,
      expression: Expression,
      statement: Statement
    ): ForOfStatement = js.native
    
    /** @deprecated Use `factory.createFunctionDeclaration` or the factory supplied by your transformation context instead. */
    def createFunctionDeclaration(
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      asteriskToken: js.UndefOr[typingsSlinky.typescript.mod.AsteriskToken],
      name: js.UndefOr[String | Identifier],
      typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[TypeNode],
      body: js.UndefOr[Block]
    ): FunctionDeclaration = js.native
    
    /** @deprecated Use `factory.createFunctionExpression` or the factory supplied by your transformation context instead. */
    def createFunctionExpression(
      modifiers: js.UndefOr[js.Array[Modifier]],
      asteriskToken: js.UndefOr[typingsSlinky.typescript.mod.AsteriskToken],
      name: js.UndefOr[String | Identifier],
      typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
      parameters: js.UndefOr[js.Array[ParameterDeclaration]],
      `type`: js.UndefOr[TypeNode],
      body: Block
    ): FunctionExpression = js.native
    
    def createFunctionTypeNode(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): FunctionTypeNode = js.native
    /** @deprecated Use `factory.createFunctionTypeNode` or the factory supplied by your transformation context instead. */
    def createFunctionTypeNode(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): FunctionTypeNode = js.native
    
    /** @deprecated Use `factory.createGetAccessorDeclaration` or the factory supplied by your transformation context instead. */
    def createGetAccessor(
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[TypeNode],
      body: js.UndefOr[Block]
    ): GetAccessorDeclaration = js.native
    
    /** @deprecated Use `factory.createHeritageClause` or the factory supplied by your transformation context instead. */
    def createHeritageClause(token: ExtendsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
    def createHeritageClause(token: ImplementsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
    
    /** @deprecated Use `factory.createIdentifier` or the factory supplied by your transformation context instead. */
    def createIdentifier(text: String): Identifier = js.native
    
    /** @deprecated Use `factory.createIf` or the factory supplied by your transformation context instead. */
    def createIf(expression: Expression, thenStatement: Statement): IfStatement = js.native
    def createIf(expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
    
    /** @deprecated Use `factory.createImmediatelyInvokedArrowFunction` or the factory supplied by your transformation context instead. */
    def createImmediatelyInvokedArrowFunction(statements: js.Array[Statement]): CallExpression = js.native
    /** @deprecated Use `factory.createImmediatelyInvokedArrowFunction` or the factory supplied by your transformation context instead. */
    def createImmediatelyInvokedArrowFunction(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
    
    /** @deprecated Use `factory.createImmediatelyInvokedFunctionExpression` or the factory supplied by your transformation context instead. */
    def createImmediatelyInvokedFunctionExpression(statements: js.Array[Statement]): CallExpression = js.native
    /** @deprecated Use `factory.createImmediatelyInvokedFunctionExpression` or the factory supplied by your transformation context instead. */
    def createImmediatelyInvokedFunctionExpression(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
    
    /** @deprecated Use `factory.createImportClause` or the factory supplied by your transformation context instead. */
    def createImportClause(): ImportClause = js.native
    def createImportClause(name: js.UndefOr[scala.Nothing], namedBindings: js.UndefOr[scala.Nothing], isTypeOnly: js.Any): ImportClause = js.native
    def createImportClause(name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings): ImportClause = js.native
    def createImportClause(name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings, isTypeOnly: js.Any): ImportClause = js.native
    def createImportClause(name: Identifier): ImportClause = js.native
    def createImportClause(name: Identifier, namedBindings: js.UndefOr[scala.Nothing], isTypeOnly: js.Any): ImportClause = js.native
    def createImportClause(name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
    def createImportClause(name: Identifier, namedBindings: NamedImportBindings, isTypeOnly: js.Any): ImportClause = js.native
    
    def createImportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      importClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def createImportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      importClause: ImportClause,
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def createImportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      importClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def createImportDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      importClause: ImportClause,
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def createImportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      importClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def createImportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      importClause: ImportClause,
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def createImportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      importClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    /** @deprecated Use `factory.createImportDeclaration` or the factory supplied by your transformation context instead. */
    def createImportDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      importClause: ImportClause,
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    
    def createImportEqualsDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    def createImportEqualsDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    def createImportEqualsDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    def createImportEqualsDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    def createImportEqualsDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    def createImportEqualsDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    /** @deprecated Use `factory.createImportEqualsDeclaration` or the factory supplied by your transformation context instead. */
    def createImportEqualsDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    def createImportEqualsDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    
    def createImportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
    /** @deprecated Use `factory.createImportSpecifier` or the factory supplied by your transformation context instead. */
    def createImportSpecifier(propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
    
    /** @deprecated Use `factory.createImportTypeNode` or the factory supplied by your transformation context instead. */
    def createImportTypeNode(argument: TypeNode): ImportTypeNode = js.native
    def createImportTypeNode(
      argument: TypeNode,
      qualifier: js.UndefOr[scala.Nothing],
      typeArguments: js.UndefOr[scala.Nothing],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def createImportTypeNode(argument: TypeNode, qualifier: js.UndefOr[scala.Nothing], typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
    def createImportTypeNode(
      argument: TypeNode,
      qualifier: js.UndefOr[scala.Nothing],
      typeArguments: js.Array[TypeNode],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def createImportTypeNode(argument: TypeNode, qualifier: Identifier): ImportTypeNode = js.native
    def createImportTypeNode(
      argument: TypeNode,
      qualifier: Identifier,
      typeArguments: js.UndefOr[scala.Nothing],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def createImportTypeNode(argument: TypeNode, qualifier: Identifier, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
    def createImportTypeNode(argument: TypeNode, qualifier: Identifier, typeArguments: js.Array[TypeNode], isTypeOf: Boolean): ImportTypeNode = js.native
    def createImportTypeNode(argument: TypeNode, qualifier: QualifiedName): ImportTypeNode = js.native
    def createImportTypeNode(
      argument: TypeNode,
      qualifier: QualifiedName,
      typeArguments: js.UndefOr[scala.Nothing],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def createImportTypeNode(argument: TypeNode, qualifier: QualifiedName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
    def createImportTypeNode(argument: TypeNode, qualifier: QualifiedName, typeArguments: js.Array[TypeNode], isTypeOf: Boolean): ImportTypeNode = js.native
    
    def createIncrementalCompilerHost(options: CompilerOptions): CompilerHost = js.native
    def createIncrementalCompilerHost(options: CompilerOptions, system: System): CompilerHost = js.native
    
    def createIncrementalProgram[T /* <: BuilderProgram */](
      hasRootNamesOptionsConfigFileParsingDiagnosticsProjectReferencesHostCreateProgram: IncrementalProgramOptions[T]
    ): T = js.native
    
    def createIndexSignature(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): IndexSignatureDeclaration = js.native
    def createIndexSignature(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): IndexSignatureDeclaration = js.native
    def createIndexSignature(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): IndexSignatureDeclaration = js.native
    /** @deprecated Use `factory.createIndexSignature` or the factory supplied by your transformation context instead. */
    def createIndexSignature(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): IndexSignatureDeclaration = js.native
    
    /** @deprecated Use `factory.createIndexedAccessTypeNode` or the factory supplied by your transformation context instead. */
    def createIndexedAccessTypeNode(objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode = js.native
    
    /** @deprecated Use `factory.createInferTypeNode` or the factory supplied by your transformation context instead. */
    def createInferTypeNode(typeParameter: TypeParameterDeclaration): InferTypeNode = js.native
    
    def createInputFiles(javascriptText: String, declarationText: String): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      javascriptMapText: js.UndefOr[scala.Nothing],
      declarationMapPath: js.UndefOr[scala.Nothing],
      declarationMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      javascriptMapText: js.UndefOr[scala.Nothing],
      declarationMapPath: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      javascriptMapText: js.UndefOr[scala.Nothing],
      declarationMapPath: String,
      declarationMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      javascriptMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      javascriptMapText: String,
      declarationMapPath: js.UndefOr[scala.Nothing],
      declarationMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      javascriptMapText: String,
      declarationMapPath: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      javascriptMapText: String,
      declarationMapPath: String,
      declarationMapText: String
    ): InputFiles = js.native
    def createInputFiles(javascriptText: String, declarationText: String, javascriptMapPath: String): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: String,
      javascriptMapText: js.UndefOr[scala.Nothing],
      declarationMapPath: js.UndefOr[scala.Nothing],
      declarationMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: String,
      javascriptMapText: js.UndefOr[scala.Nothing],
      declarationMapPath: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: String,
      javascriptMapText: js.UndefOr[scala.Nothing],
      declarationMapPath: String,
      declarationMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: String,
      javascriptMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: String,
      javascriptMapText: String,
      declarationMapPath: js.UndefOr[scala.Nothing],
      declarationMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: String,
      javascriptMapText: String,
      declarationMapPath: String
    ): InputFiles = js.native
    def createInputFiles(
      javascriptText: String,
      declarationText: String,
      javascriptMapPath: String,
      javascriptMapText: String,
      declarationMapPath: String,
      declarationMapText: String
    ): InputFiles = js.native
    def createInputFiles(
      readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
      javascriptPath: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      declarationPath: String
    ): InputFiles = js.native
    def createInputFiles(
      readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
      javascriptPath: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      declarationPath: String,
      declarationMapPath: js.UndefOr[scala.Nothing],
      buildInfoPath: String
    ): InputFiles = js.native
    def createInputFiles(
      readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
      javascriptPath: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      declarationPath: String,
      declarationMapPath: String
    ): InputFiles = js.native
    def createInputFiles(
      readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
      javascriptPath: String,
      javascriptMapPath: js.UndefOr[scala.Nothing],
      declarationPath: String,
      declarationMapPath: String,
      buildInfoPath: String
    ): InputFiles = js.native
    def createInputFiles(
      readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
      javascriptPath: String,
      javascriptMapPath: String,
      declarationPath: String
    ): InputFiles = js.native
    def createInputFiles(
      readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
      javascriptPath: String,
      javascriptMapPath: String,
      declarationPath: String,
      declarationMapPath: js.UndefOr[scala.Nothing],
      buildInfoPath: String
    ): InputFiles = js.native
    def createInputFiles(
      readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
      javascriptPath: String,
      javascriptMapPath: String,
      declarationPath: String,
      declarationMapPath: String
    ): InputFiles = js.native
    def createInputFiles(
      readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
      javascriptPath: String,
      javascriptMapPath: String,
      declarationPath: String,
      declarationMapPath: String,
      buildInfoPath: String
    ): InputFiles = js.native
    
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    /** @deprecated Use `factory.createInterfaceDeclaration` or the factory supplied by your transformation context instead. */
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def createInterfaceDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    
    /** @deprecated Use `factory.createIntersectionTypeNode` or the factory supplied by your transformation context instead. */
    def createIntersectionTypeNode(types: js.Array[TypeNode]): IntersectionTypeNode = js.native
    
    def createJSDocAugmentsTag(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
    def createJSDocAugmentsTag(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen, comment: String): JSDocAugmentsTag = js.native
    /** @deprecated Use `factory.createJSDocAugmentsTag` or the factory supplied by your transformation context instead. */
    def createJSDocAugmentsTag(tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
    def createJSDocAugmentsTag(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: String): JSDocAugmentsTag = js.native
    
    /** @deprecated Use `factory.createJSDocAuthorTag` or the factory supplied by your transformation context instead. */
    def createJSDocAuthorTag(): JSDocAuthorTag = js.native
    def createJSDocAuthorTag(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocAuthorTag = js.native
    def createJSDocAuthorTag(tagName: Identifier): JSDocAuthorTag = js.native
    def createJSDocAuthorTag(tagName: Identifier, comment: String): JSDocAuthorTag = js.native
    
    def createJSDocCallbackTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocSignature,
      fullName: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocSignature,
      fullName: Identifier,
      comment: String
    ): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocSignature,
      fullName: JSDocNamespaceDeclaration
    ): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocSignature,
      fullName: JSDocNamespaceDeclaration,
      comment: String
    ): JSDocCallbackTag = js.native
    /** @deprecated Use `factory.createJSDocCallbackTag` or the factory supplied by your transformation context instead. */
    def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(
      tagName: Identifier,
      typeExpression: JSDocSignature,
      fullName: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier, comment: String): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature, fullName: JSDocNamespaceDeclaration): JSDocCallbackTag = js.native
    def createJSDocCallbackTag(
      tagName: Identifier,
      typeExpression: JSDocSignature,
      fullName: JSDocNamespaceDeclaration,
      comment: String
    ): JSDocCallbackTag = js.native
    
    /** @deprecated Use `factory.createJSDocClassTag` or the factory supplied by your transformation context instead. */
    def createJSDocClassTag(): JSDocClassTag = js.native
    def createJSDocClassTag(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocClassTag = js.native
    def createJSDocClassTag(tagName: Identifier): JSDocClassTag = js.native
    def createJSDocClassTag(tagName: Identifier, comment: String): JSDocClassTag = js.native
    
    /** @deprecated Use `factory.createJSDocComment` or the factory supplied by your transformation context instead. */
    def createJSDocComment(): JSDoc = js.native
    def createJSDocComment(comment: js.UndefOr[scala.Nothing], tags: js.Array[JSDocTag]): JSDoc = js.native
    def createJSDocComment(comment: String): JSDoc = js.native
    def createJSDocComment(comment: String, tags: js.Array[JSDocTag]): JSDoc = js.native
    
    def createJSDocEnumTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
    def createJSDocEnumTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: String): JSDocEnumTag = js.native
    /** @deprecated Use `factory.createJSDocEnumTag` or the factory supplied by your transformation context instead. */
    def createJSDocEnumTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
    def createJSDocEnumTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: String): JSDocEnumTag = js.native
    
    def createJSDocImplementsTag(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
    def createJSDocImplementsTag(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen, comment: String): JSDocImplementsTag = js.native
    /** @deprecated Use `factory.createJSDocImplementsTag` or the factory supplied by your transformation context instead. */
    def createJSDocImplementsTag(tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
    def createJSDocImplementsTag(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: String): JSDocImplementsTag = js.native
    
    /** @deprecated Use `factory.createJSDocParameterTag` or the factory supplied by your transformation context instead. */
    def createJSDocParamTag(name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
    def createJSDocParamTag(name: EntityName, isBracketed: Boolean, typeExpression: js.UndefOr[scala.Nothing], comment: String): JSDocParameterTag = js.native
    def createJSDocParamTag(name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocParameterTag = js.native
    def createJSDocParamTag(name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression, comment: String): JSDocParameterTag = js.native
    
    def createJSDocParameterTag(tagName: js.UndefOr[scala.Nothing], name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: Boolean
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: Boolean,
      comment: String
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: Boolean
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: Boolean,
      comment: String
    ): JSDocParameterTag = js.native
    /** @deprecated Use `factory.createJSDocParameterTag` or the factory supplied by your transformation context instead. */
    def createJSDocParameterTag(tagName: Identifier, name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: Boolean
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: Boolean,
      comment: String
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(tagName: Identifier, name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: Boolean
    ): JSDocParameterTag = js.native
    def createJSDocParameterTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: Boolean,
      comment: String
    ): JSDocParameterTag = js.native
    
    /** @deprecated Use `factory.createJSDocPrivateTag` or the factory supplied by your transformation context instead. */
    def createJSDocPrivateTag(): JSDocPrivateTag = js.native
    def createJSDocPrivateTag(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocPrivateTag = js.native
    def createJSDocPrivateTag(tagName: Identifier): JSDocPrivateTag = js.native
    def createJSDocPrivateTag(tagName: Identifier, comment: String): JSDocPrivateTag = js.native
    
    def createJSDocPropertyTag(tagName: js.UndefOr[scala.Nothing], name: EntityName, isBracketed: Boolean): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: Boolean
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: Boolean,
      comment: String
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: Boolean
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: js.UndefOr[scala.Nothing],
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: Boolean,
      comment: String
    ): JSDocPropertyTag = js.native
    /** @deprecated Use `factory.createJSDocPropertyTag` or the factory supplied by your transformation context instead. */
    def createJSDocPropertyTag(tagName: Identifier, name: EntityName, isBracketed: Boolean): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: Boolean
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: js.UndefOr[scala.Nothing],
      isNameFirst: Boolean,
      comment: String
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(tagName: Identifier, name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: Boolean
    ): JSDocPropertyTag = js.native
    def createJSDocPropertyTag(
      tagName: Identifier,
      name: EntityName,
      isBracketed: Boolean,
      typeExpression: JSDocTypeExpression,
      isNameFirst: Boolean,
      comment: String
    ): JSDocPropertyTag = js.native
    
    /** @deprecated Use `factory.createJSDocProtectedTag` or the factory supplied by your transformation context instead. */
    def createJSDocProtectedTag(): JSDocProtectedTag = js.native
    def createJSDocProtectedTag(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocProtectedTag = js.native
    def createJSDocProtectedTag(tagName: Identifier): JSDocProtectedTag = js.native
    def createJSDocProtectedTag(tagName: Identifier, comment: String): JSDocProtectedTag = js.native
    
    /** @deprecated Use `factory.createJSDocPublicTag` or the factory supplied by your transformation context instead. */
    def createJSDocPublicTag(): JSDocPublicTag = js.native
    def createJSDocPublicTag(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocPublicTag = js.native
    def createJSDocPublicTag(tagName: Identifier): JSDocPublicTag = js.native
    def createJSDocPublicTag(tagName: Identifier, comment: String): JSDocPublicTag = js.native
    
    /** @deprecated Use `factory.createJSDocReadonlyTag` or the factory supplied by your transformation context instead. */
    def createJSDocReadonlyTag(): JSDocReadonlyTag = js.native
    def createJSDocReadonlyTag(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocReadonlyTag = js.native
    def createJSDocReadonlyTag(tagName: Identifier): JSDocReadonlyTag = js.native
    def createJSDocReadonlyTag(tagName: Identifier, comment: String): JSDocReadonlyTag = js.native
    
    /** @deprecated Use `factory.createJSDocReturnTag` or the factory supplied by your transformation context instead. */
    def createJSDocReturnTag(): JSDocReturnTag = js.native
    def createJSDocReturnTag(tagName: js.UndefOr[scala.Nothing], typeExpression: js.UndefOr[scala.Nothing], comment: String): JSDocReturnTag = js.native
    def createJSDocReturnTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
    def createJSDocReturnTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: String): JSDocReturnTag = js.native
    def createJSDocReturnTag(tagName: Identifier): JSDocReturnTag = js.native
    def createJSDocReturnTag(tagName: Identifier, typeExpression: js.UndefOr[scala.Nothing], comment: String): JSDocReturnTag = js.native
    def createJSDocReturnTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
    def createJSDocReturnTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: String): JSDocReturnTag = js.native
    
    def createJSDocSignature(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
    def createJSDocSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[JSDocParameterTag],
      `type`: JSDocReturnTag
    ): JSDocSignature = js.native
    /** @deprecated Use `factory.createJSDocSignature` or the factory supplied by your transformation context instead. */
    def createJSDocSignature(typeParameters: js.Array[JSDocTemplateTag], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
    def createJSDocSignature(
      typeParameters: js.Array[JSDocTemplateTag],
      parameters: js.Array[JSDocParameterTag],
      `type`: JSDocReturnTag
    ): JSDocSignature = js.native
    
    /** @deprecated Use `factory.createJSDocUnknownTag` or the factory supplied by your transformation context instead. */
    def createJSDocTag(tagName: Identifier): JSDocUnknownTag = js.native
    def createJSDocTag(tagName: Identifier, comment: String): JSDocUnknownTag = js.native
    
    def createJSDocTemplateTag(
      tagName: js.UndefOr[scala.Nothing],
      constraint: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration]
    ): JSDocTemplateTag = js.native
    def createJSDocTemplateTag(
      tagName: js.UndefOr[scala.Nothing],
      constraint: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      comment: String
    ): JSDocTemplateTag = js.native
    def createJSDocTemplateTag(
      tagName: js.UndefOr[scala.Nothing],
      constraint: JSDocTypeExpression,
      typeParameters: js.Array[TypeParameterDeclaration]
    ): JSDocTemplateTag = js.native
    def createJSDocTemplateTag(
      tagName: js.UndefOr[scala.Nothing],
      constraint: JSDocTypeExpression,
      typeParameters: js.Array[TypeParameterDeclaration],
      comment: String
    ): JSDocTemplateTag = js.native
    def createJSDocTemplateTag(
      tagName: Identifier,
      constraint: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration]
    ): JSDocTemplateTag = js.native
    def createJSDocTemplateTag(
      tagName: Identifier,
      constraint: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      comment: String
    ): JSDocTemplateTag = js.native
    /** @deprecated Use `factory.createJSDocTemplateTag` or the factory supplied by your transformation context instead. */
    def createJSDocTemplateTag(
      tagName: Identifier,
      constraint: JSDocTypeExpression,
      typeParameters: js.Array[TypeParameterDeclaration]
    ): JSDocTemplateTag = js.native
    def createJSDocTemplateTag(
      tagName: Identifier,
      constraint: JSDocTypeExpression,
      typeParameters: js.Array[TypeParameterDeclaration],
      comment: String
    ): JSDocTemplateTag = js.native
    
    def createJSDocThisTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
    def createJSDocThisTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: String): JSDocThisTag = js.native
    /** @deprecated Use `factory.createJSDocThisTag` or the factory supplied by your transformation context instead. */
    def createJSDocThisTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
    def createJSDocThisTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: String): JSDocThisTag = js.native
    
    /** @deprecated Use `factory.createJSDocTypeExpression` or the factory supplied by your transformation context instead. */
    def createJSDocTypeExpression(`type`: TypeNode): JSDocTypeExpression = js.native
    
    /** @deprecated Use `factory.createJSDocTypeLiteral` or the factory supplied by your transformation context instead. */
    def createJSDocTypeLiteral(): JSDocTypeLiteral = js.native
    def createJSDocTypeLiteral(jsDocPropertyTags: js.UndefOr[scala.Nothing], isArrayType: Boolean): JSDocTypeLiteral = js.native
    def createJSDocTypeLiteral(jsDocPropertyTags: js.Array[JSDocPropertyLikeTag]): JSDocTypeLiteral = js.native
    def createJSDocTypeLiteral(jsDocPropertyTags: js.Array[JSDocPropertyLikeTag], isArrayType: Boolean): JSDocTypeLiteral = js.native
    
    def createJSDocTypeTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
    def createJSDocTypeTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: String): JSDocTypeTag = js.native
    /** @deprecated Use `factory.createJSDocTypeTag` or the factory supplied by your transformation context instead. */
    def createJSDocTypeTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
    def createJSDocTypeTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: String): JSDocTypeTag = js.native
    
    /** @deprecated Use `factory.createJSDocTypedefTag` or the factory supplied by your transformation context instead. */
    def createJSDocTypedefTag(): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: Identifier
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: Identifier,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: JSDocNamespaceDeclaration
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: JSDocNamespaceDeclaration,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocTypeExpression,
      fullName: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, fullName: Identifier): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocTypeExpression,
      fullName: Identifier,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocTypeExpression,
      fullName: JSDocNamespaceDeclaration
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocTypeExpression,
      fullName: JSDocNamespaceDeclaration,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeLiteral): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocTypeLiteral,
      fullName: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeLiteral, fullName: Identifier): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocTypeLiteral,
      fullName: Identifier,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocTypeLiteral,
      fullName: JSDocNamespaceDeclaration
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: js.UndefOr[scala.Nothing],
      typeExpression: JSDocTypeLiteral,
      fullName: JSDocNamespaceDeclaration,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: Identifier,
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: js.UndefOr[scala.Nothing], fullName: Identifier): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: Identifier,
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: Identifier,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: Identifier,
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: JSDocNamespaceDeclaration
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: Identifier,
      typeExpression: js.UndefOr[scala.Nothing],
      fullName: JSDocNamespaceDeclaration,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: Identifier,
      typeExpression: JSDocTypeExpression,
      fullName: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeExpression, fullName: Identifier): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeExpression, fullName: Identifier, comment: String): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeExpression, fullName: JSDocNamespaceDeclaration): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: Identifier,
      typeExpression: JSDocTypeExpression,
      fullName: JSDocNamespaceDeclaration,
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeLiteral): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: Identifier,
      typeExpression: JSDocTypeLiteral,
      fullName: js.UndefOr[scala.Nothing],
      comment: String
    ): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeLiteral, fullName: Identifier): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeLiteral, fullName: Identifier, comment: String): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeLiteral, fullName: JSDocNamespaceDeclaration): JSDocTypedefTag = js.native
    def createJSDocTypedefTag(
      tagName: Identifier,
      typeExpression: JSDocTypeLiteral,
      fullName: JSDocNamespaceDeclaration,
      comment: String
    ): JSDocTypedefTag = js.native
    
    /** @deprecated Use `factory.createJsxAttribute` or the factory supplied by your transformation context instead. */
    def createJsxAttribute(name: Identifier): JsxAttribute = js.native
    def createJsxAttribute(name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
    def createJsxAttribute(name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
    
    /** @deprecated Use `factory.createJsxAttributes` or the factory supplied by your transformation context instead. */
    def createJsxAttributes(properties: js.Array[JsxAttributeLike]): JsxAttributes = js.native
    
    /** @deprecated Use `factory.createJsxClosingElement` or the factory supplied by your transformation context instead. */
    def createJsxClosingElement(tagName: JsxTagNameExpression): JsxClosingElement = js.native
    
    /** @deprecated Use `factory.createJsxElement` or the factory supplied by your transformation context instead. */
    def createJsxElement(openingElement: JsxOpeningElement, children: js.Array[JsxChild], closingElement: JsxClosingElement): JsxElement = js.native
    
    /** @deprecated Use `factory.createJsxExpression` or the factory supplied by your transformation context instead. */
    def createJsxExpression(): JsxExpression = js.native
    def createJsxExpression(dotDotDotToken: js.UndefOr[scala.Nothing], expression: Expression): JsxExpression = js.native
    def createJsxExpression(dotDotDotToken: DotDotDotToken): JsxExpression = js.native
    def createJsxExpression(dotDotDotToken: DotDotDotToken, expression: Expression): JsxExpression = js.native
    
    /** @deprecated Use `factory.createJsxFragment` or the factory supplied by your transformation context instead. */
    def createJsxFragment(
      openingFragment: JsxOpeningFragment,
      children: js.Array[JsxChild],
      closingFragment: JsxClosingFragment
    ): JsxFragment = js.native
    
    /** @deprecated Use `factory.createJsxJsxClosingFragment` or the factory supplied by your transformation context instead. */
    def createJsxJsxClosingFragment(): JsxClosingFragment = js.native
    
    def createJsxOpeningElement(tagName: JsxTagNameExpression, typeArguments: js.UndefOr[scala.Nothing], attributes: JsxAttributes): JsxOpeningElement = js.native
    /** @deprecated Use `factory.createJsxOpeningElement` or the factory supplied by your transformation context instead. */
    def createJsxOpeningElement(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxOpeningElement = js.native
    
    /** @deprecated Use `factory.createJsxOpeningFragment` or the factory supplied by your transformation context instead. */
    def createJsxOpeningFragment(): JsxOpeningFragment = js.native
    
    def createJsxSelfClosingElement(tagName: JsxTagNameExpression, typeArguments: js.UndefOr[scala.Nothing], attributes: JsxAttributes): JsxSelfClosingElement = js.native
    /** @deprecated Use `factory.createJsxSelfClosingElement` or the factory supplied by your transformation context instead. */
    def createJsxSelfClosingElement(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxSelfClosingElement = js.native
    
    /** @deprecated Use `factory.createJsxSpreadAttribute` or the factory supplied by your transformation context instead. */
    def createJsxSpreadAttribute(expression: Expression): JsxSpreadAttribute = js.native
    
    /** @deprecated Use `factory.createJsxText` or the factory supplied by your transformation context instead. */
    def createJsxText(text: String): JsxText = js.native
    def createJsxText(text: String, containsOnlyTriviaWhiteSpaces: Boolean): JsxText = js.native
    
    /** @deprecated Use `factory.createKeywordTypeNode` or the factory supplied by your transformation context instead. */
    def createKeywordTypeNode[TKind /* <: KeywordTypeSyntaxKind */](kind: TKind): KeywordTypeNode[TKind] = js.native
    
    /** @deprecated Use `factory.createLabel` or the factory supplied by your transformation context instead. */
    def createLabel(label: String, statement: Statement): LabeledStatement = js.native
    def createLabel(label: Identifier, statement: Statement): LabeledStatement = js.native
    
    def createLanguageService(host: LanguageServiceHost): LanguageService = js.native
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: js.UndefOr[scala.Nothing],
      syntaxOnlyOrLanguageServiceMode: Boolean
    ): LanguageService = js.native
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: js.UndefOr[scala.Nothing],
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService = js.native
    def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: Boolean
    ): LanguageService = js.native
    def createLanguageService(
      host: LanguageServiceHost,
      documentRegistry: DocumentRegistry,
      syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
    ): LanguageService = js.native
    
    def createLanguageServiceSourceFile(
      fileName: String,
      scriptSnapshot: IScriptSnapshot,
      scriptTarget: ScriptTarget,
      version: String,
      setNodeParents: Boolean
    ): SourceFile = js.native
    def createLanguageServiceSourceFile(
      fileName: String,
      scriptSnapshot: IScriptSnapshot,
      scriptTarget: ScriptTarget,
      version: String,
      setNodeParents: Boolean,
      scriptKind: ScriptKind
    ): SourceFile = js.native
    
    /** @deprecated Use `factory.createLessThan` or the factory supplied by your transformation context instead. */
    def createLessThan(left: Expression, right: Expression): Expression = js.native
    
    /** @deprecated Use `factory.createStringLiteral`, `factory.createStringLiteralFromNode`, `factory.createNumericLiteral`, `factory.createBigIntLiteral`, `factory.createTrue`, `factory.createFalse`, or the factory supplied by your transformation context instead. */
    def createLiteral(value: String): StringLiteral = js.native
    /** @deprecated Use `factory.createStringLiteral`, `factory.createStringLiteralFromNode`, `factory.createNumericLiteral`, `factory.createBigIntLiteral`, `factory.createTrue`, `factory.createFalse`, or the factory supplied by your transformation context instead. */
    def createLiteral(value: Boolean): BooleanLiteral = js.native
    /** @deprecated Use `factory.createStringLiteral`, `factory.createStringLiteralFromNode`, `factory.createNumericLiteral`, `factory.createBigIntLiteral`, `factory.createTrue`, `factory.createFalse`, or the factory supplied by your transformation context instead. */
    def createLiteral(value: Double): NumericLiteral = js.native
    def createLiteral(value: Identifier): StringLiteral = js.native
    def createLiteral(value: NoSubstitutionTemplateLiteral): StringLiteral = js.native
    def createLiteral(value: NumericLiteral): StringLiteral = js.native
    def createLiteral(value: PseudoBigInt): NumericLiteral = js.native
    def createLiteral(value: StringLiteral): StringLiteral = js.native
    
    def createLiteralTypeNode(literal: FalseLiteral): LiteralTypeNode = js.native
    /** @deprecated Use `factory.createLiteralTypeNode` or the factory supplied by your transformation context instead. */
    def createLiteralTypeNode(literal: LiteralExpression): LiteralTypeNode = js.native
    def createLiteralTypeNode(literal: NullLiteral): LiteralTypeNode = js.native
    def createLiteralTypeNode(literal: PrefixUnaryExpression): LiteralTypeNode = js.native
    def createLiteralTypeNode(literal: TrueLiteral): LiteralTypeNode = js.native
    
    /** @deprecated Use `factory.createStringLiteral`, `factory.createStringLiteralFromNode`, `factory.createNumericLiteral`, `factory.createBigIntLiteral`, `factory.createTrue`, `factory.createFalse`, or the factory supplied by your transformation context instead. */
    @JSName("createLiteral")
    def createLiteral_PrimaryExpression(value: String): PrimaryExpression = js.native
    @JSName("createLiteral")
    def createLiteral_PrimaryExpression(value: Boolean): PrimaryExpression = js.native
    @JSName("createLiteral")
    def createLiteral_PrimaryExpression(value: Double): PrimaryExpression = js.native
    @JSName("createLiteral")
    def createLiteral_PrimaryExpression(value: PseudoBigInt): PrimaryExpression = js.native
    
    /** @deprecated Use `factory.createLogicalAnd` or the factory supplied by your transformation context instead. */
    def createLogicalAnd(left: Expression, right: Expression): BinaryExpression = js.native
    
    /** @deprecated Use `factory.createLogicalNot` or the factory supplied by your transformation context instead. */
    def createLogicalNot(operand: Expression): PrefixUnaryExpression = js.native
    
    /** @deprecated Use `factory.createLogicalOr` or the factory supplied by your transformation context instead. */
    def createLogicalOr(left: Expression, right: Expression): BinaryExpression = js.native
    
    /** @deprecated Use `factory.createLoopVariable` or the factory supplied by your transformation context instead. */
    def createLoopVariable(): Identifier = js.native
    
    /** @deprecated Use `factory.createMappedTypeNode` or the factory supplied by your transformation context instead. */
    def createMappedTypeNode(
      readonlyToken: js.UndefOr[
          ReadonlyKeyword | typingsSlinky.typescript.mod.PlusToken | typingsSlinky.typescript.mod.MinusToken
        ],
      typeParameter: TypeParameterDeclaration,
      nameType: js.UndefOr[TypeNode],
      questionToken: js.UndefOr[
          QuestionToken | typingsSlinky.typescript.mod.PlusToken | typingsSlinky.typescript.mod.MinusToken
        ],
      `type`: js.UndefOr[TypeNode]
    ): MappedTypeNode = js.native
    
    /** @deprecated Use `factory.createMetaProperty` or the factory supplied by your transformation context instead. */
    def createMetaProperty(keywordToken: ImportKeyword, name: Identifier): MetaProperty = js.native
    def createMetaProperty(keywordToken: NewKeyword, name: Identifier): MetaProperty = js.native
    
    /** @deprecated Use `factory.createMethodDeclaration` or the factory supplied by your transformation context instead. */
    def createMethod(
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      asteriskToken: js.UndefOr[typingsSlinky.typescript.mod.AsteriskToken],
      name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
      questionToken: js.UndefOr[QuestionToken],
      typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[TypeNode],
      body: js.UndefOr[Block]
    ): MethodDeclaration = js.native
    
    def createMethodSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: String
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: PropertyName
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      name: String
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      name: String,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      name: PropertyName
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      name: PropertyName,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: String
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: PropertyName
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    /** @deprecated Use `factory.createMethodSignature` or the factory supplied by your transformation context instead. */
    def createMethodSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      name: String
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      name: String,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      name: PropertyName
    ): MethodSignature = js.native
    def createMethodSignature(
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      name: PropertyName,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    
    /** @deprecated Use `factory.createModifier` or the factory supplied by your transformation context instead. */
    def createModifier[T /* <: ModifierSyntaxKind */](kind: T): ModifierToken[T] = js.native
    
    /** @deprecated Use `factory.createModifiersFromModifierFlags` or the factory supplied by your transformation context instead. */
    def createModifiersFromModifierFlags(flags: ModifierFlags): js.Array[Modifier] = js.native
    
    /** @deprecated Use `factory.createModuleBlock` or the factory supplied by your transformation context instead. */
    def createModuleBlock(statements: js.Array[Statement]): ModuleBlock = js.native
    
    def createModuleDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.UndefOr[scala.Nothing], name: ModuleName): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: js.UndefOr[scala.Nothing],
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: Identifier
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: Identifier,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: JSDocNamespaceDeclaration
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: JSDocNamespaceDeclaration,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: ModuleBlock
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: ModuleBlock,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: NamespaceDeclaration
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: NamespaceDeclaration,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: js.UndefOr[scala.Nothing],
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: Identifier
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: Identifier,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: JSDocNamespaceDeclaration
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: JSDocNamespaceDeclaration,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: ModuleBlock
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: ModuleBlock,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: NamespaceDeclaration
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: NamespaceDeclaration,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.UndefOr[scala.Nothing], name: ModuleName): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: js.UndefOr[scala.Nothing],
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: Identifier
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: Identifier,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: JSDocNamespaceDeclaration
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: JSDocNamespaceDeclaration,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: ModuleBlock
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: ModuleBlock,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: NamespaceDeclaration
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: NamespaceDeclaration,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    /** @deprecated Use `factory.createModuleDeclaration` or the factory supplied by your transformation context instead. */
    def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: js.UndefOr[scala.Nothing],
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], name: ModuleName, body: Identifier): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: Identifier,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: JSDocNamespaceDeclaration
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: JSDocNamespaceDeclaration,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: ModuleBlock
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: ModuleBlock,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: NamespaceDeclaration
    ): ModuleDeclaration = js.native
    def createModuleDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: NamespaceDeclaration,
      flags: NodeFlags
    ): ModuleDeclaration = js.native
    
    def createModuleResolutionCache(currentDirectory: String, getCanonicalFileName: js.Function1[/* s */ String, String]): ModuleResolutionCache = js.native
    def createModuleResolutionCache(
      currentDirectory: String,
      getCanonicalFileName: js.Function1[/* s */ String, String],
      options: CompilerOptions
    ): ModuleResolutionCache = js.native
    
    /** @deprecated Use `factory.createNamedExports` or the factory supplied by your transformation context instead. */
    def createNamedExports(elements: js.Array[ExportSpecifier]): NamedExports = js.native
    
    /** @deprecated Use `factory.createNamedImports` or the factory supplied by your transformation context instead. */
    def createNamedImports(elements: js.Array[ImportSpecifier]): NamedImports = js.native
    
    /** @deprecated Use `factory.createNamespaceExport` or the factory supplied by your transformation context instead. */
    def createNamespaceExport(name: Identifier): NamespaceExport = js.native
    
    /** @deprecated Use `factory.createNamespaceExportDeclaration` or the factory supplied by your transformation context instead. */
    def createNamespaceExportDeclaration(name: String): NamespaceExportDeclaration = js.native
    def createNamespaceExportDeclaration(name: Identifier): NamespaceExportDeclaration = js.native
    
    /** @deprecated Use `factory.createNamespaceImport` or the factory supplied by your transformation context instead. */
    def createNamespaceImport(name: Identifier): NamespaceImport = js.native
    
    /** @deprecated Use `factory.createNew` or the factory supplied by your transformation context instead. */
    def createNew(expression: Expression): NewExpression = js.native
    def createNew(
      expression: Expression,
      typeArguments: js.UndefOr[scala.Nothing],
      argumentsArray: js.Array[Expression]
    ): NewExpression = js.native
    def createNew(expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
    def createNew(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): NewExpression = js.native
    
    def createNoSubstitutionTemplateLiteral(text: js.UndefOr[scala.Nothing], rawText: String): NoSubstitutionTemplateLiteral = js.native
    /** @deprecated Use `factory.createNoSubstitutionTemplateLiteral` or the factory supplied by your transformation context instead. */
    def createNoSubstitutionTemplateLiteral(text: String): NoSubstitutionTemplateLiteral = js.native
    def createNoSubstitutionTemplateLiteral(text: String, rawText: String): NoSubstitutionTemplateLiteral = js.native
    
    /** @deprecated Use an appropriate `factory` method instead. */
    def createNode(kind: SyntaxKind): Node = js.native
    def createNode(kind: SyntaxKind, pos: js.UndefOr[scala.Nothing], end: js.Any): Node = js.native
    def createNode(kind: SyntaxKind, pos: js.Any): Node = js.native
    def createNode(kind: SyntaxKind, pos: js.Any, end: js.Any): Node = js.native
    
    /** @deprecated Use `factory.createNodeArray` or the factory supplied by your transformation context instead. */
    def createNodeArray[T /* <: Node */](): NodeArray[T] = js.native
    def createNodeArray[T /* <: Node */](elements: js.UndefOr[scala.Nothing], hasTrailingComma: Boolean): NodeArray[T] = js.native
    def createNodeArray[T /* <: Node */](elements: js.Array[T]): NodeArray[T] = js.native
    def createNodeArray[T /* <: Node */](elements: js.Array[T], hasTrailingComma: Boolean): NodeArray[T] = js.native
    
    /** @deprecated Use `factory.createNonNullChain` or the factory supplied by your transformation context instead. */
    def createNonNullChain(expression: Expression): NonNullChain = js.native
    
    /** @deprecated Use `factory.createNonNullExpression` or the factory supplied by your transformation context instead. */
    def createNonNullExpression(expression: Expression): NonNullExpression = js.native
    
    /** @deprecated Use `factory.createNotEmittedStatement` or the factory supplied by your transformation context instead. */
    def createNotEmittedStatement(original: Node): NotEmittedStatement = js.native
    
    /** @deprecated Use `factory.createNull` or the factory supplied by your transformation context instead. */
    def createNull(): NullLiteral = js.native
    
    /** @deprecated Use `factory.createNumericLiteral` or the factory supplied by your transformation context instead. */
    def createNumericLiteral(value: String): NumericLiteral = js.native
    def createNumericLiteral(value: String, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
    def createNumericLiteral(value: Double): NumericLiteral = js.native
    def createNumericLiteral(value: Double, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
    
    /** @deprecated Use `factory.createObjectBindingPattern` or the factory supplied by your transformation context instead. */
    def createObjectBindingPattern(elements: js.Array[BindingElement]): ObjectBindingPattern = js.native
    
    /** @deprecated Use `factory.createObjectLiteral` or the factory supplied by your transformation context instead. */
    def createObjectLiteral(): ObjectLiteralExpression = js.native
    def createObjectLiteral(properties: js.UndefOr[scala.Nothing], multiLine: Boolean): ObjectLiteralExpression = js.native
    def createObjectLiteral(properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
    def createObjectLiteral(properties: js.Array[ObjectLiteralElementLike], multiLine: Boolean): ObjectLiteralExpression = js.native
    
    /** @deprecated Use `factory.createOmittedExpression` or the factory supplied by your transformation context instead. */
    def createOmittedExpression(): OmittedExpression = js.native
    
    /** @deprecated Use `factory.createUniqueName(text, GeneratedIdentifierFlags.Optimistic)` or the factory supplied by your transformation context instead. */
    def createOptimisticUniqueName(text: String): Identifier = js.native
    
    /** @deprecated Use `factory.createOptionalTypeNode` or the factory supplied by your transformation context instead. */
    def createOptionalTypeNode(`type`: TypeNode): OptionalTypeNode = js.native
    
    /** @deprecated Use `factory.createParameterDeclaration` or the factory supplied by your transformation context instead. */
    def createParameter(
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      dotDotDotToken: js.UndefOr[DotDotDotToken],
      name: String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
      questionToken: js.UndefOr[QuestionToken],
      `type`: js.UndefOr[TypeNode],
      initializer: js.UndefOr[Expression]
    ): ParameterDeclaration = js.native
    
    /** @deprecated Use `factory.createParen` or the factory supplied by your transformation context instead. */
    def createParen(expression: Expression): ParenthesizedExpression = js.native
    
    /** @deprecated Use `factory.createParenthesizedType` or the factory supplied by your transformation context instead. */
    def createParenthesizedType(`type`: TypeNode): ParenthesizedTypeNode = js.native
    
    /** @deprecated Use `factory.createPartiallyEmittedExpression` or the factory supplied by your transformation context instead. */
    def createPartiallyEmittedExpression(expression: Expression): PartiallyEmittedExpression = js.native
    def createPartiallyEmittedExpression(expression: Expression, original: Node): PartiallyEmittedExpression = js.native
    
    /** @deprecated Use `factory.createPostfix` or the factory supplied by your transformation context instead. */
    def createPostfix(operand: Expression, operator: PostfixUnaryOperator): PostfixUnaryExpression = js.native
    
    /** @deprecated Use `factory.createPostfixIncrement` or the factory supplied by your transformation context instead. */
    def createPostfixIncrement(operand: Expression): PostfixUnaryExpression = js.native
    
    /** @deprecated Use `factory.createPrefix` or the factory supplied by your transformation context instead. */
    def createPrefix(operator: PrefixUnaryOperator, operand: Expression): PrefixUnaryExpression = js.native
    
    def createPrinter(): Printer = js.native
    def createPrinter(printerOptions: js.UndefOr[scala.Nothing], handlers: PrintHandlers): Printer = js.native
    def createPrinter(printerOptions: PrinterOptions): Printer = js.native
    def createPrinter(printerOptions: PrinterOptions, handlers: PrintHandlers): Printer = js.native
    
    /** @deprecated Use `factory.createPrivateIdentifier` or the factory supplied by your transformation context instead. */
    def createPrivateIdentifier(text: String): PrivateIdentifier = js.native
    
    def createProgram(createProgramOptions: CreateProgramOptions): Program = js.native
    def createProgram(rootNames: js.Array[String], options: CompilerOptions): Program = js.native
    def createProgram(
      rootNames: js.Array[String],
      options: CompilerOptions,
      host: js.UndefOr[scala.Nothing],
      oldProgram: js.UndefOr[scala.Nothing],
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): Program = js.native
    def createProgram(
      rootNames: js.Array[String],
      options: CompilerOptions,
      host: js.UndefOr[scala.Nothing],
      oldProgram: Program
    ): Program = js.native
    def createProgram(
      rootNames: js.Array[String],
      options: CompilerOptions,
      host: js.UndefOr[scala.Nothing],
      oldProgram: Program,
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): Program = js.native
    def createProgram(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost): Program = js.native
    def createProgram(
      rootNames: js.Array[String],
      options: CompilerOptions,
      host: CompilerHost,
      oldProgram: js.UndefOr[scala.Nothing],
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): Program = js.native
    def createProgram(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost, oldProgram: Program): Program = js.native
    def createProgram(
      rootNames: js.Array[String],
      options: CompilerOptions,
      host: CompilerHost,
      oldProgram: Program,
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): Program = js.native
    
    /** @deprecated Use `factory.createPropertyDeclaration` or the factory supplied by your transformation context instead. */
    def createProperty(
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
      questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
      `type`: js.UndefOr[TypeNode],
      initializer: js.UndefOr[Expression]
    ): PropertyDeclaration = js.native
    
    /** @deprecated Use `factory.createPropertyAccess` or the factory supplied by your transformation context instead. */
    def createPropertyAccess(expression: Expression, name: String): PropertyAccessExpression = js.native
    def createPropertyAccess(expression: Expression, name: Identifier): PropertyAccessExpression = js.native
    def createPropertyAccess(expression: Expression, name: PrivateIdentifier): PropertyAccessExpression = js.native
    
    def createPropertyAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: String): PropertyAccessChain = js.native
    def createPropertyAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: Identifier): PropertyAccessChain = js.native
    def createPropertyAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: PrivateIdentifier): PropertyAccessChain = js.native
    /** @deprecated Use `factory.createPropertyAccessChain` or the factory supplied by your transformation context instead. */
    def createPropertyAccessChain(expression: Expression, questionDotToken: QuestionDotToken, name: String): PropertyAccessChain = js.native
    def createPropertyAccessChain(expression: Expression, questionDotToken: QuestionDotToken, name: Identifier): PropertyAccessChain = js.native
    def createPropertyAccessChain(expression: Expression, questionDotToken: QuestionDotToken, name: PrivateIdentifier): PropertyAccessChain = js.native
    
    /** @deprecated Use `factory.createPropertyAssignment` or the factory supplied by your transformation context instead. */
    def createPropertyAssignment(name: String, initializer: Expression): PropertyAssignment = js.native
    def createPropertyAssignment(name: ComputedPropertyName, initializer: Expression): PropertyAssignment = js.native
    def createPropertyAssignment(name: Identifier, initializer: Expression): PropertyAssignment = js.native
    def createPropertyAssignment(name: NumericLiteral, initializer: Expression): PropertyAssignment = js.native
    def createPropertyAssignment(name: PrivateIdentifier, initializer: Expression): PropertyAssignment = js.native
    def createPropertyAssignment(name: StringLiteral, initializer: Expression): PropertyAssignment = js.native
    
    def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: String): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: String, questionToken: QuestionToken): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      questionToken: QuestionToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: String, questionToken: QuestionToken, `type`: TypeNode): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      questionToken: QuestionToken,
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: PropertyName): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: PropertyName, questionToken: QuestionToken): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: TypeNode
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.Array[Modifier], name: String): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: String,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: String,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: String,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.Array[Modifier], name: String, questionToken: QuestionToken): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: String,
      questionToken: QuestionToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.Array[Modifier], name: String, questionToken: QuestionToken, `type`: TypeNode): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: String,
      questionToken: QuestionToken,
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    /** @deprecated Use `factory.createPropertySignature` or the factory supplied by your transformation context instead. */
    def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName, questionToken: QuestionToken): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName, questionToken: QuestionToken, `type`: TypeNode): PropertySignature = js.native
    def createPropertySignature(
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    
    /** @deprecated Use `factory.createQualifiedName` or the factory supplied by your transformation context instead. */
    def createQualifiedName(left: EntityName, right: String): QualifiedName = js.native
    def createQualifiedName(left: EntityName, right: Identifier): QualifiedName = js.native
    
    /** @deprecated Use `factory.createRegularExpressionLiteral` or the factory supplied by your transformation context instead. */
    def createRegularExpressionLiteral(text: String): RegularExpressionLiteral = js.native
    
    /** @deprecated Use `factory.createRestTypeNode` or the factory supplied by your transformation context instead. */
    def createRestTypeNode(`type`: TypeNode): RestTypeNode = js.native
    
    /** @deprecated Use `factory.createReturn` or the factory supplied by your transformation context instead. */
    def createReturn(): ReturnStatement = js.native
    def createReturn(expression: Expression): ReturnStatement = js.native
    
    def createScanner(languageVersion: ScriptTarget, skipTrivia: Boolean): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      start: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      start: Double,
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: js.UndefOr[scala.Nothing],
      onError: ErrorCallback
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: js.UndefOr[scala.Nothing],
      onError: ErrorCallback,
      start: js.UndefOr[scala.Nothing],
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: js.UndefOr[scala.Nothing],
      onError: ErrorCallback,
      start: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: js.UndefOr[scala.Nothing],
      onError: ErrorCallback,
      start: Double,
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: String
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: String,
      onError: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: String,
      onError: js.UndefOr[scala.Nothing],
      start: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: String,
      onError: js.UndefOr[scala.Nothing],
      start: Double,
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: String,
      onError: ErrorCallback
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: String,
      onError: ErrorCallback,
      start: js.UndefOr[scala.Nothing],
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: String,
      onError: ErrorCallback,
      start: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: js.UndefOr[scala.Nothing],
      textInitial: String,
      onError: ErrorCallback,
      start: Double,
      length: Double
    ): Scanner = js.native
    def createScanner(languageVersion: ScriptTarget, skipTrivia: Boolean, languageVariant: LanguageVariant): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      start: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      start: Double,
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: js.UndefOr[scala.Nothing],
      onError: ErrorCallback
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: js.UndefOr[scala.Nothing],
      onError: ErrorCallback,
      start: js.UndefOr[scala.Nothing],
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: js.UndefOr[scala.Nothing],
      onError: ErrorCallback,
      start: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: js.UndefOr[scala.Nothing],
      onError: ErrorCallback,
      start: Double,
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: String
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: String,
      onError: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: String,
      onError: js.UndefOr[scala.Nothing],
      start: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: String,
      onError: js.UndefOr[scala.Nothing],
      start: Double,
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: String,
      onError: ErrorCallback
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: String,
      onError: ErrorCallback,
      start: js.UndefOr[scala.Nothing],
      length: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: String,
      onError: ErrorCallback,
      start: Double
    ): Scanner = js.native
    def createScanner(
      languageVersion: ScriptTarget,
      skipTrivia: Boolean,
      languageVariant: LanguageVariant,
      textInitial: String,
      onError: ErrorCallback,
      start: Double,
      length: Double
    ): Scanner = js.native
    
    /**
      * Create the builder to manage semantic diagnostics and cache them
      */
    def createSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost): SemanticDiagnosticsBuilderProgram = js.native
    def createSemanticDiagnosticsBuilderProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: js.UndefOr[scala.Nothing],
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): SemanticDiagnosticsBuilderProgram = js.native
    def createSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost, oldProgram: SemanticDiagnosticsBuilderProgram): SemanticDiagnosticsBuilderProgram = js.native
    def createSemanticDiagnosticsBuilderProgram(
      newProgram: Program,
      host: BuilderProgramHost,
      oldProgram: SemanticDiagnosticsBuilderProgram,
      configFileParsingDiagnostics: js.Array[Diagnostic]
    ): SemanticDiagnosticsBuilderProgram = js.native
    def createSemanticDiagnosticsBuilderProgram(
      rootNames: js.UndefOr[js.Array[String]],
      options: js.UndefOr[CompilerOptions],
      host: js.UndefOr[CompilerHost],
      oldProgram: js.UndefOr[SemanticDiagnosticsBuilderProgram],
      configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
      projectReferences: js.UndefOr[js.Array[ProjectReference]]
    ): SemanticDiagnosticsBuilderProgram = js.native
    
    /** @deprecated Use `factory.createSemicolonClassElement` or the factory supplied by your transformation context instead. */
    def createSemicolonClassElement(): SemicolonClassElement = js.native
    
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ComputedPropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ComputedPropertyName,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: NumericLiteral,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: NumericLiteral,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: StringLiteral,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: StringLiteral,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ComputedPropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ComputedPropertyName,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: NumericLiteral,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: NumericLiteral,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: StringLiteral,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: StringLiteral,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ComputedPropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ComputedPropertyName,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: NumericLiteral,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: NumericLiteral,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: StringLiteral,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: StringLiteral,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    /** @deprecated Use `factory.createSetAccessorDeclaration` or the factory supplied by your transformation context instead. */
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ComputedPropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ComputedPropertyName,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: NumericLiteral,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: NumericLiteral,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: PrivateIdentifier,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: StringLiteral,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def createSetAccessor(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: StringLiteral,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    
    /** @deprecated Use `factory.createShorthandPropertyAssignment` or the factory supplied by your transformation context instead. */
    def createShorthandPropertyAssignment(name: String): ShorthandPropertyAssignment = js.native
    def createShorthandPropertyAssignment(name: String, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
    def createShorthandPropertyAssignment(name: Identifier): ShorthandPropertyAssignment = js.native
    def createShorthandPropertyAssignment(name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
    
    def createSolutionBuilder[T /* <: BuilderProgram */](host: SolutionBuilderHost[T], rootNames: js.Array[String], defaultOptions: BuildOptions): SolutionBuilder[T] = js.native
    
    def createSolutionBuilderHost[T /* <: BuilderProgram */](): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](system: js.UndefOr[scala.Nothing], createProgram: CreateProgram_[T]): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](system: System): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](system: System, createProgram: js.UndefOr[scala.Nothing], reportDiagnostic: DiagnosticReporter): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T]): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderHost[T] = js.native
    def createSolutionBuilderHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportErrorSummary: ReportEmitErrorSummary
    ): SolutionBuilderHost[T] = js.native
    
    def createSolutionBuilderWithWatch[T /* <: BuilderProgram */](host: SolutionBuilderWithWatchHost[T], rootNames: js.Array[String], defaultOptions: BuildOptions): SolutionBuilder[T] = js.native
    def createSolutionBuilderWithWatch[T /* <: BuilderProgram */](
      host: SolutionBuilderWithWatchHost[T],
      rootNames: js.Array[String],
      defaultOptions: BuildOptions,
      baseWatchOptions: WatchOptions
    ): SolutionBuilder[T] = js.native
    
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: js.UndefOr[scala.Nothing], createProgram: CreateProgram_[T]): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: js.UndefOr[scala.Nothing],
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: System): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: System, createProgram: js.UndefOr[scala.Nothing], reportDiagnostic: DiagnosticReporter): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T]): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportSolutionBuilderStatus: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): SolutionBuilderWithWatchHost[T] = js.native
    
    def createSourceFile(fileName: String, sourceText: String, languageVersion: ScriptTarget): SourceFile = js.native
    def createSourceFile(
      fileName: String,
      sourceText: String,
      languageVersion: ScriptTarget,
      setParentNodes: js.UndefOr[scala.Nothing],
      scriptKind: ScriptKind
    ): SourceFile = js.native
    def createSourceFile(fileName: String, sourceText: String, languageVersion: ScriptTarget, setParentNodes: Boolean): SourceFile = js.native
    def createSourceFile(
      fileName: String,
      sourceText: String,
      languageVersion: ScriptTarget,
      setParentNodes: Boolean,
      scriptKind: ScriptKind
    ): SourceFile = js.native
    
    /**
      * Create an external source map source file reference
      */
    def createSourceMapSource(fileName: String, text: String): SourceMapSource = js.native
    def createSourceMapSource(fileName: String, text: String, skipTrivia: js.Function1[/* pos */ Double, Double]): SourceMapSource = js.native
    
    /** @deprecated Use `factory.createSpread` or the factory supplied by your transformation context instead. */
    def createSpread(expression: Expression): SpreadElement = js.native
    
    /** @deprecated Use `factory.createSpreadAssignment` or the factory supplied by your transformation context instead. */
    def createSpreadAssignment(expression: Expression): SpreadAssignment = js.native
    
    /** @deprecated Use `factory.createExpressionStatement` or the factory supplied by your transformation context instead. */
    def createStatement(expression: Expression): ExpressionStatement = js.native
    
    /** @deprecated Use `factory.createStrictEquality` or the factory supplied by your transformation context instead. */
    def createStrictEquality(left: Expression, right: Expression): BinaryExpression = js.native
    
    /** @deprecated Use `factory.createStrictInequality` or the factory supplied by your transformation context instead. */
    def createStrictInequality(left: Expression, right: Expression): BinaryExpression = js.native
    
    /** @deprecated Use `factory.createStringLiteral` or the factory supplied by your transformation context instead. */
    def createStringLiteral(text: String): StringLiteral = js.native
    def createStringLiteral(text: String, isSingleQuote: js.UndefOr[scala.Nothing], hasExtendedUnicodeEscape: Boolean): StringLiteral = js.native
    def createStringLiteral(text: String, isSingleQuote: Boolean): StringLiteral = js.native
    def createStringLiteral(text: String, isSingleQuote: Boolean, hasExtendedUnicodeEscape: Boolean): StringLiteral = js.native
    
    /** @deprecated Use `factory.createStringLiteralFromNode` or the factory supplied by your transformation context instead. */
    def createStringLiteralFromNode(sourceNode: Identifier): StringLiteral = js.native
    def createStringLiteralFromNode(sourceNode: Identifier, isSingleQuote: Boolean): StringLiteral = js.native
    def createStringLiteralFromNode(sourceNode: NoSubstitutionTemplateLiteral): StringLiteral = js.native
    def createStringLiteralFromNode(sourceNode: NoSubstitutionTemplateLiteral, isSingleQuote: Boolean): StringLiteral = js.native
    def createStringLiteralFromNode(sourceNode: NumericLiteral): StringLiteral = js.native
    def createStringLiteralFromNode(sourceNode: NumericLiteral, isSingleQuote: Boolean): StringLiteral = js.native
    def createStringLiteralFromNode(sourceNode: StringLiteral): StringLiteral = js.native
    def createStringLiteralFromNode(sourceNode: StringLiteral, isSingleQuote: Boolean): StringLiteral = js.native
    
    /** @deprecated Use `factory.createSubtract` or the factory supplied by your transformation context instead. */
    def createSubtract(left: Expression, right: Expression): BinaryExpression = js.native
    
    /** @deprecated Use `factory.createSuper` or the factory supplied by your transformation context instead. */
    def createSuper(): SuperExpression = js.native
    
    /** @deprecated Use `factory.createSwitch` or the factory supplied by your transformation context instead. */
    def createSwitch(expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
    
    /** @deprecated Use `factory.createTaggedTemplate` or the factory supplied by your transformation context instead. */
    def createTaggedTemplate(tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
    def createTaggedTemplate(tag: Expression, typeArguments: js.UndefOr[scala.Nothing], template: TemplateLiteral): TaggedTemplateExpression = js.native
    /** @deprecated Use `factory.createTaggedTemplate` or the factory supplied by your transformation context instead. */
    def createTaggedTemplate(tag: Expression, typeArguments: js.Array[TypeNode], template: TemplateLiteral): TaggedTemplateExpression = js.native
    
    /** @deprecated Use `factory.createTempVariable` or the factory supplied by your transformation context instead. */
    def createTempVariable(): Identifier = js.native
    def createTempVariable(recordTempVariable: js.Function1[/* node */ Identifier, Unit]): Identifier = js.native
    
    /** @deprecated Use `factory.createTemplateExpression` or the factory supplied by your transformation context instead. */
    def createTemplateExpression(head: TemplateHead, templateSpans: js.Array[TemplateSpan]): TemplateExpression = js.native
    
    def createTemplateHead(text: js.UndefOr[scala.Nothing], rawText: String): TemplateHead = js.native
    def createTemplateHead(text: js.UndefOr[scala.Nothing], rawText: String, templateFlags: TokenFlags): TemplateHead = js.native
    /** @deprecated Use `factory.createTemplateHead` or the factory supplied by your transformation context instead. */
    def createTemplateHead(text: String): TemplateHead = js.native
    def createTemplateHead(text: String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateHead = js.native
    def createTemplateHead(text: String, rawText: String): TemplateHead = js.native
    def createTemplateHead(text: String, rawText: String, templateFlags: TokenFlags): TemplateHead = js.native
    
    def createTemplateMiddle(text: js.UndefOr[scala.Nothing], rawText: String): TemplateMiddle = js.native
    def createTemplateMiddle(text: js.UndefOr[scala.Nothing], rawText: String, templateFlags: TokenFlags): TemplateMiddle = js.native
    /** @deprecated Use `factory.createTemplateMiddle` or the factory supplied by your transformation context instead. */
    def createTemplateMiddle(text: String): TemplateMiddle = js.native
    def createTemplateMiddle(text: String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateMiddle = js.native
    def createTemplateMiddle(text: String, rawText: String): TemplateMiddle = js.native
    def createTemplateMiddle(text: String, rawText: String, templateFlags: TokenFlags): TemplateMiddle = js.native
    
    /** @deprecated Use `factory.createTemplateSpan` or the factory supplied by your transformation context instead. */
    def createTemplateSpan(expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
    def createTemplateSpan(expression: Expression, literal: TemplateTail): TemplateSpan = js.native
    
    def createTemplateTail(text: js.UndefOr[scala.Nothing], rawText: String): TemplateTail = js.native
    def createTemplateTail(text: js.UndefOr[scala.Nothing], rawText: String, templateFlags: TokenFlags): TemplateTail = js.native
    /** @deprecated Use `factory.createTemplateTail` or the factory supplied by your transformation context instead. */
    def createTemplateTail(text: String): TemplateTail = js.native
    def createTemplateTail(text: String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateTail = js.native
    def createTemplateTail(text: String, rawText: String): TemplateTail = js.native
    def createTemplateTail(text: String, rawText: String, templateFlags: TokenFlags): TemplateTail = js.native
    
    def createTextChangeRange(span: TextSpan, newLength: Double): TextChangeRange = js.native
    
    def createTextSpan(start: Double, length: Double): TextSpan = js.native
    
    def createTextSpanFromBounds(start: Double, end: Double): TextSpan = js.native
    
    /** @deprecated Use `factory.createThis` or the factory supplied by your transformation context instead. */
    def createThis(): ThisExpression = js.native
    
    /** @deprecated Use `factory.createThisTypeNode` or the factory supplied by your transformation context instead. */
    def createThisTypeNode(): ThisTypeNode = js.native
    
    /** @deprecated Use `factory.createThrow` or the factory supplied by your transformation context instead. */
    def createThrow(expression: Expression): ThrowStatement = js.native
    
    /** @deprecated Use `factory.createToken` or the factory supplied by your transformation context instead. */
    def createToken[TKind /* <: SyntaxKind */](kind: TKind): Token[TKind] = js.native
    
    /** @deprecated Use `factory.createTrue` or the factory supplied by your transformation context instead. */
    def createTrue(): TrueLiteral = js.native
    
    /** @deprecated Use `factory.createTry` or the factory supplied by your transformation context instead. */
    def createTry(tryBlock: Block): TryStatement = js.native
    def createTry(tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
    def createTry(tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
    def createTry(tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
    
    /** @deprecated Use `factory.createTupleTypeNode` or the factory supplied by your transformation context instead. */
    def createTupleTypeNode(elements: js.Array[TypeNode | NamedTupleMember]): TupleTypeNode = js.native
    
    def createTypeAliasDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    /** @deprecated Use `factory.createTypeAliasDeclaration` or the factory supplied by your transformation context instead. */
    def createTypeAliasDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: String,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def createTypeAliasDeclaration(
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    
    /** @deprecated Use `factory.createTypeAssertion` or the factory supplied by your transformation context instead. */
    def createTypeAssertion(`type`: TypeNode, expression: Expression): TypeAssertion = js.native
    
    /** @deprecated Use `factory.createTypeLiteralNode` or the factory supplied by your transformation context instead. */
    def createTypeLiteralNode(): TypeLiteralNode = js.native
    def createTypeLiteralNode(members: js.Array[TypeElement]): TypeLiteralNode = js.native
    
    /** @deprecated Use `factory.createTypeOf` or the factory supplied by your transformation context instead. */
    def createTypeOf(expression: Expression): TypeOfExpression = js.native
    
    /** @deprecated Use `factory.createTypeOperatorNode` or the factory supplied by your transformation context instead. */
    def createTypeOperatorNode(operator: KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
    def createTypeOperatorNode(operator: typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
    def createTypeOperatorNode(operator: UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
    /** @deprecated Use `factory.createTypeOperatorNode` or the factory supplied by your transformation context instead. */
    def createTypeOperatorNode(`type`: TypeNode): TypeOperatorNode = js.native
    
    /** @deprecated Use `factory.createTypeParameterDeclaration` or the factory supplied by your transformation context instead. */
    def createTypeParameterDeclaration(name: String): TypeParameterDeclaration = js.native
    def createTypeParameterDeclaration(name: String, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
    def createTypeParameterDeclaration(name: String, constraint: TypeNode): TypeParameterDeclaration = js.native
    def createTypeParameterDeclaration(name: String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
    def createTypeParameterDeclaration(name: Identifier): TypeParameterDeclaration = js.native
    def createTypeParameterDeclaration(name: Identifier, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
    def createTypeParameterDeclaration(name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
    def createTypeParameterDeclaration(name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
    
    def createTypePredicateNode(parameterName: String, `type`: TypeNode): TypePredicateNode = js.native
    /** @deprecated Use `factory.createTypePredicateNode` or the factory supplied by your transformation context instead. */
    def createTypePredicateNode(parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
    def createTypePredicateNode(parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
    
    def createTypePredicateNodeWithModifier(assertsModifier: js.UndefOr[scala.Nothing], parameterName: String): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: js.UndefOr[scala.Nothing], parameterName: String, `type`: TypeNode): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
    /** @deprecated Use `factory.createTypePredicateNode` or the factory supplied by your transformation context instead. */
    def createTypePredicateNodeWithModifier(assertsModifier: AssertsKeyword, parameterName: String): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: AssertsKeyword, parameterName: String, `type`: TypeNode): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: AssertsKeyword, parameterName: Identifier): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: AssertsKeyword, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: AssertsKeyword, parameterName: ThisTypeNode): TypePredicateNode = js.native
    def createTypePredicateNodeWithModifier(assertsModifier: AssertsKeyword, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
    
    /** @deprecated Use `factory.createTypeQueryNode` or the factory supplied by your transformation context instead. */
    def createTypeQueryNode(exprName: EntityName): TypeQueryNode = js.native
    
    /** @deprecated Use `factory.createTypeReferenceNode` or the factory supplied by your transformation context instead. */
    def createTypeReferenceNode(typeName: String): TypeReferenceNode = js.native
    def createTypeReferenceNode(typeName: String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
    def createTypeReferenceNode(typeName: Identifier): TypeReferenceNode = js.native
    def createTypeReferenceNode(typeName: Identifier, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
    def createTypeReferenceNode(typeName: QualifiedName): TypeReferenceNode = js.native
    def createTypeReferenceNode(typeName: QualifiedName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
    
    /** @deprecated Use `factory.createUnionTypeNode` or the factory supplied by your transformation context instead. */
    def createUnionTypeNode(types: js.Array[TypeNode]): UnionTypeNode = js.native
    
    /** @deprecated Use `factory.createUniqueName` or the factory supplied by your transformation context instead. */
    def createUniqueName(text: String): Identifier = js.native
    def createUniqueName(text: String, flags: GeneratedIdentifierFlags): Identifier = js.native
    
    def createUnparsedSourceFile(text: String): UnparsedSource = js.native
    def createUnparsedSourceFile(text: String, mapPath: js.UndefOr[scala.Nothing], map: String): UnparsedSource = js.native
    def createUnparsedSourceFile(text: String, mapPath: String): UnparsedSource = js.native
    def createUnparsedSourceFile(text: String, mapPath: String, map: String): UnparsedSource = js.native
    @JSName("createUnparsedSourceFile")
    def createUnparsedSourceFile_dts(inputFile: InputFiles, `type`: dts): UnparsedSource = js.native
    @JSName("createUnparsedSourceFile")
    def createUnparsedSourceFile_dts(inputFile: InputFiles, `type`: dts, stripInternal: Boolean): UnparsedSource = js.native
    @JSName("createUnparsedSourceFile")
    def createUnparsedSourceFile_js(inputFile: InputFiles, `type`: js_): UnparsedSource = js.native
    @JSName("createUnparsedSourceFile")
    def createUnparsedSourceFile_js(inputFile: InputFiles, `type`: js_, stripInternal: Boolean): UnparsedSource = js.native
    
    /** @deprecated Use `factory.createVariableDeclaration` or the factory supplied by your transformation context instead. */
    def createVariableDeclaration(name: String): VariableDeclaration = js.native
    def createVariableDeclaration(
      name: String,
      exclamationToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): VariableDeclaration = js.native
    def createVariableDeclaration(name: String, exclamationToken: js.UndefOr[scala.Nothing], `type`: TypeNode): VariableDeclaration = js.native
    def createVariableDeclaration(
      name: String,
      exclamationToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): VariableDeclaration = js.native
    def createVariableDeclaration(name: String, exclamationToken: ExclamationToken): VariableDeclaration = js.native
    def createVariableDeclaration(
      name: String,
      exclamationToken: ExclamationToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): VariableDeclaration = js.native
    def createVariableDeclaration(name: String, exclamationToken: ExclamationToken, `type`: TypeNode): VariableDeclaration = js.native
    def createVariableDeclaration(name: String, exclamationToken: ExclamationToken, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
    def createVariableDeclaration(name: String, `type`: js.UndefOr[scala.Nothing], initializer: Expression): VariableDeclaration = js.native
    def createVariableDeclaration(name: String, `type`: TypeNode): VariableDeclaration = js.native
    def createVariableDeclaration(name: String, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
    def createVariableDeclaration(name: BindingName): VariableDeclaration = js.native
    def createVariableDeclaration(
      name: BindingName,
      exclamationToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): VariableDeclaration = js.native
    def createVariableDeclaration(name: BindingName, exclamationToken: js.UndefOr[scala.Nothing], `type`: TypeNode): VariableDeclaration = js.native
    def createVariableDeclaration(
      name: BindingName,
      exclamationToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): VariableDeclaration = js.native
    def createVariableDeclaration(name: BindingName, exclamationToken: ExclamationToken): VariableDeclaration = js.native
    def createVariableDeclaration(
      name: BindingName,
      exclamationToken: ExclamationToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): VariableDeclaration = js.native
    def createVariableDeclaration(name: BindingName, exclamationToken: ExclamationToken, `type`: TypeNode): VariableDeclaration = js.native
    def createVariableDeclaration(name: BindingName, exclamationToken: ExclamationToken, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
    def createVariableDeclaration(name: BindingName, `type`: js.UndefOr[scala.Nothing], initializer: Expression): VariableDeclaration = js.native
    def createVariableDeclaration(name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
    def createVariableDeclaration(name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
    
    /** @deprecated Use `factory.createVariableDeclarationList` or the factory supplied by your transformation context instead. */
    def createVariableDeclarationList(declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
    def createVariableDeclarationList(declarations: js.Array[VariableDeclaration], flags: NodeFlags): VariableDeclarationList = js.native
    
    def createVariableStatement(modifiers: js.UndefOr[scala.Nothing], declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
    def createVariableStatement(modifiers: js.UndefOr[scala.Nothing], declarationList: VariableDeclarationList): VariableStatement = js.native
    def createVariableStatement(modifiers: js.Array[Modifier], declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
    /** @deprecated Use `factory.createVariableStatement` or the factory supplied by your transformation context instead. */
    def createVariableStatement(modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
    
    /** @deprecated Use `factory.createVoid` or the factory supplied by your transformation context instead. */
    def createVoid(expression: Expression): VoidExpression = js.native
    
    /** @deprecated Use `factory.createVoidZero` or the factory supplied by your transformation context instead. */
    def createVoidZero(): VoidExpression = js.native
    
    /**
      * Create the watch compiler host for either configFile or fileNames and its options
      */
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      configFileName: String,
      optionsToExtend: js.UndefOr[CompilerOptions],
      system: System,
      createProgram: js.UndefOr[CreateProgram_[T]],
      reportDiagnostic: js.UndefOr[DiagnosticReporter],
      reportWatchStatus: js.UndefOr[WatchStatusReporter],
      watchOptionsToExtend: js.UndefOr[WatchOptions],
      extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]]
    ): WatchCompilerHostOfConfigFile[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](rootFiles: js.Array[String], options: CompilerOptions, system: System): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.UndefOr[scala.Nothing],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.Array[ProjectReference]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.Array[ProjectReference],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.UndefOr[scala.Nothing],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.Array[ProjectReference]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.Array[ProjectReference],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.UndefOr[scala.Nothing],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.Array[ProjectReference]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.Array[ProjectReference],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.UndefOr[scala.Nothing],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.Array[ProjectReference]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: js.UndefOr[scala.Nothing],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.Array[ProjectReference],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.UndefOr[scala.Nothing],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.Array[ProjectReference]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.Array[ProjectReference],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.UndefOr[scala.Nothing],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.Array[ProjectReference]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: js.UndefOr[scala.Nothing],
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.Array[ProjectReference],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.UndefOr[scala.Nothing],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.Array[ProjectReference]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: js.UndefOr[scala.Nothing],
      projectReferences: js.Array[ProjectReference],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.UndefOr[scala.Nothing],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.Array[ProjectReference]
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    def createWatchCompilerHost[T /* <: BuilderProgram */](
      rootFiles: js.Array[String],
      options: CompilerOptions,
      system: System,
      createProgram: CreateProgram_[T],
      reportDiagnostic: DiagnosticReporter,
      reportWatchStatus: WatchStatusReporter,
      projectReferences: js.Array[ProjectReference],
      watchOptions: WatchOptions
    ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
    
    /**
      * Creates the watch from the host for config file
      */
    def createWatchProgram[T /* <: BuilderProgram */](host: WatchCompilerHostOfConfigFile[T]): WatchOfConfigFile[T] = js.native
    /**
      * Creates the watch from the host for root files and compiler options
      */
    def createWatchProgram[T /* <: BuilderProgram */](host: WatchCompilerHostOfFilesAndCompilerOptions[T]): WatchOfFilesAndCompilerOptions[T] = js.native
    
    /** @deprecated Use `factory.createWhile` or the factory supplied by your transformation context instead. */
    def createWhile(expression: Expression, statement: Statement): WhileStatement = js.native
    
    /** @deprecated Use `factory.createWith` or the factory supplied by your transformation context instead. */
    def createWith(expression: Expression, statement: Statement): WithStatement = js.native
    
    /** @deprecated Use `factory.createYield` or the factory supplied by your transformation context instead. */
    def createYield(): YieldExpression = js.native
    def createYield(asteriskToken: js.UndefOr[scala.Nothing], expression: Expression): YieldExpression = js.native
    /** @deprecated Use `factory.createYield` or the factory supplied by your transformation context instead. */
    def createYield(asteriskToken: typingsSlinky.typescript.mod.AsteriskToken, expression: Expression): YieldExpression = js.native
    def createYield(expression: Expression): YieldExpression = js.native
    
    def decodedTextSpanIntersectsWith(start1: Double, length1: Double, start2: Double, length2: Double): Boolean = js.native
    
    def displayPartsToString(): String = js.native
    def displayPartsToString(displayParts: js.Array[SymbolDisplayPart]): String = js.native
    
    /**
      * Clears any `EmitNode` entries from parse-tree nodes.
      * @param sourceFile A source file.
      */
    def disposeEmitNodes(): Unit = js.native
    def disposeEmitNodes(sourceFile: SourceFile): Unit = js.native
    
    /** Add an extra underscore to identifiers that start with two underscores to avoid issues with magic names like '__proto__' */
    def escapeLeadingUnderscores(identifier: String): typingsSlinky.typescript.mod.String = js.native
    
    val factory: NodeFactory = js.native
    
    def findAncestor[T /* <: Node */](node: js.UndefOr[scala.Nothing], callback: js.Function1[/* element */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
    /**
      * Iterates through the parent chain of a node and performs the callback on each parent until the callback
      * returns a truthy value, then returns that value.
      * If no such value is found, it applies the callback until the parent pointer is undefined or the callback returns "quit"
      * At that point findAncestor returns undefined.
      */
    def findAncestor[T /* <: Node */](node: Node, callback: js.Function1[/* element */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
    @JSName("findAncestor")
    def findAncestor_quit(node: js.UndefOr[scala.Nothing], callback: js.Function1[/* element */ Node, Boolean | quit]): js.UndefOr[Node] = js.native
    @JSName("findAncestor")
    def findAncestor_quit(node: Node, callback: js.Function1[/* element */ Node, Boolean | quit]): js.UndefOr[Node] = js.native
    
    def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean]): js.UndefOr[String] = js.native
    def findConfigFile(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean], configName: String): js.UndefOr[String] = js.native
    
    def flattenDiagnosticMessageText(diag: js.UndefOr[scala.Nothing], newLine: String): String = js.native
    def flattenDiagnosticMessageText(diag: js.UndefOr[scala.Nothing], newLine: String, indent: Double): String = js.native
    def flattenDiagnosticMessageText(diag: String, newLine: String): String = js.native
    def flattenDiagnosticMessageText(diag: String, newLine: String, indent: Double): String = js.native
    def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: String): String = js.native
    def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: String, indent: Double): String = js.native
    
    def forEachChild[T](node: Node, cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      node: Node,
      cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
      cbNodes: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def forEachLeadingCommentRange[U](
      text: String,
      pos: Double,
      cb: js.Function4[
          /* pos */ Double, 
          /* end */ Double, 
          /* kind */ CommentKind, 
          /* hasTrailingNewLine */ Boolean, 
          U
        ]
    ): js.UndefOr[U] = js.native
    def forEachLeadingCommentRange[T, U](
      text: String,
      pos: Double,
      cb: js.Function5[
          /* pos */ Double, 
          /* end */ Double, 
          /* kind */ CommentKind, 
          /* hasTrailingNewLine */ Boolean, 
          /* state */ T, 
          U
        ],
      state: T
    ): js.UndefOr[U] = js.native
    
    def forEachTrailingCommentRange[U](
      text: String,
      pos: Double,
      cb: js.Function4[
          /* pos */ Double, 
          /* end */ Double, 
          /* kind */ CommentKind, 
          /* hasTrailingNewLine */ Boolean, 
          U
        ]
    ): js.UndefOr[U] = js.native
    def forEachTrailingCommentRange[T, U](
      text: String,
      pos: Double,
      cb: js.Function5[
          /* pos */ Double, 
          /* end */ Double, 
          /* kind */ CommentKind, 
          /* hasTrailingNewLine */ Boolean, 
          /* state */ T, 
          U
        ],
      state: T
    ): js.UndefOr[U] = js.native
    
    def formatDiagnostic(diagnostic: Diagnostic, host: FormatDiagnosticsHost): String = js.native
    
    def formatDiagnostics(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
    
    def formatDiagnosticsWithColorAndContext(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
    
    /** Gets all JSDoc tags that match a specified predicate */
    def getAllJSDocTags[T /* <: JSDocTag */](node: Node, predicate: js.Function1[/* tag */ JSDocTag, /* is T */ Boolean]): js.Array[T] = js.native
    
    /** Gets all JSDoc tags of a specified kind */
    def getAllJSDocTagsOfKind(node: Node, kind: SyntaxKind): js.Array[JSDocTag] = js.native
    
    /**
      * Given a set of options, returns the set of type directive names
      *   that should be included for this program automatically.
      * This list could either come from the config file,
      *   or from enumerating the types root + initial secondary types lookup location.
      * More type directives might appear in the program later as a result of loading actual source files;
      *   this list is only the set of defaults that are implicitly included.
      */
    def getAutomaticTypeDirectiveNames(options: CompilerOptions, host: ModuleResolutionHost): js.Array[String] = js.native
    
    def getCombinedModifierFlags(node: Declaration): ModifierFlags = js.native
    
    def getCombinedNodeFlags(node: Node): NodeFlags = js.native
    
    /**
      * Gets a custom text range to use when emitting comments.
      */
    def getCommentRange(node: Node): TextRange = js.native
    
    def getConfigFileParsingDiagnostics(configFileParseResult: ParsedCommandLine): js.Array[Diagnostic] = js.native
    
    /**
      * Gets the constant value to emit for an expression representing an enum.
      */
    def getConstantValue(node: AccessExpression): js.UndefOr[String | Double] = js.native
    
    def getDefaultCompilerOptions(): CompilerOptions = js.native
    
    def getDefaultFormatCodeSettings(): FormatCodeSettings = js.native
    def getDefaultFormatCodeSettings(newLineCharacter: String): FormatCodeSettings = js.native
    
    def getDefaultLibFileName(options: CompilerOptions): String = js.native
    
    /**
      * Get the path of the default library files (lib.d.ts) as distributed with the typescript
      * node package.
      * The functionality is not supported if the ts module is consumed outside of a node module.
      */
    def getDefaultLibFilePath(options: CompilerOptions): String = js.native
    
    def getEffectiveConstraintOfTypeParameter(node: TypeParameterDeclaration): js.UndefOr[TypeNode] = js.native
    
    /**
      * Gets the effective type parameters. If the node was parsed in a
      * JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
      */
    def getEffectiveTypeParameterDeclarations(node: DeclarationWithTypeParameters): js.Array[TypeParameterDeclaration] = js.native
    
    def getEffectiveTypeRoots(options: CompilerOptions, host: GetEffectiveTypeRootsHost): js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Gets the EmitHelpers of a node.
      */
    def getEmitHelpers(node: Node): js.UndefOr[js.Array[EmitHelper]] = js.native
    
    /** @deprecated Use `factory.getGeneratedNameForNode` or the factory supplied by your transformation context instead. */
    def getGeneratedNameForNode(): Identifier = js.native
    def getGeneratedNameForNode(node: Node): Identifier = js.native
    
    /** Gets the JSDoc augments tag for the node if present */
    def getJSDocAugmentsTag(node: Node): js.UndefOr[JSDocAugmentsTag] = js.native
    
    /** Gets the JSDoc class tag for the node if present */
    def getJSDocClassTag(node: Node): js.UndefOr[JSDocClassTag] = js.native
    
    /** Gets the JSDoc deprecated tag for the node if present */
    def getJSDocDeprecatedTag(node: Node): js.UndefOr[JSDocDeprecatedTag] = js.native
    
    /** Gets the JSDoc enum tag for the node if present */
    def getJSDocEnumTag(node: Node): js.UndefOr[JSDocEnumTag] = js.native
    
    /** Gets the JSDoc implements tags for the node if present */
    def getJSDocImplementsTags(node: Node): js.Array[JSDocImplementsTag] = js.native
    
    /**
      * Gets the JSDoc parameter tags for the node if present.
      *
      * @remarks Returns any JSDoc param tag whose name matches the provided
      * parameter, whether a param tag on a containing function
      * expression, or a param tag on a variable declaration whose
      * initializer is the containing function. The tags closest to the
      * node are returned first, so in the previous example, the param
      * tag on the containing function expression would be first.
      *
      * For binding patterns, parameter tags are matched by position.
      */
    def getJSDocParameterTags(param: ParameterDeclaration): js.Array[JSDocParameterTag] = js.native
    
    /** Gets the JSDoc private tag for the node if present */
    def getJSDocPrivateTag(node: Node): js.UndefOr[JSDocPrivateTag] = js.native
    
    /** Gets the JSDoc protected tag for the node if present */
    def getJSDocProtectedTag(node: Node): js.UndefOr[JSDocProtectedTag] = js.native
    
    /** Gets the JSDoc public tag for the node if present */
    def getJSDocPublicTag(node: Node): js.UndefOr[JSDocPublicTag] = js.native
    
    /** Gets the JSDoc protected tag for the node if present */
    def getJSDocReadonlyTag(node: Node): js.UndefOr[JSDocReadonlyTag] = js.native
    
    /** Gets the JSDoc return tag for the node if present */
    def getJSDocReturnTag(node: Node): js.UndefOr[JSDocReturnTag] = js.native
    
    /**
      * Gets the return type node for the node if provided via JSDoc return tag or type tag.
      *
      * @remarks `getJSDocReturnTag` just gets the whole JSDoc tag. This function
      * gets the type from inside the braces, after the fat arrow, etc.
      */
    def getJSDocReturnType(node: Node): js.UndefOr[TypeNode] = js.native
    
    /** Get all JSDoc tags related to a node, including those on parent nodes. */
    def getJSDocTags(node: Node): js.Array[JSDocTag] = js.native
    
    /** Gets the JSDoc template tag for the node if present */
    def getJSDocTemplateTag(node: Node): js.UndefOr[JSDocTemplateTag] = js.native
    
    /** Gets the JSDoc this tag for the node if present */
    def getJSDocThisTag(node: Node): js.UndefOr[JSDocThisTag] = js.native
    
    /**
      * Gets the type node for the node if provided via JSDoc.
      *
      * @remarks The search includes any JSDoc param tag that relates
      * to the provided parameter, for example a type tag on the
      * parameter itself, or a param tag on a containing function
      * expression, or a param tag on a variable declaration whose
      * initializer is the containing function. The tags closest to the
      * node are examined first, so in the previous example, the type
      * tag directly on the node would be returned.
      */
    def getJSDocType(node: Node): js.UndefOr[TypeNode] = js.native
    
    /**
      * Gets the JSDoc type parameter tags for the node if present.
      *
      * @remarks Returns any JSDoc template tag whose names match the provided
      * parameter, whether a template tag on a containing function
      * expression, or a template tag on a variable declaration whose
      * initializer is the containing function. The tags closest to the
      * node are returned first, so in the previous example, the template
      * tag on the containing function expression would be first.
      */
    def getJSDocTypeParameterTags(param: TypeParameterDeclaration): js.Array[JSDocTemplateTag] = js.native
    
    /** Gets the JSDoc type tag for the node if present and valid */
    def getJSDocTypeTag(node: Node): js.UndefOr[JSDocTypeTag] = js.native
    
    def getLeadingCommentRanges(text: String, pos: Double): js.UndefOr[js.Array[CommentRange]] = js.native
    
    def getLineAndCharacterOfPosition(sourceFile: SourceFileLike, position: Double): LineAndCharacter = js.native
    
    /**
      * Creates a shallow, memberwise clone of a node ~for mutation~ with its `pos`, `end`, and `parent` set.
      *
      * NOTE: It is unsafe to change any properties of a `Node` that relate to its AST children, as those changes won't be
      * captured with respect to transformations.
      *
      * @deprecated Use `factory.cloneNode` instead and use `setCommentRange` or `setSourceMapRange` and avoid setting `parent`.
      */
    def getMutableClone[T /* <: Node */](node: T): T = js.native
    
    def getNameOfDeclaration(declaration: Declaration): js.UndefOr[DeclarationName] = js.native
    def getNameOfDeclaration(declaration: Expression): js.UndefOr[DeclarationName] = js.native
    
    def getNameOfJSDocTypedef(declaration: JSDocTypedefTag): js.UndefOr[Identifier | PrivateIdentifier] = js.native
    
    def getNodeMajorVersion(): js.UndefOr[Double] = js.native
    
    def getOriginalNode(): js.UndefOr[Node] = js.native
    def getOriginalNode(node: Node): js.UndefOr[Node] = js.native
    def getOriginalNode[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      nodeTest: js.Function1[/* node */ js.UndefOr[Node], /* is T */ Boolean]
    ): js.UndefOr[T] = js.native
    def getOriginalNode[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): T = js.native
    @JSName("getOriginalNode")
    def getOriginalNode_Node(node: Node): Node = js.native
    @JSName("getOriginalNode")
    def getOriginalNode_T_Node_Union[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ js.UndefOr[Node], /* is T */ Boolean]): js.UndefOr[T] = js.native
    
    def getOutputFileNames(commandLine: ParsedCommandLine, inputFileName: String, ignoreCase: Boolean): js.Array[String] = js.native
    
    /**
      * Gets the original parse tree node for a node.
      *
      * @param node The original node.
      * @returns The original parse tree node if found; otherwise, undefined.
      */
    def getParseTreeNode(): js.UndefOr[Node] = js.native
    def getParseTreeNode(node: Node): js.UndefOr[Node] = js.native
    def getParseTreeNode[T /* <: Node */](node: T): js.UndefOr[T] = js.native
    def getParseTreeNode[T /* <: Node */](node: T, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
    def getParseTreeNode[T /* <: Node */](node: js.UndefOr[scala.Nothing], nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
    /**
      * Gets the original parse tree node for a node.
      *
      * @param node The original node.
      * @param nodeTest A callback used to ensure the correct type of parse tree node is returned.
      * @returns The original parse tree node if found; otherwise, undefined.
      */
    @JSName("getParseTreeNode")
    def getParseTreeNode_T_Node[T /* <: Node */](): js.UndefOr[T] = js.native
    
    def getParsedCommandLineOfConfigFile(configFileName: String, optionsToExtend: CompilerOptions, host: ParseConfigFileHost): js.UndefOr[ParsedCommandLine] = js.native
    def getParsedCommandLineOfConfigFile(
      configFileName: String,
      optionsToExtend: CompilerOptions,
      host: ParseConfigFileHost,
      extendedConfigCache: js.UndefOr[scala.Nothing],
      watchOptionsToExtend: js.UndefOr[scala.Nothing],
      extraFileExtensions: js.Array[FileExtensionInfo]
    ): js.UndefOr[ParsedCommandLine] = js.native
    def getParsedCommandLineOfConfigFile(
      configFileName: String,
      optionsToExtend: CompilerOptions,
      host: ParseConfigFileHost,
      extendedConfigCache: js.UndefOr[scala.Nothing],
      watchOptionsToExtend: WatchOptions
    ): js.UndefOr[ParsedCommandLine] = js.native
    def getParsedCommandLineOfConfigFile(
      configFileName: String,
      optionsToExtend: CompilerOptions,
      host: ParseConfigFileHost,
      extendedConfigCache: js.UndefOr[scala.Nothing],
      watchOptionsToExtend: WatchOptions,
      extraFileExtensions: js.Array[FileExtensionInfo]
    ): js.UndefOr[ParsedCommandLine] = js.native
    def getParsedCommandLineOfConfigFile(
      configFileName: String,
      optionsToExtend: CompilerOptions,
      host: ParseConfigFileHost,
      extendedConfigCache: Map[ExtendedConfigCacheEntry]
    ): js.UndefOr[ParsedCommandLine] = js.native
    def getParsedCommandLineOfConfigFile(
      configFileName: String,
      optionsToExtend: CompilerOptions,
      host: ParseConfigFileHost,
      extendedConfigCache: Map[ExtendedConfigCacheEntry],
      watchOptionsToExtend: js.UndefOr[scala.Nothing],
      extraFileExtensions: js.Array[FileExtensionInfo]
    ): js.UndefOr[ParsedCommandLine] = js.native
    def getParsedCommandLineOfConfigFile(
      configFileName: String,
      optionsToExtend: CompilerOptions,
      host: ParseConfigFileHost,
      extendedConfigCache: Map[ExtendedConfigCacheEntry],
      watchOptionsToExtend: WatchOptions
    ): js.UndefOr[ParsedCommandLine] = js.native
    def getParsedCommandLineOfConfigFile(
      configFileName: String,
      optionsToExtend: CompilerOptions,
      host: ParseConfigFileHost,
      extendedConfigCache: Map[ExtendedConfigCacheEntry],
      watchOptionsToExtend: WatchOptions,
      extraFileExtensions: js.Array[FileExtensionInfo]
    ): js.UndefOr[ParsedCommandLine] = js.native
    
    def getPositionOfLineAndCharacter(sourceFile: SourceFileLike, line: Double, character: Double): Double = js.native
    
    def getPreEmitDiagnostics(program: Program): js.Array[Diagnostic] = js.native
    def getPreEmitDiagnostics(program: Program, sourceFile: js.UndefOr[scala.Nothing], cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
    def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
    def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
    
    /** Optionally, get the shebang */
    def getShebang(text: String): js.UndefOr[String] = js.native
    
    /**
      * Gets a custom text range to use when emitting source maps.
      */
    def getSourceMapRange(node: Node): SourceMapRange = js.native
    
    def getSupportedCodeFixes(): js.Array[String] = js.native
    
    def getSyntheticLeadingComments(node: Node): js.UndefOr[js.Array[SynthesizedComment]] = js.native
    
    def getSyntheticTrailingComments(node: Node): js.UndefOr[js.Array[SynthesizedComment]] = js.native
    
    /**
      * Gets the TextRange to use for source maps for a token of a node.
      */
    def getTokenSourceMapRange(node: Node, token: SyntaxKind): js.UndefOr[SourceMapRange] = js.native
    
    def getTrailingCommentRanges(text: String, pos: Double): js.UndefOr[js.Array[CommentRange]] = js.native
    
    def getTsBuildInfoEmitOutputFilePath(options: CompilerOptions): js.UndefOr[String] = js.native
    
    def getTypeParameterOwner(d: Declaration): js.UndefOr[Declaration] = js.native
    
    /**
      * Return true if the node has JSDoc parameter tags.
      *
      * @remarks Includes parameter tags that are not directly on the node,
      * for example on a variable declaration whose initializer is a function expression.
      */
    def hasJSDocParameterTags(node: FunctionLikeDeclaration): Boolean = js.native
    def hasJSDocParameterTags(node: SignatureDeclaration): Boolean = js.native
    
    /** True if has initializer node attached to it. */
    def hasOnlyExpressionInitializer(node: Node): /* is typescript.typescript.HasExpressionInitializer */ Boolean = js.native
    
    def idText(identifierOrPrivateName: Identifier): String = js.native
    def idText(identifierOrPrivateName: PrivateIdentifier): String = js.native
    
    def isAccessor(node: Node): /* is typescript.typescript.AccessorDeclaration */ Boolean = js.native
    
    def isArrayBindingPattern(node: Node): /* is typescript.typescript.ArrayBindingPattern */ Boolean = js.native
    
    def isArrayLiteralExpression(node: Node): /* is typescript.typescript.ArrayLiteralExpression */ Boolean = js.native
    
    def isArrayTypeNode(node: Node): /* is typescript.typescript.ArrayTypeNode */ Boolean = js.native
    
    def isArrowFunction(node: Node): /* is typescript.typescript.ArrowFunction */ Boolean = js.native
    
    def isAsExpression(node: Node): /* is typescript.typescript.AsExpression */ Boolean = js.native
    
    def isAssertionExpression(node: Node): /* is typescript.typescript.AssertionExpression */ Boolean = js.native
    
    def isAwaitExpression(node: Node): /* is typescript.typescript.AwaitExpression */ Boolean = js.native
    
    def isBigIntLiteral(node: Node): /* is typescript.typescript.BigIntLiteral */ Boolean = js.native
    
    def isBinaryExpression(node: Node): /* is typescript.typescript.BinaryExpression */ Boolean = js.native
    
    def isBindingElement(node: Node): /* is typescript.typescript.BindingElement */ Boolean = js.native
    
    def isBindingName(node: Node): /* is typescript.typescript.BindingName */ Boolean = js.native
    
    def isBlock(node: Node): /* is typescript.typescript.Block */ Boolean = js.native
    
    def isBreakOrContinueStatement(node: Node): /* is typescript.typescript.BreakOrContinueStatement */ Boolean = js.native
    
    def isBreakStatement(node: Node): /* is typescript.typescript.BreakStatement */ Boolean = js.native
    
    def isBundle(node: Node): /* is typescript.typescript.Bundle */ Boolean = js.native
    
    def isCallChain(node: Node): /* is typescript.typescript.CallChain */ Boolean = js.native
    
    def isCallExpression(node: Node): /* is typescript.typescript.CallExpression */ Boolean = js.native
    
    def isCallLikeExpression(node: Node): /* is typescript.typescript.CallLikeExpression */ Boolean = js.native
    
    def isCallOrNewExpression(node: Node): Boolean = js.native
    
    def isCallSignatureDeclaration(node: Node): /* is typescript.typescript.CallSignatureDeclaration */ Boolean = js.native
    
    def isCaseBlock(node: Node): /* is typescript.typescript.CaseBlock */ Boolean = js.native
    
    def isCaseClause(node: Node): /* is typescript.typescript.CaseClause */ Boolean = js.native
    
    def isCaseOrDefaultClause(node: Node): /* is typescript.typescript.CaseOrDefaultClause */ Boolean = js.native
    
    def isCatchClause(node: Node): /* is typescript.typescript.CatchClause */ Boolean = js.native
    
    def isClassDeclaration(node: Node): /* is typescript.typescript.ClassDeclaration */ Boolean = js.native
    
    def isClassElement(node: Node): /* is typescript.typescript.ClassElement */ Boolean = js.native
    
    def isClassExpression(node: Node): /* is typescript.typescript.ClassExpression */ Boolean = js.native
    
    def isClassLike(node: Node): /* is typescript.typescript.ClassLikeDeclaration */ Boolean = js.native
    
    def isClassOrTypeElement(node: Node): Boolean = js.native
    
    def isCommaListExpression(node: Node): /* is typescript.typescript.CommaListExpression */ Boolean = js.native
    
    def isComputedPropertyName(node: Node): /* is typescript.typescript.ComputedPropertyName */ Boolean = js.native
    
    def isConditionalExpression(node: Node): /* is typescript.typescript.ConditionalExpression */ Boolean = js.native
    
    def isConditionalTypeNode(node: Node): /* is typescript.typescript.ConditionalTypeNode */ Boolean = js.native
    
    def isConstTypeReference(node: Node): Boolean = js.native
    
    def isConstructSignatureDeclaration(node: Node): /* is typescript.typescript.ConstructSignatureDeclaration */ Boolean = js.native
    
    def isConstructorDeclaration(node: Node): /* is typescript.typescript.ConstructorDeclaration */ Boolean = js.native
    
    def isConstructorTypeNode(node: Node): /* is typescript.typescript.ConstructorTypeNode */ Boolean = js.native
    
    def isContinueStatement(node: Node): /* is typescript.typescript.ContinueStatement */ Boolean = js.native
    
    def isDebuggerStatement(node: Node): /* is typescript.typescript.DebuggerStatement */ Boolean = js.native
    
    def isDecorator(node: Node): /* is typescript.typescript.Decorator */ Boolean = js.native
    
    def isDefaultClause(node: Node): /* is typescript.typescript.DefaultClause */ Boolean = js.native
    
    def isDeleteExpression(node: Node): /* is typescript.typescript.DeleteExpression */ Boolean = js.native
    
    def isDoStatement(node: Node): /* is typescript.typescript.DoStatement */ Boolean = js.native
    
    def isElementAccessChain(node: Node): /* is typescript.typescript.ElementAccessChain */ Boolean = js.native
    
    def isElementAccessExpression(node: Node): /* is typescript.typescript.ElementAccessExpression */ Boolean = js.native
    
    def isEmptyBindingElement(node: BindingElement): Boolean = js.native
    
    def isEmptyBindingPattern(node: BindingName): /* is typescript.typescript.BindingPattern */ Boolean = js.native
    
    def isEmptyStatement(node: Node): /* is typescript.typescript.EmptyStatement */ Boolean = js.native
    
    def isEntityName(node: Node): /* is typescript.typescript.EntityName */ Boolean = js.native
    
    def isEnumDeclaration(node: Node): /* is typescript.typescript.EnumDeclaration */ Boolean = js.native
    
    def isEnumMember(node: Node): /* is typescript.typescript.EnumMember */ Boolean = js.native
    
    def isExportAssignment(node: Node): /* is typescript.typescript.ExportAssignment */ Boolean = js.native
    
    def isExportDeclaration(node: Node): /* is typescript.typescript.ExportDeclaration */ Boolean = js.native
    
    def isExportSpecifier(node: Node): /* is typescript.typescript.ExportSpecifier */ Boolean = js.native
    
    def isExpressionStatement(node: Node): /* is typescript.typescript.ExpressionStatement */ Boolean = js.native
    
    def isExpressionWithTypeArguments(node: Node): /* is typescript.typescript.ExpressionWithTypeArguments */ Boolean = js.native
    
    def isExternalModule(file: SourceFile): Boolean = js.native
    
    def isExternalModuleNameRelative(moduleName: String): Boolean = js.native
    
    def isExternalModuleReference(node: Node): /* is typescript.typescript.ExternalModuleReference */ Boolean = js.native
    
    def isForInStatement(node: Node): /* is typescript.typescript.ForInStatement */ Boolean = js.native
    
    def isForOfStatement(node: Node): /* is typescript.typescript.ForOfStatement */ Boolean = js.native
    
    def isForStatement(node: Node): /* is typescript.typescript.ForStatement */ Boolean = js.native
    
    def isFunctionDeclaration(node: Node): /* is typescript.typescript.FunctionDeclaration */ Boolean = js.native
    
    def isFunctionExpression(node: Node): /* is typescript.typescript.FunctionExpression */ Boolean = js.native
    
    def isFunctionLike(node: Node): /* is typescript.typescript.SignatureDeclaration */ Boolean = js.native
    
    def isFunctionOrConstructorTypeNode(node: Node): Boolean = js.native
    
    def isFunctionTypeNode(node: Node): /* is typescript.typescript.FunctionTypeNode */ Boolean = js.native
    
    def isGetAccessor(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ Boolean = js.native
    
    def isGetAccessorDeclaration(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ Boolean = js.native
    
    def isHeritageClause(node: Node): /* is typescript.typescript.HeritageClause */ Boolean = js.native
    
    def isIdentifier(node: Node): /* is typescript.typescript.Identifier */ Boolean = js.native
    
    def isIdentifierOrPrivateIdentifier(node: Node): Boolean = js.native
    
    def isIdentifierPart(ch: Double): Boolean = js.native
    def isIdentifierPart(ch: Double, languageVersion: js.UndefOr[scala.Nothing], identifierVariant: LanguageVariant): Boolean = js.native
    def isIdentifierPart(ch: Double, languageVersion: ScriptTarget): Boolean = js.native
    def isIdentifierPart(ch: Double, languageVersion: ScriptTarget, identifierVariant: LanguageVariant): Boolean = js.native
    
    def isIdentifierStart(ch: Double): Boolean = js.native
    def isIdentifierStart(ch: Double, languageVersion: ScriptTarget): Boolean = js.native
    
    def isIfStatement(node: Node): /* is typescript.typescript.IfStatement */ Boolean = js.native
    
    def isImportClause(node: Node): /* is typescript.typescript.ImportClause */ Boolean = js.native
    
    def isImportDeclaration(node: Node): /* is typescript.typescript.ImportDeclaration */ Boolean = js.native
    
    def isImportEqualsDeclaration(node: Node): /* is typescript.typescript.ImportEqualsDeclaration */ Boolean = js.native
    
    def isImportOrExportSpecifier(node: Node): Boolean = js.native
    
    def isImportSpecifier(node: Node): /* is typescript.typescript.ImportSpecifier */ Boolean = js.native
    
    def isImportTypeNode(node: Node): /* is typescript.typescript.ImportTypeNode */ Boolean = js.native
    
    def isIndexSignatureDeclaration(node: Node): /* is typescript.typescript.IndexSignatureDeclaration */ Boolean = js.native
    
    def isIndexedAccessTypeNode(node: Node): /* is typescript.typescript.IndexedAccessTypeNode */ Boolean = js.native
    
    def isInferTypeNode(node: Node): /* is typescript.typescript.InferTypeNode */ Boolean = js.native
    
    def isInterfaceDeclaration(node: Node): /* is typescript.typescript.InterfaceDeclaration */ Boolean = js.native
    
    def isIntersectionTypeNode(node: Node): /* is typescript.typescript.IntersectionTypeNode */ Boolean = js.native
    
    def isIterationStatement(node: Node, lookInLabeledStatements: Boolean): Boolean = js.native
    @JSName("isIterationStatement")
    def isIterationStatement_false(node: Node, lookInLabeledStatements: `false`): /* is typescript.typescript.IterationStatement */ Boolean = js.native
    
    def isJSDoc(node: Node): /* is typescript.typescript.JSDoc */ Boolean = js.native
    
    def isJSDocAllType(node: Node): /* is typescript.typescript.JSDocAllType */ Boolean = js.native
    
    def isJSDocAugmentsTag(node: Node): /* is typescript.typescript.JSDocAugmentsTag */ Boolean = js.native
    
    def isJSDocAuthorTag(node: Node): /* is typescript.typescript.JSDocAuthorTag */ Boolean = js.native
    
    def isJSDocCallbackTag(node: Node): /* is typescript.typescript.JSDocCallbackTag */ Boolean = js.native
    
    def isJSDocClassTag(node: Node): /* is typescript.typescript.JSDocClassTag */ Boolean = js.native
    
    /** True if node is of a kind that may contain comment text. */
    def isJSDocCommentContainingNode(node: Node): Boolean = js.native
    
    def isJSDocDeprecatedTag(node: Node): /* is typescript.typescript.JSDocDeprecatedTag */ Boolean = js.native
    
    def isJSDocEnumTag(node: Node): /* is typescript.typescript.JSDocEnumTag */ Boolean = js.native
    
    def isJSDocFunctionType(node: Node): /* is typescript.typescript.JSDocFunctionType */ Boolean = js.native
    
    def isJSDocImplementsTag(node: Node): /* is typescript.typescript.JSDocImplementsTag */ Boolean = js.native
    
    def isJSDocNameReference(node: Node): /* is typescript.typescript.JSDocNameReference */ Boolean = js.native
    
    def isJSDocNamepathType(node: Node): /* is typescript.typescript.JSDocNamepathType */ Boolean = js.native
    
    def isJSDocNonNullableType(node: Node): /* is typescript.typescript.JSDocNonNullableType */ Boolean = js.native
    
    def isJSDocNullableType(node: Node): /* is typescript.typescript.JSDocNullableType */ Boolean = js.native
    
    def isJSDocOptionalType(node: Node): /* is typescript.typescript.JSDocOptionalType */ Boolean = js.native
    
    def isJSDocParameterTag(node: Node): /* is typescript.typescript.JSDocParameterTag */ Boolean = js.native
    
    def isJSDocPrivateTag(node: Node): /* is typescript.typescript.JSDocPrivateTag */ Boolean = js.native
    
    def isJSDocPropertyLikeTag(node: Node): /* is typescript.typescript.JSDocPropertyLikeTag */ Boolean = js.native
    
    def isJSDocPropertyTag(node: Node): /* is typescript.typescript.JSDocPropertyTag */ Boolean = js.native
    
    def isJSDocProtectedTag(node: Node): /* is typescript.typescript.JSDocProtectedTag */ Boolean = js.native
    
    def isJSDocPublicTag(node: Node): /* is typescript.typescript.JSDocPublicTag */ Boolean = js.native
    
    def isJSDocReadonlyTag(node: Node): /* is typescript.typescript.JSDocReadonlyTag */ Boolean = js.native
    
    def isJSDocReturnTag(node: Node): /* is typescript.typescript.JSDocReturnTag */ Boolean = js.native
    
    def isJSDocSignature(node: Node): /* is typescript.typescript.JSDocSignature */ Boolean = js.native
    
    def isJSDocTemplateTag(node: Node): /* is typescript.typescript.JSDocTemplateTag */ Boolean = js.native
    
    def isJSDocThisTag(node: Node): /* is typescript.typescript.JSDocThisTag */ Boolean = js.native
    
    def isJSDocTypeExpression(node: Node): /* is typescript.typescript.JSDocTypeExpression */ Boolean = js.native
    
    def isJSDocTypeLiteral(node: Node): /* is typescript.typescript.JSDocTypeLiteral */ Boolean = js.native
    
    def isJSDocTypeTag(node: Node): /* is typescript.typescript.JSDocTypeTag */ Boolean = js.native
    
    def isJSDocTypedefTag(node: Node): /* is typescript.typescript.JSDocTypedefTag */ Boolean = js.native
    
    def isJSDocUnknownTag(node: Node): /* is typescript.typescript.JSDocUnknownTag */ Boolean = js.native
    
    def isJSDocUnknownType(node: Node): /* is typescript.typescript.JSDocUnknownType */ Boolean = js.native
    
    def isJSDocVariadicType(node: Node): /* is typescript.typescript.JSDocVariadicType */ Boolean = js.native
    
    def isJsxAttribute(node: Node): /* is typescript.typescript.JsxAttribute */ Boolean = js.native
    
    def isJsxAttributes(node: Node): /* is typescript.typescript.JsxAttributes */ Boolean = js.native
    
    def isJsxClosingElement(node: Node): /* is typescript.typescript.JsxClosingElement */ Boolean = js.native
    
    def isJsxClosingFragment(node: Node): /* is typescript.typescript.JsxClosingFragment */ Boolean = js.native
    
    def isJsxElement(node: Node): /* is typescript.typescript.JsxElement */ Boolean = js.native
    
    def isJsxExpression(node: Node): /* is typescript.typescript.JsxExpression */ Boolean = js.native
    
    def isJsxFragment(node: Node): /* is typescript.typescript.JsxFragment */ Boolean = js.native
    
    def isJsxOpeningElement(node: Node): /* is typescript.typescript.JsxOpeningElement */ Boolean = js.native
    
    def isJsxOpeningFragment(node: Node): /* is typescript.typescript.JsxOpeningFragment */ Boolean = js.native
    
    def isJsxOpeningLikeElement(node: Node): /* is typescript.typescript.JsxOpeningLikeElement */ Boolean = js.native
    
    def isJsxSelfClosingElement(node: Node): /* is typescript.typescript.JsxSelfClosingElement */ Boolean = js.native
    
    def isJsxSpreadAttribute(node: Node): /* is typescript.typescript.JsxSpreadAttribute */ Boolean = js.native
    
    def isJsxText(node: Node): /* is typescript.typescript.JsxText */ Boolean = js.native
    
    def isLabeledStatement(node: Node): /* is typescript.typescript.LabeledStatement */ Boolean = js.native
    
    def isLineBreak(ch: Double): Boolean = js.native
    
    def isLiteralExpression(node: Node): /* is typescript.typescript.LiteralExpression */ Boolean = js.native
    
    def isLiteralTypeNode(node: Node): /* is typescript.typescript.LiteralTypeNode */ Boolean = js.native
    
    def isMappedTypeNode(node: Node): /* is typescript.typescript.MappedTypeNode */ Boolean = js.native
    
    def isMetaProperty(node: Node): /* is typescript.typescript.MetaProperty */ Boolean = js.native
    
    def isMethodDeclaration(node: Node): /* is typescript.typescript.MethodDeclaration */ Boolean = js.native
    
    def isMethodSignature(node: Node): /* is typescript.typescript.MethodSignature */ Boolean = js.native
    
    def isMissingDeclaration(node: Node): /* is typescript.typescript.MissingDeclaration */ Boolean = js.native
    
    def isModifier(node: Node): /* is typescript.typescript.Modifier */ Boolean = js.native
    
    def isModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = js.native
    
    def isModuleDeclaration(node: Node): /* is typescript.typescript.ModuleDeclaration */ Boolean = js.native
    
    def isNamedExportBindings(node: Node): /* is typescript.typescript.NamedExportBindings */ Boolean = js.native
    
    def isNamedExports(node: Node): /* is typescript.typescript.NamedExports */ Boolean = js.native
    
    def isNamedImports(node: Node): /* is typescript.typescript.NamedImports */ Boolean = js.native
    
    def isNamedTupleMember(node: Node): /* is typescript.typescript.NamedTupleMember */ Boolean = js.native
    
    def isNamespaceExport(node: Node): /* is typescript.typescript.NamespaceExport */ Boolean = js.native
    
    def isNamespaceExportDeclaration(node: Node): /* is typescript.typescript.NamespaceExportDeclaration */ Boolean = js.native
    
    def isNamespaceImport(node: Node): /* is typescript.typescript.NamespaceImport */ Boolean = js.native
    
    def isNewExpression(node: Node): /* is typescript.typescript.NewExpression */ Boolean = js.native
    
    def isNoSubstitutionTemplateLiteral(node: Node): /* is typescript.typescript.NoSubstitutionTemplateLiteral */ Boolean = js.native
    
    def isNonNullChain(node: Node): /* is typescript.typescript.NonNullChain */ Boolean = js.native
    
    def isNonNullExpression(node: Node): /* is typescript.typescript.NonNullExpression */ Boolean = js.native
    
    def isNotEmittedStatement(node: Node): /* is typescript.typescript.NotEmittedStatement */ Boolean = js.native
    
    def isNullishCoalesce(node: Node): Boolean = js.native
    
    def isNumericLiteral(node: Node): /* is typescript.typescript.NumericLiteral */ Boolean = js.native
    
    def isObjectBindingPattern(node: Node): /* is typescript.typescript.ObjectBindingPattern */ Boolean = js.native
    
    def isObjectLiteralElement(node: Node): /* is typescript.typescript.ObjectLiteralElement */ Boolean = js.native
    
    def isObjectLiteralElementLike(node: Node): /* is typescript.typescript.ObjectLiteralElementLike */ Boolean = js.native
    
    def isObjectLiteralExpression(node: Node): /* is typescript.typescript.ObjectLiteralExpression */ Boolean = js.native
    
    def isOmittedExpression(node: Node): /* is typescript.typescript.OmittedExpression */ Boolean = js.native
    
    def isOptionalChain(node: Node): Boolean = js.native
    
    def isOptionalTypeNode(node: Node): /* is typescript.typescript.OptionalTypeNode */ Boolean = js.native
    
    def isParameter(node: Node): /* is typescript.typescript.ParameterDeclaration */ Boolean = js.native
    
    def isParameterPropertyDeclaration(node: Node, parent: Node): /* is typescript.typescript.ParameterPropertyDeclaration */ Boolean = js.native
    
    def isParenthesizedExpression(node: Node): /* is typescript.typescript.ParenthesizedExpression */ Boolean = js.native
    
    def isParenthesizedTypeNode(node: Node): /* is typescript.typescript.ParenthesizedTypeNode */ Boolean = js.native
    
    /**
      * Gets a value indicating whether a node originated in the parse tree.
      *
      * @param node The node to test.
      */
    def isParseTreeNode(node: Node): Boolean = js.native
    
    def isPartiallyEmittedExpression(node: Node): /* is typescript.typescript.PartiallyEmittedExpression */ Boolean = js.native
    
    def isPostfixUnaryExpression(node: Node): /* is typescript.typescript.PostfixUnaryExpression */ Boolean = js.native
    
    def isPrefixUnaryExpression(node: Node): /* is typescript.typescript.PrefixUnaryExpression */ Boolean = js.native
    
    def isPrivateIdentifier(node: Node): /* is typescript.typescript.PrivateIdentifier */ Boolean = js.native
    
    def isPropertyAccessChain(node: Node): /* is typescript.typescript.PropertyAccessChain */ Boolean = js.native
    
    def isPropertyAccessExpression(node: Node): /* is typescript.typescript.PropertyAccessExpression */ Boolean = js.native
    
    def isPropertyAccessOrQualifiedName(node: Node): Boolean = js.native
    
    def isPropertyAssignment(node: Node): /* is typescript.typescript.PropertyAssignment */ Boolean = js.native
    
    def isPropertyDeclaration(node: Node): /* is typescript.typescript.PropertyDeclaration */ Boolean = js.native
    
    def isPropertyName(node: Node): /* is typescript.typescript.PropertyName */ Boolean = js.native
    
    def isPropertySignature(node: Node): /* is typescript.typescript.PropertySignature */ Boolean = js.native
    
    def isQualifiedName(node: Node): /* is typescript.typescript.QualifiedName */ Boolean = js.native
    
    def isRegularExpressionLiteral(node: Node): /* is typescript.typescript.RegularExpressionLiteral */ Boolean = js.native
    
    def isRestTypeNode(node: Node): /* is typescript.typescript.RestTypeNode */ Boolean = js.native
    
    def isReturnStatement(node: Node): /* is typescript.typescript.ReturnStatement */ Boolean = js.native
    
    def isSemicolonClassElement(node: Node): /* is typescript.typescript.SemicolonClassElement */ Boolean = js.native
    
    def isSetAccessor(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ Boolean = js.native
    
    def isSetAccessorDeclaration(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ Boolean = js.native
    
    def isShorthandPropertyAssignment(node: Node): /* is typescript.typescript.ShorthandPropertyAssignment */ Boolean = js.native
    
    def isSourceFile(node: Node): /* is typescript.typescript.SourceFile */ Boolean = js.native
    
    def isSpreadAssignment(node: Node): /* is typescript.typescript.SpreadAssignment */ Boolean = js.native
    
    def isSpreadElement(node: Node): /* is typescript.typescript.SpreadElement */ Boolean = js.native
    
    def isStringLiteral(node: Node): /* is typescript.typescript.StringLiteral */ Boolean = js.native
    
    def isStringLiteralLike(node: Node): /* is typescript.typescript.StringLiteralLike */ Boolean = js.native
    
    def isStringTextContainingNode(node: Node): Boolean = js.native
    
    def isSwitchStatement(node: Node): /* is typescript.typescript.SwitchStatement */ Boolean = js.native
    
    def isSyntheticExpression(node: Node): /* is typescript.typescript.SyntheticExpression */ Boolean = js.native
    
    def isTaggedTemplateExpression(node: Node): /* is typescript.typescript.TaggedTemplateExpression */ Boolean = js.native
    
    def isTemplateExpression(node: Node): /* is typescript.typescript.TemplateExpression */ Boolean = js.native
    
    def isTemplateHead(node: Node): /* is typescript.typescript.TemplateHead */ Boolean = js.native
    
    def isTemplateLiteral(node: Node): /* is typescript.typescript.TemplateLiteral */ Boolean = js.native
    
    def isTemplateLiteralToken(node: Node): /* is typescript.typescript.TemplateLiteralToken */ Boolean = js.native
    
    def isTemplateLiteralTypeNode(node: Node): /* is typescript.typescript.TemplateLiteralTypeNode */ Boolean = js.native
    
    def isTemplateLiteralTypeSpan(node: Node): /* is typescript.typescript.TemplateLiteralTypeSpan */ Boolean = js.native
    
    def isTemplateMiddle(node: Node): /* is typescript.typescript.TemplateMiddle */ Boolean = js.native
    
    def isTemplateMiddleOrTemplateTail(node: Node): Boolean = js.native
    
    def isTemplateSpan(node: Node): /* is typescript.typescript.TemplateSpan */ Boolean = js.native
    
    def isTemplateTail(node: Node): /* is typescript.typescript.TemplateTail */ Boolean = js.native
    
    def isThisTypeNode(node: Node): /* is typescript.typescript.ThisTypeNode */ Boolean = js.native
    
    def isThrowStatement(node: Node): /* is typescript.typescript.ThrowStatement */ Boolean = js.native
    
    /**
      * True if node is of some token syntax kind.
      * For example, this is true for an IfKeyword but not for an IfStatement.
      * Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
      */
    def isToken(n: Node): Boolean = js.native
    
    def isTryStatement(node: Node): /* is typescript.typescript.TryStatement */ Boolean = js.native
    
    def isTupleTypeNode(node: Node): /* is typescript.typescript.TupleTypeNode */ Boolean = js.native
    
    def isTypeAliasDeclaration(node: Node): /* is typescript.typescript.TypeAliasDeclaration */ Boolean = js.native
    
    /** @deprecated Use `isTypeAssertionExpression` instead. */
    def isTypeAssertion(node: Node): /* is typescript.typescript.TypeAssertion */ Boolean = js.native
    
    def isTypeAssertionExpression(node: Node): /* is typescript.typescript.TypeAssertion */ Boolean = js.native
    
    def isTypeElement(node: Node): /* is typescript.typescript.TypeElement */ Boolean = js.native
    
    def isTypeLiteralNode(node: Node): /* is typescript.typescript.TypeLiteralNode */ Boolean = js.native
    
    /**
      * Node test that determines whether a node is a valid type node.
      * This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
      * of a TypeNode.
      */
    def isTypeNode(node: Node): /* is typescript.typescript.TypeNode */ Boolean = js.native
    
    def isTypeOfExpression(node: Node): /* is typescript.typescript.TypeOfExpression */ Boolean = js.native
    
    def isTypeOnlyImportOrExportDeclaration(node: Node): /* is typescript.typescript.TypeOnlyCompatibleAliasDeclaration */ Boolean = js.native
    
    def isTypeOperatorNode(node: Node): /* is typescript.typescript.TypeOperatorNode */ Boolean = js.native
    
    def isTypeParameterDeclaration(node: Node): /* is typescript.typescript.TypeParameterDeclaration */ Boolean = js.native
    
    def isTypePredicateNode(node: Node): /* is typescript.typescript.TypePredicateNode */ Boolean = js.native
    
    def isTypeQueryNode(node: Node): /* is typescript.typescript.TypeQueryNode */ Boolean = js.native
    
    def isTypeReferenceNode(node: Node): /* is typescript.typescript.TypeReferenceNode */ Boolean = js.native
    
    def isUnionTypeNode(node: Node): /* is typescript.typescript.UnionTypeNode */ Boolean = js.native
    
    def isUnparsedNode(node: Node): /* is typescript.typescript.UnparsedNode */ Boolean = js.native
    
    def isUnparsedPrepend(node: Node): /* is typescript.typescript.UnparsedPrepend */ Boolean = js.native
    
    def isUnparsedSource(node: Node): /* is typescript.typescript.UnparsedSource */ Boolean = js.native
    
    def isUnparsedTextLike(node: Node): /* is typescript.typescript.UnparsedTextLike */ Boolean = js.native
    
    def isVariableDeclaration(node: Node): /* is typescript.typescript.VariableDeclaration */ Boolean = js.native
    
    def isVariableDeclarationList(node: Node): /* is typescript.typescript.VariableDeclarationList */ Boolean = js.native
    
    def isVariableStatement(node: Node): /* is typescript.typescript.VariableStatement */ Boolean = js.native
    
    def isVoidExpression(node: Node): /* is typescript.typescript.VoidExpression */ Boolean = js.native
    
    def isWhileStatement(node: Node): /* is typescript.typescript.WhileStatement */ Boolean = js.native
    
    def isWhiteSpaceLike(ch: Double): Boolean = js.native
    
    /** Does not include line breaks. For that, see isWhiteSpaceLike. */
    def isWhiteSpaceSingleLine(ch: Double): Boolean = js.native
    
    def isWithStatement(node: Node): /* is typescript.typescript.WithStatement */ Boolean = js.native
    
    def isYieldExpression(node: Node): /* is typescript.typescript.YieldExpression */ Boolean = js.native
    
    /**
      * Moves matching emit helpers from a source node to a target node.
      */
    def moveEmitHelpers(source: Node, target: Node, predicate: js.Function1[/* helper */ EmitHelper, Boolean]): Unit = js.native
    
    def moveSyntheticComments[T /* <: Node */](node: T, original: Node): T = js.native
    
    def nodeModuleNameResolver(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def nodeModuleNameResolver(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: js.UndefOr[scala.Nothing],
      redirectedReference: ResolvedProjectReference
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def nodeModuleNameResolver(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def nodeModuleNameResolver(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache,
      redirectedReference: ResolvedProjectReference
    ): ResolvedModuleWithFailedLookupLocations = js.native
    
    def parseCommandLine(commandLine: js.Array[String]): ParsedCommandLine = js.native
    def parseCommandLine(commandLine: js.Array[String], readFile: js.Function1[/* path */ String, js.UndefOr[String]]): ParsedCommandLine = js.native
    
    def parseConfigFileTextToJson(fileName: String, jsonText: String): Config = js.native
    
    def parseIsolatedEntityName(text: String, languageVersion: ScriptTarget): js.UndefOr[EntityName] = js.native
    
    def parseJsonConfigFileContent(
      json: js.Any,
      host: ParseConfigHost,
      basePath: String,
      existingOptions: js.UndefOr[CompilerOptions],
      configFileName: js.UndefOr[String],
      resolutionStack: js.UndefOr[js.Array[Path]],
      extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
      extendedConfigCache: js.UndefOr[Map[ExtendedConfigCacheEntry]],
      existingWatchOptions: js.UndefOr[WatchOptions]
    ): ParsedCommandLine = js.native
    
    def parseJsonSourceFileConfigFileContent(
      sourceFile: TsConfigSourceFile,
      host: ParseConfigHost,
      basePath: String,
      existingOptions: js.UndefOr[CompilerOptions],
      configFileName: js.UndefOr[String],
      resolutionStack: js.UndefOr[js.Array[Path]],
      extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
      extendedConfigCache: js.UndefOr[Map[ExtendedConfigCacheEntry]],
      existingWatchOptions: js.UndefOr[WatchOptions]
    ): ParsedCommandLine = js.native
    
    def parseJsonText(fileName: String, sourceText: String): JsonSourceFile = js.native
    
    def preProcessFile(sourceText: String): PreProcessedFileInfo = js.native
    def preProcessFile(sourceText: String, readImportFiles: js.UndefOr[scala.Nothing], detectJavaScriptImports: Boolean): PreProcessedFileInfo = js.native
    def preProcessFile(sourceText: String, readImportFiles: Boolean): PreProcessedFileInfo = js.native
    def preProcessFile(sourceText: String, readImportFiles: Boolean, detectJavaScriptImports: Boolean): PreProcessedFileInfo = js.native
    
    def readBuilderProgram(compilerOptions: CompilerOptions, host: ReadBuildProgramHost): js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram] = js.native
    
    def readConfigFile(fileName: String, readFile: js.Function1[/* path */ String, js.UndefOr[String]]): Config = js.native
    
    def readJsonConfigFile(fileName: String, readFile: js.Function1[/* path */ String, js.UndefOr[String]]): TsConfigSourceFile = js.native
    
    def reduceEachLeadingCommentRange[T, U](
      text: String,
      pos: Double,
      cb: js.Function6[
          /* pos */ Double, 
          /* end */ Double, 
          /* kind */ CommentKind, 
          /* hasTrailingNewLine */ Boolean, 
          /* state */ T, 
          /* memo */ U, 
          U
        ],
      state: T,
      initial: U
    ): js.UndefOr[U] = js.native
    
    def reduceEachTrailingCommentRange[T, U](
      text: String,
      pos: Double,
      cb: js.Function6[
          /* pos */ Double, 
          /* end */ Double, 
          /* kind */ CommentKind, 
          /* hasTrailingNewLine */ Boolean, 
          /* state */ T, 
          /* memo */ U, 
          U
        ],
      state: T,
      initial: U
    ): js.UndefOr[U] = js.native
    
    /**
      * Removes an EmitHelper from a node.
      */
    def removeEmitHelper(node: Node, helper: EmitHelper): Boolean = js.native
    
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: js.UndefOr[scala.Nothing],
      redirectedReference: ResolvedProjectReference
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache
    ): ResolvedModuleWithFailedLookupLocations = js.native
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      host: ModuleResolutionHost,
      cache: ModuleResolutionCache,
      redirectedReference: ResolvedProjectReference
    ): ResolvedModuleWithFailedLookupLocations = js.native
    
    def resolveModuleNameFromCache(moduleName: String, containingFile: String, cache: ModuleResolutionCache): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
    
    def resolveProjectReferencePath(host: ResolveProjectReferencePathHost, ref: ProjectReference): ResolvedConfigFileName = js.native
    def resolveProjectReferencePath(ref: ProjectReference): ResolvedConfigFileName = js.native
    
    def resolveTripleslashReference(moduleName: String, containingFile: String): String = js.native
    
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: js.UndefOr[scala.Nothing],
      options: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: js.UndefOr[scala.Nothing],
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
    /**
      * @param {string | undefined} containingFile - file that contains type reference directive, can be undefined if containing file is unknown.
      * This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
      * is assumed to be the same as root directory of the project.
      */
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
    def resolveTypeReferenceDirective(
      typeReferenceDirectiveName: String,
      containingFile: String,
      options: CompilerOptions,
      host: ModuleResolutionHost,
      redirectedReference: ResolvedProjectReference
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
    
    val server: js.Any = js.native
    
    /** The version of the language service API */
    val servicesVersion: /* "0.8" */ String = js.native
    
    /**
      * Sets a custom text range to use when emitting comments.
      */
    def setCommentRange[T /* <: Node */](node: T, range: TextRange): T = js.native
    
    /**
      * Sets the constant value to emit for an expression.
      */
    def setConstantValue(node: AccessExpression, value: String): AccessExpression = js.native
    def setConstantValue(node: AccessExpression, value: Double): AccessExpression = js.native
    
    /**
      * Sets flags that control emit behavior of a node.
      */
    def setEmitFlags[T /* <: Node */](node: T, emitFlags: EmitFlags): T = js.native
    
    def setOriginalNode[T /* <: Node */](node: T): T = js.native
    def setOriginalNode[T /* <: Node */](node: T, original: Node): T = js.native
    
    /**
      * Sets a custom text range to use when emitting source maps.
      */
    def setSourceMapRange[T /* <: Node */](node: T): T = js.native
    def setSourceMapRange[T /* <: Node */](node: T, range: SourceMapRange): T = js.native
    
    def setSyntheticLeadingComments[T /* <: Node */](node: T): T = js.native
    def setSyntheticLeadingComments[T /* <: Node */](node: T, comments: js.Array[SynthesizedComment]): T = js.native
    
    def setSyntheticTrailingComments[T /* <: Node */](node: T): T = js.native
    def setSyntheticTrailingComments[T /* <: Node */](node: T, comments: js.Array[SynthesizedComment]): T = js.native
    
    def setTextRange[T /* <: TextRange */](range: T): T = js.native
    def setTextRange[T /* <: TextRange */](range: T, location: TextRange): T = js.native
    
    /**
      * Sets the TextRange to use for source maps for a token of a node.
      */
    def setTokenSourceMapRange[T /* <: Node */](node: T, token: SyntaxKind): T = js.native
    def setTokenSourceMapRange[T /* <: Node */](node: T, token: SyntaxKind, range: SourceMapRange): T = js.native
    
    def skipPartiallyEmittedExpressions(node: Expression): Expression = js.native
    def skipPartiallyEmittedExpressions(node: Node): Node = js.native
    
    def sortAndDeduplicateDiagnostics[T /* <: Diagnostic */](diagnostics: js.Array[T]): SortedReadonlyArray[T] = js.native
    
    def symbolName(symbol: Symbol): String = js.native
    
    var sys: System = js.native
    
    def textChangeRangeIsUnchanged(range: TextChangeRange): Boolean = js.native
    
    def textChangeRangeNewSpan(range: TextChangeRange): TextSpan = js.native
    
    def textSpanContainsPosition(span: TextSpan, position: Double): Boolean = js.native
    
    def textSpanContainsTextSpan(span: TextSpan, other: TextSpan): Boolean = js.native
    
    def textSpanEnd(span: TextSpan): Double = js.native
    
    def textSpanIntersection(span1: TextSpan, span2: TextSpan): js.UndefOr[TextSpan] = js.native
    
    def textSpanIntersectsWith(span: TextSpan, start: Double, length: Double): Boolean = js.native
    
    def textSpanIntersectsWithPosition(span: TextSpan, position: Double): Boolean = js.native
    
    def textSpanIntersectsWithTextSpan(span: TextSpan, other: TextSpan): Boolean = js.native
    
    def textSpanIsEmpty(span: TextSpan): Boolean = js.native
    
    def textSpanOverlap(span1: TextSpan, span2: TextSpan): js.UndefOr[TextSpan] = js.native
    
    def textSpanOverlapsWith(span: TextSpan, other: TextSpan): Boolean = js.native
    
    def toEditorSettings(options: EditorOptions): EditorSettings = js.native
    def toEditorSettings(options: EditorSettings): EditorSettings = js.native
    
    def tokenToString(t: SyntaxKind): js.UndefOr[String] = js.native
    
    /**
      * Transform one or more nodes using the supplied transformers.
      * @param source A single `Node` or an array of `Node` objects.
      * @param transformers An array of `TransformerFactory` callbacks used to process the transformation.
      * @param compilerOptions Optional compiler options.
      */
    def transform[T /* <: Node */](source: T, transformers: js.Array[TransformerFactory[T]]): TransformationResult[T] = js.native
    def transform[T /* <: Node */](source: T, transformers: js.Array[TransformerFactory[T]], compilerOptions: CompilerOptions): TransformationResult[T] = js.native
    def transform[T /* <: Node */](source: js.Array[T], transformers: js.Array[TransformerFactory[T]]): TransformationResult[T] = js.native
    def transform[T /* <: Node */](
      source: js.Array[T],
      transformers: js.Array[TransformerFactory[T]],
      compilerOptions: CompilerOptions
    ): TransformationResult[T] = js.native
    
    def transpile(input: String): String = js.native
    def transpile(
      input: String,
      compilerOptions: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      diagnostics: js.UndefOr[scala.Nothing],
      moduleName: String
    ): String = js.native
    def transpile(
      input: String,
      compilerOptions: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      diagnostics: js.Array[Diagnostic]
    ): String = js.native
    def transpile(
      input: String,
      compilerOptions: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      diagnostics: js.Array[Diagnostic],
      moduleName: String
    ): String = js.native
    def transpile(input: String, compilerOptions: js.UndefOr[scala.Nothing], fileName: String): String = js.native
    def transpile(
      input: String,
      compilerOptions: js.UndefOr[scala.Nothing],
      fileName: String,
      diagnostics: js.UndefOr[scala.Nothing],
      moduleName: String
    ): String = js.native
    def transpile(
      input: String,
      compilerOptions: js.UndefOr[scala.Nothing],
      fileName: String,
      diagnostics: js.Array[Diagnostic]
    ): String = js.native
    def transpile(
      input: String,
      compilerOptions: js.UndefOr[scala.Nothing],
      fileName: String,
      diagnostics: js.Array[Diagnostic],
      moduleName: String
    ): String = js.native
    def transpile(input: String, compilerOptions: CompilerOptions): String = js.native
    def transpile(
      input: String,
      compilerOptions: CompilerOptions,
      fileName: js.UndefOr[scala.Nothing],
      diagnostics: js.UndefOr[scala.Nothing],
      moduleName: String
    ): String = js.native
    def transpile(
      input: String,
      compilerOptions: CompilerOptions,
      fileName: js.UndefOr[scala.Nothing],
      diagnostics: js.Array[Diagnostic]
    ): String = js.native
    def transpile(
      input: String,
      compilerOptions: CompilerOptions,
      fileName: js.UndefOr[scala.Nothing],
      diagnostics: js.Array[Diagnostic],
      moduleName: String
    ): String = js.native
    def transpile(input: String, compilerOptions: CompilerOptions, fileName: String): String = js.native
    def transpile(
      input: String,
      compilerOptions: CompilerOptions,
      fileName: String,
      diagnostics: js.UndefOr[scala.Nothing],
      moduleName: String
    ): String = js.native
    def transpile(
      input: String,
      compilerOptions: CompilerOptions,
      fileName: String,
      diagnostics: js.Array[Diagnostic]
    ): String = js.native
    def transpile(
      input: String,
      compilerOptions: CompilerOptions,
      fileName: String,
      diagnostics: js.Array[Diagnostic],
      moduleName: String
    ): String = js.native
    
    def transpileModule(input: String, transpileOptions: TranspileOptions): TranspileOutput = js.native
    
    var unchangedTextChangeRange: TextChangeRange = js.native
    
    /**
      * Remove extra underscore from escaped identifier text content.
      *
      * @param identifier The escaped identifier text.
      * @returns The unescaped identifier text.
      */
    def unescapeLeadingUnderscores(identifier: typingsSlinky.typescript.mod.String): String = js.native
    
    /** @deprecated Use `factory.updateArrayBindingPattern` or the factory supplied by your transformation context instead. */
    def updateArrayBindingPattern(node: ArrayBindingPattern, elements: js.Array[ArrayBindingElement]): ArrayBindingPattern = js.native
    
    /** @deprecated Use `factory.updateArrayLiteral` or the factory supplied by your transformation context instead. */
    def updateArrayLiteral(node: ArrayLiteralExpression, elements: js.Array[Expression]): ArrayLiteralExpression = js.native
    
    /** @deprecated Use `factory.updateArrayTypeNode` or the factory supplied by your transformation context instead. */
    def updateArrayTypeNode(node: ArrayTypeNode, elementType: TypeNode): ArrayTypeNode = js.native
    
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.Array[Modifier],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: ConciseBody
    ): ArrowFunction = js.native
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    /** @deprecated Use `factory.updateArrowFunction` or the factory supplied by your transformation context instead. */
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: ConciseBody
    ): ArrowFunction = js.native
    /** @deprecated Use `factory.updateArrowFunction` or the factory supplied by your transformation context instead. */
    def updateArrowFunction(
      node: ArrowFunction,
      modifiers: js.Array[Modifier],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      equalsGreaterThanToken: EqualsGreaterThanToken,
      body: ConciseBody
    ): ArrowFunction = js.native
    
    /** @deprecated Use `factory.updateAsExpression` or the factory supplied by your transformation context instead. */
    def updateAsExpression(node: AsExpression, expression: Expression, `type`: TypeNode): AsExpression = js.native
    
    /** @deprecated Use `factory.updateAwait` or the factory supplied by your transformation context instead. */
    def updateAwait(node: AwaitExpression, expression: Expression): AwaitExpression = js.native
    
    /** @deprecated Use `factory.updateBinary` or the factory supplied by your transformation context instead. */
    def updateBinary(node: BinaryExpression, left: Expression, right: Expression): BinaryExpression = js.native
    def updateBinary(node: BinaryExpression, left: Expression, right: Expression, operator: BinaryOperator): BinaryExpression = js.native
    def updateBinary(node: BinaryExpression, left: Expression, right: Expression, operator: BinaryOperatorToken): BinaryExpression = js.native
    
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: js.UndefOr[scala.Nothing],
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: js.UndefOr[scala.Nothing],
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: ComputedPropertyName,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: ComputedPropertyName,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: Identifier,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: Identifier,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: NumericLiteral,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: NumericLiteral,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: PrivateIdentifier,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: PrivateIdentifier,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: StringLiteral,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: js.UndefOr[scala.Nothing],
      propertyName: StringLiteral,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: js.UndefOr[scala.Nothing],
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: js.UndefOr[scala.Nothing],
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: ComputedPropertyName,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: ComputedPropertyName,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    /** @deprecated Use `factory.updateBindingElement` or the factory supplied by your transformation context instead. */
    def updateBindingElement(node: BindingElement, dotDotDotToken: DotDotDotToken, propertyName: Identifier, name: BindingName): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: Identifier,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: NumericLiteral,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: NumericLiteral,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: PrivateIdentifier,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: PrivateIdentifier,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: StringLiteral,
      name: BindingName
    ): BindingElement = js.native
    def updateBindingElement(
      node: BindingElement,
      dotDotDotToken: DotDotDotToken,
      propertyName: StringLiteral,
      name: BindingName,
      initializer: Expression
    ): BindingElement = js.native
    
    /** @deprecated Use `factory.updateBlock` or the factory supplied by your transformation context instead. */
    def updateBlock(node: Block, statements: js.Array[Statement]): Block = js.native
    
    /** @deprecated Use `factory.updateBreak` or the factory supplied by your transformation context instead. */
    def updateBreak(node: BreakStatement): BreakStatement = js.native
    def updateBreak(node: BreakStatement, label: Identifier): BreakStatement = js.native
    
    /** @deprecated Use `factory.updateBundle` or the factory supplied by your transformation context instead. */
    def updateBundle(node: Bundle, sourceFiles: js.Array[SourceFile]): Bundle = js.native
    def updateBundle(node: Bundle, sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
    
    def updateCall(
      node: CallExpression,
      expression: Expression,
      typeArguments: js.UndefOr[scala.Nothing],
      argumentsArray: js.Array[Expression]
    ): CallExpression = js.native
    /** @deprecated Use `factory.updateCall` or the factory supplied by your transformation context instead. */
    def updateCall(
      node: CallExpression,
      expression: Expression,
      typeArguments: js.Array[TypeNode],
      argumentsArray: js.Array[Expression]
    ): CallExpression = js.native
    
    def updateCallChain(
      node: CallChain,
      expression: Expression,
      questionDotToken: js.UndefOr[scala.Nothing],
      typeArguments: js.UndefOr[scala.Nothing],
      argumentsArray: js.Array[Expression]
    ): CallChain = js.native
    def updateCallChain(
      node: CallChain,
      expression: Expression,
      questionDotToken: js.UndefOr[scala.Nothing],
      typeArguments: js.Array[TypeNode],
      argumentsArray: js.Array[Expression]
    ): CallChain = js.native
    def updateCallChain(
      node: CallChain,
      expression: Expression,
      questionDotToken: QuestionDotToken,
      typeArguments: js.UndefOr[scala.Nothing],
      argumentsArray: js.Array[Expression]
    ): CallChain = js.native
    /** @deprecated Use `factory.updateCallChain` or the factory supplied by your transformation context instead. */
    def updateCallChain(
      node: CallChain,
      expression: Expression,
      questionDotToken: QuestionDotToken,
      typeArguments: js.Array[TypeNode],
      argumentsArray: js.Array[Expression]
    ): CallChain = js.native
    
    def updateCallSignature(
      node: CallSignatureDeclaration,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration]
    ): CallSignatureDeclaration = js.native
    def updateCallSignature(
      node: CallSignatureDeclaration,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode
    ): CallSignatureDeclaration = js.native
    /** @deprecated Use `factory.updateCallSignature` or the factory supplied by your transformation context instead. */
    def updateCallSignature(
      node: CallSignatureDeclaration,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration]
    ): CallSignatureDeclaration = js.native
    def updateCallSignature(
      node: CallSignatureDeclaration,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode
    ): CallSignatureDeclaration = js.native
    
    /** @deprecated Use `factory.updateCaseBlock` or the factory supplied by your transformation context instead. */
    def updateCaseBlock(node: CaseBlock, clauses: js.Array[CaseOrDefaultClause]): CaseBlock = js.native
    
    /** @deprecated Use `factory.updateCaseClause` or the factory supplied by your transformation context instead. */
    def updateCaseClause(node: CaseClause, expression: Expression, statements: js.Array[Statement]): CaseClause = js.native
    
    def updateCatchClause(node: CatchClause, variableDeclaration: js.UndefOr[scala.Nothing], block: Block): CatchClause = js.native
    /** @deprecated Use `factory.updateCatchClause` or the factory supplied by your transformation context instead. */
    def updateCatchClause(node: CatchClause, variableDeclaration: VariableDeclaration, block: Block): CatchClause = js.native
    
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    /** @deprecated Use `factory.updateClassDeclaration` or the factory supplied by your transformation context instead. */
    def updateClassDeclaration(
      node: ClassDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassDeclaration = js.native
    
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.Array[Modifier],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    /** @deprecated Use `factory.updateClassExpression` or the factory supplied by your transformation context instead. */
    def updateClassExpression(
      node: ClassExpression,
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[ClassElement]
    ): ClassExpression = js.native
    
    /** @deprecated Use `factory.updateCommaList` or the factory supplied by your transformation context instead. */
    def updateCommaList(node: CommaListExpression, elements: js.Array[Expression]): CommaListExpression = js.native
    
    /** @deprecated Use `factory.updateComputedPropertyName` or the factory supplied by your transformation context instead. */
    def updateComputedPropertyName(node: ComputedPropertyName, expression: Expression): ComputedPropertyName = js.native
    
    /** @deprecated Use `factory.updateConditional` or the factory supplied by your transformation context instead. */
    def updateConditional(
      node: ConditionalExpression,
      condition: Expression,
      questionToken: QuestionToken,
      whenTrue: Expression,
      colonToken: ColonToken,
      whenFalse: Expression
    ): ConditionalExpression = js.native
    
    /** @deprecated Use `factory.updateConditionalTypeNode` or the factory supplied by your transformation context instead. */
    def updateConditionalTypeNode(
      node: ConditionalTypeNode,
      checkType: TypeNode,
      extendsType: TypeNode,
      trueType: TypeNode,
      falseType: TypeNode
    ): ConditionalTypeNode = js.native
    
    def updateConstructSignature(
      node: ConstructSignatureDeclaration,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration]
    ): ConstructSignatureDeclaration = js.native
    def updateConstructSignature(
      node: ConstructSignatureDeclaration,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode
    ): ConstructSignatureDeclaration = js.native
    /** @deprecated Use `factory.updateConstructSignature` or the factory supplied by your transformation context instead. */
    def updateConstructSignature(
      node: ConstructSignatureDeclaration,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration]
    ): ConstructSignatureDeclaration = js.native
    def updateConstructSignature(
      node: ConstructSignatureDeclaration,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode
    ): ConstructSignatureDeclaration = js.native
    
    def updateConstructor(
      node: ConstructorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration]
    ): ConstructorDeclaration = js.native
    def updateConstructor(
      node: ConstructorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): ConstructorDeclaration = js.native
    def updateConstructor(
      node: ConstructorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration]
    ): ConstructorDeclaration = js.native
    def updateConstructor(
      node: ConstructorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): ConstructorDeclaration = js.native
    def updateConstructor(
      node: ConstructorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration]
    ): ConstructorDeclaration = js.native
    def updateConstructor(
      node: ConstructorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): ConstructorDeclaration = js.native
    /** @deprecated Use `factory.updateConstructorDeclaration` or the factory supplied by your transformation context instead. */
    def updateConstructor(
      node: ConstructorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration]
    ): ConstructorDeclaration = js.native
    def updateConstructor(
      node: ConstructorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): ConstructorDeclaration = js.native
    
    def updateConstructorTypeNode(
      node: ConstructorTypeNode,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode
    ): ConstructorTypeNode = js.native
    /** @deprecated Use `factory.updateConstructorTypeNode` or the factory supplied by your transformation context instead. */
    def updateConstructorTypeNode(
      node: ConstructorTypeNode,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode
    ): ConstructorTypeNode = js.native
    
    /** @deprecated Use `factory.updateContinue` or the factory supplied by your transformation context instead. */
    def updateContinue(node: ContinueStatement): ContinueStatement = js.native
    def updateContinue(node: ContinueStatement, label: Identifier): ContinueStatement = js.native
    
    /** @deprecated Use `factory.updateDecorator` or the factory supplied by your transformation context instead. */
    def updateDecorator(node: Decorator, expression: Expression): Decorator = js.native
    
    /** @deprecated Use `factory.updateDefaultClause` or the factory supplied by your transformation context instead. */
    def updateDefaultClause(node: DefaultClause, statements: js.Array[Statement]): DefaultClause = js.native
    
    /** @deprecated Use `factory.updateDelete` or the factory supplied by your transformation context instead. */
    def updateDelete(node: DeleteExpression, expression: Expression): DeleteExpression = js.native
    
    /** @deprecated Use `factory.updateDo` or the factory supplied by your transformation context instead. */
    def updateDo(node: DoStatement, statement: Statement, expression: Expression): DoStatement = js.native
    
    /** @deprecated Use `factory.updateElementAccess` or the factory supplied by your transformation context instead. */
    def updateElementAccess(node: ElementAccessExpression, expression: Expression, argumentExpression: Expression): ElementAccessExpression = js.native
    
    def updateElementAccessChain(
      node: ElementAccessChain,
      expression: Expression,
      questionDotToken: js.UndefOr[scala.Nothing],
      argumentExpression: Expression
    ): ElementAccessChain = js.native
    /** @deprecated Use `factory.updateElementAccessChain` or the factory supplied by your transformation context instead. */
    def updateElementAccessChain(
      node: ElementAccessChain,
      expression: Expression,
      questionDotToken: QuestionDotToken,
      argumentExpression: Expression
    ): ElementAccessChain = js.native
    
    def updateEnumDeclaration(
      node: EnumDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    def updateEnumDeclaration(
      node: EnumDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    def updateEnumDeclaration(
      node: EnumDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    /** @deprecated Use `factory.updateEnumDeclaration` or the factory supplied by your transformation context instead. */
    def updateEnumDeclaration(
      node: EnumDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      members: js.Array[EnumMember]
    ): EnumDeclaration = js.native
    
    /** @deprecated Use `factory.updateEnumMember` or the factory supplied by your transformation context instead. */
    def updateEnumMember(node: EnumMember, name: PropertyName): EnumMember = js.native
    def updateEnumMember(node: EnumMember, name: PropertyName, initializer: Expression): EnumMember = js.native
    
    def updateExportAssignment(
      node: ExportAssignment,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      expression: Expression
    ): ExportAssignment = js.native
    def updateExportAssignment(
      node: ExportAssignment,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      expression: Expression
    ): ExportAssignment = js.native
    def updateExportAssignment(
      node: ExportAssignment,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      expression: Expression
    ): ExportAssignment = js.native
    /** @deprecated Use `factory.updateExportAssignment` or the factory supplied by your transformation context instead. */
    def updateExportAssignment(
      node: ExportAssignment,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      expression: Expression
    ): ExportAssignment = js.native
    
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression,
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression,
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression,
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression,
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression,
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression,
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression,
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    /** @deprecated Use `factory.updateExportDeclaration` or the factory supplied by your transformation context instead. */
    def updateExportDeclaration(
      node: ExportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      exportClause: NamedExportBindings,
      moduleSpecifier: Expression,
      isTypeOnly: Boolean
    ): ExportDeclaration = js.native
    
    def updateExportSpecifier(node: ExportSpecifier, propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
    /** @deprecated Use `factory.updateExportSpecifier` or the factory supplied by your transformation context instead. */
    def updateExportSpecifier(node: ExportSpecifier, propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
    
    /** @deprecated Use `factory.updateExpressionStatement` or the factory supplied by your transformation context instead. */
    def updateExpressionStatement(node: ExpressionStatement, expression: Expression): ExpressionStatement = js.native
    
    def updateExpressionWithTypeArguments(
      node: ExpressionWithTypeArguments,
      typeArguments: js.UndefOr[scala.Nothing],
      expression: Expression
    ): ExpressionWithTypeArguments = js.native
    /** @deprecated Use `factory.updateExpressionWithTypeArguments` or the factory supplied by your transformation context instead. */
    def updateExpressionWithTypeArguments(node: ExpressionWithTypeArguments, typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
    
    /** @deprecated Use `factory.updateExternalModuleReference` or the factory supplied by your transformation context instead. */
    def updateExternalModuleReference(node: ExternalModuleReference, expression: Expression): ExternalModuleReference = js.native
    
    def updateFor(
      node: ForStatement,
      initializer: js.UndefOr[scala.Nothing],
      condition: js.UndefOr[scala.Nothing],
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: js.UndefOr[scala.Nothing],
      condition: js.UndefOr[scala.Nothing],
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: js.UndefOr[scala.Nothing],
      condition: Expression,
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: js.UndefOr[scala.Nothing],
      condition: Expression,
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: Expression,
      condition: js.UndefOr[scala.Nothing],
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: Expression,
      condition: js.UndefOr[scala.Nothing],
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: Expression,
      condition: Expression,
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    /** @deprecated Use `factory.updateFor` or the factory supplied by your transformation context instead. */
    def updateFor(
      node: ForStatement,
      initializer: Expression,
      condition: Expression,
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: VariableDeclarationList,
      condition: js.UndefOr[scala.Nothing],
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: VariableDeclarationList,
      condition: js.UndefOr[scala.Nothing],
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: VariableDeclarationList,
      condition: Expression,
      incrementor: js.UndefOr[scala.Nothing],
      statement: Statement
    ): ForStatement = js.native
    def updateFor(
      node: ForStatement,
      initializer: VariableDeclarationList,
      condition: Expression,
      incrementor: Expression,
      statement: Statement
    ): ForStatement = js.native
    
    /** @deprecated Use `factory.updateForIn` or the factory supplied by your transformation context instead. */
    def updateForIn(node: ForInStatement, initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
    
    def updateForOf(
      node: ForOfStatement,
      awaitModifier: js.UndefOr[scala.Nothing],
      initializer: ForInitializer,
      expression: Expression,
      statement: Statement
    ): ForOfStatement = js.native
    /** @deprecated Use `factory.updateForOf` or the factory supplied by your transformation context instead. */
    def updateForOf(
      node: ForOfStatement,
      awaitModifier: AwaitKeyword,
      initializer: ForInitializer,
      expression: Expression,
      statement: Statement
    ): ForOfStatement = js.native
    
    /** @deprecated Use `factory.updateFunctionDeclaration` or the factory supplied by your transformation context instead. */
    def updateFunctionDeclaration(
      node: FunctionDeclaration,
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      asteriskToken: js.UndefOr[typingsSlinky.typescript.mod.AsteriskToken],
      name: js.UndefOr[Identifier],
      typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[TypeNode],
      body: js.UndefOr[Block]
    ): FunctionDeclaration = js.native
    
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.UndefOr[scala.Nothing],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: js.UndefOr[scala.Nothing],
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): FunctionExpression = js.native
    /** @deprecated Use `factory.updateFunctionExpression` or the factory supplied by your transformation context instead. */
    def updateFunctionExpression(
      node: FunctionExpression,
      modifiers: js.Array[Modifier],
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): FunctionExpression = js.native
    
    def updateFunctionTypeNode(
      node: FunctionTypeNode,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode
    ): FunctionTypeNode = js.native
    /** @deprecated Use `factory.updateFunctionTypeNode` or the factory supplied by your transformation context instead. */
    def updateFunctionTypeNode(
      node: FunctionTypeNode,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode
    ): FunctionTypeNode = js.native
    
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): GetAccessorDeclaration = js.native
    /** @deprecated Use `factory.updateGetAccessorDeclaration` or the factory supplied by your transformation context instead. */
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      body: Block
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): GetAccessorDeclaration = js.native
    def updateGetAccessor(
      node: GetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode,
      body: Block
    ): GetAccessorDeclaration = js.native
    
    /** @deprecated Use `factory.updateHeritageClause` or the factory supplied by your transformation context instead. */
    def updateHeritageClause(node: HeritageClause, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
    
    /** @deprecated Use `factory.updateIf` or the factory supplied by your transformation context instead. */
    def updateIf(node: IfStatement, expression: Expression, thenStatement: Statement): IfStatement = js.native
    def updateIf(node: IfStatement, expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
    
    def updateImportClause(
      node: ImportClause,
      name: js.UndefOr[scala.Nothing],
      namedBindings: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ImportClause = js.native
    def updateImportClause(
      node: ImportClause,
      name: js.UndefOr[scala.Nothing],
      namedBindings: NamedImportBindings,
      isTypeOnly: Boolean
    ): ImportClause = js.native
    def updateImportClause(
      node: ImportClause,
      name: Identifier,
      namedBindings: js.UndefOr[scala.Nothing],
      isTypeOnly: Boolean
    ): ImportClause = js.native
    /** @deprecated Use `factory.updateImportClause` or the factory supplied by your transformation context instead. */
    def updateImportClause(node: ImportClause, name: Identifier, namedBindings: NamedImportBindings, isTypeOnly: Boolean): ImportClause = js.native
    
    def updateImportDeclaration(
      node: ImportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      importClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def updateImportDeclaration(
      node: ImportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      importClause: ImportClause,
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def updateImportDeclaration(
      node: ImportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      importClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def updateImportDeclaration(
      node: ImportDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      importClause: ImportClause,
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def updateImportDeclaration(
      node: ImportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      importClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def updateImportDeclaration(
      node: ImportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      importClause: ImportClause,
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    def updateImportDeclaration(
      node: ImportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      importClause: js.UndefOr[scala.Nothing],
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    /** @deprecated Use `factory.updateImportDeclaration` or the factory supplied by your transformation context instead. */
    def updateImportDeclaration(
      node: ImportDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      importClause: ImportClause,
      moduleSpecifier: Expression
    ): ImportDeclaration = js.native
    
    def updateImportEqualsDeclaration(
      node: ImportEqualsDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    def updateImportEqualsDeclaration(
      node: ImportEqualsDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    def updateImportEqualsDeclaration(
      node: ImportEqualsDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    /** @deprecated Use `factory.updateImportEqualsDeclaration` or the factory supplied by your transformation context instead. */
    def updateImportEqualsDeclaration(
      node: ImportEqualsDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      moduleReference: ModuleReference
    ): ImportEqualsDeclaration = js.native
    
    def updateImportSpecifier(node: ImportSpecifier, propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
    /** @deprecated Use `factory.updateImportSpecifier` or the factory supplied by your transformation context instead. */
    def updateImportSpecifier(node: ImportSpecifier, propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
    
    /** @deprecated Use `factory.updateImportTypeNode` or the factory supplied by your transformation context instead. */
    def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode): ImportTypeNode = js.native
    def updateImportTypeNode(
      node: ImportTypeNode,
      argument: TypeNode,
      qualifier: js.UndefOr[scala.Nothing],
      typeArguments: js.UndefOr[scala.Nothing],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def updateImportTypeNode(
      node: ImportTypeNode,
      argument: TypeNode,
      qualifier: js.UndefOr[scala.Nothing],
      typeArguments: js.Array[TypeNode]
    ): ImportTypeNode = js.native
    def updateImportTypeNode(
      node: ImportTypeNode,
      argument: TypeNode,
      qualifier: js.UndefOr[scala.Nothing],
      typeArguments: js.Array[TypeNode],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: Identifier): ImportTypeNode = js.native
    def updateImportTypeNode(
      node: ImportTypeNode,
      argument: TypeNode,
      qualifier: Identifier,
      typeArguments: js.UndefOr[scala.Nothing],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: Identifier, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
    def updateImportTypeNode(
      node: ImportTypeNode,
      argument: TypeNode,
      qualifier: Identifier,
      typeArguments: js.Array[TypeNode],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: QualifiedName): ImportTypeNode = js.native
    def updateImportTypeNode(
      node: ImportTypeNode,
      argument: TypeNode,
      qualifier: QualifiedName,
      typeArguments: js.UndefOr[scala.Nothing],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    def updateImportTypeNode(
      node: ImportTypeNode,
      argument: TypeNode,
      qualifier: QualifiedName,
      typeArguments: js.Array[TypeNode]
    ): ImportTypeNode = js.native
    def updateImportTypeNode(
      node: ImportTypeNode,
      argument: TypeNode,
      qualifier: QualifiedName,
      typeArguments: js.Array[TypeNode],
      isTypeOf: Boolean
    ): ImportTypeNode = js.native
    
    def updateIndexSignature(
      node: IndexSignatureDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): IndexSignatureDeclaration = js.native
    def updateIndexSignature(
      node: IndexSignatureDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): IndexSignatureDeclaration = js.native
    def updateIndexSignature(
      node: IndexSignatureDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): IndexSignatureDeclaration = js.native
    /** @deprecated Use `factory.updateIndexSignature` or the factory supplied by your transformation context instead. */
    def updateIndexSignature(
      node: IndexSignatureDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      parameters: js.Array[ParameterDeclaration],
      `type`: TypeNode
    ): IndexSignatureDeclaration = js.native
    
    /** @deprecated Use `factory.updateIndexedAccessTypeNode` or the factory supplied by your transformation context instead. */
    def updateIndexedAccessTypeNode(node: IndexedAccessTypeNode, objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode = js.native
    
    /** @deprecated Use `factory.updateInferTypeNode` or the factory supplied by your transformation context instead. */
    def updateInferTypeNode(node: InferTypeNode, typeParameter: TypeParameterDeclaration): InferTypeNode = js.native
    
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.UndefOr[scala.Nothing],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    /** @deprecated Use `factory.updateInterfaceDeclaration` or the factory supplied by your transformation context instead. */
    def updateInterfaceDeclaration(
      node: InterfaceDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      heritageClauses: js.Array[HeritageClause],
      members: js.Array[TypeElement]
    ): InterfaceDeclaration = js.native
    
    /** @deprecated Use `factory.updateIntersectionTypeNode` or the factory supplied by your transformation context instead. */
    def updateIntersectionTypeNode(node: IntersectionTypeNode, types: NodeArray[TypeNode]): IntersectionTypeNode = js.native
    
    /** @deprecated Use `factory.updateJsxAttribute` or the factory supplied by your transformation context instead. */
    def updateJsxAttribute(node: JsxAttribute, name: Identifier): JsxAttribute = js.native
    def updateJsxAttribute(node: JsxAttribute, name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
    def updateJsxAttribute(node: JsxAttribute, name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
    
    /** @deprecated Use `factory.updateJsxAttributes` or the factory supplied by your transformation context instead. */
    def updateJsxAttributes(node: JsxAttributes, properties: js.Array[JsxAttributeLike]): JsxAttributes = js.native
    
    /** @deprecated Use `factory.updateJsxClosingElement` or the factory supplied by your transformation context instead. */
    def updateJsxClosingElement(node: JsxClosingElement, tagName: JsxTagNameExpression): JsxClosingElement = js.native
    
    /** @deprecated Use `factory.updateJsxElement` or the factory supplied by your transformation context instead. */
    def updateJsxElement(
      node: JsxElement,
      openingElement: JsxOpeningElement,
      children: js.Array[JsxChild],
      closingElement: JsxClosingElement
    ): JsxElement = js.native
    
    /** @deprecated Use `factory.updateJsxExpression` or the factory supplied by your transformation context instead. */
    def updateJsxExpression(node: JsxExpression): JsxExpression = js.native
    def updateJsxExpression(node: JsxExpression, expression: Expression): JsxExpression = js.native
    
    /** @deprecated Use `factory.updateJsxFragment` or the factory supplied by your transformation context instead. */
    def updateJsxFragment(
      node: JsxFragment,
      openingFragment: JsxOpeningFragment,
      children: js.Array[JsxChild],
      closingFragment: JsxClosingFragment
    ): JsxFragment = js.native
    
    def updateJsxOpeningElement(
      node: JsxOpeningElement,
      tagName: JsxTagNameExpression,
      typeArguments: js.UndefOr[scala.Nothing],
      attributes: JsxAttributes
    ): JsxOpeningElement = js.native
    /** @deprecated Use `factory.updateJsxOpeningElement` or the factory supplied by your transformation context instead. */
    def updateJsxOpeningElement(
      node: JsxOpeningElement,
      tagName: JsxTagNameExpression,
      typeArguments: js.Array[TypeNode],
      attributes: JsxAttributes
    ): JsxOpeningElement = js.native
    
    def updateJsxSelfClosingElement(
      node: JsxSelfClosingElement,
      tagName: JsxTagNameExpression,
      typeArguments: js.UndefOr[scala.Nothing],
      attributes: JsxAttributes
    ): JsxSelfClosingElement = js.native
    /** @deprecated Use `factory.updateJsxSelfClosingElement` or the factory supplied by your transformation context instead. */
    def updateJsxSelfClosingElement(
      node: JsxSelfClosingElement,
      tagName: JsxTagNameExpression,
      typeArguments: js.Array[TypeNode],
      attributes: JsxAttributes
    ): JsxSelfClosingElement = js.native
    
    /** @deprecated Use `factory.updateJsxSpreadAttribute` or the factory supplied by your transformation context instead. */
    def updateJsxSpreadAttribute(node: JsxSpreadAttribute, expression: Expression): JsxSpreadAttribute = js.native
    
    /** @deprecated Use `factory.updateJsxText` or the factory supplied by your transformation context instead. */
    def updateJsxText(node: JsxText, text: String): JsxText = js.native
    def updateJsxText(node: JsxText, text: String, containsOnlyTriviaWhiteSpaces: Boolean): JsxText = js.native
    
    /** @deprecated Use `factory.updateLabel` or the factory supplied by your transformation context instead. */
    def updateLabel(node: LabeledStatement, label: Identifier, statement: Statement): LabeledStatement = js.native
    
    def updateLanguageServiceSourceFile(sourceFile: SourceFile, scriptSnapshot: IScriptSnapshot, version: String): SourceFile = js.native
    def updateLanguageServiceSourceFile(
      sourceFile: SourceFile,
      scriptSnapshot: IScriptSnapshot,
      version: String,
      textChangeRange: js.UndefOr[scala.Nothing],
      aggressiveChecks: Boolean
    ): SourceFile = js.native
    def updateLanguageServiceSourceFile(
      sourceFile: SourceFile,
      scriptSnapshot: IScriptSnapshot,
      version: String,
      textChangeRange: TextChangeRange
    ): SourceFile = js.native
    def updateLanguageServiceSourceFile(
      sourceFile: SourceFile,
      scriptSnapshot: IScriptSnapshot,
      version: String,
      textChangeRange: TextChangeRange,
      aggressiveChecks: Boolean
    ): SourceFile = js.native
    
    def updateLiteralTypeNode(node: LiteralTypeNode, literal: FalseLiteral): LiteralTypeNode = js.native
    /** @deprecated Use `factory.updateLiteralTypeNode` or the factory supplied by your transformation context instead. */
    def updateLiteralTypeNode(node: LiteralTypeNode, literal: LiteralExpression): LiteralTypeNode = js.native
    def updateLiteralTypeNode(node: LiteralTypeNode, literal: NullLiteral): LiteralTypeNode = js.native
    def updateLiteralTypeNode(node: LiteralTypeNode, literal: PrefixUnaryExpression): LiteralTypeNode = js.native
    def updateLiteralTypeNode(node: LiteralTypeNode, literal: TrueLiteral): LiteralTypeNode = js.native
    
    /** @deprecated Use `factory.updateMappedTypeNode` or the factory supplied by your transformation context instead. */
    def updateMappedTypeNode(
      node: MappedTypeNode,
      readonlyToken: js.UndefOr[
          ReadonlyKeyword | typingsSlinky.typescript.mod.PlusToken | typingsSlinky.typescript.mod.MinusToken
        ],
      typeParameter: TypeParameterDeclaration,
      nameType: js.UndefOr[TypeNode],
      questionToken: js.UndefOr[
          QuestionToken | typingsSlinky.typescript.mod.PlusToken | typingsSlinky.typescript.mod.MinusToken
        ],
      `type`: js.UndefOr[TypeNode]
    ): MappedTypeNode = js.native
    
    /** @deprecated Use `factory.updateMetaProperty` or the factory supplied by your transformation context instead. */
    def updateMetaProperty(node: MetaProperty, name: Identifier): MetaProperty = js.native
    
    /** @deprecated Use `factory.updateMethodDeclaration` or the factory supplied by your transformation context instead. */
    def updateMethod(
      node: MethodDeclaration,
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      asteriskToken: js.UndefOr[typingsSlinky.typescript.mod.AsteriskToken],
      name: PropertyName,
      questionToken: js.UndefOr[QuestionToken],
      typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
      parameters: js.Array[ParameterDeclaration],
      `type`: js.UndefOr[TypeNode],
      body: js.UndefOr[Block]
    ): MethodDeclaration = js.native
    
    def updateMethodSignature(
      node: MethodSignature,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: PropertyName
    ): MethodSignature = js.native
    def updateMethodSignature(
      node: MethodSignature,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    def updateMethodSignature(
      node: MethodSignature,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode,
      name: PropertyName
    ): MethodSignature = js.native
    def updateMethodSignature(
      node: MethodSignature,
      typeParameters: js.UndefOr[scala.Nothing],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode,
      name: PropertyName,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    def updateMethodSignature(
      node: MethodSignature,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: PropertyName
    ): MethodSignature = js.native
    def updateMethodSignature(
      node: MethodSignature,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration],
      `type`: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    /** @deprecated Use `factory.updateMethodSignature` or the factory supplied by your transformation context instead. */
    def updateMethodSignature(
      node: MethodSignature,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode,
      name: PropertyName
    ): MethodSignature = js.native
    def updateMethodSignature(
      node: MethodSignature,
      typeParameters: NodeArray[TypeParameterDeclaration],
      parameters: NodeArray[ParameterDeclaration],
      `type`: TypeNode,
      name: PropertyName,
      questionToken: QuestionToken
    ): MethodSignature = js.native
    
    /** @deprecated Use `factory.updateModuleBlock` or the factory supplied by your transformation context instead. */
    def updateModuleBlock(node: ModuleBlock, statements: js.Array[Statement]): ModuleBlock = js.native
    
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: Identifier
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: JSDocNamespaceDeclaration
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: ModuleBlock
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: NamespaceDeclaration
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: Identifier
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: JSDocNamespaceDeclaration
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: ModuleBlock
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: NamespaceDeclaration
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: Identifier
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: JSDocNamespaceDeclaration
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: ModuleBlock
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: ModuleName,
      body: NamespaceDeclaration
    ): ModuleDeclaration = js.native
    /** @deprecated Use `factory.updateModuleDeclaration` or the factory supplied by your transformation context instead. */
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: Identifier
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: JSDocNamespaceDeclaration
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: ModuleBlock
    ): ModuleDeclaration = js.native
    def updateModuleDeclaration(
      node: ModuleDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: ModuleName,
      body: NamespaceDeclaration
    ): ModuleDeclaration = js.native
    
    /** @deprecated Use `factory.updateNamedExports` or the factory supplied by your transformation context instead. */
    def updateNamedExports(node: NamedExports, elements: js.Array[ExportSpecifier]): NamedExports = js.native
    
    /** @deprecated Use `factory.updateNamedImports` or the factory supplied by your transformation context instead. */
    def updateNamedImports(node: NamedImports, elements: js.Array[ImportSpecifier]): NamedImports = js.native
    
    /** @deprecated Use `factory.updateNamespaceExport` or the factory supplied by your transformation context instead. */
    def updateNamespaceExport(node: NamespaceExport, name: Identifier): NamespaceExport = js.native
    
    /** @deprecated Use `factory.updateNamespaceExportDeclaration` or the factory supplied by your transformation context instead. */
    def updateNamespaceExportDeclaration(node: NamespaceExportDeclaration, name: Identifier): NamespaceExportDeclaration = js.native
    
    /** @deprecated Use `factory.updateNamespaceImport` or the factory supplied by your transformation context instead. */
    def updateNamespaceImport(node: NamespaceImport, name: Identifier): NamespaceImport = js.native
    
    /** @deprecated Use `factory.updateNew` or the factory supplied by your transformation context instead. */
    def updateNew(node: NewExpression, expression: Expression): NewExpression = js.native
    def updateNew(
      node: NewExpression,
      expression: Expression,
      typeArguments: js.UndefOr[scala.Nothing],
      argumentsArray: js.Array[Expression]
    ): NewExpression = js.native
    def updateNew(node: NewExpression, expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
    def updateNew(
      node: NewExpression,
      expression: Expression,
      typeArguments: js.Array[TypeNode],
      argumentsArray: js.Array[Expression]
    ): NewExpression = js.native
    
    /** @deprecated Use `factory.updateNonNullChain` or the factory supplied by your transformation context instead. */
    def updateNonNullChain(node: NonNullChain, expression: Expression): NonNullChain = js.native
    
    /** @deprecated Use `factory.updateNonNullExpression` or the factory supplied by your transformation context instead. */
    def updateNonNullExpression(node: NonNullExpression, expression: Expression): NonNullExpression = js.native
    
    /** @deprecated Use `factory.updateObjectBindingPattern` or the factory supplied by your transformation context instead. */
    def updateObjectBindingPattern(node: ObjectBindingPattern, elements: js.Array[BindingElement]): ObjectBindingPattern = js.native
    
    /** @deprecated Use `factory.updateObjectLiteral` or the factory supplied by your transformation context instead. */
    def updateObjectLiteral(node: ObjectLiteralExpression, properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
    
    /** @deprecated Use `factory.updateOptionalTypeNode` or the factory supplied by your transformation context instead. */
    def updateOptionalTypeNode(node: OptionalTypeNode, `type`: TypeNode): OptionalTypeNode = js.native
    
    /** @deprecated Use `factory.updateParameterDeclaration` or the factory supplied by your transformation context instead. */
    def updateParameter(
      node: ParameterDeclaration,
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      dotDotDotToken: js.UndefOr[DotDotDotToken],
      name: String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
      questionToken: js.UndefOr[QuestionToken],
      `type`: js.UndefOr[TypeNode],
      initializer: js.UndefOr[Expression]
    ): ParameterDeclaration = js.native
    
    /** @deprecated Use `factory.updateParen` or the factory supplied by your transformation context instead. */
    def updateParen(node: ParenthesizedExpression, expression: Expression): ParenthesizedExpression = js.native
    
    /** @deprecated Use `factory.updateParenthesizedType` or the factory supplied by your transformation context instead. */
    def updateParenthesizedType(node: ParenthesizedTypeNode, `type`: TypeNode): ParenthesizedTypeNode = js.native
    
    /** @deprecated Use `factory.updatePartiallyEmittedExpression` or the factory supplied by your transformation context instead. */
    def updatePartiallyEmittedExpression(node: PartiallyEmittedExpression, expression: Expression): PartiallyEmittedExpression = js.native
    
    /** @deprecated Use `factory.updatePostfix` or the factory supplied by your transformation context instead. */
    def updatePostfix(node: PostfixUnaryExpression, operand: Expression): PostfixUnaryExpression = js.native
    
    /** @deprecated Use `factory.updatePrefix` or the factory supplied by your transformation context instead. */
    def updatePrefix(node: PrefixUnaryExpression, operand: Expression): PrefixUnaryExpression = js.native
    
    /** @deprecated Use `factory.updatePropertyDeclaration` or the factory supplied by your transformation context instead. */
    def updateProperty(
      node: PropertyDeclaration,
      decorators: js.UndefOr[js.Array[Decorator]],
      modifiers: js.UndefOr[js.Array[Modifier]],
      name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
      questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
      `type`: js.UndefOr[TypeNode],
      initializer: js.UndefOr[Expression]
    ): PropertyDeclaration = js.native
    
    /** @deprecated Use `factory.updatePropertyAccess` or the factory supplied by your transformation context instead. */
    def updatePropertyAccess(node: PropertyAccessExpression, expression: Expression, name: Identifier): PropertyAccessExpression = js.native
    def updatePropertyAccess(node: PropertyAccessExpression, expression: Expression, name: PrivateIdentifier): PropertyAccessExpression = js.native
    
    def updatePropertyAccessChain(
      node: PropertyAccessChain,
      expression: Expression,
      questionDotToken: js.UndefOr[scala.Nothing],
      name: Identifier
    ): PropertyAccessChain = js.native
    def updatePropertyAccessChain(
      node: PropertyAccessChain,
      expression: Expression,
      questionDotToken: js.UndefOr[scala.Nothing],
      name: PrivateIdentifier
    ): PropertyAccessChain = js.native
    /** @deprecated Use `factory.updatePropertyAccessChain` or the factory supplied by your transformation context instead. */
    def updatePropertyAccessChain(
      node: PropertyAccessChain,
      expression: Expression,
      questionDotToken: QuestionDotToken,
      name: Identifier
    ): PropertyAccessChain = js.native
    def updatePropertyAccessChain(
      node: PropertyAccessChain,
      expression: Expression,
      questionDotToken: QuestionDotToken,
      name: PrivateIdentifier
    ): PropertyAccessChain = js.native
    
    /** @deprecated Use `factory.updatePropertyAssignment` or the factory supplied by your transformation context instead. */
    def updatePropertyAssignment(node: PropertyAssignment, name: PropertyName, initializer: Expression): PropertyAssignment = js.native
    
    def updatePropertySignature(node: PropertySignature, modifiers: js.UndefOr[scala.Nothing], name: PropertyName): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: TypeNode
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    /** @deprecated Use `factory.updatePropertySignature` or the factory supplied by your transformation context instead. */
    def updatePropertySignature(node: PropertySignature, modifiers: js.Array[Modifier], name: PropertyName): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: QuestionToken
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: TypeNode
    ): PropertySignature = js.native
    def updatePropertySignature(
      node: PropertySignature,
      modifiers: js.Array[Modifier],
      name: PropertyName,
      questionToken: QuestionToken,
      `type`: TypeNode,
      initializer: Expression
    ): PropertySignature = js.native
    
    /** @deprecated Use `factory.updateQualifiedName` or the factory supplied by your transformation context instead. */
    def updateQualifiedName(node: QualifiedName, left: EntityName, right: Identifier): QualifiedName = js.native
    
    /** @deprecated Use `factory.updateRestTypeNode` or the factory supplied by your transformation context instead. */
    def updateRestTypeNode(node: RestTypeNode, `type`: TypeNode): RestTypeNode = js.native
    
    /** @deprecated Use `factory.updateReturn` or the factory supplied by your transformation context instead. */
    def updateReturn(node: ReturnStatement): ReturnStatement = js.native
    def updateReturn(node: ReturnStatement, expression: Expression): ReturnStatement = js.native
    
    def updateSetAccessor(
      node: SetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def updateSetAccessor(
      node: SetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def updateSetAccessor(
      node: SetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def updateSetAccessor(
      node: SetAccessorDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    def updateSetAccessor(
      node: SetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def updateSetAccessor(
      node: SetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    /** @deprecated Use `factory.updateSetAccessorDeclaration` or the factory supplied by your transformation context instead. */
    def updateSetAccessor(
      node: SetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration]
    ): SetAccessorDeclaration = js.native
    def updateSetAccessor(
      node: SetAccessorDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: PropertyName,
      parameters: js.Array[ParameterDeclaration],
      body: Block
    ): SetAccessorDeclaration = js.native
    
    /** @deprecated Use `factory.updateShorthandPropertyAssignment` or the factory supplied by your transformation context instead. */
    def updateShorthandPropertyAssignment(node: ShorthandPropertyAssignment, name: Identifier): ShorthandPropertyAssignment = js.native
    def updateShorthandPropertyAssignment(node: ShorthandPropertyAssignment, name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
    
    def updateSourceFile(sourceFile: SourceFile, newText: String, textChangeRange: TextChangeRange): SourceFile = js.native
    def updateSourceFile(
      sourceFile: SourceFile,
      newText: String,
      textChangeRange: TextChangeRange,
      aggressiveChecks: Boolean
    ): SourceFile = js.native
    
    /** @deprecated Use `factory.updateSourceFile` or the factory supplied by your transformation context instead. */
    def updateSourceFileNode(node: SourceFile, statements: js.Array[Statement]): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: js.UndefOr[scala.Nothing],
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: Boolean
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: Boolean,
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: js.UndefOr[scala.Nothing],
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: Boolean
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: Boolean,
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.Array[FileReference],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: js.UndefOr[scala.Nothing],
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.Array[FileReference],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: Boolean
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.Array[FileReference],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: Boolean,
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.Array[FileReference],
      typeReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.Array[FileReference],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: js.UndefOr[scala.Nothing],
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.Array[FileReference],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: Boolean
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: js.UndefOr[scala.Nothing],
      referencedFiles: js.Array[FileReference],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: Boolean,
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(node: SourceFile, statements: js.Array[Statement], isDeclarationFile: Boolean): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: js.UndefOr[scala.Nothing],
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: Boolean
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: Boolean,
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: js.UndefOr[scala.Nothing],
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: Boolean
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.UndefOr[scala.Nothing],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: Boolean,
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.Array[FileReference],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: js.UndefOr[scala.Nothing],
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.Array[FileReference],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: Boolean
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.Array[FileReference],
      typeReferences: js.UndefOr[scala.Nothing],
      hasNoDefaultLib: Boolean,
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.Array[FileReference],
      typeReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.Array[FileReference],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: js.UndefOr[scala.Nothing],
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.Array[FileReference],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: Boolean
    ): SourceFile = js.native
    def updateSourceFileNode(
      node: SourceFile,
      statements: js.Array[Statement],
      isDeclarationFile: Boolean,
      referencedFiles: js.Array[FileReference],
      typeReferences: js.Array[FileReference],
      hasNoDefaultLib: Boolean,
      libReferences: js.Array[FileReference]
    ): SourceFile = js.native
    
    /** @deprecated Use `factory.updateSpread` or the factory supplied by your transformation context instead. */
    def updateSpread(node: SpreadElement, expression: Expression): SpreadElement = js.native
    
    /** @deprecated Use `factory.updateSpreadAssignment` or the factory supplied by your transformation context instead. */
    def updateSpreadAssignment(node: SpreadAssignment, expression: Expression): SpreadAssignment = js.native
    
    /** @deprecated Use `factory.updateExpressionStatement` or the factory supplied by your transformation context instead. */
    def updateStatement(node: ExpressionStatement, expression: Expression): ExpressionStatement = js.native
    
    /** @deprecated Use `factory.updateSwitch` or the factory supplied by your transformation context instead. */
    def updateSwitch(node: SwitchStatement, expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
    
    /** @deprecated Use `factory.updateTaggedTemplate` or the factory supplied by your transformation context instead. */
    def updateTaggedTemplate(node: TaggedTemplateExpression, tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
    def updateTaggedTemplate(
      node: TaggedTemplateExpression,
      tag: Expression,
      typeArguments: js.UndefOr[scala.Nothing],
      template: TemplateLiteral
    ): TaggedTemplateExpression = js.native
    /** @deprecated Use `factory.updateTaggedTemplate` or the factory supplied by your transformation context instead. */
    def updateTaggedTemplate(
      node: TaggedTemplateExpression,
      tag: Expression,
      typeArguments: js.Array[TypeNode],
      template: TemplateLiteral
    ): TaggedTemplateExpression = js.native
    
    /** @deprecated Use `factory.updateTemplateExpression` or the factory supplied by your transformation context instead. */
    def updateTemplateExpression(node: TemplateExpression, head: TemplateHead, templateSpans: js.Array[TemplateSpan]): TemplateExpression = js.native
    
    /** @deprecated Use `factory.updateTemplateSpan` or the factory supplied by your transformation context instead. */
    def updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
    def updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateTail): TemplateSpan = js.native
    
    /** @deprecated Use `factory.updateThrow` or the factory supplied by your transformation context instead. */
    def updateThrow(node: ThrowStatement, expression: Expression): ThrowStatement = js.native
    
    /** @deprecated Use `factory.updateTry` or the factory supplied by your transformation context instead. */
    def updateTry(node: TryStatement, tryBlock: Block): TryStatement = js.native
    def updateTry(node: TryStatement, tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
    def updateTry(node: TryStatement, tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
    def updateTry(node: TryStatement, tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
    
    /** @deprecated Use `factory.updateTupleTypeNode` or the factory supplied by your transformation context instead. */
    def updateTupleTypeNode(node: TupleTypeNode, elements: js.Array[TypeNode | NamedTupleMember]): TupleTypeNode = js.native
    
    def updateTypeAliasDeclaration(
      node: TypeAliasDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def updateTypeAliasDeclaration(
      node: TypeAliasDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def updateTypeAliasDeclaration(
      node: TypeAliasDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def updateTypeAliasDeclaration(
      node: TypeAliasDeclaration,
      decorators: js.UndefOr[scala.Nothing],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def updateTypeAliasDeclaration(
      node: TypeAliasDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def updateTypeAliasDeclaration(
      node: TypeAliasDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.UndefOr[scala.Nothing],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    def updateTypeAliasDeclaration(
      node: TypeAliasDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    /** @deprecated Use `factory.updateTypeAliasDeclaration` or the factory supplied by your transformation context instead. */
    def updateTypeAliasDeclaration(
      node: TypeAliasDeclaration,
      decorators: js.Array[Decorator],
      modifiers: js.Array[Modifier],
      name: Identifier,
      typeParameters: js.Array[TypeParameterDeclaration],
      `type`: TypeNode
    ): TypeAliasDeclaration = js.native
    
    /** @deprecated Use `factory.updateTypeAssertion` or the factory supplied by your transformation context instead. */
    def updateTypeAssertion(node: TypeAssertion, `type`: TypeNode, expression: Expression): TypeAssertion = js.native
    
    /** @deprecated Use `factory.updateTypeLiteralNode` or the factory supplied by your transformation context instead. */
    def updateTypeLiteralNode(node: TypeLiteralNode, members: NodeArray[TypeElement]): TypeLiteralNode = js.native
    
    /** @deprecated Use `factory.updateTypeOf` or the factory supplied by your transformation context instead. */
    def updateTypeOf(node: TypeOfExpression, expression: Expression): TypeOfExpression = js.native
    
    /** @deprecated Use `factory.updateTypeOperatorNode` or the factory supplied by your transformation context instead. */
    def updateTypeOperatorNode(node: TypeOperatorNode, `type`: TypeNode): TypeOperatorNode = js.native
    
    /** @deprecated Use `factory.updateTypeParameterDeclaration` or the factory supplied by your transformation context instead. */
    def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier): TypeParameterDeclaration = js.native
    def updateTypeParameterDeclaration(
      node: TypeParameterDeclaration,
      name: Identifier,
      constraint: js.UndefOr[scala.Nothing],
      defaultType: TypeNode
    ): TypeParameterDeclaration = js.native
    def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
    def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
    
    /** @deprecated Use `factory.updateTypePredicateNode` or the factory supplied by your transformation context instead. */
    def updateTypePredicateNode(node: TypePredicateNode, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
    def updateTypePredicateNode(node: TypePredicateNode, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
    
    def updateTypePredicateNodeWithModifier(node: TypePredicateNode, assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier): TypePredicateNode = js.native
    def updateTypePredicateNodeWithModifier(
      node: TypePredicateNode,
      assertsModifier: js.UndefOr[scala.Nothing],
      parameterName: Identifier,
      `type`: TypeNode
    ): TypePredicateNode = js.native
    def updateTypePredicateNodeWithModifier(node: TypePredicateNode, assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode): TypePredicateNode = js.native
    def updateTypePredicateNodeWithModifier(
      node: TypePredicateNode,
      assertsModifier: js.UndefOr[scala.Nothing],
      parameterName: ThisTypeNode,
      `type`: TypeNode
    ): TypePredicateNode = js.native
    /** @deprecated Use `factory.updateTypePredicateNode` or the factory supplied by your transformation context instead. */
    def updateTypePredicateNodeWithModifier(node: TypePredicateNode, assertsModifier: AssertsKeyword, parameterName: Identifier): TypePredicateNode = js.native
    def updateTypePredicateNodeWithModifier(
      node: TypePredicateNode,
      assertsModifier: AssertsKeyword,
      parameterName: Identifier,
      `type`: TypeNode
    ): TypePredicateNode = js.native
    def updateTypePredicateNodeWithModifier(node: TypePredicateNode, assertsModifier: AssertsKeyword, parameterName: ThisTypeNode): TypePredicateNode = js.native
    def updateTypePredicateNodeWithModifier(
      node: TypePredicateNode,
      assertsModifier: AssertsKeyword,
      parameterName: ThisTypeNode,
      `type`: TypeNode
    ): TypePredicateNode = js.native
    
    /** @deprecated Use `factory.updateTypeQueryNode` or the factory supplied by your transformation context instead. */
    def updateTypeQueryNode(node: TypeQueryNode, exprName: EntityName): TypeQueryNode = js.native
    
    /** @deprecated Use `factory.updateTypeReferenceNode` or the factory supplied by your transformation context instead. */
    def updateTypeReferenceNode(node: TypeReferenceNode, typeName: EntityName): TypeReferenceNode = js.native
    def updateTypeReferenceNode(node: TypeReferenceNode, typeName: EntityName, typeArguments: NodeArray[TypeNode]): TypeReferenceNode = js.native
    
    /** @deprecated Use `factory.updateUnionTypeNode` or the factory supplied by your transformation context instead. */
    def updateUnionTypeNode(node: UnionTypeNode, types: NodeArray[TypeNode]): UnionTypeNode = js.native
    
    /** @deprecated Use `factory.updateVariableDeclaration` or the factory supplied by your transformation context instead. */
    def updateVariableDeclaration(node: VariableDeclaration, name: BindingName): VariableDeclaration = js.native
    def updateVariableDeclaration(
      node: VariableDeclaration,
      name: BindingName,
      exclamationToken: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): VariableDeclaration = js.native
    def updateVariableDeclaration(
      node: VariableDeclaration,
      name: BindingName,
      exclamationToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode
    ): VariableDeclaration = js.native
    def updateVariableDeclaration(
      node: VariableDeclaration,
      name: BindingName,
      exclamationToken: js.UndefOr[scala.Nothing],
      `type`: TypeNode,
      initializer: Expression
    ): VariableDeclaration = js.native
    def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, exclamationToken: ExclamationToken): VariableDeclaration = js.native
    def updateVariableDeclaration(
      node: VariableDeclaration,
      name: BindingName,
      exclamationToken: ExclamationToken,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): VariableDeclaration = js.native
    def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, exclamationToken: ExclamationToken, `type`: TypeNode): VariableDeclaration = js.native
    def updateVariableDeclaration(
      node: VariableDeclaration,
      name: BindingName,
      exclamationToken: ExclamationToken,
      `type`: TypeNode,
      initializer: Expression
    ): VariableDeclaration = js.native
    def updateVariableDeclaration(
      node: VariableDeclaration,
      name: BindingName,
      `type`: js.UndefOr[scala.Nothing],
      initializer: Expression
    ): VariableDeclaration = js.native
    def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
    def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
    
    /** @deprecated Use `factory.updateVariableDeclarationList` or the factory supplied by your transformation context instead. */
    def updateVariableDeclarationList(node: VariableDeclarationList, declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
    
    def updateVariableStatement(
      node: VariableStatement,
      modifiers: js.UndefOr[scala.Nothing],
      declarationList: VariableDeclarationList
    ): VariableStatement = js.native
    /** @deprecated Use `factory.updateVariableStatement` or the factory supplied by your transformation context instead. */
    def updateVariableStatement(node: VariableStatement, modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
    
    /** @deprecated Use `factory.updateVoid` or the factory supplied by your transformation context instead. */
    def updateVoid(node: VoidExpression, expression: Expression): VoidExpression = js.native
    
    /** @deprecated Use `factory.updateWhile` or the factory supplied by your transformation context instead. */
    def updateWhile(node: WhileStatement, expression: Expression, statement: Statement): WhileStatement = js.native
    
    /** @deprecated Use `factory.updateWith` or the factory supplied by your transformation context instead. */
    def updateWith(node: WithStatement, expression: Expression, statement: Statement): WithStatement = js.native
    
    /** @deprecated Use `factory.updateYield` or the factory supplied by your transformation context instead. */
    def updateYield(node: YieldExpression): YieldExpression = js.native
    def updateYield(node: YieldExpression, asteriskToken: js.UndefOr[scala.Nothing], expression: Expression): YieldExpression = js.native
    def updateYield(node: YieldExpression, asteriskToken: typingsSlinky.typescript.mod.AsteriskToken): YieldExpression = js.native
    def updateYield(
      node: YieldExpression,
      asteriskToken: typingsSlinky.typescript.mod.AsteriskToken,
      expression: Expression
    ): YieldExpression = js.native
    
    /**
      * Checks to see if the locale is in the appropriate format,
      * and if it is, attempts to set the appropriate language.
      */
    def validateLocaleAndSetLanguage(locale: String, sys: FileExists): Unit = js.native
    def validateLocaleAndSetLanguage(locale: String, sys: FileExists, errors: Push[Diagnostic]): Unit = js.native
    
    /** The version of the TypeScript compiler release */
    val version: String = js.native
    
    val versionMajorMinor: /* "4.1" */ String = js.native
    
    /**
      * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
      *
      * @param node The Node whose children will be visited.
      * @param visitor The callback used to visit each child.
      * @param context A lexical environment context for the visitor.
      */
    def visitEachChild[T /* <: Node */](node: T, visitor: Visitor, context: TransformationContext): T = js.native
    def visitEachChild[T /* <: Node */](
      node: T,
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: js.UndefOr[scala.Nothing],
      tokenVisitor: Visitor
    ): js.UndefOr[T] = js.native
    def visitEachChild[T /* <: Node */](
      node: T,
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: typingsSlinky.typescript.anon.FnCall
    ): js.UndefOr[T] = js.native
    def visitEachChild[T /* <: Node */](
      node: T,
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: typingsSlinky.typescript.anon.FnCall,
      tokenVisitor: Visitor
    ): js.UndefOr[T] = js.native
    def visitEachChild[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[T] = js.native
    def visitEachChild[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: js.UndefOr[scala.Nothing],
      tokenVisitor: Visitor
    ): js.UndefOr[T] = js.native
    def visitEachChild[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: typingsSlinky.typescript.anon.FnCall
    ): js.UndefOr[T] = js.native
    def visitEachChild[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: typingsSlinky.typescript.anon.FnCall,
      tokenVisitor: Visitor
    ): js.UndefOr[T] = js.native
    /**
      * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
      *
      * @param node The Node whose children will be visited.
      * @param visitor The callback used to visit each child.
      * @param context A lexical environment context for the visitor.
      */
    @JSName("visitEachChild")
    def visitEachChild_T_Node_Union[T /* <: Node */](node: T, visitor: Visitor, context: TransformationContext): js.UndefOr[T] = js.native
    
    def visitFunctionBody(node: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[FunctionBody] = js.native
    /**
      * Resumes a suspended lexical environment and visits a function body, ending the lexical
      * environment and merging hoisted declarations upon completion.
      */
    def visitFunctionBody(node: FunctionBody, visitor: Visitor, context: TransformationContext): js.UndefOr[FunctionBody] = js.native
    /**
      * Resumes a suspended lexical environment and visits a concise body, ending the lexical
      * environment and merging hoisted declarations upon completion.
      */
    @JSName("visitFunctionBody")
    def visitFunctionBody_ConciseBody(node: ConciseBody, visitor: Visitor, context: TransformationContext): ConciseBody = js.native
    /**
      * Resumes a suspended lexical environment and visits a function body, ending the lexical
      * environment and merging hoisted declarations upon completion.
      */
    @JSName("visitFunctionBody")
    def visitFunctionBody_FunctionBody(node: FunctionBody, visitor: Visitor, context: TransformationContext): FunctionBody = js.native
    
    /**
      * Starts a new lexical environment and visits a statement list, ending the lexical environment
      * and merging hoisted declarations upon completion.
      */
    def visitLexicalEnvironment(statements: NodeArray[Statement], visitor: Visitor, context: TransformationContext): NodeArray[Statement] = js.native
    def visitLexicalEnvironment(
      statements: NodeArray[Statement],
      visitor: Visitor,
      context: TransformationContext,
      start: js.UndefOr[scala.Nothing],
      ensureUseStrict: js.UndefOr[scala.Nothing],
      nodesVisitor: NodesVisitor
    ): NodeArray[Statement] = js.native
    def visitLexicalEnvironment(
      statements: NodeArray[Statement],
      visitor: Visitor,
      context: TransformationContext,
      start: js.UndefOr[scala.Nothing],
      ensureUseStrict: Boolean
    ): NodeArray[Statement] = js.native
    def visitLexicalEnvironment(
      statements: NodeArray[Statement],
      visitor: Visitor,
      context: TransformationContext,
      start: js.UndefOr[scala.Nothing],
      ensureUseStrict: Boolean,
      nodesVisitor: NodesVisitor
    ): NodeArray[Statement] = js.native
    def visitLexicalEnvironment(statements: NodeArray[Statement], visitor: Visitor, context: TransformationContext, start: Double): NodeArray[Statement] = js.native
    def visitLexicalEnvironment(
      statements: NodeArray[Statement],
      visitor: Visitor,
      context: TransformationContext,
      start: Double,
      ensureUseStrict: js.UndefOr[scala.Nothing],
      nodesVisitor: NodesVisitor
    ): NodeArray[Statement] = js.native
    def visitLexicalEnvironment(
      statements: NodeArray[Statement],
      visitor: Visitor,
      context: TransformationContext,
      start: Double,
      ensureUseStrict: Boolean
    ): NodeArray[Statement] = js.native
    def visitLexicalEnvironment(
      statements: NodeArray[Statement],
      visitor: Visitor,
      context: TransformationContext,
      start: Double,
      ensureUseStrict: Boolean,
      nodesVisitor: NodesVisitor
    ): NodeArray[Statement] = js.native
    
    /**
      * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
      *
      * @param node The Node to visit.
      * @param visitor The callback used to visit the Node.
      * @param test A callback to execute to verify the Node is valid.
      * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
      */
    def visitNode[T /* <: Node */](): js.UndefOr[T] = js.native
    /**
      * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
      *
      * @param node The Node to visit.
      * @param visitor The callback used to visit the Node.
      * @param test A callback to execute to verify the Node is valid.
      * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
      */
    def visitNode[T /* <: Node */](node: T): T = js.native
    def visitNode[T /* <: Node */](
      node: T,
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): T = js.native
    def visitNode[T /* <: Node */](node: T, visitor: js.UndefOr[scala.Nothing], test: js.Function1[/* node */ Node, Boolean]): T = js.native
    def visitNode[T /* <: Node */](
      node: T,
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): T = js.native
    def visitNode[T /* <: Node */](node: T, visitor: Visitor): T = js.native
    def visitNode[T /* <: Node */](
      node: T,
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): T = js.native
    def visitNode[T /* <: Node */](node: T, visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): T = js.native
    def visitNode[T /* <: Node */](
      node: T,
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): T = js.native
    def visitNode[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): js.UndefOr[T] = js.native
    def visitNode[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean]
    ): js.UndefOr[T] = js.native
    def visitNode[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): js.UndefOr[T] = js.native
    def visitNode[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor): js.UndefOr[T] = js.native
    def visitNode[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): js.UndefOr[T] = js.native
    def visitNode[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
    def visitNode[T /* <: Node */](
      node: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): js.UndefOr[T] = js.native
    @JSName("visitNode")
    def visitNode_T_Node_Union[T /* <: Node */](node: T): js.UndefOr[T] = js.native
    @JSName("visitNode")
    def visitNode_T_Node_Union[T /* <: Node */](
      node: T,
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): js.UndefOr[T] = js.native
    @JSName("visitNode")
    def visitNode_T_Node_Union[T /* <: Node */](node: T, visitor: js.UndefOr[scala.Nothing], test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
    @JSName("visitNode")
    def visitNode_T_Node_Union[T /* <: Node */](
      node: T,
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): js.UndefOr[T] = js.native
    @JSName("visitNode")
    def visitNode_T_Node_Union[T /* <: Node */](node: T, visitor: Visitor): js.UndefOr[T] = js.native
    @JSName("visitNode")
    def visitNode_T_Node_Union[T /* <: Node */](
      node: T,
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): js.UndefOr[T] = js.native
    @JSName("visitNode")
    def visitNode_T_Node_Union[T /* <: Node */](node: T, visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
    @JSName("visitNode")
    def visitNode_T_Node_Union[T /* <: Node */](
      node: T,
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      lift: js.Function1[/* node */ NodeArray[Node], T]
    ): js.UndefOr[T] = js.native
    
    /**
      * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
      *
      * @param nodes The NodeArray to visit.
      * @param visitor The callback used to visit a Node.
      * @param test A node test to execute for each node.
      * @param start An optional value indicating the starting offset at which to start visiting.
      * @param count An optional value indicating the maximum number of nodes to visit.
      */
    def visitNodes[T /* <: Node */](): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean]
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor, test: js.UndefOr[scala.Nothing], start: Double): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](nodes: NodeArray[T]): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean]
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.UndefOr[scala.Nothing], start: Double): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean], start: Double): js.UndefOr[NodeArray[T]] = js.native
    def visitNodes[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    /**
      * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
      *
      * @param nodes The NodeArray to visit.
      * @param visitor The callback used to visit a Node.
      * @param test A node test to execute for each node.
      * @param start An optional value indicating the starting offset at which to start visiting.
      * @param count An optional value indicating the maximum number of nodes to visit.
      */
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](nodes: NodeArray[T]): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.UndefOr[scala.Nothing],
      start: Double,
      count: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean]
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: js.UndefOr[scala.Nothing],
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.UndefOr[scala.Nothing], start: Double): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.UndefOr[scala.Nothing],
      start: Double,
      count: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: js.UndefOr[scala.Nothing],
      count: Double
    ): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean], start: Double): NodeArray[T] = js.native
    @JSName("visitNodes")
    def visitNodes_T_Node_NodeArray[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): NodeArray[T] = js.native
    
    def visitParameterList(nodes: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
    def visitParameterList(
      nodes: js.UndefOr[scala.Nothing],
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: NodesVisitor
    ): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
    def visitParameterList(nodes: NodeArray[ParameterDeclaration], visitor: Visitor, context: TransformationContext): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
    def visitParameterList(
      nodes: NodeArray[ParameterDeclaration],
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: NodesVisitor
    ): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
    /**
      * Starts a new lexical environment and visits a parameter list, suspending the lexical
      * environment upon completion.
      */
    @JSName("visitParameterList")
    def visitParameterList_NodeArray(nodes: NodeArray[ParameterDeclaration], visitor: Visitor, context: TransformationContext): NodeArray[ParameterDeclaration] = js.native
    @JSName("visitParameterList")
    def visitParameterList_NodeArray(
      nodes: NodeArray[ParameterDeclaration],
      visitor: Visitor,
      context: TransformationContext,
      nodesVisitor: NodesVisitor
    ): NodeArray[ParameterDeclaration] = js.native
    
    def walkUpBindingElementsAndPatterns(binding: BindingElement): VariableDeclaration | ParameterDeclaration = js.native
  }
}
