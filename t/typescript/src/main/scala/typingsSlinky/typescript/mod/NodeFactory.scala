package typingsSlinky.typescript.mod

import typingsSlinky.typescript.anon.ExpressionWithTypeArgumen
import typingsSlinky.typescript.mod.SyntaxKind.ExtendsKeyword
import typingsSlinky.typescript.mod.SyntaxKind.FalseKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ImplementsKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ImportKeyword
import typingsSlinky.typescript.mod.SyntaxKind.KeyOfKeyword
import typingsSlinky.typescript.mod.SyntaxKind.NewKeyword
import typingsSlinky.typescript.mod.SyntaxKind.NullKeyword
import typingsSlinky.typescript.mod.SyntaxKind.SuperKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ThisKeyword
import typingsSlinky.typescript.mod.SyntaxKind.TrueKeyword
import typingsSlinky.typescript.mod.SyntaxKind.UniqueKeyword
import typingsSlinky.typescript.mod.SyntaxKind.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeFactory extends StObject {
  
  def createAdd(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createArrayBindingPattern(elements: js.Array[ArrayBindingElement]): ArrayBindingPattern = js.native
  
  def createArrayLiteralExpression(): ArrayLiteralExpression = js.native
  def createArrayLiteralExpression(elements: js.UndefOr[scala.Nothing], multiLine: Boolean): ArrayLiteralExpression = js.native
  def createArrayLiteralExpression(elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  def createArrayLiteralExpression(elements: js.Array[Expression], multiLine: Boolean): ArrayLiteralExpression = js.native
  
  def createArrayTypeNode(elementType: TypeNode): ArrayTypeNode = js.native
  
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
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  
  def createAsExpression(expression: Expression, `type`: TypeNode): AsExpression = js.native
  
  def createAssignment(left: ArrayLiteralExpression, right: Expression): DestructuringAssignment = js.native
  def createAssignment(left: Expression, right: Expression): AssignmentExpression[EqualsToken] = js.native
  def createAssignment(left: ObjectLiteralExpression, right: Expression): DestructuringAssignment = js.native
  
  def createAwaitExpression(expression: Expression): AwaitExpression = js.native
  
  def createBigIntLiteral(value: java.lang.String): BigIntLiteral = js.native
  def createBigIntLiteral(value: PseudoBigInt): BigIntLiteral = js.native
  
  def createBinaryExpression(left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression = js.native
  def createBinaryExpression(left: Expression, operator: BinaryOperator, right: Expression): BinaryExpression = js.native
  
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName
  ): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: java.lang.String, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: java.lang.String, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: PropertyName, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: PropertyName,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: PropertyName, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: js.UndefOr[scala.Nothing], name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: js.UndefOr[scala.Nothing], name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: java.lang.String, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: java.lang.String, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: java.lang.String,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: PropertyName, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: PropertyName, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  
  def createBitwiseAnd(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createBitwiseNot(operand: Expression): PrefixUnaryExpression = js.native
  
  def createBitwiseOr(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createBitwiseXor(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createBlock(statements: js.Array[Statement]): Block = js.native
  def createBlock(statements: js.Array[Statement], multiLine: Boolean): Block = js.native
  
  def createBreakStatement(): BreakStatement = js.native
  def createBreakStatement(label: java.lang.String): BreakStatement = js.native
  def createBreakStatement(label: Identifier): BreakStatement = js.native
  
  def createBundle(sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def createBundle(sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
  
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
  
  def createCallExpression(expression: Expression): CallExpression = js.native
  def createCallExpression(
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def createCallExpression(expression: Expression, typeArguments: js.Array[TypeNode]): CallExpression = js.native
  def createCallExpression(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): CallExpression = js.native
  
  def createCallSignature(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  def createCallSignature(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  
  def createCaseBlock(clauses: js.Array[CaseOrDefaultClause]): CaseBlock = js.native
  
  def createCaseClause(expression: Expression, statements: js.Array[Statement]): CaseClause = js.native
  
  def createCatchClause(variableDeclaration: js.UndefOr[scala.Nothing], block: Block): CatchClause = js.native
  def createCatchClause(variableDeclaration: java.lang.String, block: Block): CatchClause = js.native
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
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
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  
  def createComma(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createCommaListExpression(elements: js.Array[Expression]): CommaListExpression = js.native
  
  def createComputedPropertyName(expression: Expression): ComputedPropertyName = js.native
  
  def createConditionalExpression(
    condition: Expression,
    questionToken: js.UndefOr[scala.Nothing],
    whenTrue: Expression,
    colonToken: js.UndefOr[scala.Nothing],
    whenFalse: Expression
  ): ConditionalExpression = js.native
  def createConditionalExpression(
    condition: Expression,
    questionToken: js.UndefOr[scala.Nothing],
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  def createConditionalExpression(
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: js.UndefOr[scala.Nothing],
    whenFalse: Expression
  ): ConditionalExpression = js.native
  def createConditionalExpression(
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  
  def createConditionalTypeNode(checkType: TypeNode, extendsType: TypeNode, trueType: TypeNode, falseType: TypeNode): ConditionalTypeNode = js.native
  
  def createConstructSignature(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def createConstructSignature(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  
  def createConstructorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
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
  def createConstructorTypeNode(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  
  def createContinueStatement(): ContinueStatement = js.native
  def createContinueStatement(label: java.lang.String): ContinueStatement = js.native
  def createContinueStatement(label: Identifier): ContinueStatement = js.native
  
  def createDebuggerStatement(): DebuggerStatement = js.native
  
  def createDecorator(expression: Expression): Decorator = js.native
  
  def createDefaultClause(statements: js.Array[Statement]): DefaultClause = js.native
  
  def createDeleteExpression(expression: Expression): DeleteExpression = js.native
  
  def createDivide(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createDoStatement(statement: Statement, expression: Expression): DoStatement = js.native
  
  def createElementAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], index: Double): ElementAccessChain = js.native
  def createElementAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], index: Expression): ElementAccessChain = js.native
  def createElementAccessChain(expression: Expression, questionDotToken: QuestionDotToken, index: Double): ElementAccessChain = js.native
  def createElementAccessChain(expression: Expression, questionDotToken: QuestionDotToken, index: Expression): ElementAccessChain = js.native
  
  def createElementAccessExpression(expression: Expression, index: Double): ElementAccessExpression = js.native
  def createElementAccessExpression(expression: Expression, index: Expression): ElementAccessExpression = js.native
  
  def createEmptyStatement(): EmptyStatement = js.native
  
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
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
    name: java.lang.String,
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
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  
  def createEnumMember(name: java.lang.String): EnumMember = js.native
  def createEnumMember(name: java.lang.String, initializer: Expression): EnumMember = js.native
  def createEnumMember(name: PropertyName): EnumMember = js.native
  def createEnumMember(name: PropertyName, initializer: Expression): EnumMember = js.native
  
  def createEquality(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createExponent(left: Expression, right: Expression): BinaryExpression = js.native
  
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
  def createExportAssignment(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isExportEquals: Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  
  def createExportDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.UndefOr[scala.Nothing], isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.Array[Modifier], isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[Decorator], modifiers: js.UndefOr[scala.Nothing], isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  
  def createExportDefault(expression: Expression): ExportAssignment = js.native
  
  def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: java.lang.String, name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: java.lang.String, name: Identifier): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: Identifier, name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
  
  def createExpressionStatement(expression: Expression): ExpressionStatement = js.native
  
  def createExpressionWithTypeArguments(expression: Expression): ExpressionWithTypeArguments = js.native
  def createExpressionWithTypeArguments(expression: Expression, typeArguments: js.Array[TypeNode]): ExpressionWithTypeArguments = js.native
  
  def createExternalModuleExport(exportName: Identifier): ExportDeclaration = js.native
  
  def createExternalModuleReference(expression: Expression): ExternalModuleReference = js.native
  
  def createFalse(): FalseLiteral = js.native
  
  def createForInStatement(initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
  
  def createForOfStatement(
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def createForOfStatement(
    awaitModifier: AwaitKeyword,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  
  def createForStatement(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def createForStatement(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def createForStatement(
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def createForStatement(
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def createForStatement(
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def createForStatement(
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def createForStatement(
    initializer: ForInitializer,
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def createForStatement(initializer: ForInitializer, condition: Expression, incrementor: Expression, statement: Statement): ForStatement = js.native
  
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): FunctionDeclaration = js.native
  
  def createFunctionExpression(
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
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
  def createFunctionTypeNode(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  
  def createGreaterThan(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createGreaterThanEquals(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createHeritageClause(token: ExtendsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  def createHeritageClause(token: ImplementsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  
  def createIdentifier(text: java.lang.String): Identifier = js.native
  
  def createIfStatement(expression: Expression, thenStatement: Statement): IfStatement = js.native
  def createIfStatement(expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
  
  def createImmediatelyInvokedArrowFunction(statements: js.Array[Statement]): CallExpression = js.native
  def createImmediatelyInvokedArrowFunction(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
  
  def createImmediatelyInvokedFunctionExpression(statements: js.Array[Statement]): CallExpression = js.native
  def createImmediatelyInvokedFunctionExpression(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
  
  def createImportClause(isTypeOnly: Boolean): ImportClause = js.native
  def createImportClause(isTypeOnly: Boolean, name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings): ImportClause = js.native
  def createImportClause(isTypeOnly: Boolean, name: Identifier): ImportClause = js.native
  def createImportClause(isTypeOnly: Boolean, name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  
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
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
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
    name: java.lang.String,
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
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  
  def createImportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
  def createImportSpecifier(propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
  
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
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    qualifier: EntityName,
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode], isTypeOf: Boolean): ImportTypeNode = js.native
  
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
  def createIndexSignature(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  
  def createIndexedAccessTypeNode(objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode = js.native
  
  def createInequality(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createInferTypeNode(typeParameter: TypeParameterDeclaration): InferTypeNode = js.native
  
  def createInterfaceDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
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
  
  def createIntersectionTypeNode(types: js.Array[TypeNode]): IntersectionTypeNode = js.native
  
  def createJSDocAllType(): JSDocAllType = js.native
  
  def createJSDocAugmentsTag(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def createJSDocAugmentsTag(
    tagName: js.UndefOr[scala.Nothing],
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocAugmentsTag = js.native
  def createJSDocAugmentsTag(tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def createJSDocAugmentsTag(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: java.lang.String): JSDocAugmentsTag = js.native
  
  def createJSDocAuthorTag(): JSDocAuthorTag = js.native
  def createJSDocAuthorTag(tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocAuthorTag = js.native
  def createJSDocAuthorTag(tagName: Identifier): JSDocAuthorTag = js.native
  def createJSDocAuthorTag(tagName: Identifier, comment: java.lang.String): JSDocAuthorTag = js.native
  
  def createJSDocCallbackTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature, fullName: JSDocNamespaceDeclaration): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  
  def createJSDocClassTag(): JSDocClassTag = js.native
  def createJSDocClassTag(tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocClassTag = js.native
  def createJSDocClassTag(tagName: Identifier): JSDocClassTag = js.native
  def createJSDocClassTag(tagName: Identifier, comment: java.lang.String): JSDocClassTag = js.native
  
  def createJSDocComment(): JSDoc = js.native
  def createJSDocComment(comment: js.UndefOr[scala.Nothing], tags: js.Array[JSDocTag]): JSDoc = js.native
  def createJSDocComment(comment: java.lang.String): JSDoc = js.native
  def createJSDocComment(comment: java.lang.String, tags: js.Array[JSDocTag]): JSDoc = js.native
  
  def createJSDocDeprecatedTag(tagName: Identifier): JSDocDeprecatedTag = js.native
  def createJSDocDeprecatedTag(tagName: Identifier, comment: java.lang.String): JSDocDeprecatedTag = js.native
  
  def createJSDocEnumTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def createJSDocEnumTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocEnumTag = js.native
  def createJSDocEnumTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def createJSDocEnumTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocEnumTag = js.native
  
  def createJSDocFunctionType(parameters: js.Array[ParameterDeclaration]): JSDocFunctionType = js.native
  def createJSDocFunctionType(parameters: js.Array[ParameterDeclaration], `type`: TypeNode): JSDocFunctionType = js.native
  
  def createJSDocImplementsTag(tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def createJSDocImplementsTag(
    tagName: js.UndefOr[scala.Nothing],
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocImplementsTag = js.native
  def createJSDocImplementsTag(tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def createJSDocImplementsTag(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: java.lang.String): JSDocImplementsTag = js.native
  
  def createJSDocNameReference(name: EntityName): JSDocNameReference = js.native
  
  def createJSDocNamepathType(`type`: TypeNode): JSDocNamepathType = js.native
  
  def createJSDocNonNullableType(`type`: TypeNode): JSDocNonNullableType = js.native
  
  def createJSDocNullableType(`type`: TypeNode): JSDocNullableType = js.native
  
  def createJSDocOptionalType(`type`: TypeNode): JSDocOptionalType = js.native
  
  def createJSDocParameterTag(tagName: js.UndefOr[scala.Nothing], name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: js.UndefOr[scala.Nothing],
    comment: java.lang.String
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
    comment: java.lang.String
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
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(tagName: Identifier, name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: js.UndefOr[scala.Nothing],
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(tagName: Identifier, name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: js.UndefOr[scala.Nothing],
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  
  def createJSDocPrivateTag(): JSDocPrivateTag = js.native
  def createJSDocPrivateTag(tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocPrivateTag = js.native
  def createJSDocPrivateTag(tagName: Identifier): JSDocPrivateTag = js.native
  def createJSDocPrivateTag(tagName: Identifier, comment: java.lang.String): JSDocPrivateTag = js.native
  
  def createJSDocPropertyTag(tagName: js.UndefOr[scala.Nothing], name: EntityName, isBracketed: Boolean): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: js.UndefOr[scala.Nothing],
    comment: java.lang.String
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
    comment: java.lang.String
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
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(tagName: Identifier, name: EntityName, isBracketed: Boolean): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: js.UndefOr[scala.Nothing],
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(tagName: Identifier, name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: js.UndefOr[scala.Nothing],
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  
  def createJSDocProtectedTag(): JSDocProtectedTag = js.native
  def createJSDocProtectedTag(tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocProtectedTag = js.native
  def createJSDocProtectedTag(tagName: Identifier): JSDocProtectedTag = js.native
  def createJSDocProtectedTag(tagName: Identifier, comment: java.lang.String): JSDocProtectedTag = js.native
  
  def createJSDocPublicTag(): JSDocPublicTag = js.native
  def createJSDocPublicTag(tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocPublicTag = js.native
  def createJSDocPublicTag(tagName: Identifier): JSDocPublicTag = js.native
  def createJSDocPublicTag(tagName: Identifier, comment: java.lang.String): JSDocPublicTag = js.native
  
  def createJSDocReadonlyTag(): JSDocReadonlyTag = js.native
  def createJSDocReadonlyTag(tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocReadonlyTag = js.native
  def createJSDocReadonlyTag(tagName: Identifier): JSDocReadonlyTag = js.native
  def createJSDocReadonlyTag(tagName: Identifier, comment: java.lang.String): JSDocReadonlyTag = js.native
  
  def createJSDocReturnTag(): JSDocReturnTag = js.native
  def createJSDocReturnTag(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier, typeExpression: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocReturnTag = js.native
  
  def createJSDocSeeTag(): JSDocSeeTag = js.native
  def createJSDocSeeTag(
    tagName: js.UndefOr[scala.Nothing],
    nameExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: js.UndefOr[scala.Nothing], nameExpression: JSDocNameReference): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: js.UndefOr[scala.Nothing], nameExpression: JSDocNameReference, comment: java.lang.String): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier, nameExpression: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier, nameExpression: JSDocNameReference): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier, nameExpression: JSDocNameReference, comment: java.lang.String): JSDocSeeTag = js.native
  
  def createJSDocSignature(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def createJSDocSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  def createJSDocSignature(typeParameters: js.Array[JSDocTemplateTag], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def createJSDocSignature(
    typeParameters: js.Array[JSDocTemplateTag],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  
  def createJSDocTemplateTag(
    tagName: js.UndefOr[scala.Nothing],
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: js.UndefOr[scala.Nothing],
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
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
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  
  def createJSDocThisTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def createJSDocThisTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocThisTag = js.native
  def createJSDocThisTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def createJSDocThisTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocThisTag = js.native
  
  def createJSDocTypeExpression(`type`: TypeNode): JSDocTypeExpression = js.native
  
  def createJSDocTypeLiteral(): JSDocTypeLiteral = js.native
  def createJSDocTypeLiteral(jsDocPropertyTags: js.UndefOr[scala.Nothing], isArrayType: Boolean): JSDocTypeLiteral = js.native
  def createJSDocTypeLiteral(jsDocPropertyTags: js.Array[JSDocPropertyLikeTag]): JSDocTypeLiteral = js.native
  def createJSDocTypeLiteral(jsDocPropertyTags: js.Array[JSDocPropertyLikeTag], isArrayType: Boolean): JSDocTypeLiteral = js.native
  
  def createJSDocTypeTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def createJSDocTypeTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocTypeTag = js.native
  def createJSDocTypeTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def createJSDocTypeTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocTypeTag = js.native
  
  def createJSDocTypedefTag(): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
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
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression, fullName: Identifier): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    fullName: Identifier,
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeLiteral): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeLiteral,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeLiteral, fullName: Identifier): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeLiteral,
    fullName: Identifier,
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: Identifier): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: Identifier, typeExpression: js.UndefOr[scala.Nothing], fullName: Identifier): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: Identifier,
    comment: java.lang.String
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
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeExpression, fullName: Identifier): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeExpression, fullName: JSDocNamespaceDeclaration): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeLiteral): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: Identifier,
    typeExpression: JSDocTypeLiteral,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeLiteral, fullName: Identifier): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: Identifier,
    typeExpression: JSDocTypeLiteral,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(tagName: Identifier, typeExpression: JSDocTypeLiteral, fullName: JSDocNamespaceDeclaration): JSDocTypedefTag = js.native
  def createJSDocTypedefTag(
    tagName: Identifier,
    typeExpression: JSDocTypeLiteral,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  
  def createJSDocUnknownTag(tagName: Identifier): JSDocUnknownTag = js.native
  def createJSDocUnknownTag(tagName: Identifier, comment: java.lang.String): JSDocUnknownTag = js.native
  
  def createJSDocUnknownType(): JSDocUnknownType = js.native
  
  def createJSDocVariadicType(`type`: TypeNode): JSDocVariadicType = js.native
  
  def createJsxAttribute(name: Identifier): JsxAttribute = js.native
  def createJsxAttribute(name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
  def createJsxAttribute(name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
  
  def createJsxAttributes(properties: js.Array[JsxAttributeLike]): JsxAttributes = js.native
  
  def createJsxClosingElement(tagName: JsxTagNameExpression): JsxClosingElement = js.native
  
  def createJsxElement(openingElement: JsxOpeningElement, children: js.Array[JsxChild], closingElement: JsxClosingElement): JsxElement = js.native
  
  def createJsxExpression(): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: js.UndefOr[scala.Nothing], expression: Expression): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: DotDotDotToken): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: DotDotDotToken, expression: Expression): JsxExpression = js.native
  
  def createJsxFragment(
    openingFragment: JsxOpeningFragment,
    children: js.Array[JsxChild],
    closingFragment: JsxClosingFragment
  ): JsxFragment = js.native
  
  def createJsxJsxClosingFragment(): JsxClosingFragment = js.native
  
  def createJsxOpeningElement(tagName: JsxTagNameExpression, typeArguments: js.UndefOr[scala.Nothing], attributes: JsxAttributes): JsxOpeningElement = js.native
  def createJsxOpeningElement(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxOpeningElement = js.native
  
  def createJsxOpeningFragment(): JsxOpeningFragment = js.native
  
  def createJsxSelfClosingElement(tagName: JsxTagNameExpression, typeArguments: js.UndefOr[scala.Nothing], attributes: JsxAttributes): JsxSelfClosingElement = js.native
  def createJsxSelfClosingElement(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxSelfClosingElement = js.native
  
  def createJsxSpreadAttribute(expression: Expression): JsxSpreadAttribute = js.native
  
  def createJsxText(text: java.lang.String): JsxText = js.native
  def createJsxText(text: java.lang.String, containsOnlyTriviaWhiteSpaces: Boolean): JsxText = js.native
  
  def createKeywordTypeNode[TKind /* <: KeywordTypeSyntaxKind */](kind: TKind): KeywordTypeNode[TKind] = js.native
  
  def createLabeledStatement(label: java.lang.String, statement: Statement): LabeledStatement = js.native
  def createLabeledStatement(label: Identifier, statement: Statement): LabeledStatement = js.native
  
  def createLeftShift(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createLessThan(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createLessThanEquals(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createLiteralTypeNode(literal: BooleanLiteral): LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: LiteralExpression): LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: NullLiteral): LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: PrefixUnaryExpression): LiteralTypeNode = js.native
  
  def createLogicalAnd(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createLogicalNot(operand: Expression): PrefixUnaryExpression = js.native
  
  def createLogicalOr(left: Expression, right: Expression): BinaryExpression = js.native
  
  /** Create a unique temporary variable for use in a loop. */
  def createLoopVariable(): Identifier = js.native
  
  def createMappedTypeNode(
    readonlyToken: js.UndefOr[ReadonlyKeyword | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    nameType: js.UndefOr[TypeNode],
    questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken],
    `type`: js.UndefOr[TypeNode]
  ): MappedTypeNode = js.native
  
  def createMetaProperty(keywordToken: ImportKeyword, name: Identifier): MetaProperty = js.native
  def createMetaProperty(keywordToken: NewKeyword, name: Identifier): MetaProperty = js.native
  
  def createMethodDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: java.lang.String | PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
  
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  
  def createModifier[T /* <: ModifierSyntaxKind */](kind: T): ModifierToken[T] = js.native
  
  def createModifiersFromModifierFlags(flags: ModifierFlags): js.Array[Modifier] = js.native
  
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
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: ModuleBody,
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
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody,
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
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  
  def createModulo(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createMultiply(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createNamedExports(elements: js.Array[ExportSpecifier]): NamedExports = js.native
  
  def createNamedImports(elements: js.Array[ImportSpecifier]): NamedImports = js.native
  
  def createNamedTupleMember(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: Identifier,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def createNamedTupleMember(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: Identifier,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def createNamedTupleMember(
    dotDotDotToken: DotDotDotToken,
    name: Identifier,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def createNamedTupleMember(dotDotDotToken: DotDotDotToken, name: Identifier, questionToken: QuestionToken, `type`: TypeNode): NamedTupleMember = js.native
  
  def createNamespaceExport(name: Identifier): NamespaceExport = js.native
  
  def createNamespaceExportDeclaration(name: java.lang.String): NamespaceExportDeclaration = js.native
  def createNamespaceExportDeclaration(name: Identifier): NamespaceExportDeclaration = js.native
  
  def createNamespaceImport(name: Identifier): NamespaceImport = js.native
  
  def createNewExpression(expression: Expression): NewExpression = js.native
  def createNewExpression(
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def createNewExpression(expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def createNewExpression(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): NewExpression = js.native
  
  def createNoSubstitutionTemplateLiteral(text: js.UndefOr[scala.Nothing], rawText: java.lang.String): NoSubstitutionTemplateLiteral = js.native
  def createNoSubstitutionTemplateLiteral(text: java.lang.String): NoSubstitutionTemplateLiteral = js.native
  def createNoSubstitutionTemplateLiteral(text: java.lang.String, rawText: java.lang.String): NoSubstitutionTemplateLiteral = js.native
  
  def createNodeArray[T /* <: Node */](): NodeArray[T] = js.native
  def createNodeArray[T /* <: Node */](elements: js.UndefOr[scala.Nothing], hasTrailingComma: Boolean): NodeArray[T] = js.native
  def createNodeArray[T /* <: Node */](elements: js.Array[T]): NodeArray[T] = js.native
  def createNodeArray[T /* <: Node */](elements: js.Array[T], hasTrailingComma: Boolean): NodeArray[T] = js.native
  
  def createNonNullChain(expression: Expression): NonNullChain = js.native
  
  def createNonNullExpression(expression: Expression): NonNullExpression = js.native
  
  def createNotEmittedStatement(original: Node): NotEmittedStatement = js.native
  
  def createNull(): NullLiteral = js.native
  
  def createNumericLiteral(value: java.lang.String): NumericLiteral = js.native
  def createNumericLiteral(value: java.lang.String, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
  def createNumericLiteral(value: Double): NumericLiteral = js.native
  def createNumericLiteral(value: Double, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
  
  def createObjectBindingPattern(elements: js.Array[BindingElement]): ObjectBindingPattern = js.native
  
  def createObjectLiteralExpression(): ObjectLiteralExpression = js.native
  def createObjectLiteralExpression(properties: js.UndefOr[scala.Nothing], multiLine: Boolean): ObjectLiteralExpression = js.native
  def createObjectLiteralExpression(properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
  def createObjectLiteralExpression(properties: js.Array[ObjectLiteralElementLike], multiLine: Boolean): ObjectLiteralExpression = js.native
  
  def createOmittedExpression(): OmittedExpression = js.native
  
  def createOptionalTypeNode(`type`: TypeNode): OptionalTypeNode = js.native
  
  def createParameterDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
  
  def createParenthesizedExpression(expression: Expression): ParenthesizedExpression = js.native
  
  def createParenthesizedType(`type`: TypeNode): ParenthesizedTypeNode = js.native
  
  def createPartiallyEmittedExpression(expression: Expression): PartiallyEmittedExpression = js.native
  def createPartiallyEmittedExpression(expression: Expression, original: Node): PartiallyEmittedExpression = js.native
  
  def createPostfixDecrement(operand: Expression): PostfixUnaryExpression = js.native
  
  def createPostfixIncrement(operand: Expression): PostfixUnaryExpression = js.native
  
  def createPostfixUnaryExpression(operand: Expression, operator: PostfixUnaryOperator): PostfixUnaryExpression = js.native
  
  def createPrefixDecrement(operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrefixIncrement(operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrefixMinus(operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrefixPlus(operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrefixUnaryExpression(operator: PrefixUnaryOperator, operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrivateIdentifier(text: java.lang.String): PrivateIdentifier = js.native
  
  def createPropertyAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: java.lang.String): PropertyAccessChain = js.native
  def createPropertyAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: Identifier): PropertyAccessChain = js.native
  def createPropertyAccessChain(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: PrivateIdentifier): PropertyAccessChain = js.native
  def createPropertyAccessChain(expression: Expression, questionDotToken: QuestionDotToken, name: java.lang.String): PropertyAccessChain = js.native
  def createPropertyAccessChain(expression: Expression, questionDotToken: QuestionDotToken, name: Identifier): PropertyAccessChain = js.native
  def createPropertyAccessChain(expression: Expression, questionDotToken: QuestionDotToken, name: PrivateIdentifier): PropertyAccessChain = js.native
  
  def createPropertyAccessExpression(expression: Expression, name: java.lang.String): PropertyAccessExpression = js.native
  def createPropertyAccessExpression(expression: Expression, name: Identifier): PropertyAccessExpression = js.native
  def createPropertyAccessExpression(expression: Expression, name: PrivateIdentifier): PropertyAccessExpression = js.native
  
  def createPropertyAssignment(name: java.lang.String, initializer: Expression): PropertyAssignment = js.native
  def createPropertyAssignment(name: PropertyName, initializer: Expression): PropertyAssignment = js.native
  
  def createPropertyDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
  
  def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: java.lang.String): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: java.lang.String, questionToken: QuestionToken): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: PropertyName): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(modifiers: js.UndefOr[scala.Nothing], name: PropertyName, questionToken: QuestionToken): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: java.lang.String): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: java.lang.String, questionToken: QuestionToken): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName, questionToken: QuestionToken): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName, questionToken: QuestionToken, `type`: TypeNode): PropertySignature = js.native
  
  def createQualifiedName(left: EntityName, right: java.lang.String): QualifiedName = js.native
  def createQualifiedName(left: EntityName, right: Identifier): QualifiedName = js.native
  
  def createRegularExpressionLiteral(text: java.lang.String): RegularExpressionLiteral = js.native
  
  def createRestTypeNode(`type`: TypeNode): RestTypeNode = js.native
  
  def createReturnStatement(): ReturnStatement = js.native
  def createReturnStatement(expression: Expression): ReturnStatement = js.native
  
  def createRightShift(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createSemicolonClassElement(): SemicolonClassElement = js.native
  
  def createSetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  
  def createShorthandPropertyAssignment(name: java.lang.String): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: java.lang.String, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: Identifier): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  
  def createSourceFile(statements: js.Array[Statement], endOfFileToken: EndOfFileToken, flags: NodeFlags): SourceFile = js.native
  
  def createSpreadAssignment(expression: Expression): SpreadAssignment = js.native
  
  def createSpreadElement(expression: Expression): SpreadElement = js.native
  
  def createStrictEquality(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createStrictInequality(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createStringLiteral(text: java.lang.String): StringLiteral = js.native
  def createStringLiteral(text: java.lang.String, isSingleQuote: Boolean): StringLiteral = js.native
  
  def createStringLiteralFromNode(sourceNode: PropertyNameLiteral): StringLiteral = js.native
  def createStringLiteralFromNode(sourceNode: PropertyNameLiteral, isSingleQuote: Boolean): StringLiteral = js.native
  
  def createSubtract(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createSuper(): SuperExpression = js.native
  
  def createSwitchStatement(expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
  
  def createTaggedTemplateExpression(tag: Expression, typeArguments: js.UndefOr[scala.Nothing], template: TemplateLiteral): TaggedTemplateExpression = js.native
  def createTaggedTemplateExpression(tag: Expression, typeArguments: js.Array[TypeNode], template: TemplateLiteral): TaggedTemplateExpression = js.native
  
  /** Create a unique temporary variable. */
  def createTempVariable(): Identifier = js.native
  def createTempVariable(recordTempVariable: js.Function1[/* node */ Identifier, Unit]): Identifier = js.native
  
  def createTemplateExpression(head: TemplateHead, templateSpans: js.Array[TemplateSpan]): TemplateExpression = js.native
  
  def createTemplateHead(text: js.UndefOr[scala.Nothing], rawText: java.lang.String): TemplateHead = js.native
  def createTemplateHead(text: js.UndefOr[scala.Nothing], rawText: java.lang.String, templateFlags: TokenFlags): TemplateHead = js.native
  def createTemplateHead(text: java.lang.String): TemplateHead = js.native
  def createTemplateHead(text: java.lang.String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateHead = js.native
  def createTemplateHead(text: java.lang.String, rawText: java.lang.String): TemplateHead = js.native
  def createTemplateHead(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateHead = js.native
  
  def createTemplateLiteralType(head: TemplateHead, templateSpans: js.Array[TemplateLiteralTypeSpan]): TemplateLiteralTypeNode = js.native
  
  def createTemplateLiteralTypeSpan(`type`: TypeNode, literal: TemplateMiddle): TemplateLiteralTypeSpan = js.native
  def createTemplateLiteralTypeSpan(`type`: TypeNode, literal: TemplateTail): TemplateLiteralTypeSpan = js.native
  
  def createTemplateMiddle(text: js.UndefOr[scala.Nothing], rawText: java.lang.String): TemplateMiddle = js.native
  def createTemplateMiddle(text: js.UndefOr[scala.Nothing], rawText: java.lang.String, templateFlags: TokenFlags): TemplateMiddle = js.native
  def createTemplateMiddle(text: java.lang.String): TemplateMiddle = js.native
  def createTemplateMiddle(text: java.lang.String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateMiddle = js.native
  def createTemplateMiddle(text: java.lang.String, rawText: java.lang.String): TemplateMiddle = js.native
  def createTemplateMiddle(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateMiddle = js.native
  
  def createTemplateSpan(expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def createTemplateSpan(expression: Expression, literal: TemplateTail): TemplateSpan = js.native
  
  def createTemplateTail(text: js.UndefOr[scala.Nothing], rawText: java.lang.String): TemplateTail = js.native
  def createTemplateTail(text: js.UndefOr[scala.Nothing], rawText: java.lang.String, templateFlags: TokenFlags): TemplateTail = js.native
  def createTemplateTail(text: java.lang.String): TemplateTail = js.native
  def createTemplateTail(text: java.lang.String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateTail = js.native
  def createTemplateTail(text: java.lang.String, rawText: java.lang.String): TemplateTail = js.native
  def createTemplateTail(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateTail = js.native
  
  def createThis(): ThisExpression = js.native
  
  def createThisTypeNode(): ThisTypeNode = js.native
  
  def createThrowStatement(expression: Expression): ThrowStatement = js.native
  
  def createToken(token: FalseKeyword): FalseLiteral = js.native
  def createToken(token: NullKeyword): NullLiteral = js.native
  def createToken(token: SuperKeyword): SuperExpression = js.native
  def createToken(token: ThisKeyword): ThisExpression = js.native
  def createToken(token: TrueKeyword): TrueLiteral = js.native
  def createToken[TKind /* <: KeywordTypeSyntaxKind */](token: TKind): KeywordTypeNode[TKind] = js.native
  @JSName("createToken")
  def createToken_TKind_KeywordSyntaxKind_KeywordToken[TKind /* <: KeywordSyntaxKind */](token: TKind): KeywordToken[TKind] = js.native
  @JSName("createToken")
  def createToken_TKind_ModifierSyntaxKind_ModifierToken[TKind /* <: ModifierSyntaxKind */](token: TKind): ModifierToken[TKind] = js.native
  @JSName("createToken")
  def createToken_TKind_PunctuationSyntaxKind_PunctuationToken[TKind /* <: PunctuationSyntaxKind */](token: TKind): PunctuationToken[TKind] = js.native
  @JSName("createToken")
  def createToken_TKind_UnionUnknownEndOfFileToken_Token[TKind /* <: Unknown | typingsSlinky.typescript.mod.SyntaxKind.EndOfFileToken */](token: TKind): Token[TKind] = js.native
  
  def createTrue(): TrueLiteral = js.native
  
  def createTryStatement(tryBlock: Block): TryStatement = js.native
  def createTryStatement(tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
  def createTryStatement(tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def createTryStatement(tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
  
  def createTupleTypeNode(elements: js.Array[TypeNode | NamedTupleMember]): TupleTypeNode = js.native
  
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
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
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
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
  
  def createTypeAssertion(`type`: TypeNode, expression: Expression): TypeAssertion = js.native
  
  def createTypeLiteralNode(): TypeLiteralNode = js.native
  def createTypeLiteralNode(members: js.Array[TypeElement]): TypeLiteralNode = js.native
  
  def createTypeOfExpression(expression: Expression): TypeOfExpression = js.native
  
  def createTypeOperatorNode(operator: KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def createTypeOperatorNode(operator: typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def createTypeOperatorNode(operator: UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  
  def createTypeParameterDeclaration(name: java.lang.String): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  
  def createTypePredicateNode(assertsModifier: js.UndefOr[scala.Nothing], parameterName: java.lang.String): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: js.UndefOr[scala.Nothing], parameterName: java.lang.String, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: java.lang.String): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: java.lang.String, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: Identifier): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: ThisTypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
  
  def createTypeQueryNode(exprName: EntityName): TypeQueryNode = js.native
  
  def createTypeReferenceNode(typeName: java.lang.String): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: java.lang.String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: EntityName): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: EntityName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  
  def createUnionTypeNode(types: js.Array[TypeNode]): UnionTypeNode = js.native
  
  /** Create a unique name based on the supplied text. */
  def createUniqueName(text: java.lang.String): Identifier = js.native
  def createUniqueName(text: java.lang.String, flags: GeneratedIdentifierFlags): Identifier = js.native
  
  def createUnsignedRightShift(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createVariableDeclaration(name: java.lang.String): VariableDeclaration = js.native
  def createVariableDeclaration(
    name: java.lang.String,
    exclamationToken: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: js.UndefOr[scala.Nothing], `type`: TypeNode): VariableDeclaration = js.native
  def createVariableDeclaration(
    name: java.lang.String,
    exclamationToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode,
    initializer: Expression
  ): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: ExclamationToken): VariableDeclaration = js.native
  def createVariableDeclaration(
    name: java.lang.String,
    exclamationToken: ExclamationToken,
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: ExclamationToken, `type`: TypeNode): VariableDeclaration = js.native
  def createVariableDeclaration(
    name: java.lang.String,
    exclamationToken: ExclamationToken,
    `type`: TypeNode,
    initializer: Expression
  ): VariableDeclaration = js.native
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
  
  def createVariableDeclarationList(declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
  def createVariableDeclarationList(declarations: js.Array[VariableDeclaration], flags: NodeFlags): VariableDeclarationList = js.native
  
  def createVariableStatement(modifiers: js.UndefOr[scala.Nothing], declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
  def createVariableStatement(modifiers: js.UndefOr[scala.Nothing], declarationList: VariableDeclarationList): VariableStatement = js.native
  def createVariableStatement(modifiers: js.Array[Modifier], declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
  def createVariableStatement(modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
  
  def createVoidExpression(expression: Expression): VoidExpression = js.native
  
  def createVoidZero(): VoidExpression = js.native
  
  def createWhileStatement(expression: Expression, statement: Statement): WhileStatement = js.native
  
  def createWithStatement(expression: Expression, statement: Statement): WithStatement = js.native
  
  def createYieldExpression(): YieldExpression = js.native
  def createYieldExpression(asteriskToken: js.UndefOr[scala.Nothing], expression: Expression): YieldExpression = js.native
  def createYieldExpression(asteriskToken: AsteriskToken, expression: Expression): YieldExpression = js.native
  
  /** Create a unique name generated for a node. */
  def getGeneratedNameForNode(): Identifier = js.native
  def getGeneratedNameForNode(node: Node): Identifier = js.native
  
  def restoreOuterExpressions(outerExpression: js.UndefOr[scala.Nothing], innerExpression: Expression): Expression = js.native
  def restoreOuterExpressions(
    outerExpression: js.UndefOr[scala.Nothing],
    innerExpression: Expression,
    kinds: OuterExpressionKinds
  ): Expression = js.native
  def restoreOuterExpressions(outerExpression: Expression, innerExpression: Expression): Expression = js.native
  def restoreOuterExpressions(outerExpression: Expression, innerExpression: Expression, kinds: OuterExpressionKinds): Expression = js.native
  
  def updateArrayBindingPattern(node: ArrayBindingPattern, elements: js.Array[ArrayBindingElement]): ArrayBindingPattern = js.native
  
  def updateArrayLiteralExpression(node: ArrayLiteralExpression, elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  
  def updateArrayTypeNode(node: ArrayTypeNode, elementType: TypeNode): ArrayTypeNode = js.native
  
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
    equalsGreaterThanToken: EqualsGreaterThanToken,
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
    equalsGreaterThanToken: EqualsGreaterThanToken,
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
    equalsGreaterThanToken: EqualsGreaterThanToken,
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
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  
  def updateAsExpression(node: AsExpression, expression: Expression, `type`: TypeNode): AsExpression = js.native
  
  def updateAwaitExpression(node: AwaitExpression, expression: Expression): AwaitExpression = js.native
  
  def updateBinaryExpression(node: BinaryExpression, left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression = js.native
  def updateBinaryExpression(node: BinaryExpression, left: Expression, operator: BinaryOperator, right: Expression): BinaryExpression = js.native
  
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
    propertyName: PropertyName,
    name: BindingName
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: PropertyName,
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
    propertyName: PropertyName,
    name: BindingName
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  
  def updateBlock(node: Block, statements: js.Array[Statement]): Block = js.native
  
  def updateBreakStatement(node: BreakStatement): BreakStatement = js.native
  def updateBreakStatement(node: BreakStatement, label: Identifier): BreakStatement = js.native
  
  def updateBundle(node: Bundle, sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def updateBundle(node: Bundle, sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
  
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
  def updateCallChain(
    node: CallChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  
  def updateCallExpression(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def updateCallExpression(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  
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
  
  def updateCaseBlock(node: CaseBlock, clauses: js.Array[CaseOrDefaultClause]): CaseBlock = js.native
  
  def updateCaseClause(node: CaseClause, expression: Expression, statements: js.Array[Statement]): CaseClause = js.native
  
  def updateCatchClause(node: CatchClause, variableDeclaration: js.UndefOr[scala.Nothing], block: Block): CatchClause = js.native
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
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  
  def updateCommaListExpression(node: CommaListExpression, elements: js.Array[Expression]): CommaListExpression = js.native
  
  def updateComputedPropertyName(node: ComputedPropertyName, expression: Expression): ComputedPropertyName = js.native
  
  def updateConditionalExpression(
    node: ConditionalExpression,
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  
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
  
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
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
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  
  def updateContinueStatement(node: ContinueStatement): ContinueStatement = js.native
  def updateContinueStatement(node: ContinueStatement, label: Identifier): ContinueStatement = js.native
  
  def updateDecorator(node: Decorator, expression: Expression): Decorator = js.native
  
  def updateDefaultClause(node: DefaultClause, statements: js.Array[Statement]): DefaultClause = js.native
  
  def updateDeleteExpression(node: DeleteExpression, expression: Expression): DeleteExpression = js.native
  
  def updateDoStatement(node: DoStatement, statement: Statement, expression: Expression): DoStatement = js.native
  
  def updateElementAccessChain(
    node: ElementAccessChain,
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    argumentExpression: Expression
  ): ElementAccessChain = js.native
  def updateElementAccessChain(
    node: ElementAccessChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    argumentExpression: Expression
  ): ElementAccessChain = js.native
  
  def updateElementAccessExpression(node: ElementAccessExpression, expression: Expression, argumentExpression: Expression): ElementAccessExpression = js.native
  
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
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  
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
    isTypeOnly: Boolean
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  
  def updateExportSpecifier(node: ExportSpecifier, propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
  def updateExportSpecifier(node: ExportSpecifier, propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
  
  def updateExpressionStatement(node: ExpressionStatement, expression: Expression): ExpressionStatement = js.native
  
  def updateExpressionWithTypeArguments(node: ExpressionWithTypeArguments, expression: Expression): ExpressionWithTypeArguments = js.native
  def updateExpressionWithTypeArguments(node: ExpressionWithTypeArguments, expression: Expression, typeArguments: js.Array[TypeNode]): ExpressionWithTypeArguments = js.native
  
  def updateExternalModuleReference(node: ExternalModuleReference, expression: Expression): ExternalModuleReference = js.native
  
  def updateForInStatement(node: ForInStatement, initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
  
  def updateForOfStatement(
    node: ForOfStatement,
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def updateForOfStatement(
    node: ForOfStatement,
    awaitModifier: AwaitKeyword,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  
  def updateForStatement(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  
  def updateFunctionDeclaration(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
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
    asteriskToken: AsteriskToken,
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.UndefOr[scala.Nothing],
    asteriskToken: AsteriskToken,
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.UndefOr[scala.Nothing],
    asteriskToken: AsteriskToken,
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.UndefOr[scala.Nothing],
    asteriskToken: AsteriskToken,
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.UndefOr[scala.Nothing],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.UndefOr[scala.Nothing],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.UndefOr[scala.Nothing],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.UndefOr[scala.Nothing],
    asteriskToken: AsteriskToken,
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
    asteriskToken: AsteriskToken,
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
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
  def updateFunctionTypeNode(
    node: FunctionTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  
  def updateHeritageClause(node: HeritageClause, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  
  def updateIfStatement(node: IfStatement, expression: Expression, thenStatement: Statement): IfStatement = js.native
  def updateIfStatement(node: IfStatement, expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
  
  def updateImportClause(node: ImportClause, isTypeOnly: Boolean): ImportClause = js.native
  def updateImportClause(
    node: ImportClause,
    isTypeOnly: Boolean,
    name: js.UndefOr[scala.Nothing],
    namedBindings: NamedImportBindings
  ): ImportClause = js.native
  def updateImportClause(node: ImportClause, isTypeOnly: Boolean, name: Identifier): ImportClause = js.native
  def updateImportClause(node: ImportClause, isTypeOnly: Boolean, name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  
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
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  
  def updateImportSpecifier(node: ImportSpecifier, propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
  def updateImportSpecifier(node: ImportSpecifier, propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
  
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
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: EntityName): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: EntityName,
    typeArguments: js.UndefOr[scala.Nothing],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: EntityName,
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
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  
  def updateIndexedAccessTypeNode(node: IndexedAccessTypeNode, objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode = js.native
  
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
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  
  def updateIntersectionTypeNode(node: IntersectionTypeNode, types: NodeArray[TypeNode]): IntersectionTypeNode = js.native
  
  def updateJSDocAugmentsTag(node: JSDocAugmentsTag, tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def updateJSDocAugmentsTag(
    node: JSDocAugmentsTag,
    tagName: js.UndefOr[scala.Nothing],
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocAugmentsTag = js.native
  def updateJSDocAugmentsTag(node: JSDocAugmentsTag, tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def updateJSDocAugmentsTag(
    node: JSDocAugmentsTag,
    tagName: Identifier,
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocAugmentsTag = js.native
  
  def updateJSDocAuthorTag(node: JSDocAuthorTag): JSDocAuthorTag = js.native
  def updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocAuthorTag = js.native
  def updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: Identifier): JSDocAuthorTag = js.native
  def updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: Identifier, comment: java.lang.String): JSDocAuthorTag = js.native
  
  def updateJSDocCallbackTag(node: JSDocCallbackTag, tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: Identifier
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(node: JSDocCallbackTag, tagName: Identifier, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(node: JSDocCallbackTag, tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  
  def updateJSDocClassTag(node: JSDocClassTag): JSDocClassTag = js.native
  def updateJSDocClassTag(node: JSDocClassTag, tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocClassTag = js.native
  def updateJSDocClassTag(node: JSDocClassTag, tagName: Identifier): JSDocClassTag = js.native
  def updateJSDocClassTag(node: JSDocClassTag, tagName: Identifier, comment: java.lang.String): JSDocClassTag = js.native
  
  def updateJSDocComment(node: JSDoc): JSDoc = js.native
  def updateJSDocComment(node: JSDoc, comment: js.UndefOr[scala.Nothing], tags: js.Array[JSDocTag]): JSDoc = js.native
  def updateJSDocComment(node: JSDoc, comment: java.lang.String): JSDoc = js.native
  def updateJSDocComment(node: JSDoc, comment: java.lang.String, tags: js.Array[JSDocTag]): JSDoc = js.native
  
  def updateJSDocDeprecatedTag(node: JSDocDeprecatedTag, tagName: Identifier): JSDocDeprecatedTag = js.native
  def updateJSDocDeprecatedTag(node: JSDocDeprecatedTag, tagName: Identifier, comment: java.lang.String): JSDocDeprecatedTag = js.native
  
  def updateJSDocEnumTag(node: JSDocEnumTag, tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def updateJSDocEnumTag(
    node: JSDocEnumTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocEnumTag = js.native
  def updateJSDocEnumTag(node: JSDocEnumTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def updateJSDocEnumTag(
    node: JSDocEnumTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocEnumTag = js.native
  
  def updateJSDocFunctionType(node: JSDocFunctionType, parameters: js.Array[ParameterDeclaration]): JSDocFunctionType = js.native
  def updateJSDocFunctionType(node: JSDocFunctionType, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): JSDocFunctionType = js.native
  
  def updateJSDocImplementsTag(node: JSDocImplementsTag, tagName: js.UndefOr[scala.Nothing], className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def updateJSDocImplementsTag(
    node: JSDocImplementsTag,
    tagName: js.UndefOr[scala.Nothing],
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocImplementsTag = js.native
  def updateJSDocImplementsTag(node: JSDocImplementsTag, tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def updateJSDocImplementsTag(
    node: JSDocImplementsTag,
    tagName: Identifier,
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocImplementsTag = js.native
  
  def updateJSDocNameReference(node: JSDocNameReference, name: EntityName): JSDocNameReference = js.native
  
  def updateJSDocNamepathType(node: JSDocNamepathType, `type`: TypeNode): JSDocNamepathType = js.native
  
  def updateJSDocNonNullableType(node: JSDocNonNullableType, `type`: TypeNode): JSDocNonNullableType = js.native
  
  def updateJSDocNullableType(node: JSDocNullableType, `type`: TypeNode): JSDocNullableType = js.native
  
  def updateJSDocOptionalType(node: JSDocOptionalType, `type`: TypeNode): JSDocOptionalType = js.native
  
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  
  def updateJSDocPrivateTag(node: JSDocPrivateTag): JSDocPrivateTag = js.native
  def updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocPrivateTag = js.native
  def updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: Identifier): JSDocPrivateTag = js.native
  def updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: Identifier, comment: java.lang.String): JSDocPrivateTag = js.native
  
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: js.UndefOr[scala.Nothing],
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: js.UndefOr[scala.Nothing],
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  
  def updateJSDocProtectedTag(node: JSDocProtectedTag): JSDocProtectedTag = js.native
  def updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocProtectedTag = js.native
  def updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: Identifier): JSDocProtectedTag = js.native
  def updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: Identifier, comment: java.lang.String): JSDocProtectedTag = js.native
  
  def updateJSDocPublicTag(node: JSDocPublicTag): JSDocPublicTag = js.native
  def updateJSDocPublicTag(node: JSDocPublicTag, tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocPublicTag = js.native
  def updateJSDocPublicTag(node: JSDocPublicTag, tagName: Identifier): JSDocPublicTag = js.native
  def updateJSDocPublicTag(node: JSDocPublicTag, tagName: Identifier, comment: java.lang.String): JSDocPublicTag = js.native
  
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag): JSDocReadonlyTag = js.native
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: js.UndefOr[scala.Nothing], comment: java.lang.String): JSDocReadonlyTag = js.native
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: Identifier): JSDocReadonlyTag = js.native
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: Identifier, comment: java.lang.String): JSDocReadonlyTag = js.native
  
  def updateJSDocReturnTag(node: JSDocReturnTag): JSDocReturnTag = js.native
  def updateJSDocReturnTag(
    node: JSDocReturnTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def updateJSDocReturnTag(
    node: JSDocReturnTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Identifier): JSDocReturnTag = js.native
  def updateJSDocReturnTag(
    node: JSDocReturnTag,
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def updateJSDocReturnTag(
    node: JSDocReturnTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocReturnTag = js.native
  
  def updateJSDocSeeTag(node: JSDocSeeTag): JSDocSeeTag = js.native
  def updateJSDocSeeTag(
    node: JSDocSeeTag,
    tagName: js.UndefOr[scala.Nothing],
    nameExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: js.UndefOr[scala.Nothing], nameExpression: JSDocNameReference): JSDocSeeTag = js.native
  def updateJSDocSeeTag(
    node: JSDocSeeTag,
    tagName: js.UndefOr[scala.Nothing],
    nameExpression: JSDocNameReference,
    comment: java.lang.String
  ): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Identifier): JSDocSeeTag = js.native
  def updateJSDocSeeTag(
    node: JSDocSeeTag,
    tagName: Identifier,
    nameExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Identifier, nameExpression: JSDocNameReference): JSDocSeeTag = js.native
  def updateJSDocSeeTag(
    node: JSDocSeeTag,
    tagName: Identifier,
    nameExpression: JSDocNameReference,
    comment: java.lang.String
  ): JSDocSeeTag = js.native
  
  def updateJSDocSignature(
    node: JSDocSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[JSDocParameterTag]
  ): JSDocSignature = js.native
  def updateJSDocSignature(
    node: JSDocSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  def updateJSDocSignature(
    node: JSDocSignature,
    typeParameters: js.Array[JSDocTemplateTag],
    parameters: js.Array[JSDocParameterTag]
  ): JSDocSignature = js.native
  def updateJSDocSignature(
    node: JSDocSignature,
    typeParameters: js.Array[JSDocTemplateTag],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: js.UndefOr[scala.Nothing],
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: js.UndefOr[scala.Nothing],
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: js.UndefOr[scala.Nothing],
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: js.UndefOr[scala.Nothing],
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  
  def updateJSDocThisTag(node: JSDocThisTag): JSDocThisTag = js.native
  def updateJSDocThisTag(
    node: JSDocThisTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def updateJSDocThisTag(
    node: JSDocThisTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Identifier): JSDocThisTag = js.native
  def updateJSDocThisTag(
    node: JSDocThisTag,
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def updateJSDocThisTag(
    node: JSDocThisTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocThisTag = js.native
  
  def updateJSDocTypeExpression(node: JSDocTypeExpression, `type`: TypeNode): JSDocTypeExpression = js.native
  
  def updateJSDocTypeLiteral(node: JSDocTypeLiteral): JSDocTypeLiteral = js.native
  def updateJSDocTypeLiteral(node: JSDocTypeLiteral, jsDocPropertyTags: js.UndefOr[scala.Nothing], isArrayType: Boolean): JSDocTypeLiteral = js.native
  def updateJSDocTypeLiteral(node: JSDocTypeLiteral, jsDocPropertyTags: js.Array[JSDocPropertyLikeTag]): JSDocTypeLiteral = js.native
  def updateJSDocTypeLiteral(node: JSDocTypeLiteral, jsDocPropertyTags: js.Array[JSDocPropertyLikeTag], isArrayType: Boolean): JSDocTypeLiteral = js.native
  
  def updateJSDocTypeTag(node: JSDocTypeTag, tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def updateJSDocTypeTag(
    node: JSDocTypeTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocTypeTag = js.native
  def updateJSDocTypeTag(node: JSDocTypeTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def updateJSDocTypeTag(
    node: JSDocTypeTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocTypeTag = js.native
  
  def updateJSDocTypedefTag(node: JSDocTypedefTag): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: Identifier
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: JSDocNamespaceDeclaration
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(node: JSDocTypedefTag, tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeExpression): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    fullName: Identifier
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    fullName: JSDocNamespaceDeclaration
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeExpression,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(node: JSDocTypedefTag, tagName: js.UndefOr[scala.Nothing], typeExpression: JSDocTypeLiteral): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeLiteral,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeLiteral,
    fullName: Identifier
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeLiteral,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeLiteral,
    fullName: JSDocNamespaceDeclaration
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[scala.Nothing],
    typeExpression: JSDocTypeLiteral,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(node: JSDocTypedefTag, tagName: Identifier): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: Identifier
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: JSDocNamespaceDeclaration
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: js.UndefOr[scala.Nothing],
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(node: JSDocTypedefTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    fullName: Identifier
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    fullName: JSDocNamespaceDeclaration
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(node: JSDocTypedefTag, tagName: Identifier, typeExpression: JSDocTypeLiteral): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeLiteral,
    fullName: js.UndefOr[scala.Nothing],
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(node: JSDocTypedefTag, tagName: Identifier, typeExpression: JSDocTypeLiteral, fullName: Identifier): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeLiteral,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeLiteral,
    fullName: JSDocNamespaceDeclaration
  ): JSDocTypedefTag = js.native
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: Identifier,
    typeExpression: JSDocTypeLiteral,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocTypedefTag = js.native
  
  def updateJSDocUnknownTag(node: JSDocUnknownTag, tagName: Identifier): JSDocUnknownTag = js.native
  def updateJSDocUnknownTag(node: JSDocUnknownTag, tagName: Identifier, comment: java.lang.String): JSDocUnknownTag = js.native
  
  def updateJSDocVariadicType(node: JSDocVariadicType, `type`: TypeNode): JSDocVariadicType = js.native
  
  def updateJsxAttribute(node: JsxAttribute, name: Identifier): JsxAttribute = js.native
  def updateJsxAttribute(node: JsxAttribute, name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
  def updateJsxAttribute(node: JsxAttribute, name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
  
  def updateJsxAttributes(node: JsxAttributes, properties: js.Array[JsxAttributeLike]): JsxAttributes = js.native
  
  def updateJsxClosingElement(node: JsxClosingElement, tagName: JsxTagNameExpression): JsxClosingElement = js.native
  
  def updateJsxElement(
    node: JsxElement,
    openingElement: JsxOpeningElement,
    children: js.Array[JsxChild],
    closingElement: JsxClosingElement
  ): JsxElement = js.native
  
  def updateJsxExpression(node: JsxExpression): JsxExpression = js.native
  def updateJsxExpression(node: JsxExpression, expression: Expression): JsxExpression = js.native
  
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
  def updateJsxSelfClosingElement(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
  
  def updateJsxSpreadAttribute(node: JsxSpreadAttribute, expression: Expression): JsxSpreadAttribute = js.native
  
  def updateJsxText(node: JsxText, text: java.lang.String): JsxText = js.native
  def updateJsxText(node: JsxText, text: java.lang.String, containsOnlyTriviaWhiteSpaces: Boolean): JsxText = js.native
  
  def updateLabeledStatement(node: LabeledStatement, label: Identifier, statement: Statement): LabeledStatement = js.native
  
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: BooleanLiteral): LiteralTypeNode = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: LiteralExpression): LiteralTypeNode = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: NullLiteral): LiteralTypeNode = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: PrefixUnaryExpression): LiteralTypeNode = js.native
  
  def updateMappedTypeNode(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyKeyword | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    nameType: js.UndefOr[TypeNode],
    questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken],
    `type`: js.UndefOr[TypeNode]
  ): MappedTypeNode = js.native
  
  def updateMetaProperty(node: MetaProperty, name: Identifier): MetaProperty = js.native
  
  def updateMethodDeclaration(
    node: MethodDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
  
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  
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
    body: ModuleBody
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
    body: ModuleBody
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
    body: ModuleBody
  ): ModuleDeclaration = js.native
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
    body: ModuleBody
  ): ModuleDeclaration = js.native
  
  def updateNamedExports(node: NamedExports, elements: js.Array[ExportSpecifier]): NamedExports = js.native
  
  def updateNamedImports(node: NamedImports, elements: js.Array[ImportSpecifier]): NamedImports = js.native
  
  def updateNamedTupleMember(
    node: NamedTupleMember,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: Identifier,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def updateNamedTupleMember(
    node: NamedTupleMember,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: Identifier,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def updateNamedTupleMember(
    node: NamedTupleMember,
    dotDotDotToken: DotDotDotToken,
    name: Identifier,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def updateNamedTupleMember(
    node: NamedTupleMember,
    dotDotDotToken: DotDotDotToken,
    name: Identifier,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): NamedTupleMember = js.native
  
  def updateNamespaceExport(node: NamespaceExport, name: Identifier): NamespaceExport = js.native
  
  def updateNamespaceExportDeclaration(node: NamespaceExportDeclaration, name: Identifier): NamespaceExportDeclaration = js.native
  
  def updateNamespaceImport(node: NamespaceImport, name: Identifier): NamespaceImport = js.native
  
  def updateNewExpression(node: NewExpression, expression: Expression): NewExpression = js.native
  def updateNewExpression(
    node: NewExpression,
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def updateNewExpression(node: NewExpression, expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def updateNewExpression(
    node: NewExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  
  def updateNonNullChain(node: NonNullChain, expression: Expression): NonNullChain = js.native
  
  def updateNonNullExpression(node: NonNullExpression, expression: Expression): NonNullExpression = js.native
  
  def updateObjectBindingPattern(node: ObjectBindingPattern, elements: js.Array[BindingElement]): ObjectBindingPattern = js.native
  
  def updateObjectLiteralExpression(node: ObjectLiteralExpression, properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
  
  def updateOptionalTypeNode(node: OptionalTypeNode, `type`: TypeNode): OptionalTypeNode = js.native
  
  def updateParameterDeclaration(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
  
  def updateParenthesizedExpression(node: ParenthesizedExpression, expression: Expression): ParenthesizedExpression = js.native
  
  def updateParenthesizedType(node: ParenthesizedTypeNode, `type`: TypeNode): ParenthesizedTypeNode = js.native
  
  def updatePartiallyEmittedExpression(node: PartiallyEmittedExpression, expression: Expression): PartiallyEmittedExpression = js.native
  
  def updatePostfixUnaryExpression(node: PostfixUnaryExpression, operand: Expression): PostfixUnaryExpression = js.native
  
  def updatePrefixUnaryExpression(node: PrefixUnaryExpression, operand: Expression): PrefixUnaryExpression = js.native
  
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
  
  def updatePropertyAccessExpression(node: PropertyAccessExpression, expression: Expression, name: Identifier): PropertyAccessExpression = js.native
  def updatePropertyAccessExpression(node: PropertyAccessExpression, expression: Expression, name: PrivateIdentifier): PropertyAccessExpression = js.native
  
  def updatePropertyAssignment(node: PropertyAssignment, name: PropertyName, initializer: Expression): PropertyAssignment = js.native
  
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
  
  def updatePropertySignature(node: PropertySignature, modifiers: js.UndefOr[scala.Nothing], name: PropertyName): PropertySignature = js.native
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
    questionToken: QuestionToken
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def updatePropertySignature(node: PropertySignature, modifiers: js.Array[Modifier], name: PropertyName): PropertySignature = js.native
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
    questionToken: QuestionToken
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  
  def updateQualifiedName(node: QualifiedName, left: EntityName, right: Identifier): QualifiedName = js.native
  
  def updateRestTypeNode(node: RestTypeNode, `type`: TypeNode): RestTypeNode = js.native
  
  def updateReturnStatement(node: ReturnStatement): ReturnStatement = js.native
  def updateReturnStatement(node: ReturnStatement, expression: Expression): ReturnStatement = js.native
  
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  
  def updateShorthandPropertyAssignment(node: ShorthandPropertyAssignment, name: Identifier): ShorthandPropertyAssignment = js.native
  def updateShorthandPropertyAssignment(node: ShorthandPropertyAssignment, name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  
  def updateSourceFile(node: SourceFile, statements: js.Array[Statement]): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: js.UndefOr[scala.Nothing],
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: js.UndefOr[scala.Nothing],
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.Array[FileReference],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: js.UndefOr[scala.Nothing],
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.Array[FileReference],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.Array[FileReference],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: js.UndefOr[scala.Nothing],
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: js.UndefOr[scala.Nothing],
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(node: SourceFile, statements: js.Array[Statement], isDeclarationFile: Boolean): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: js.UndefOr[scala.Nothing],
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: js.UndefOr[scala.Nothing],
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.UndefOr[scala.Nothing],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: js.UndefOr[scala.Nothing],
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.UndefOr[scala.Nothing],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: js.UndefOr[scala.Nothing],
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  
  def updateSpreadAssignment(node: SpreadAssignment, expression: Expression): SpreadAssignment = js.native
  
  def updateSpreadElement(node: SpreadElement, expression: Expression): SpreadElement = js.native
  
  def updateSwitchStatement(node: SwitchStatement, expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
  
  def updateTaggedTemplateExpression(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
  def updateTaggedTemplateExpression(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.Array[TypeNode],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
  
  def updateTemplateExpression(node: TemplateExpression, head: TemplateHead, templateSpans: js.Array[TemplateSpan]): TemplateExpression = js.native
  
  def updateTemplateLiteralType(
    node: TemplateLiteralTypeNode,
    head: TemplateHead,
    templateSpans: js.Array[TemplateLiteralTypeSpan]
  ): TemplateLiteralTypeNode = js.native
  
  def updateTemplateLiteralTypeSpan(node: TemplateLiteralTypeSpan, `type`: TypeNode, literal: TemplateMiddle): TemplateLiteralTypeSpan = js.native
  def updateTemplateLiteralTypeSpan(node: TemplateLiteralTypeSpan, `type`: TypeNode, literal: TemplateTail): TemplateLiteralTypeSpan = js.native
  
  def updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateTail): TemplateSpan = js.native
  
  def updateThrowStatement(node: ThrowStatement, expression: Expression): ThrowStatement = js.native
  
  def updateTryStatement(node: TryStatement, tryBlock: Block): TryStatement = js.native
  def updateTryStatement(node: TryStatement, tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
  def updateTryStatement(node: TryStatement, tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def updateTryStatement(node: TryStatement, tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
  
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
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  
  def updateTypeAssertion(node: TypeAssertion, `type`: TypeNode, expression: Expression): TypeAssertion = js.native
  
  def updateTypeLiteralNode(node: TypeLiteralNode, members: NodeArray[TypeElement]): TypeLiteralNode = js.native
  
  def updateTypeOfExpression(node: TypeOfExpression, expression: Expression): TypeOfExpression = js.native
  
  def updateTypeOperatorNode(node: TypeOperatorNode, `type`: TypeNode): TypeOperatorNode = js.native
  
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: TypeParameterDeclaration,
    name: Identifier,
    constraint: js.UndefOr[scala.Nothing],
    defaultType: TypeNode
  ): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier): TypePredicateNode = js.native
  def updateTypePredicateNode(
    node: TypePredicateNode,
    assertsModifier: js.UndefOr[scala.Nothing],
    parameterName: Identifier,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode): TypePredicateNode = js.native
  def updateTypePredicateNode(
    node: TypePredicateNode,
    assertsModifier: js.UndefOr[scala.Nothing],
    parameterName: ThisTypeNode,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: AssertsKeyword, parameterName: Identifier): TypePredicateNode = js.native
  def updateTypePredicateNode(
    node: TypePredicateNode,
    assertsModifier: AssertsKeyword,
    parameterName: Identifier,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: AssertsKeyword, parameterName: ThisTypeNode): TypePredicateNode = js.native
  def updateTypePredicateNode(
    node: TypePredicateNode,
    assertsModifier: AssertsKeyword,
    parameterName: ThisTypeNode,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  
  def updateTypeQueryNode(node: TypeQueryNode, exprName: EntityName): TypeQueryNode = js.native
  
  def updateTypeReferenceNode(node: TypeReferenceNode, typeName: EntityName): TypeReferenceNode = js.native
  def updateTypeReferenceNode(node: TypeReferenceNode, typeName: EntityName, typeArguments: NodeArray[TypeNode]): TypeReferenceNode = js.native
  
  def updateUnionTypeNode(node: UnionTypeNode, types: NodeArray[TypeNode]): UnionTypeNode = js.native
  
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
  
  def updateVariableDeclarationList(node: VariableDeclarationList, declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
  
  def updateVariableStatement(
    node: VariableStatement,
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: VariableDeclarationList
  ): VariableStatement = js.native
  def updateVariableStatement(node: VariableStatement, modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
  
  def updateVoidExpression(node: VoidExpression, expression: Expression): VoidExpression = js.native
  
  def updateWhileStatement(node: WhileStatement, expression: Expression, statement: Statement): WhileStatement = js.native
  
  def updateWithStatement(node: WithStatement, expression: Expression, statement: Statement): WithStatement = js.native
  
  def updateYieldExpression(node: YieldExpression): YieldExpression = js.native
  def updateYieldExpression(node: YieldExpression, asteriskToken: js.UndefOr[scala.Nothing], expression: Expression): YieldExpression = js.native
  def updateYieldExpression(node: YieldExpression, asteriskToken: AsteriskToken): YieldExpression = js.native
  def updateYieldExpression(node: YieldExpression, asteriskToken: AsteriskToken, expression: Expression): YieldExpression = js.native
}
