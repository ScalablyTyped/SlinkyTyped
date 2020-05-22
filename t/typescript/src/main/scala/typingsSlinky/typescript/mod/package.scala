package typingsSlinky.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AdditiveOperatorOrHigher = typingsSlinky.typescript.mod.MultiplicativeOperatorOrHigher | typingsSlinky.typescript.mod.AdditiveOperator
  type AffectedFileResult[T] = js.UndefOr[typingsSlinky.typescript.anon.Affected[T]]
  type AssertsToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.AssertsKeyword]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typescript.mod.SyntaxKind.QuestionQuestionToken
    - typingsSlinky.typescript.mod.LogicalOperatorOrHigher
    - typingsSlinky.typescript.mod.AssignmentOperator
  */
  type AssignmentOperatorOrHigher = typingsSlinky.typescript.mod._AssignmentOperatorOrHigher | typingsSlinky.typescript.mod.LogicalOperatorOrHigher
  type AssignmentOperatorToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.AssignmentOperator]
  type AsteriskToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.AsteriskToken]
  type AwaitKeywordToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.AwaitKeyword]
  type BaseType = typingsSlinky.typescript.mod.ObjectType | typingsSlinky.typescript.mod.IntersectionType | typingsSlinky.typescript.mod.TypeVariable
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typescript.mod.AssignmentOperatorOrHigher
    - typingsSlinky.typescript.mod.SyntaxKind.CommaToken
  */
  type BinaryOperator = typingsSlinky.typescript.mod._BinaryOperator | typingsSlinky.typescript.mod.LogicalOperatorOrHigher
  type BinaryOperatorToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.BinaryOperator]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typescript.mod.VariableDeclaration
    - typingsSlinky.typescript.mod.ParameterDeclaration
    - typingsSlinky.typescript.mod.BindingElement
    - typingsSlinky.typescript.mod.PropertyAssignment
    - typingsSlinky.typescript.mod.ShorthandPropertyAssignment
    - typingsSlinky.typescript.mod.SpreadAssignment
    - typingsSlinky.typescript.mod.OmittedExpression
    - typingsSlinky.typescript.mod.SpreadElement
    - typingsSlinky.typescript.mod.ArrayLiteralExpression
    - typingsSlinky.typescript.mod.ObjectLiteralExpression
    - typingsSlinky.typescript.mod.AssignmentExpression[typingsSlinky.typescript.mod.EqualsToken]
    - typingsSlinky.typescript.mod.Identifier
    - typingsSlinky.typescript.mod.PropertyAccessExpression
    - typingsSlinky.typescript.mod.ElementAccessExpression
  */
  type BindingOrAssignmentElement = typingsSlinky.typescript.mod._BindingOrAssignmentElement | typingsSlinky.typescript.mod.AssignmentExpression[typingsSlinky.typescript.mod.EqualsToken]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typescript.mod.DotDotDotToken
    - typingsSlinky.typescript.mod.SpreadElement
    - typingsSlinky.typescript.mod.SpreadAssignment
  */
  type BindingOrAssignmentElementRestIndicator = typingsSlinky.typescript.mod._BindingOrAssignmentElementRestIndicator | typingsSlinky.typescript.mod.DotDotDotToken
  type BitwiseOperatorOrHigher = typingsSlinky.typescript.mod.EqualityOperatorOrHigher | typingsSlinky.typescript.mod.BitwiseOperator
  type CodeActionCommand = typingsSlinky.typescript.mod.InstallPackageAction
  type ColonToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.ColonToken]
  type CompilerOptionsValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[
      scala.Double | typingsSlinky.typescript.mod.PluginImport | typingsSlinky.typescript.mod.ProjectReference | java.lang.String
    ]) | typingsSlinky.typescript.mod.MapLike[js.Array[java.lang.String]] | scala.Null
  ]
  type ConciseBody = typingsSlinky.typescript.mod.FunctionBody | typingsSlinky.typescript.mod.Expression
  /** Create the program with rootNames and options, if they are undefined, oldProgram and new configFile diagnostics create new program */
  type CreateProgram_[T /* <: typingsSlinky.typescript.mod.BuilderProgram */] = js.Function6[
    /* rootNames */ js.UndefOr[js.Array[java.lang.String]], 
    /* options */ js.UndefOr[typingsSlinky.typescript.mod.CompilerOptions], 
    /* host */ js.UndefOr[typingsSlinky.typescript.mod.CompilerHost], 
    /* oldProgram */ js.UndefOr[T], 
    /* configFileParsingDiagnostics */ js.UndefOr[js.Array[typingsSlinky.typescript.mod.Diagnostic]], 
    /* projectReferences */ js.UndefOr[js.Array[typingsSlinky.typescript.mod.ProjectReference]], 
    T
  ]
  type CustomTransformerFactory = js.Function1[
    /* context */ typingsSlinky.typescript.mod.TransformationContext, 
    typingsSlinky.typescript.mod.CustomTransformer
  ]
  type DeferredTypeReference = typingsSlinky.typescript.mod.TypeReference
  type DiagnosticReporter = js.Function1[/* diagnostic */ typingsSlinky.typescript.mod.Diagnostic, scala.Unit]
  type DirectoryWatcherCallback = js.Function1[/* fileName */ java.lang.String, scala.Unit]
  type DocumentRegistryBucketKey = java.lang.String with typingsSlinky.typescript.anon.BucketKey
  type DotDotDotToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.DotDotDotToken]
  type DotToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.DotToken]
  type EmitHelperUniqueNameCallback = js.Function1[/* name */ java.lang.String, java.lang.String]
  type EndOfFileToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.EndOfFileToken] with typingsSlinky.typescript.mod.JSDocContainer
  type EnumType = typingsSlinky.typescript.mod.Type
  type EqualityOperatorOrHigher = typingsSlinky.typescript.mod.RelationalOperatorOrHigher | typingsSlinky.typescript.mod.EqualityOperator
  type EqualsGreaterThanToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.EqualsGreaterThanToken]
  type EqualsToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.EqualsToken]
  type ErrorCallback = js.Function2[
    /* message */ typingsSlinky.typescript.mod.DiagnosticMessage, 
    /* length */ scala.Double, 
    scala.Unit
  ]
  type ExclamationToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.ExclamationToken]
  type ExponentiationOperator = typingsSlinky.typescript.mod.SyntaxKind.AsteriskAsteriskToken
  type FileWatcherCallback = js.Function2[
    /* fileName */ java.lang.String, 
    /* eventKind */ typingsSlinky.typescript.mod.FileWatcherEventKind, 
    scala.Unit
  ]
  type FunctionBody = typingsSlinky.typescript.mod.Block
  type FunctionLike = typingsSlinky.typescript.mod.SignatureDeclaration
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typescript.mod.ParameterDeclaration
    - typingsSlinky.typescript.mod.CallSignatureDeclaration
    - typingsSlinky.typescript.mod.ConstructSignatureDeclaration
    - typingsSlinky.typescript.mod.MethodSignature
    - typingsSlinky.typescript.mod.PropertySignature
    - typingsSlinky.typescript.mod.ArrowFunction
    - typingsSlinky.typescript.mod.ParenthesizedExpression
    - typingsSlinky.typescript.mod.SpreadAssignment
    - typingsSlinky.typescript.mod.ShorthandPropertyAssignment
    - typingsSlinky.typescript.mod.PropertyAssignment
    - typingsSlinky.typescript.mod.FunctionExpression
    - typingsSlinky.typescript.mod.LabeledStatement
    - typingsSlinky.typescript.mod.ExpressionStatement
    - typingsSlinky.typescript.mod.VariableStatement
    - typingsSlinky.typescript.mod.FunctionDeclaration
    - typingsSlinky.typescript.mod.ConstructorDeclaration
    - typingsSlinky.typescript.mod.MethodDeclaration
    - typingsSlinky.typescript.mod.PropertyDeclaration
    - typingsSlinky.typescript.mod.AccessorDeclaration
    - typingsSlinky.typescript.mod.ClassLikeDeclaration
    - typingsSlinky.typescript.mod.InterfaceDeclaration
    - typingsSlinky.typescript.mod.TypeAliasDeclaration
    - typingsSlinky.typescript.mod.EnumMember
    - typingsSlinky.typescript.mod.EnumDeclaration
    - typingsSlinky.typescript.mod.ModuleDeclaration
    - typingsSlinky.typescript.mod.ImportEqualsDeclaration
    - typingsSlinky.typescript.mod.IndexSignatureDeclaration
    - typingsSlinky.typescript.mod.FunctionTypeNode
    - typingsSlinky.typescript.mod.ConstructorTypeNode
    - typingsSlinky.typescript.mod.JSDocFunctionType
    - typingsSlinky.typescript.mod.ExportDeclaration
    - typingsSlinky.typescript.mod.EndOfFileToken
  */
  type HasJSDoc = typingsSlinky.typescript.mod._HasJSDoc | typingsSlinky.typescript.mod.EndOfFileToken
  type IncrementExpression = typingsSlinky.typescript.mod.UpdateExpression
  type InstantiableType = typingsSlinky.typescript.mod.Type
  type IntersectionType = typingsSlinky.typescript.mod.UnionOrIntersectionType
  type JsFileExtensionInfo = typingsSlinky.typescript.mod.FileExtensionInfo
  type LogicalOperatorOrHigher = typingsSlinky.typescript.mod.BitwiseOperatorOrHigher | typingsSlinky.typescript.mod.LogicalOperator
  /**
    * Type of objects whose values are all of the same type.
    * The `in` and `for-in` operators can *not* be safely used,
    * since `Object.prototype` may be modified by outside code.
    */
  type MapLike[T] = org.scalablytyped.runtime.StringDictionary[T]
  type MinusToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.MinusToken]
  type Modifier = typingsSlinky.typescript.mod.Token[
    typingsSlinky.typescript.mod.SyntaxKind.AbstractKeyword | typingsSlinky.typescript.mod.SyntaxKind.AsyncKeyword | typingsSlinky.typescript.mod.SyntaxKind.ConstKeyword | typingsSlinky.typescript.mod.SyntaxKind.DeclareKeyword | typingsSlinky.typescript.mod.SyntaxKind.DefaultKeyword | typingsSlinky.typescript.mod.SyntaxKind.ExportKeyword | typingsSlinky.typescript.mod.SyntaxKind.PrivateKeyword | typingsSlinky.typescript.mod.SyntaxKind.ProtectedKeyword | typingsSlinky.typescript.mod.SyntaxKind.PublicKeyword | typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword | typingsSlinky.typescript.mod.SyntaxKind.StaticKeyword
  ]
  type ModifiersArray = typingsSlinky.typescript.mod.NodeArray[typingsSlinky.typescript.mod.Modifier]
  type MultiplicativeOperatorOrHigher = typingsSlinky.typescript.mod.ExponentiationOperator | typingsSlinky.typescript.mod.MultiplicativeOperator
  type OrganizeImportsScope = typingsSlinky.typescript.mod.CombinedCodeFixScope
  type Path = java.lang.String with typingsSlinky.typescript.anon.PathBrand
  type PlusToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.PlusToken]
  type QuestionDotToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.QuestionDotToken]
  type QuestionToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.QuestionToken]
  type ReadonlyToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword]
  type RelationalOperatorOrHigher = typingsSlinky.typescript.mod.ShiftOperatorOrHigher | typingsSlinky.typescript.mod.RelationalOperator
  type ReportEmitErrorSummary = js.Function1[/* errorCount */ scala.Double, scala.Unit]
  type ResolvedConfigFileName = java.lang.String with js.Object
  type ShiftOperatorOrHigher = typingsSlinky.typescript.mod.AdditiveOperatorOrHigher | typingsSlinky.typescript.mod.ShiftOperator
  type String = (java.lang.String with typingsSlinky.typescript.anon.EscapedIdentifier) | (scala.Unit with typingsSlinky.typescript.anon.EscapedIdentifier) | typingsSlinky.typescript.mod.InternalSymbolName
  type StructuredType = typingsSlinky.typescript.mod.ObjectType | typingsSlinky.typescript.mod.UnionType | typingsSlinky.typescript.mod.IntersectionType
  type SymbolTable = typingsSlinky.typescript.mod.UnderscoreEscapedMap[typingsSlinky.typescript.mod.Symbol]
  type Transformer[T /* <: typingsSlinky.typescript.mod.Node */] = js.Function1[/* node */ T, T]
  type TransformerFactory[T /* <: typingsSlinky.typescript.mod.Node */] = js.Function1[
    /* context */ typingsSlinky.typescript.mod.TransformationContext, 
    typingsSlinky.typescript.mod.Transformer[T]
  ]
  type TypeParameter = typingsSlinky.typescript.mod.InstantiableType
  type TypeVariable = typingsSlinky.typescript.mod.TypeParameter | typingsSlinky.typescript.mod.IndexedAccessType
  type UnionType = typingsSlinky.typescript.mod.UnionOrIntersectionType
  type VisitResult[T /* <: typingsSlinky.typescript.mod.Node */] = js.UndefOr[T | js.Array[T]]
  type Visitor = js.Function1[
    /* node */ typingsSlinky.typescript.mod.Node, 
    typingsSlinky.typescript.mod.VisitResult[typingsSlinky.typescript.mod.Node]
  ]
  /**
    * Creates the watch what generates program using the config file
    */
  type WatchOfConfigFile[T] = typingsSlinky.typescript.mod.Watch[T]
  type WatchStatusReporter = js.Function4[
    /* diagnostic */ typingsSlinky.typescript.mod.Diagnostic, 
    /* newLine */ java.lang.String, 
    /* options */ typingsSlinky.typescript.mod.CompilerOptions, 
    /* errorCount */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type WithMetadata[T] = T with typingsSlinky.typescript.anon.Metadata
  type WriteFileCallback = js.Function5[
    /* fileName */ java.lang.String, 
    /* data */ java.lang.String, 
    /* writeByteOrderMark */ scala.Boolean, 
    /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]], 
    /* sourceFiles */ js.UndefOr[js.Array[typingsSlinky.typescript.mod.SourceFile]], 
    scala.Unit
  ]
}
