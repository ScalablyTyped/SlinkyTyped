package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullDecl extends js.Object {
  var childDeclNamespaceCache: IIndexable[js.Array[PullDecl]] = js.native
  var childDeclTypeCache: IIndexable[js.Array[PullDecl]] = js.native
  var childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]] = js.native
  var childDeclValueCache: IIndexable[js.Array[PullDecl]] = js.native
  var childDecls: js.Any = js.native
  var containerDecl: js.Any = js.native
  var declDisplayName: js.Any = js.native
  var declGroups: js.Any = js.native
  var declID: Double = js.native
  var flags: PullElementFlags = js.native
  var kind: PullElementKind = js.native
  var name: String = js.native
  var semanticInfoChain: SemanticInfoChain = js.native
  var synthesizedValDecl: js.Any = js.native
  var typeParameters: js.Any = js.native
  def _getEnclosingDeclFromParentDecl(): PullDecl = js.native
  def addChildDecl(childDecl: PullDecl): Unit = js.native
  def addVariableDeclToGroup(decl: PullDecl): Unit = js.native
  def ast(): AST = js.native
  def ensureSymbolIsBound(): Unit = js.native
  def fileName(): String = js.native
  /* private */ def getChildDeclCache(declKind: js.Any): js.Any = js.native
  def getChildDecls(): js.Array[PullDecl] = js.native
  def getContainerDecl(): PullDecl = js.native
  def getDisplayName(): String = js.native
  def getEnclosingDecl(): PullDecl = js.native
  def getParentDecl(): PullDecl = js.native
  def getParentPath(): js.Array[PullDecl] = js.native
  def getSignatureSymbol(): PullSignatureSymbol = js.native
  def getSymbol(): PullSymbol = js.native
  def getTypeParameters(): js.Array[PullDecl] = js.native
  def getValueDecl(): PullDecl = js.native
  def getVariableDeclGroups(): js.Array[js.Array[PullDecl]] = js.native
  def hasBeenBound(): Boolean = js.native
  def hasSignatureSymbol(): Boolean = js.native
  def hasSymbol(): Boolean = js.native
  def isExternalModule(): Boolean = js.native
  def isRootDecl(): Unit = js.native
  def isSynthesized(): Boolean = js.native
  def searchChildDecls(declName: String, searchKind: PullElementKind): js.Array[PullDecl] = js.native
  def setFlag(flags: PullElementFlags): Unit = js.native
  def setFlags(flags: PullElementFlags): Unit = js.native
  def setSignatureSymbol(signatureSymbol: PullSignatureSymbol): Unit = js.native
  def setSymbol(symbol: PullSymbol): Unit = js.native
  def setValueDecl(valDecl: PullDecl): Unit = js.native
}

