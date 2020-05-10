package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalRoot extends js.Object {
  var aliasSymbol: js.UndefOr[Symbol] = js.native
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.native
  var checkType: Type = js.native
  var extendsType: Type = js.native
  var falseType: Type = js.native
  var inferTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.native
  var instantiations: js.UndefOr[Map[Type]] = js.native
  var isDistributive: Boolean = js.native
  var node: ConditionalTypeNode = js.native
  var outerTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.native
  var trueType: Type = js.native
}

object ConditionalRoot {
  @scala.inline
  def apply(
    checkType: Type,
    extendsType: Type,
    falseType: Type,
    isDistributive: Boolean,
    node: ConditionalTypeNode,
    trueType: Type
  ): ConditionalRoot = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], isDistributive = isDistributive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRoot]
  }
  @scala.inline
  implicit class ConditionalRootOps[Self <: ConditionalRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendsType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFalseType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDistributive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDistributive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: ConditionalTypeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueType")(value.asInstanceOf[js.Any])
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
    def withInferTypeParameters(value: js.Array[TypeParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferTypeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferTypeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferTypeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withInstantiations(value: Map[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstantiations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiations")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterTypeParameters(value: js.Array[TypeParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerTypeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterTypeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerTypeParameters")(js.undefined)
        ret
    }
  }
  
}

