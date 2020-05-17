package typingsSlinky.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AssertsToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.AssertsKeyword]
  type AssignmentOperatorToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.AssignmentOperator]
  type AsteriskToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.AsteriskToken]
  type AwaitKeywordToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.AwaitKeyword]
  type BinaryOperatorToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.BinaryOperator]
  type CodeActionCommand = typingsSlinky.typescript.mod.InstallPackageAction
  type ColonToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.ColonToken]
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
  type IncrementExpression = typingsSlinky.typescript.mod.UpdateExpression
  type InstantiableType = typingsSlinky.typescript.mod.Type
  type IntersectionType = typingsSlinky.typescript.mod.UnionOrIntersectionType
  type JsFileExtensionInfo = typingsSlinky.typescript.mod.FileExtensionInfo
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
  type OrganizeImportsScope = typingsSlinky.typescript.mod.CombinedCodeFixScope
  type Path = java.lang.String with typingsSlinky.typescript.anon.PathBrand
  type PlusToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.PlusToken]
  type QuestionDotToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.QuestionDotToken]
  type QuestionToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.QuestionToken]
  type ReadonlyToken = typingsSlinky.typescript.mod.Token[typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword]
  type ReportEmitErrorSummary = js.Function1[/* errorCount */ scala.Double, scala.Unit]
  type ResolvedConfigFileName = java.lang.String with js.Object
  type SymbolTable = typingsSlinky.typescript.mod.UnderscoreEscapedMap[typingsSlinky.typescript.mod.Symbol]
  type Transformer[T /* <: typingsSlinky.typescript.mod.Node */] = js.Function1[/* node */ T, T]
  type TransformerFactory[T /* <: typingsSlinky.typescript.mod.Node */] = js.Function1[
    /* context */ typingsSlinky.typescript.mod.TransformationContext, 
    typingsSlinky.typescript.mod.Transformer[T]
  ]
  type TypeParameter = typingsSlinky.typescript.mod.InstantiableType
  type UnionType = typingsSlinky.typescript.mod.UnionOrIntersectionType
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