object PullDecl {
  @scala.inline
  def apply(
    _getEnclosingDeclFromParentDecl: () => PullDecl,
    addChildDecl: PullDecl => Unit,
    addVariableDeclToGroup: PullDecl => Unit,
    ast: () => AST,
    childDeclNamespaceCache: IIndexable[js.Array[PullDecl]],
    childDeclTypeCache: IIndexable[js.Array[PullDecl]],
    childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]],
    childDeclValueCache: IIndexable[js.Array[PullDecl]],
    childDecls: js.Any,
    containerDecl: js.Any,
    declDisplayName: js.Any,
    declGroups: js.Any,
    declID: Double,
    ensureSymbolIsBound: () => Unit,
    fileName: () => String,
    flags: PullElementFlags,
    getChildDeclCache: js.Any => js.Any,
    getChildDecls: () => js.Array[PullDecl],
    getContainerDecl: () => PullDecl,
    getDisplayName: () => String,
    getEnclosingDecl: () => PullDecl,
    getParentDecl: () => PullDecl,
    getParentPath: () => js.Array[PullDecl],
    getSignatureSymbol: () => PullSignatureSymbol,
    getSymbol: () => PullSymbol,
    getTypeParameters: () => js.Array[PullDecl],
    getValueDecl: () => PullDecl,
    getVariableDeclGroups: () => js.Array[js.Array[PullDecl]],
    hasBeenBound: () => Boolean,
    hasSignatureSymbol: () => Boolean,
    hasSymbol: () => Boolean,
    isExternalModule: () => Boolean,
    isRootDecl: () => Unit,
    isSynthesized: () => Boolean,
    kind: PullElementKind,
    name: String,
    searchChildDecls: (String, PullElementKind) => js.Array[PullDecl],
    semanticInfoChain: SemanticInfoChain,
    setFlag: PullElementFlags => Unit,
    setFlags: PullElementFlags => Unit,
    setSignatureSymbol: PullSignatureSymbol => Unit,
    setSymbol: PullSymbol => Unit,
    setValueDecl: PullDecl => Unit,
    synthesizedValDecl: js.Any,
    typeParameters: js.Any
  ): PullDecl = {
    val __obj = js.Dynamic.literal(_getEnclosingDeclFromParentDecl = js.Any.fromFunction0(_getEnclosingDeclFromParentDecl), addChildDecl = js.Any.fromFunction1(addChildDecl), addVariableDeclToGroup = js.Any.fromFunction1(addVariableDeclToGroup), ast = js.Any.fromFunction0(ast), childDeclNamespaceCache = childDeclNamespaceCache.asInstanceOf[js.Any], childDeclTypeCache = childDeclTypeCache.asInstanceOf[js.Any], childDeclTypeParameterCache = childDeclTypeParameterCache.asInstanceOf[js.Any], childDeclValueCache = childDeclValueCache.asInstanceOf[js.Any], childDecls = childDecls.asInstanceOf[js.Any], containerDecl = containerDecl.asInstanceOf[js.Any], declDisplayName = declDisplayName.asInstanceOf[js.Any], declGroups = declGroups.asInstanceOf[js.Any], declID = declID.asInstanceOf[js.Any], ensureSymbolIsBound = js.Any.fromFunction0(ensureSymbolIsBound), fileName = js.Any.fromFunction0(fileName), flags = flags.asInstanceOf[js.Any], getChildDeclCache = js.Any.fromFunction1(getChildDeclCache), getChildDecls = js.Any.fromFunction0(getChildDecls), getContainerDecl = js.Any.fromFunction0(getContainerDecl), getDisplayName = js.Any.fromFunction0(getDisplayName), getEnclosingDecl = js.Any.fromFunction0(getEnclosingDecl), getParentDecl = js.Any.fromFunction0(getParentDecl), getParentPath = js.Any.fromFunction0(getParentPath), getSignatureSymbol = js.Any.fromFunction0(getSignatureSymbol), getSymbol = js.Any.fromFunction0(getSymbol), getTypeParameters = js.Any.fromFunction0(getTypeParameters), getValueDecl = js.Any.fromFunction0(getValueDecl), getVariableDeclGroups = js.Any.fromFunction0(getVariableDeclGroups), hasBeenBound = js.Any.fromFunction0(hasBeenBound), hasSignatureSymbol = js.Any.fromFunction0(hasSignatureSymbol), hasSymbol = js.Any.fromFunction0(hasSymbol), isExternalModule = js.Any.fromFunction0(isExternalModule), isRootDecl = js.Any.fromFunction0(isRootDecl), isSynthesized = js.Any.fromFunction0(isSynthesized), kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchChildDecls = js.Any.fromFunction2(searchChildDecls), semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], setFlag = js.Any.fromFunction1(setFlag), setFlags = js.Any.fromFunction1(setFlags), setSignatureSymbol = js.Any.fromFunction1(setSignatureSymbol), setSymbol = js.Any.fromFunction1(setSymbol), setValueDecl = js.Any.fromFunction1(setValueDecl), synthesizedValDecl = synthesizedValDecl.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDecl]
  }
  @scala.inline
  implicit class PullDeclOps[Self <: PullDecl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_getEnclosingDeclFromParentDecl(value: () => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getEnclosingDeclFromParentDecl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddChildDecl(value: PullDecl => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildDecl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddVariableDeclToGroup(value: PullDecl => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addVariableDeclToGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAst(value: () => AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildDeclNamespaceCache(value: IIndexable[js.Array[PullDecl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDeclNamespaceCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildDeclTypeCache(value: IIndexable[js.Array[PullDecl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDeclTypeCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildDeclTypeParameterCache(value: IIndexable[js.Array[PullDecl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDeclTypeParameterCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildDeclValueCache(value: IIndexable[js.Array[PullDecl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDeclValueCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildDecls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDecls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerDecl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDecl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclDisplayName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclGroups(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnsureSymbolIsBound(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureSymbolIsBound")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlags(value: PullElementFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetChildDeclCache(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildDeclCache")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildDecls(value: () => js.Array[PullDecl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildDecls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContainerDecl(value: () => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainerDecl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisplayName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnclosingDecl(value: () => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnclosingDecl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentDecl(value: () => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentDecl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentPath(value: () => js.Array[PullDecl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSignatureSymbol(value: () => PullSignatureSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignatureSymbol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSymbol(value: () => PullSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSymbol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeParameters(value: () => js.Array[PullDecl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValueDecl(value: () => PullDecl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueDecl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVariableDeclGroups(value: () => js.Array[js.Array[PullDecl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariableDeclGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasBeenBound(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBeenBound")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSignatureSymbol(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSignatureSymbol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSymbol(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSymbol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsExternalModule(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalModule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRootDecl(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRootDecl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSynthesized(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSynthesized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKind(value: PullElementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchChildDecls(value: (String, PullElementKind) => js.Array[PullDecl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchChildDecls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSemanticInfoChain(value: SemanticInfoChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticInfoChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFlag(value: PullElementFlags => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFlags(value: PullElementFlags => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSignatureSymbol(value: PullSignatureSymbol => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSignatureSymbol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSymbol(value: PullSymbol => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSymbol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValueDecl(value: PullDecl => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueDecl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSynthesizedValDecl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synthesizedValDecl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

