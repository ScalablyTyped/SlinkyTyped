package typingsSlinky.tsutils.usageMod

import typingsSlinky.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableInfo extends js.Object {
  var declarations: js.Array[Identifier] = js.native
  var domain: DeclarationDomain = js.native
  var exported: Boolean = js.native
  var inGlobalScope: Boolean = js.native
  var uses: js.Array[VariableUse] = js.native
}

object VariableInfo {
  @scala.inline
  def apply(
    declarations: js.Array[Identifier],
    domain: DeclarationDomain,
    exported: Boolean,
    inGlobalScope: Boolean,
    uses: js.Array[VariableUse]
  ): VariableInfo = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], inGlobalScope = inGlobalScope.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableInfo]
  }
  @scala.inline
  implicit class VariableInfoOps[Self <: VariableInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclarations(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: DeclarationDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInGlobalScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGlobalScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUses(value: js.Array[VariableUse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

