package typingsSlinky.terser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ASTAccessor = typingsSlinky.terser.mod.ASTLambda
  type ASTArrow = typingsSlinky.terser.mod.ASTLambda
  type ASTAssign = typingsSlinky.terser.mod.ASTBinary
  type ASTAtom = typingsSlinky.terser.mod.ASTConstant
  type ASTBlockStatement = typingsSlinky.terser.mod.ASTBlock
  type ASTBoolean = typingsSlinky.terser.mod.ASTAtom
  type ASTBreak = typingsSlinky.terser.mod.ASTLoopControl
  type ASTClassExpression = typingsSlinky.terser.mod.ASTClass
  type ASTConst = typingsSlinky.terser.mod.ASTDefinitions
  type ASTConstant = typingsSlinky.terser.mod.ASTNode
  type ASTContinue = typingsSlinky.terser.mod.ASTLoopControl
  type ASTDebugger = typingsSlinky.terser.mod.ASTStatement
  type ASTDefClass = typingsSlinky.terser.mod.ASTClass
  type ASTDefault = typingsSlinky.terser.mod.ASTSwitchBranch
  type ASTDefaultAssign = typingsSlinky.terser.mod.ASTBinary
  type ASTDefun = typingsSlinky.terser.mod.ASTLambda
  type ASTDo = typingsSlinky.terser.mod.ASTDWLoop
  type ASTDot = typingsSlinky.terser.mod.ASTPropAccess
  type ASTEmptyStatement = typingsSlinky.terser.mod.ASTStatement
  type ASTFalse = typingsSlinky.terser.mod.ASTBoolean
  type ASTFinally = typingsSlinky.terser.mod.ASTBlock
  type ASTFunction = typingsSlinky.terser.mod.ASTLambda
  type ASTHole = typingsSlinky.terser.mod.ASTAtom
  type ASTInfinity = typingsSlinky.terser.mod.ASTAtom
  type ASTJump = typingsSlinky.terser.mod.ASTStatement
  type ASTLabelRef = typingsSlinky.terser.mod.ASTSymbol
  type ASTLet = typingsSlinky.terser.mod.ASTDefinitions
  type ASTNaN = typingsSlinky.terser.mod.ASTAtom
  type ASTNew = typingsSlinky.terser.mod.ASTCall
  type ASTNewTarget = typingsSlinky.terser.mod.ASTNode
  type ASTNull = typingsSlinky.terser.mod.ASTAtom
  type ASTReturn = typingsSlinky.terser.mod.ASTExit
  type ASTStatement = typingsSlinky.terser.mod.ASTNode
  type ASTSub = typingsSlinky.terser.mod.ASTPropAccess
  type ASTSuper = typingsSlinky.terser.mod.ASTThis
  type ASTSwitchBranch = typingsSlinky.terser.mod.ASTBlock
  type ASTSymbolBlockDeclaration = typingsSlinky.terser.mod.ASTSymbolDeclaration
  type ASTSymbolCatch = typingsSlinky.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolClass = typingsSlinky.terser.mod.ASTSymbolDeclaration
  type ASTSymbolConst = typingsSlinky.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolDefClass = typingsSlinky.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolDefun = typingsSlinky.terser.mod.ASTSymbolDeclaration
  type ASTSymbolExport = typingsSlinky.terser.mod.ASTSymbolRef
  type ASTSymbolExportForeign = typingsSlinky.terser.mod.ASTSymbol
  type ASTSymbolFunarg = typingsSlinky.terser.mod.ASTSymbolVar
  type ASTSymbolImport = typingsSlinky.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolImportForeign = typingsSlinky.terser.mod.ASTSymbol
  type ASTSymbolLambda = typingsSlinky.terser.mod.ASTSymbolDeclaration
  type ASTSymbolLet = typingsSlinky.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolMethod = typingsSlinky.terser.mod.ASTSymbol
  type ASTSymbolRef = typingsSlinky.terser.mod.ASTSymbol
  type ASTSymbolVar = typingsSlinky.terser.mod.ASTSymbolDeclaration
  type ASTThis = typingsSlinky.terser.mod.ASTSymbol
  type ASTThrow = typingsSlinky.terser.mod.ASTExit
  type ASTTrue = typingsSlinky.terser.mod.ASTBoolean
  type ASTUnaryPostfix = typingsSlinky.terser.mod.ASTUnary
  type ASTUnaryPrefix = typingsSlinky.terser.mod.ASTUnary
  type ASTUndefined = typingsSlinky.terser.mod.ASTAtom
  type ASTVar = typingsSlinky.terser.mod.ASTDefinitions
  type ASTWhile = typingsSlinky.terser.mod.ASTDWLoop
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.terser.mod.ASTSymbolFunarg
    - typingsSlinky.terser.mod.ASTDefaultAssign
    - typingsSlinky.terser.mod.ASTDestructuring
    - typingsSlinky.terser.mod.ASTExpansion
  */
  type ArgType = typingsSlinky.terser.mod._ArgType | typingsSlinky.terser.mod.ASTSymbolFunarg | typingsSlinky.terser.mod.ASTDefaultAssign
}
