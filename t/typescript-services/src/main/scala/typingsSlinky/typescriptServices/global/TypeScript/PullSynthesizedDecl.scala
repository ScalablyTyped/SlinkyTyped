package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IIndexable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullSynthesizedDecl")
@js.native
class PullSynthesizedDecl protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullSynthesizedDecl {
  def this(
    declName: String,
    displayName: String,
    kind: typingsSlinky.typescriptServices.TypeScript.PullElementKind,
    declFlags: typingsSlinky.typescriptServices.TypeScript.PullElementFlags,
    parentDecl: typingsSlinky.typescriptServices.TypeScript.PullDecl,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
  /* CompleteClass */
  override var _rootDecl: typingsSlinky.typescriptServices.TypeScript.RootPullDecl = js.native
  /* CompleteClass */
  override var childDeclNamespaceCache: IIndexable[js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override var childDeclTypeCache: IIndexable[js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override var childDeclTypeParameterCache: IIndexable[js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override var childDeclValueCache: IIndexable[js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override var childDecls: js.Any = js.native
  /* CompleteClass */
  override var containerDecl: js.Any = js.native
  /* CompleteClass */
  override var declDisplayName: js.Any = js.native
  /* CompleteClass */
  override var declGroups: js.Any = js.native
  /* CompleteClass */
  override var declID: Double = js.native
  /* CompleteClass */
  override var flags: typingsSlinky.typescriptServices.TypeScript.PullElementFlags = js.native
  /* CompleteClass */
  override var kind: typingsSlinky.typescriptServices.TypeScript.PullElementKind = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var parentDecl: js.Any = js.native
  /* CompleteClass */
  override var parentPath: js.Any = js.native
  /* CompleteClass */
  override var semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain = js.native
  /* CompleteClass */
  override var synthesizedValDecl: js.Any = js.native
  /* CompleteClass */
  override var typeParameters: js.Any = js.native
  /* CompleteClass */
  override def _getEnclosingDeclFromParentDecl(): typingsSlinky.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def addChildDecl(childDecl: typingsSlinky.typescriptServices.TypeScript.PullDecl): Unit = js.native
  /* CompleteClass */
  override def addVariableDeclToGroup(decl: typingsSlinky.typescriptServices.TypeScript.PullDecl): Unit = js.native
  /* CompleteClass */
  override def ast(): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def ensureSymbolIsBound(): Unit = js.native
  /* CompleteClass */
  override def fileName(): String = js.native
  /* CompleteClass */
  /* private */ override def getChildDeclCache(declKind: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getChildDecls(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl] = js.native
  /* CompleteClass */
  override def getContainerDecl(): typingsSlinky.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def getDisplayName(): String = js.native
  /* CompleteClass */
  override def getEnclosingDecl(): typingsSlinky.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def getParentDecl(): typingsSlinky.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def getParentPath(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl] = js.native
  /* CompleteClass */
  override def getSignatureSymbol(): typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol = js.native
  /* CompleteClass */
  override def getSymbol(): typingsSlinky.typescriptServices.TypeScript.PullSymbol = js.native
  /* CompleteClass */
  override def getTypeParameters(): js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl] = js.native
  /* CompleteClass */
  override def getValueDecl(): typingsSlinky.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def getVariableDeclGroups(): js.Array[js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override def hasBeenBound(): Boolean = js.native
  /* CompleteClass */
  override def hasSignatureSymbol(): Boolean = js.native
  /* CompleteClass */
  override def hasSymbol(): Boolean = js.native
  /* CompleteClass */
  override def isExternalModule(): Boolean = js.native
  /* CompleteClass */
  override def isRootDecl(): Unit = js.native
  /* CompleteClass */
  override def isSynthesized(): Boolean = js.native
  /* CompleteClass */
  override def searchChildDecls(declName: String, searchKind: typingsSlinky.typescriptServices.TypeScript.PullElementKind): js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl] = js.native
  /* CompleteClass */
  override def setFlag(flags: typingsSlinky.typescriptServices.TypeScript.PullElementFlags): Unit = js.native
  /* CompleteClass */
  override def setFlags(flags: typingsSlinky.typescriptServices.TypeScript.PullElementFlags): Unit = js.native
  /* CompleteClass */
  override def setSignatureSymbol(signatureSymbol: typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol): Unit = js.native
  /* CompleteClass */
  override def setSymbol(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  /* CompleteClass */
  override def setValueDecl(valDecl: typingsSlinky.typescriptServices.TypeScript.PullDecl): Unit = js.native
}

