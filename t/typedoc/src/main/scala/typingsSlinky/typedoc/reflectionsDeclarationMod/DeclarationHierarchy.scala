package typingsSlinky.typedoc.reflectionsDeclarationMod

import typingsSlinky.typedoc.modelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationHierarchy extends js.Object {
  var isTarget: js.UndefOr[Boolean] = js.native
  var next: js.UndefOr[DeclarationHierarchy] = js.native
  var types: js.Array[Type] = js.native
}

object DeclarationHierarchy {
  @scala.inline
  def apply(types: js.Array[Type]): DeclarationHierarchy = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationHierarchy]
  }
  @scala.inline
  implicit class DeclarationHierarchyOps[Self <: DeclarationHierarchy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: DeclarationHierarchy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
  }
  
}

