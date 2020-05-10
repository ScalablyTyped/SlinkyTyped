package typingsSlinky.typescriptServices.TypeScript.Syntax

import typingsSlinky.typescriptServices.TypeScript.ArgumentListSyntax
import typingsSlinky.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ArrayTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.BinaryExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.BlockSyntax
import typingsSlinky.typescriptServices.TypeScript.BreakStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.CaseSwitchClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.CastExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.ClassDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.ConditionalExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ConstraintSyntax
import typingsSlinky.typescriptServices.TypeScript.ConstructSignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.ConstructorDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.ConstructorTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.ContinueStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.DebuggerStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.DefaultSwitchClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.DeleteExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.DoStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ElementAccessExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ElseClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.EmptyStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.EnumDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.EnumElementSyntax
import typingsSlinky.typescriptServices.TypeScript.EqualsValueClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.ExportAssignmentSyntax
import typingsSlinky.typescriptServices.TypeScript.ExpressionStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ExternalModuleReferenceSyntax
import typingsSlinky.typescriptServices.TypeScript.FinallyClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.ForInStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ForStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.FunctionExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax
import typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.GenericTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.GetAccessorSyntax
import typingsSlinky.typescriptServices.TypeScript.HeritageClauseSyntax
import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IMemberExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IModuleReferenceSyntax
import typingsSlinky.typescriptServices.TypeScript.INameSyntax
import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import typingsSlinky.typescriptServices.TypeScript.IUnaryExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IfStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ImportDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.IndexMemberDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.IndexSignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.InterfaceDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.InvocationExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.LabeledStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.MemberAccessExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.MemberVariableDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.MethodSignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.ModuleDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax
import typingsSlinky.typescriptServices.TypeScript.ObjectCreationExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ObjectTypeSyntax
import typingsSlinky.typescriptServices.TypeScript.OmittedExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax
import typingsSlinky.typescriptServices.TypeScript.ParameterSyntax
import typingsSlinky.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ParenthesizedExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.PropertySignatureSyntax
import typingsSlinky.typescriptServices.TypeScript.QualifiedNameSyntax
import typingsSlinky.typescriptServices.TypeScript.ReturnStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.SetAccessorSyntax
import typingsSlinky.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptServices.TypeScript.SwitchStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import typingsSlinky.typescriptServices.TypeScript.ThrowStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.TryStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeArgumentListSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeOfExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeParameterSyntax
import typingsSlinky.typescriptServices.TypeScript.TypeQuerySyntax
import typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax
import typingsSlinky.typescriptServices.TypeScript.VariableDeclaratorSyntax
import typingsSlinky.typescriptServices.TypeScript.VariableStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.VoidExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.WhileStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.WithStatementSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFactory extends js.Object {
  def argumentList(
    typeArgumentList: TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken
  ): ArgumentListSyntax = js.native
  def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  def binaryExpression(kind: SyntaxKind, left: IExpressionSyntax, operatorToken: ISyntaxToken, right: IExpressionSyntax): BinaryExpressionSyntax = js.native
  def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): BreakStatementSyntax = js.native
  def callSignature(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax
  ): CallSignatureSyntax = js.native
  def caseSwitchClause(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList
  ): CaseSwitchClauseSyntax = js.native
  def castExpression(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax
  ): CastExpressionSyntax = js.native
  def catchClause(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: BlockSyntax
  ): CatchClauseSyntax = js.native
  def classDeclaration(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ClassDeclarationSyntax = js.native
  def conditionalExpression(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax
  ): ConditionalExpressionSyntax = js.native
  def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): ConstraintSyntax = js.native
  def constructSignature(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
  def constructorDeclaration(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): ConstructorDeclarationSyntax = js.native
  def constructorType(
    newKeyword: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): ConstructorTypeSyntax = js.native
  def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
  def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
  def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
  def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): DeleteExpressionSyntax = js.native
  def doStatement(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): DoStatementSyntax = js.native
  def elementAccessExpression(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken
  ): ElementAccessExpressionSyntax = js.native
  def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): ElseClauseSyntax = js.native
  def emptyStatement(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
  def enumDeclaration(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): EnumDeclarationSyntax = js.native
  def enumElement(propertyName: ISyntaxToken, equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax = js.native
  def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
  def exportAssignment(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): ExportAssignmentSyntax = js.native
  def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
  def externalModuleReference(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken
  ): ExternalModuleReferenceSyntax = js.native
  def finallyClause(finallyKeyword: ISyntaxToken, block: BlockSyntax): FinallyClauseSyntax = js.native
  def forInStatement(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForInStatementSyntax = js.native
  def forStatement(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    initializer: IExpressionSyntax,
    firstSemicolonToken: ISyntaxToken,
    condition: IExpressionSyntax,
    secondSemicolonToken: ISyntaxToken,
    incrementor: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForStatementSyntax = js.native
  def functionDeclaration(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): FunctionDeclarationSyntax = js.native
  def functionExpression(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax
  ): FunctionExpressionSyntax = js.native
  def functionPropertyAssignment(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
  def functionType(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): FunctionTypeSyntax = js.native
  def genericType(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
  def getAccessor(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax,
    block: BlockSyntax
  ): GetAccessorSyntax = js.native
  def heritageClause(kind: SyntaxKind, extendsOrImplementsKeyword: ISyntaxToken, typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
  def ifStatement(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: ElseClauseSyntax
  ): IfStatementSyntax = js.native
  def importDeclaration(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): ImportDeclarationSyntax = js.native
  def indexMemberDeclaration(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def indexSignature(
    openBracketToken: ISyntaxToken,
    parameter: ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax
  ): IndexSignatureSyntax = js.native
  def interfaceDeclaration(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: ObjectTypeSyntax
  ): InterfaceDeclarationSyntax = js.native
  def invocationExpression(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
  def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax = js.native
  def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  def memberFunctionDeclaration(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): MemberFunctionDeclarationSyntax = js.native
  def memberVariableDeclaration(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def methodSignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, callSignature: CallSignatureSyntax): MethodSignatureSyntax = js.native
  def moduleDeclaration(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ModuleDeclarationSyntax = js.native
  def moduleNameModuleReference(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax = js.native
  def objectCreationExpression(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  def objectLiteralExpression(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): ObjectLiteralExpressionSyntax = js.native
  def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def omittedExpression(): OmittedExpressionSyntax = js.native
  def parameter(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): ParameterSyntax = js.native
  def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): ParameterListSyntax = js.native
  def parenthesizedArrowFunctionExpression(
    callSignature: CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
  def postfixUnaryExpression(kind: SyntaxKind, operand: IMemberExpressionSyntax, operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax = js.native
  def prefixUnaryExpression(kind: SyntaxKind, operatorToken: ISyntaxToken, operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax = js.native
  def propertySignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
  def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): QualifiedNameSyntax = js.native
  def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  def setAccessor(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    block: BlockSyntax
  ): SetAccessorSyntax = js.native
  def simpleArrowFunctionExpression(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): SimpleArrowFunctionExpressionSyntax = js.native
  def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
  def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
  def switchStatement(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax = js.native
  def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ThrowStatementSyntax = js.native
  def tryStatement(
    tryKeyword: ISyntaxToken,
    block: BlockSyntax,
    catchClause: CatchClauseSyntax,
    finallyClause: FinallyClauseSyntax
  ): TryStatementSyntax = js.native
  def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): TypeAnnotationSyntax = js.native
  def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
  def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  def typeParameter(identifier: ISyntaxToken, constraint: ConstraintSyntax): TypeParameterSyntax = js.native
  def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax = js.native
  def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
  def variableDeclarator(
    propertyName: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): VariableDeclaratorSyntax = js.native
  def variableStatement(
    modifiers: ISyntaxList,
    variableDeclaration: VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): VariableStatementSyntax = js.native
  def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
  def whileStatement(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WhileStatementSyntax = js.native
  def withStatement(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WithStatementSyntax = js.native
}

object IFactory {
  @scala.inline
  def apply(
    argumentList: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArgumentListSyntax,
    arrayLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArrayLiteralExpressionSyntax,
    arrayType: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => ArrayTypeSyntax,
    binaryExpression: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => BinaryExpressionSyntax,
    block: (ISyntaxToken, ISyntaxList, ISyntaxToken) => BlockSyntax,
    breakStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => BreakStatementSyntax,
    callSignature: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallSignatureSyntax,
    caseSwitchClause: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CaseSwitchClauseSyntax,
    castExpression: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CastExpressionSyntax,
    catchClause: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CatchClauseSyntax,
    classDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => ClassDeclarationSyntax,
    conditionalExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => ConditionalExpressionSyntax,
    constraint: (ISyntaxToken, ITypeSyntax) => ConstraintSyntax,
    constructSignature: (ISyntaxToken, CallSignatureSyntax) => ConstructSignatureSyntax,
    constructorDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => ConstructorDeclarationSyntax,
    constructorType: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => ConstructorTypeSyntax,
    continueStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => ContinueStatementSyntax,
    debuggerStatement: (ISyntaxToken, ISyntaxToken) => DebuggerStatementSyntax,
    defaultSwitchClause: (ISyntaxToken, ISyntaxToken, ISyntaxList) => DefaultSwitchClauseSyntax,
    deleteExpression: (ISyntaxToken, IUnaryExpressionSyntax) => DeleteExpressionSyntax,
    doStatement: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => DoStatementSyntax,
    elementAccessExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ElementAccessExpressionSyntax,
    elseClause: (ISyntaxToken, IStatementSyntax) => ElseClauseSyntax,
    emptyStatement: ISyntaxToken => EmptyStatementSyntax,
    enumDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => EnumDeclarationSyntax,
    enumElement: (ISyntaxToken, EqualsValueClauseSyntax) => EnumElementSyntax,
    equalsValueClause: (ISyntaxToken, IExpressionSyntax) => EqualsValueClauseSyntax,
    exportAssignment: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExportAssignmentSyntax,
    expressionStatement: (IExpressionSyntax, ISyntaxToken) => ExpressionStatementSyntax,
    externalModuleReference: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExternalModuleReferenceSyntax,
    finallyClause: (ISyntaxToken, BlockSyntax) => FinallyClauseSyntax,
    forInStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForInStatementSyntax,
    forStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForStatementSyntax,
    functionDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => FunctionDeclarationSyntax,
    functionExpression: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionExpressionSyntax,
    functionPropertyAssignment: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionPropertyAssignmentSyntax,
    functionType: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => FunctionTypeSyntax,
    genericType: (INameSyntax, TypeArgumentListSyntax) => GenericTypeSyntax,
    getAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => GetAccessorSyntax,
    heritageClause: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => HeritageClauseSyntax,
    ifStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => IfStatementSyntax,
    importDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => ImportDeclarationSyntax,
    indexMemberDeclaration: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => IndexMemberDeclarationSyntax,
    indexSignature: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => IndexSignatureSyntax,
    interfaceDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => InterfaceDeclarationSyntax,
    invocationExpression: (IMemberExpressionSyntax, ArgumentListSyntax) => InvocationExpressionSyntax,
    labeledStatement: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => LabeledStatementSyntax,
    memberAccessExpression: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => MemberAccessExpressionSyntax,
    memberFunctionDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => MemberFunctionDeclarationSyntax,
    memberVariableDeclaration: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => MemberVariableDeclarationSyntax,
    methodSignature: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => MethodSignatureSyntax,
    moduleDeclaration: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => ModuleDeclarationSyntax,
    moduleNameModuleReference: INameSyntax => ModuleNameModuleReferenceSyntax,
    objectCreationExpression: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => ObjectCreationExpressionSyntax,
    objectLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectLiteralExpressionSyntax,
    objectType: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectTypeSyntax,
    omittedExpression: () => OmittedExpressionSyntax,
    parameter: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => ParameterSyntax,
    parameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ParameterListSyntax,
    parenthesizedArrowFunctionExpression: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => ParenthesizedArrowFunctionExpressionSyntax,
    parenthesizedExpression: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ParenthesizedExpressionSyntax,
    postfixUnaryExpression: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => PostfixUnaryExpressionSyntax,
    prefixUnaryExpression: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => PrefixUnaryExpressionSyntax,
    propertySignature: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => PropertySignatureSyntax,
    qualifiedName: (INameSyntax, ISyntaxToken, ISyntaxToken) => QualifiedNameSyntax,
    returnStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ReturnStatementSyntax,
    setAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => SetAccessorSyntax,
    simpleArrowFunctionExpression: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => SimpleArrowFunctionExpressionSyntax,
    simplePropertyAssignment: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => SimplePropertyAssignmentSyntax,
    sourceUnit: (ISyntaxList, ISyntaxToken) => SourceUnitSyntax,
    switchStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => SwitchStatementSyntax,
    throwStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ThrowStatementSyntax,
    tryStatement: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => TryStatementSyntax,
    typeAnnotation: (ISyntaxToken, ITypeSyntax) => TypeAnnotationSyntax,
    typeArgumentList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeArgumentListSyntax,
    typeOfExpression: (ISyntaxToken, IUnaryExpressionSyntax) => TypeOfExpressionSyntax,
    typeParameter: (ISyntaxToken, ConstraintSyntax) => TypeParameterSyntax,
    typeParameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeParameterListSyntax,
    typeQuery: (ISyntaxToken, INameSyntax) => TypeQuerySyntax,
    variableDeclaration: (ISyntaxToken, ISeparatedSyntaxList) => VariableDeclarationSyntax,
    variableDeclarator: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => VariableDeclaratorSyntax,
    variableStatement: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => VariableStatementSyntax,
    voidExpression: (ISyntaxToken, IUnaryExpressionSyntax) => VoidExpressionSyntax,
    whileStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WhileStatementSyntax,
    withStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WithStatementSyntax
  ): IFactory = {
    val __obj = js.Dynamic.literal(argumentList = js.Any.fromFunction4(argumentList), arrayLiteralExpression = js.Any.fromFunction3(arrayLiteralExpression), arrayType = js.Any.fromFunction3(arrayType), binaryExpression = js.Any.fromFunction4(binaryExpression), block = js.Any.fromFunction3(block), breakStatement = js.Any.fromFunction3(breakStatement), callSignature = js.Any.fromFunction3(callSignature), caseSwitchClause = js.Any.fromFunction4(caseSwitchClause), castExpression = js.Any.fromFunction4(castExpression), catchClause = js.Any.fromFunction6(catchClause), classDeclaration = js.Any.fromFunction8(classDeclaration), conditionalExpression = js.Any.fromFunction5(conditionalExpression), constraint = js.Any.fromFunction2(constraint), constructSignature = js.Any.fromFunction2(constructSignature), constructorDeclaration = js.Any.fromFunction5(constructorDeclaration), constructorType = js.Any.fromFunction5(constructorType), continueStatement = js.Any.fromFunction3(continueStatement), debuggerStatement = js.Any.fromFunction2(debuggerStatement), defaultSwitchClause = js.Any.fromFunction3(defaultSwitchClause), deleteExpression = js.Any.fromFunction2(deleteExpression), doStatement = js.Any.fromFunction7(doStatement), elementAccessExpression = js.Any.fromFunction4(elementAccessExpression), elseClause = js.Any.fromFunction2(elseClause), emptyStatement = js.Any.fromFunction1(emptyStatement), enumDeclaration = js.Any.fromFunction6(enumDeclaration), enumElement = js.Any.fromFunction2(enumElement), equalsValueClause = js.Any.fromFunction2(equalsValueClause), exportAssignment = js.Any.fromFunction4(exportAssignment), expressionStatement = js.Any.fromFunction2(expressionStatement), externalModuleReference = js.Any.fromFunction4(externalModuleReference), finallyClause = js.Any.fromFunction2(finallyClause), forInStatement = js.Any.fromFunction8(forInStatement), forStatement = js.Any.fromFunction10(forStatement), functionDeclaration = js.Any.fromFunction6(functionDeclaration), functionExpression = js.Any.fromFunction4(functionExpression), functionPropertyAssignment = js.Any.fromFunction3(functionPropertyAssignment), functionType = js.Any.fromFunction4(functionType), genericType = js.Any.fromFunction2(genericType), getAccessor = js.Any.fromFunction6(getAccessor), heritageClause = js.Any.fromFunction3(heritageClause), ifStatement = js.Any.fromFunction6(ifStatement), importDeclaration = js.Any.fromFunction6(importDeclaration), indexMemberDeclaration = js.Any.fromFunction3(indexMemberDeclaration), indexSignature = js.Any.fromFunction4(indexSignature), interfaceDeclaration = js.Any.fromFunction6(interfaceDeclaration), invocationExpression = js.Any.fromFunction2(invocationExpression), labeledStatement = js.Any.fromFunction3(labeledStatement), memberAccessExpression = js.Any.fromFunction3(memberAccessExpression), memberFunctionDeclaration = js.Any.fromFunction5(memberFunctionDeclaration), memberVariableDeclaration = js.Any.fromFunction3(memberVariableDeclaration), methodSignature = js.Any.fromFunction3(methodSignature), moduleDeclaration = js.Any.fromFunction7(moduleDeclaration), moduleNameModuleReference = js.Any.fromFunction1(moduleNameModuleReference), objectCreationExpression = js.Any.fromFunction3(objectCreationExpression), objectLiteralExpression = js.Any.fromFunction3(objectLiteralExpression), objectType = js.Any.fromFunction3(objectType), omittedExpression = js.Any.fromFunction0(omittedExpression), parameter = js.Any.fromFunction6(parameter), parameterList = js.Any.fromFunction3(parameterList), parenthesizedArrowFunctionExpression = js.Any.fromFunction4(parenthesizedArrowFunctionExpression), parenthesizedExpression = js.Any.fromFunction3(parenthesizedExpression), postfixUnaryExpression = js.Any.fromFunction3(postfixUnaryExpression), prefixUnaryExpression = js.Any.fromFunction3(prefixUnaryExpression), propertySignature = js.Any.fromFunction3(propertySignature), qualifiedName = js.Any.fromFunction3(qualifiedName), returnStatement = js.Any.fromFunction3(returnStatement), setAccessor = js.Any.fromFunction5(setAccessor), simpleArrowFunctionExpression = js.Any.fromFunction4(simpleArrowFunctionExpression), simplePropertyAssignment = js.Any.fromFunction3(simplePropertyAssignment), sourceUnit = js.Any.fromFunction2(sourceUnit), switchStatement = js.Any.fromFunction7(switchStatement), throwStatement = js.Any.fromFunction3(throwStatement), tryStatement = js.Any.fromFunction4(tryStatement), typeAnnotation = js.Any.fromFunction2(typeAnnotation), typeArgumentList = js.Any.fromFunction3(typeArgumentList), typeOfExpression = js.Any.fromFunction2(typeOfExpression), typeParameter = js.Any.fromFunction2(typeParameter), typeParameterList = js.Any.fromFunction3(typeParameterList), typeQuery = js.Any.fromFunction2(typeQuery), variableDeclaration = js.Any.fromFunction2(variableDeclaration), variableDeclarator = js.Any.fromFunction3(variableDeclarator), variableStatement = js.Any.fromFunction3(variableStatement), voidExpression = js.Any.fromFunction2(voidExpression), whileStatement = js.Any.fromFunction5(whileStatement), withStatement = js.Any.fromFunction5(withStatement))
    __obj.asInstanceOf[IFactory]
  }
  @scala.inline
  implicit class IFactoryOps[Self <: IFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentList(
      value: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArgumentListSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentList")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withArrayLiteralExpression(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArrayLiteralExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayLiteralExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withArrayType(value: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => ArrayTypeSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayType")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBinaryExpression(value: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => BinaryExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryExpression")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withBlock(value: (ISyntaxToken, ISyntaxList, ISyntaxToken) => BlockSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBreakStatement(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => BreakStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakStatement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCallSignature(value: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallSignatureSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSignature")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCaseSwitchClause(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CaseSwitchClauseSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSwitchClause")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCastExpression(value: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CastExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castExpression")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCatchClause(
      value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CatchClauseSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchClause")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withClassDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => ClassDeclarationSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classDeclaration")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withConditionalExpression(
      value: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => ConditionalExpressionSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalExpression")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withConstraint(value: (ISyntaxToken, ITypeSyntax) => ConstraintSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConstructSignature(value: (ISyntaxToken, CallSignatureSyntax) => ConstructSignatureSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructSignature")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConstructorDeclaration(
      value: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => ConstructorDeclarationSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructorDeclaration")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withConstructorType(
      value: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => ConstructorTypeSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructorType")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withContinueStatement(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => ContinueStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueStatement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDebuggerStatement(value: (ISyntaxToken, ISyntaxToken) => DebuggerStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggerStatement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDefaultSwitchClause(value: (ISyntaxToken, ISyntaxToken, ISyntaxList) => DefaultSwitchClauseSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSwitchClause")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDeleteExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => DeleteExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteExpression")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDoStatement(
      value: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => DoStatementSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doStatement")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withElementAccessExpression(
      value: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ElementAccessExpressionSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementAccessExpression")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withElseClause(value: (ISyntaxToken, IStatementSyntax) => ElseClauseSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elseClause")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmptyStatement(value: ISyntaxToken => EmptyStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyStatement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnumDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => EnumDeclarationSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumDeclaration")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withEnumElement(value: (ISyntaxToken, EqualsValueClauseSyntax) => EnumElementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEqualsValueClause(value: (ISyntaxToken, IExpressionSyntax) => EqualsValueClauseSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalsValueClause")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExportAssignment(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExportAssignmentSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAssignment")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withExpressionStatement(value: (IExpressionSyntax, ISyntaxToken) => ExpressionStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionStatement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExternalModuleReference(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExternalModuleReferenceSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModuleReference")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFinallyClause(value: (ISyntaxToken, BlockSyntax) => FinallyClauseSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finallyClause")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withForInStatement(
      value: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForInStatementSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forInStatement")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withForStatement(
      value: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForStatementSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forStatement")(js.Any.fromFunction10(value))
        ret
    }
    @scala.inline
    def withFunctionDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => FunctionDeclarationSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionDeclaration")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withFunctionExpression(value: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionExpression")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFunctionPropertyAssignment(value: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionPropertyAssignmentSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionPropertyAssignment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFunctionType(
      value: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => FunctionTypeSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionType")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGenericType(value: (INameSyntax, TypeArgumentListSyntax) => GenericTypeSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAccessor(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => GetAccessorSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccessor")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withHeritageClause(value: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => HeritageClauseSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heritageClause")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIfStatement(
      value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => IfStatementSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifStatement")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withImportDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => ImportDeclarationSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importDeclaration")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withIndexMemberDeclaration(value: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => IndexMemberDeclarationSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexMemberDeclaration")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIndexSignature(value: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => IndexSignatureSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSignature")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withInterfaceDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => InterfaceDeclarationSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceDeclaration")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withInvocationExpression(value: (IMemberExpressionSyntax, ArgumentListSyntax) => InvocationExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationExpression")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLabeledStatement(value: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => LabeledStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeledStatement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMemberAccessExpression(value: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => MemberAccessExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccessExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMemberFunctionDeclaration(
      value: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => MemberFunctionDeclarationSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberFunctionDeclaration")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withMemberVariableDeclaration(value: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => MemberVariableDeclarationSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberVariableDeclaration")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMethodSignature(value: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => MethodSignatureSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodSignature")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withModuleDeclaration(
      value: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => ModuleDeclarationSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleDeclaration")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withModuleNameModuleReference(value: INameSyntax => ModuleNameModuleReferenceSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleNameModuleReference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObjectCreationExpression(
      value: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => ObjectCreationExpressionSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectCreationExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withObjectLiteralExpression(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectLiteralExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectLiteralExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withObjectType(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectTypeSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOmittedExpression(value: () => OmittedExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omittedExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParameter(
      value: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => ParameterSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withParameterList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ParameterListSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterList")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withParenthesizedArrowFunctionExpression(
      value: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => ParenthesizedArrowFunctionExpressionSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parenthesizedArrowFunctionExpression")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withParenthesizedExpression(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ParenthesizedExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parenthesizedExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPostfixUnaryExpression(value: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => PostfixUnaryExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfixUnaryExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPrefixUnaryExpression(value: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => PrefixUnaryExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixUnaryExpression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPropertySignature(value: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => PropertySignatureSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertySignature")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQualifiedName(value: (INameSyntax, ISyntaxToken, ISyntaxToken) => QualifiedNameSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiedName")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReturnStatement(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ReturnStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnStatement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetAccessor(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => SetAccessorSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccessor")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSimpleArrowFunctionExpression(
      value: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => SimpleArrowFunctionExpressionSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleArrowFunctionExpression")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSimplePropertyAssignment(value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => SimplePropertyAssignmentSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplePropertyAssignment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSourceUnit(value: (ISyntaxList, ISyntaxToken) => SourceUnitSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUnit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSwitchStatement(
      value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => SwitchStatementSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchStatement")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withThrowStatement(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ThrowStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwStatement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTryStatement(value: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => TryStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryStatement")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: (ISyntaxToken, ITypeSyntax) => TypeAnnotationSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTypeArgumentList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeArgumentListSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArgumentList")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTypeOfExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => TypeOfExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOfExpression")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTypeParameter(value: (ISyntaxToken, ConstraintSyntax) => TypeParameterSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTypeParameterList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeParameterListSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameterList")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTypeQuery(value: (ISyntaxToken, INameSyntax) => TypeQuerySyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVariableDeclaration(value: (ISyntaxToken, ISeparatedSyntaxList) => VariableDeclarationSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableDeclaration")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVariableDeclarator(value: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => VariableDeclaratorSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableDeclarator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withVariableStatement(value: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => VariableStatementSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableStatement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withVoidExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => VoidExpressionSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidExpression")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWhileStatement(
      value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WhileStatementSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whileStatement")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withWithStatement(
      value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WithStatementSyntax
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withStatement")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

