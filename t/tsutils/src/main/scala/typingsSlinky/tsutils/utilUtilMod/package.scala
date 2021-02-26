package typingsSlinky.tsutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilUtilMod {
  
  type BooleanCompilerOptions = js.Any
  
  type ForEachCommentCallback = js.Function2[
    /* fullText */ java.lang.String, 
    /* comment */ typingsSlinky.typescript.mod.CommentRange, 
    scala.Unit
  ]
  
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typingsSlinky.typescript.mod.SyntaxKind, 
    /* range */ typingsSlinky.typescript.mod.TextRange, 
    /* parent */ typingsSlinky.typescript.mod.Node, 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typescript.mod.ImportDeclaration
    - typingsSlinky.tsutils.anon.ImportEqualsDeclarationmo
    - typingsSlinky.tsutils.anon.ExportDeclarationmoduleSp
    - typingsSlinky.tsutils.anon.CallExpressionexpressionT
    - typingsSlinky.typescript.mod.ImportTypeNode
  */
  type ImportLike = typingsSlinky.tsutils.utilUtilMod._ImportLike | typingsSlinky.typescript.mod.ImportDeclaration | typingsSlinky.typescript.mod.ImportTypeNode
  
  @scala.inline
  def canHaveJsDoc(node: typingsSlinky.typescript.mod.Node): /* is typescript.typescript.HasJSDoc */ scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("canHaveJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.HasJSDoc */ scala.Boolean]
  
  @scala.inline
  def commentText(sourceText: java.lang.String, comment: typingsSlinky.typescript.mod.CommentRange): java.lang.String = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("commentText")(sourceText.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def findImportLikeNodes(
    sourceFile: typingsSlinky.typescript.mod.SourceFile,
    kinds: typingsSlinky.tsutils.utilUtilMod.ImportKind
  ): js.Array[typingsSlinky.tsutils.utilUtilMod.ImportLike] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("findImportLikeNodes")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.tsutils.utilUtilMod.ImportLike]]
  
  @scala.inline
  def findImports(
    sourceFile: typingsSlinky.typescript.mod.SourceFile,
    kinds: typingsSlinky.tsutils.utilUtilMod.ImportKind
  ): js.Array[
    typingsSlinky.typescript.mod.StringLiteral | typingsSlinky.typescript.mod.NoSubstitutionTemplateLiteral
  ] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("findImports")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    typingsSlinky.typescript.mod.StringLiteral | typingsSlinky.typescript.mod.NoSubstitutionTemplateLiteral
  ]]
  
  @scala.inline
  def forEachComment(
    node: typingsSlinky.typescript.mod.Node,
    cb: typingsSlinky.tsutils.utilUtilMod.ForEachCommentCallback
  ): scala.Unit = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def forEachComment(
    node: typingsSlinky.typescript.mod.Node,
    cb: typingsSlinky.tsutils.utilUtilMod.ForEachCommentCallback,
    sourceFile: typingsSlinky.typescript.mod.SourceFile
  ): scala.Unit = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def forEachDeclaredVariable[T](
    declarationList: typingsSlinky.typescript.mod.VariableDeclarationList,
    cb: js.Function1[
      /* element */ (typingsSlinky.typescript.mod.VariableDeclaration | typingsSlinky.typescript.mod.BindingElement) with typingsSlinky.tsutils.anon.Name, 
      T
    ]
  ): js.UndefOr[T] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachDeclaredVariable")(declarationList.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def forEachDestructuringIdentifier[T](
    pattern: typingsSlinky.typescript.mod.BindingPattern,
    fn: js.Function1[/* element */ typingsSlinky.tsutils.anon.BindingElementnameIdentif, T]
  ): js.UndefOr[T] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachDestructuringIdentifier")(pattern.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def forEachToken(
    node: typingsSlinky.typescript.mod.Node,
    cb: js.Function1[/* node */ typingsSlinky.typescript.mod.Node, scala.Unit]
  ): scala.Unit = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def forEachToken(
    node: typingsSlinky.typescript.mod.Node,
    cb: js.Function1[/* node */ typingsSlinky.typescript.mod.Node, scala.Unit],
    sourceFile: typingsSlinky.typescript.mod.SourceFile
  ): scala.Unit = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def forEachTokenWithTrivia(
    node: typingsSlinky.typescript.mod.Node,
    cb: typingsSlinky.tsutils.utilUtilMod.ForEachTokenCallback
  ): scala.Unit = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachTokenWithTrivia")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def forEachTokenWithTrivia(
    node: typingsSlinky.typescript.mod.Node,
    cb: typingsSlinky.tsutils.utilUtilMod.ForEachTokenCallback,
    sourceFile: typingsSlinky.typescript.mod.SourceFile
  ): scala.Unit = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachTokenWithTrivia")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getAccessKind(node: typingsSlinky.typescript.mod.Node): typingsSlinky.tsutils.utilUtilMod.AccessKind = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getAccessKind")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.AccessKind]
  
  @scala.inline
  def getCheckJsDirective(source: java.lang.String): js.UndefOr[typingsSlinky.typescript.mod.CheckJsDirective] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCheckJsDirective")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.CheckJsDirective]]
  
  @scala.inline
  def getChildOfKind[T /* <: typingsSlinky.typescript.mod.SyntaxKind */](node: typingsSlinky.typescript.mod.Node, kind: T): js.UndefOr[typingsSlinky.typescript.mod.Token[T]] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getChildOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Token[T]]]
  @scala.inline
  def getChildOfKind[T /* <: typingsSlinky.typescript.mod.SyntaxKind */](
    node: typingsSlinky.typescript.mod.Node,
    kind: T,
    sourceFile: typingsSlinky.typescript.mod.SourceFile
  ): js.UndefOr[typingsSlinky.typescript.mod.Token[T]] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getChildOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Token[T]]]
  
  @scala.inline
  def getCommentAtPosition(sourceFile: typingsSlinky.typescript.mod.SourceFile, pos: scala.Double): js.UndefOr[typingsSlinky.typescript.mod.CommentRange] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCommentAtPosition")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.CommentRange]]
  @scala.inline
  def getCommentAtPosition(
    sourceFile: typingsSlinky.typescript.mod.SourceFile,
    pos: scala.Double,
    parent: typingsSlinky.typescript.mod.Node
  ): js.UndefOr[typingsSlinky.typescript.mod.CommentRange] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCommentAtPosition")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.CommentRange]]
  
  @scala.inline
  def getDeclarationOfBindingElement(node: typingsSlinky.typescript.mod.BindingElement): typingsSlinky.typescript.mod.VariableDeclaration | typingsSlinky.typescript.mod.ParameterDeclaration = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getDeclarationOfBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.typescript.mod.VariableDeclaration | typingsSlinky.typescript.mod.ParameterDeclaration]
  
  @scala.inline
  def getIIFE(func: typingsSlinky.typescript.mod.ArrowFunction): js.UndefOr[typingsSlinky.typescript.mod.CallExpression] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getIIFE")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.CallExpression]]
  @scala.inline
  def getIIFE(func: typingsSlinky.typescript.mod.FunctionExpression): js.UndefOr[typingsSlinky.typescript.mod.CallExpression] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getIIFE")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.CallExpression]]
  
  @scala.inline
  def getJsDoc(node: typingsSlinky.typescript.mod.Node): js.Array[typingsSlinky.typescript.mod.JSDoc] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.typescript.mod.JSDoc]]
  @scala.inline
  def getJsDoc(node: typingsSlinky.typescript.mod.Node, sourceFile: typingsSlinky.typescript.mod.SourceFile): js.Array[typingsSlinky.typescript.mod.JSDoc] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getJsDoc")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.typescript.mod.JSDoc]]
  
  @scala.inline
  def getLateBoundPropertyNames(node: typingsSlinky.typescript.mod.Expression, checker: typingsSlinky.typescript.mod.TypeChecker): typingsSlinky.tsutils.utilUtilMod.LateBoundPropertyNames = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getLateBoundPropertyNames")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.LateBoundPropertyNames]
  
  @scala.inline
  def getLateBoundPropertyNamesOfPropertyName(node: typingsSlinky.typescript.mod.PropertyName, checker: typingsSlinky.typescript.mod.TypeChecker): typingsSlinky.tsutils.utilUtilMod.LateBoundPropertyNames = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getLateBoundPropertyNamesOfPropertyName")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.LateBoundPropertyNames]
  
  @scala.inline
  def getLineBreakStyle(sourceFile: typingsSlinky.typescript.mod.SourceFile): typingsSlinky.tsutils.tsutilsStrings.Linefeed | typingsSlinky.tsutils.tsutilsStrings.CarriagereturnLinefeed = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getLineBreakStyle")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tsutils.tsutilsStrings.Linefeed | typingsSlinky.tsutils.tsutilsStrings.CarriagereturnLinefeed]
  
  @scala.inline
  def getLineRanges(sourceFile: typingsSlinky.typescript.mod.SourceFile): js.Array[typingsSlinky.tsutils.utilUtilMod.LineRange] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getLineRanges")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.tsutils.utilUtilMod.LineRange]]
  
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.AbstractKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.AsyncKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.ConstKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.DeclareKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.DefaultKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.ExportKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.PrivateKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.ProtectedKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.PublicKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  @scala.inline
  def getModifier(
    node: typingsSlinky.typescript.mod.Node,
    kind: typingsSlinky.typescript.mod.SyntaxKind.StaticKeyword
  ): js.UndefOr[typingsSlinky.typescript.mod.Modifier] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Modifier]]
  
  @scala.inline
  def getNextStatement(statement: typingsSlinky.typescript.mod.Statement): js.UndefOr[typingsSlinky.typescript.mod.Statement] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNextStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Statement]]
  
  @scala.inline
  def getNextToken(node: typingsSlinky.typescript.mod.Node): js.UndefOr[typingsSlinky.typescript.mod.Node] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNextToken")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  @scala.inline
  def getNextToken(node: typingsSlinky.typescript.mod.Node, sourceFile: typingsSlinky.typescript.mod.SourceFile): js.UndefOr[typingsSlinky.typescript.mod.Node] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNextToken")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  
  @scala.inline
  def getPreviousStatement(statement: typingsSlinky.typescript.mod.Statement): js.UndefOr[typingsSlinky.typescript.mod.Statement] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Statement]]
  
  @scala.inline
  def getPreviousToken(node: typingsSlinky.typescript.mod.Node): js.UndefOr[typingsSlinky.typescript.mod.Node] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousToken")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  @scala.inline
  def getPreviousToken(node: typingsSlinky.typescript.mod.Node, sourceFile: typingsSlinky.typescript.mod.SourceFile): js.UndefOr[typingsSlinky.typescript.mod.Node] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousToken")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  
  @scala.inline
  def getPropertyName(propertyName: typingsSlinky.typescript.mod.PropertyName): js.UndefOr[java.lang.String] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyName")(propertyName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def getPropertyNameOfWellKnownSymbol(node: typingsSlinky.tsutils.utilUtilMod.WellKnownSymbolLiteral): typingsSlinky.tsutils.utilUtilMod.PropertyName = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameOfWellKnownSymbol")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.PropertyName]
  
  @scala.inline
  def getSingleLateBoundPropertyNameOfPropertyName(node: typingsSlinky.typescript.mod.PropertyName, checker: typingsSlinky.typescript.mod.TypeChecker): js.UndefOr[typingsSlinky.tsutils.utilUtilMod.PropertyName] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getSingleLateBoundPropertyNameOfPropertyName")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.tsutils.utilUtilMod.PropertyName]]
  
  @scala.inline
  def getTokenAtPosition(parent: typingsSlinky.typescript.mod.Node, pos: scala.Double): js.UndefOr[typingsSlinky.typescript.mod.Node] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  @scala.inline
  def getTokenAtPosition(
    parent: typingsSlinky.typescript.mod.Node,
    pos: scala.Double,
    sourceFile: js.UndefOr[scala.Nothing],
    allowJsDoc: scala.Boolean
  ): js.UndefOr[typingsSlinky.typescript.mod.Node] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], allowJsDoc.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  @scala.inline
  def getTokenAtPosition(
    parent: typingsSlinky.typescript.mod.Node,
    pos: scala.Double,
    sourceFile: typingsSlinky.typescript.mod.SourceFile
  ): js.UndefOr[typingsSlinky.typescript.mod.Node] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  @scala.inline
  def getTokenAtPosition(
    parent: typingsSlinky.typescript.mod.Node,
    pos: scala.Double,
    sourceFile: typingsSlinky.typescript.mod.SourceFile,
    allowJsDoc: scala.Boolean
  ): js.UndefOr[typingsSlinky.typescript.mod.Node] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], allowJsDoc.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.typescript.mod.Node]]
  
  @scala.inline
  def getVariableDeclarationKind(declarationList: typingsSlinky.typescript.mod.VariableDeclarationList): typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getVariableDeclarationKind")(declarationList.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.VariableDeclarationKind]
  
  @scala.inline
  def getWrappedNodeAtPosition(wrap: typingsSlinky.tsutils.convertAstMod.NodeWrap, pos: scala.Double): js.UndefOr[typingsSlinky.tsutils.convertAstMod.NodeWrap] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getWrappedNodeAtPosition")(wrap.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.tsutils.convertAstMod.NodeWrap]]
  
  @scala.inline
  def hasAccessModifier(node: typingsSlinky.typescript.mod.ClassElement): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessModifier")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasAccessModifier(node: typingsSlinky.typescript.mod.ParameterDeclaration): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessModifier")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasModifier(
    modifiers: js.UndefOr[scala.Nothing],
    kinds: (typingsSlinky.typescript.mod.SyntaxKind.AbstractKeyword | typingsSlinky.typescript.mod.SyntaxKind.AsyncKeyword | typingsSlinky.typescript.mod.SyntaxKind.ConstKeyword | typingsSlinky.typescript.mod.SyntaxKind.DeclareKeyword | typingsSlinky.typescript.mod.SyntaxKind.DefaultKeyword | typingsSlinky.typescript.mod.SyntaxKind.ExportKeyword | typingsSlinky.typescript.mod.SyntaxKind.PrivateKeyword | typingsSlinky.typescript.mod.SyntaxKind.ProtectedKeyword | typingsSlinky.typescript.mod.SyntaxKind.PublicKeyword | typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword | typingsSlinky.typescript.mod.SyntaxKind.StaticKeyword)*
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasModifier(
    modifiers: typingsSlinky.typescript.mod.ModifiersArray,
    kinds: (typingsSlinky.typescript.mod.SyntaxKind.AbstractKeyword | typingsSlinky.typescript.mod.SyntaxKind.AsyncKeyword | typingsSlinky.typescript.mod.SyntaxKind.ConstKeyword | typingsSlinky.typescript.mod.SyntaxKind.DeclareKeyword | typingsSlinky.typescript.mod.SyntaxKind.DefaultKeyword | typingsSlinky.typescript.mod.SyntaxKind.ExportKeyword | typingsSlinky.typescript.mod.SyntaxKind.PrivateKeyword | typingsSlinky.typescript.mod.SyntaxKind.ProtectedKeyword | typingsSlinky.typescript.mod.SyntaxKind.PublicKeyword | typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword | typingsSlinky.typescript.mod.SyntaxKind.StaticKeyword)*
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasOwnThisReference(node: typingsSlinky.typescript.mod.Node): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnThisReference")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasSideEffects(node: typingsSlinky.typescript.mod.Expression): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasSideEffects")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasSideEffects(
    node: typingsSlinky.typescript.mod.Expression,
    options: typingsSlinky.tsutils.utilUtilMod.SideEffectOptions
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasSideEffects")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isAmbientModule(node: typingsSlinky.typescript.mod.ModuleDeclaration): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientModule")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isAmbientModuleBlock(node: typingsSlinky.typescript.mod.Node): /* is typescript.typescript.ModuleBlock */ scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientModuleBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleBlock */ scala.Boolean]
  
  @scala.inline
  def isAssignmentKind(kind: typingsSlinky.typescript.mod.SyntaxKind): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBindableObjectDefinePropertyCall(node: typingsSlinky.typescript.mod.CallExpression): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBindableObjectDefinePropertyCall")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBlockScopeBoundary(node: typingsSlinky.typescript.mod.Node): typingsSlinky.tsutils.utilUtilMod.ScopeBoundary = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.ScopeBoundary]
  
  @scala.inline
  def isBlockScopedDeclarationStatement(statement: typingsSlinky.typescript.mod.Statement): /* is typescript.typescript.DeclarationStatement */ scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedDeclarationStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DeclarationStatement */ scala.Boolean]
  
  @scala.inline
  def isBlockScopedVariableDeclaration(declaration: typingsSlinky.typescript.mod.VariableDeclaration): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariableDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBlockScopedVariableDeclarationList(declarationList: typingsSlinky.typescript.mod.VariableDeclarationList): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariableDeclarationList")(declarationList.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isCompilerOptionEnabled(
    options: typingsSlinky.typescript.mod.CompilerOptions,
    option: typingsSlinky.tsutils.utilUtilMod.BooleanCompilerOptions
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isCompilerOptionEnabled_stripInternal(
    options: typingsSlinky.typescript.mod.CompilerOptions,
    option: typingsSlinky.tsutils.tsutilsStrings.stripInternal
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isConstAssertion(node: typingsSlinky.typescript.mod.AssertionExpression): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConstAssertion")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isExpressionValueUsed(node: typingsSlinky.typescript.mod.Expression): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionValueUsed")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isFunctionScopeBoundary(node: typingsSlinky.typescript.mod.Node): typingsSlinky.tsutils.utilUtilMod.ScopeBoundary = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.ScopeBoundary]
  
  @scala.inline
  def isFunctionWithBody(node: typingsSlinky.typescript.mod.Node): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionWithBody")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isInConstContext(node: typingsSlinky.typescript.mod.Expression): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInConstContext")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isInSingleStatementContext(statement: typingsSlinky.typescript.mod.Statement): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInSingleStatementContext")(statement.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isJsDocKind(kind: typingsSlinky.typescript.mod.SyntaxKind): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isJsDocKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isKeywordKind(kind: typingsSlinky.typescript.mod.SyntaxKind): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isModifierFlagSet(node: typingsSlinky.typescript.mod.Node, flag: typingsSlinky.typescript.mod.ModifierFlags): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isModifierFlagSet")(node.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNodeFlagSet(node: typingsSlinky.typescript.mod.Node, flag: typingsSlinky.typescript.mod.NodeFlags): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNodeFlagSet")(node.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNodeKind(kind: typingsSlinky.typescript.mod.SyntaxKind): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNodeKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNumericPropertyName(name: java.lang.String): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumericPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isNumericPropertyName(name: typingsSlinky.typescript.mod.String): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumericPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isObjectFlagSet(
    objectType: typingsSlinky.typescript.mod.ObjectType,
    flag: typingsSlinky.typescript.mod.ObjectFlags
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isObjectFlagSet")(objectType.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isParameterProperty(node: typingsSlinky.typescript.mod.ParameterDeclaration): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isParameterProperty")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPositionInComment(sourceFile: typingsSlinky.typescript.mod.SourceFile, pos: scala.Double): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPositionInComment")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def isPositionInComment(
    sourceFile: typingsSlinky.typescript.mod.SourceFile,
    pos: scala.Double,
    parent: typingsSlinky.typescript.mod.Node
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPositionInComment")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isReadonlyAssignmentDeclaration(
    node: typingsSlinky.typescript.mod.CallExpression,
    checker: typingsSlinky.typescript.mod.TypeChecker
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyAssignmentDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isReassignmentTarget(node: typingsSlinky.typescript.mod.Expression): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isReassignmentTarget")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSameLine(sourceFile: typingsSlinky.typescript.mod.SourceFile, pos1: scala.Double, pos2: scala.Double): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSameLine")(sourceFile.asInstanceOf[js.Any], pos1.asInstanceOf[js.Any], pos2.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isScopeBoundary(node: typingsSlinky.typescript.mod.Node): typingsSlinky.tsutils.utilUtilMod.ScopeBoundary = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.ScopeBoundary]
  
  @scala.inline
  def isStatementInAmbientContext(node: typingsSlinky.typescript.mod.Statement): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStatementInAmbientContext")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isStrictCompilerOptionEnabled(
    options: typingsSlinky.typescript.mod.CompilerOptions,
    option: typingsSlinky.tsutils.utilUtilMod.StrictCompilerOption
  ): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStrictCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSymbolFlagSet(symbol: typingsSlinky.typescript.mod.Symbol, flag: typingsSlinky.typescript.mod.SymbolFlags): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolFlagSet")(symbol.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isThisParameter(parameter: typingsSlinky.typescript.mod.ParameterDeclaration): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isThisParameter")(parameter.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTokenKind(kind: typingsSlinky.typescript.mod.SyntaxKind): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypeFlagSet(`type`: typingsSlinky.typescript.mod.Type, flag: typingsSlinky.typescript.mod.TypeFlags): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypeFlagSet")(`type`.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypeNodeKind(kind: typingsSlinky.typescript.mod.SyntaxKind): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypeNodeKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypeScopeBoundary(node: typingsSlinky.typescript.mod.Node): typingsSlinky.tsutils.utilUtilMod.ScopeBoundary = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tsutils.utilUtilMod.ScopeBoundary]
  
  @scala.inline
  def isValidIdentifier(text: java.lang.String): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isValidIdentifier(text: java.lang.String, languageVersion: typingsSlinky.typescript.mod.ScriptTarget): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isValidJsxIdentifier(text: java.lang.String): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidJsxIdentifier")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isValidJsxIdentifier(text: java.lang.String, languageVersion: typingsSlinky.typescript.mod.ScriptTarget): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidJsxIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isValidNumericLiteral(text: java.lang.String): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericLiteral")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isValidNumericLiteral(text: java.lang.String, languageVersion: typingsSlinky.typescript.mod.ScriptTarget): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericLiteral")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isValidPropertyAccess(text: java.lang.String): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyAccess")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isValidPropertyAccess(text: java.lang.String, languageVersion: typingsSlinky.typescript.mod.ScriptTarget): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyAccess")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isValidPropertyName(text: java.lang.String): scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyName")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isValidPropertyName(text: java.lang.String, languageVersion: typingsSlinky.typescript.mod.ScriptTarget): scala.Boolean = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyName")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isWellKnownSymbolLiterally(node: typingsSlinky.typescript.mod.Expression): /* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ scala.Boolean = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isWellKnownSymbolLiterally")(node.asInstanceOf[js.Any]).asInstanceOf[/* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ scala.Boolean]
  
  @scala.inline
  def parseJsDocOfNode(node: typingsSlinky.typescript.mod.Node): js.Array[typingsSlinky.typescript.mod.JSDoc] = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.typescript.mod.JSDoc]]
  @scala.inline
  def parseJsDocOfNode(
    node: typingsSlinky.typescript.mod.Node,
    considerTrailingComments: js.UndefOr[scala.Nothing],
    sourceFile: typingsSlinky.typescript.mod.SourceFile
  ): js.Array[typingsSlinky.typescript.mod.JSDoc] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.typescript.mod.JSDoc]]
  @scala.inline
  def parseJsDocOfNode(node: typingsSlinky.typescript.mod.Node, considerTrailingComments: scala.Boolean): js.Array[typingsSlinky.typescript.mod.JSDoc] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.typescript.mod.JSDoc]]
  @scala.inline
  def parseJsDocOfNode(
    node: typingsSlinky.typescript.mod.Node,
    considerTrailingComments: scala.Boolean,
    sourceFile: typingsSlinky.typescript.mod.SourceFile
  ): js.Array[typingsSlinky.typescript.mod.JSDoc] = (typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.typescript.mod.JSDoc]]
  
  @scala.inline
  def unwrapParentheses(node: typingsSlinky.typescript.mod.Expression): typingsSlinky.typescript.mod.Expression = typingsSlinky.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrapParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.typescript.mod.Expression]
}
