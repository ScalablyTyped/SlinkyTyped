package typingsSlinky.tsutils

import typingsSlinky.typescript.mod.ArrayTypeNode
import typingsSlinky.typescript.mod.BaseType
import typingsSlinky.typescript.mod.DestructuringPattern
import typingsSlinky.typescript.mod.GenericType
import typingsSlinky.typescript.mod.ObjectFlags
import typingsSlinky.typescript.mod.Signature
import typingsSlinky.typescript.mod.Symbol
import typingsSlinky.typescript.mod.TupleType
import typingsSlinky.typescript.mod.TupleTypeNode
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeFlags
import typingsSlinky.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined typescript.typescript.TypeReference & {  target  :typescript.typescript.TupleType} */
@js.native
trait TypeReferencetargetTupleT extends js.Object {
  var aliasSymbol: js.UndefOr[Symbol] = js.native
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.native
  var flags: TypeFlags = js.native
  var node: js.UndefOr[TypeReferenceNode | ArrayTypeNode | TupleTypeNode] = js.native
  var objectFlags: ObjectFlags = js.native
  var pattern: js.UndefOr[DestructuringPattern] = js.native
  var symbol: Symbol = js.native
  var target: GenericType with TupleType = js.native
  var typeArguments: js.UndefOr[js.Array[Type]] = js.native
  def getApparentProperties(): js.Array[Symbol] = js.native
  def getBaseTypes(): js.UndefOr[js.Array[BaseType]] = js.native
  def getCallSignatures(): js.Array[Signature] = js.native
  def getConstraint(): js.UndefOr[Type] = js.native
  def getConstructSignatures(): js.Array[Signature] = js.native
  def getDefault(): js.UndefOr[Type] = js.native
  def getFlags(): TypeFlags = js.native
  def getNonNullableType(): Type = js.native
  def getNumberIndexType(): js.UndefOr[Type] = js.native
  def getProperties(): js.Array[Symbol] = js.native
  def getProperty(propertyName: String): js.UndefOr[Symbol] = js.native
  def getStringIndexType(): js.UndefOr[Type] = js.native
  def getSymbol(): js.UndefOr[Symbol] = js.native
  def isClass(): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  def isClassOrInterface(): /* is typescript.typescript.InterfaceType */ Boolean = js.native
  def isIntersection(): /* is typescript.typescript.IntersectionType */ Boolean = js.native
  def isLiteral(): /* is typescript.typescript.LiteralType */ Boolean = js.native
  def isNumberLiteral(): /* is typescript.typescript.NumberLiteralType */ Boolean = js.native
  def isStringLiteral(): /* is typescript.typescript.StringLiteralType */ Boolean = js.native
  def isTypeParameter(): /* is typescript.typescript.TypeParameter */ Boolean = js.native
  def isUnion(): /* is typescript.typescript.UnionType */ Boolean = js.native
  def isUnionOrIntersection(): /* is typescript.typescript.UnionOrIntersectionType */ Boolean = js.native
}

object TypeReferencetargetTupleT {
  @scala.inline
  def apply(
    flags: TypeFlags,
    getApparentProperties: () => js.Array[Symbol],
    getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
    getCallSignatures: () => js.Array[Signature],
    getConstraint: () => js.UndefOr[Type],
    getConstructSignatures: () => js.Array[Signature],
    getDefault: () => js.UndefOr[Type],
    getFlags: () => TypeFlags,
    getNonNullableType: () => Type,
    getNumberIndexType: () => js.UndefOr[Type],
    getProperties: () => js.Array[Symbol],
    getProperty: String => js.UndefOr[Symbol],
    getStringIndexType: () => js.UndefOr[Type],
    getSymbol: () => js.UndefOr[Symbol],
    isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
    isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
    isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
    isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
    objectFlags: ObjectFlags,
    symbol: Symbol,
    target: GenericType with TupleType
  ): TypeReferencetargetTupleT = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeReferencetargetTupleT]
  }
  @scala.inline
  implicit class TypeReferencetargetTupleTOps[Self <: TypeReferencetargetTupleT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: TypeFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetApparentProperties(value: () => js.Array[Symbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApparentProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBaseTypes(value: () => js.UndefOr[js.Array[BaseType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBaseTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCallSignatures(value: () => js.Array[Signature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallSignatures")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConstraint(value: () => js.UndefOr[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstraint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConstructSignatures(value: () => js.Array[Signature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstructSignatures")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefault(value: () => js.UndefOr[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFlags(value: () => TypeFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFlags")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNonNullableType(value: () => Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNonNullableType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumberIndexType(value: () => js.UndefOr[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberIndexType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProperties(value: () => js.Array[Symbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProperty(value: String => js.UndefOr[Symbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStringIndexType(value: () => js.UndefOr[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStringIndexType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSymbol(value: () => js.UndefOr[Symbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSymbol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsClass(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsClassOrInterface(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClassOrInterface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIntersection(value: () => /* is typescript.typescript.IntersectionType */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIntersection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLiteral(value: () => /* is typescript.typescript.LiteralType */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLiteral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNumberLiteral(value: () => /* is typescript.typescript.NumberLiteralType */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumberLiteral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStringLiteral(value: () => /* is typescript.typescript.StringLiteralType */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStringLiteral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTypeParameter(value: () => /* is typescript.typescript.TypeParameter */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeParameter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUnion(value: () => /* is typescript.typescript.UnionType */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUnionOrIntersection(value: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnionOrIntersection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjectFlags(value: ObjectFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: GenericType with TupleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasSymbol(value: Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withAliasTypeArguments(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasTypeArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasTypeArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasTypeArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: TypeReferenceNode | ArrayTypeNode | TupleTypeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: DestructuringPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeArguments(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArguments")(js.undefined)
        ret
    }
  }
  
}

