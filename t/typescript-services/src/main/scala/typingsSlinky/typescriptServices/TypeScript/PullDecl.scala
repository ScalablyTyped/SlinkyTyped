package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullDecl extends js.Object {
  
  def _getEnclosingDeclFromParentDecl(): PullDecl = js.native
  
  def addChildDecl(childDecl: PullDecl): Unit = js.native
  
  def addVariableDeclToGroup(decl: PullDecl): Unit = js.native
  
  def ast(): AST = js.native
  
  var childDeclNamespaceCache: IIndexable[js.Array[PullDecl]] = js.native
  
  var childDeclTypeCache: IIndexable[js.Array[PullDecl]] = js.native
  
  var childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]] = js.native
  
  var childDeclValueCache: IIndexable[js.Array[PullDecl]] = js.native
  
  var childDecls: js.Any = js.native
  
  var containerDecl: js.Any = js.native
  
  var declDisplayName: js.Any = js.native
  
  var declGroups: js.Any = js.native
  
  var declID: Double = js.native
  
  def ensureSymbolIsBound(): Unit = js.native
  
  def fileName(): String = js.native
  
  var flags: PullElementFlags = js.native
  
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
  
  var kind: PullElementKind = js.native
  
  var name: String = js.native
  
  def searchChildDecls(declName: String, searchKind: PullElementKind): js.Array[PullDecl] = js.native
  
  var semanticInfoChain: SemanticInfoChain = js.native
  
  def setFlag(flags: PullElementFlags): Unit = js.native
  
  def setFlags(flags: PullElementFlags): Unit = js.native
  
  def setSignatureSymbol(signatureSymbol: PullSignatureSymbol): Unit = js.native
  
  def setSymbol(symbol: PullSymbol): Unit = js.native
  
  def setValueDecl(valDecl: PullDecl): Unit = js.native
  
  var synthesizedValDecl: js.Any = js.native
  
  var typeParameters: js.Any = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_getEnclosingDeclFromParentDecl(value: () => PullDecl): Self = this.set("_getEnclosingDeclFromParentDecl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddChildDecl(value: PullDecl => Unit): Self = this.set("addChildDecl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddVariableDeclToGroup(value: PullDecl => Unit): Self = this.set("addVariableDeclToGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAst(value: () => AST): Self = this.set("ast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildDeclNamespaceCache(value: IIndexable[js.Array[PullDecl]]): Self = this.set("childDeclNamespaceCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDeclTypeCache(value: IIndexable[js.Array[PullDecl]]): Self = this.set("childDeclTypeCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDeclTypeParameterCache(value: IIndexable[js.Array[PullDecl]]): Self = this.set("childDeclTypeParameterCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDeclValueCache(value: IIndexable[js.Array[PullDecl]]): Self = this.set("childDeclValueCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDecls(value: js.Any): Self = this.set("childDecls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerDecl(value: js.Any): Self = this.set("containerDecl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclDisplayName(value: js.Any): Self = this.set("declDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclGroups(value: js.Any): Self = this.set("declGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclID(value: Double): Self = this.set("declID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnsureSymbolIsBound(value: () => Unit): Self = this.set("ensureSymbolIsBound", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileName(value: () => String): Self = this.set("fileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlags(value: PullElementFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChildDeclCache(value: js.Any => js.Any): Self = this.set("getChildDeclCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildDecls(value: () => js.Array[PullDecl]): Self = this.set("getChildDecls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainerDecl(value: () => PullDecl): Self = this.set("getContainerDecl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayName(value: () => String): Self = this.set("getDisplayName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnclosingDecl(value: () => PullDecl): Self = this.set("getEnclosingDecl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentDecl(value: () => PullDecl): Self = this.set("getParentDecl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentPath(value: () => js.Array[PullDecl]): Self = this.set("getParentPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSignatureSymbol(value: () => PullSignatureSymbol): Self = this.set("getSignatureSymbol", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSymbol(value: () => PullSymbol): Self = this.set("getSymbol", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeParameters(value: () => js.Array[PullDecl]): Self = this.set("getTypeParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueDecl(value: () => PullDecl): Self = this.set("getValueDecl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVariableDeclGroups(value: () => js.Array[js.Array[PullDecl]]): Self = this.set("getVariableDeclGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasBeenBound(value: () => Boolean): Self = this.set("hasBeenBound", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSignatureSymbol(value: () => Boolean): Self = this.set("hasSignatureSymbol", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSymbol(value: () => Boolean): Self = this.set("hasSymbol", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExternalModule(value: () => Boolean): Self = this.set("isExternalModule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRootDecl(value: () => Unit): Self = this.set("isRootDecl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSynthesized(value: () => Boolean): Self = this.set("isSynthesized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKind(value: PullElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchChildDecls(value: (String, PullElementKind) => js.Array[PullDecl]): Self = this.set("searchChildDecls", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSemanticInfoChain(value: SemanticInfoChain): Self = this.set("semanticInfoChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFlag(value: PullElementFlags => Unit): Self = this.set("setFlag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFlags(value: PullElementFlags => Unit): Self = this.set("setFlags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSignatureSymbol(value: PullSignatureSymbol => Unit): Self = this.set("setSignatureSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSymbol(value: PullSymbol => Unit): Self = this.set("setSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueDecl(value: PullDecl => Unit): Self = this.set("setValueDecl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSynthesizedValDecl(value: js.Any): Self = this.set("synthesizedValDecl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: js.Any): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
  }
}
