package typingsSlinky.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolDef extends js.Object {
  var eliminated: Double = js.native
  var export: Boolean = js.native
  var global: Boolean = js.native
  var id: Double = js.native
  var init: ASTSymbolRef = js.native
  var mangled_name: Null | String = js.native
  var name: String = js.native
  var orig: js.Array[ASTSymbolRef] = js.native
  var references: js.Array[ASTSymbolRef] = js.native
  var replaced: Double = js.native
  var scope: ASTScope = js.native
  var undeclared: Boolean = js.native
}

object SymbolDef {
  @scala.inline
  def apply(
    eliminated: Double,
    export: Boolean,
    global: Boolean,
    id: Double,
    init: ASTSymbolRef,
    name: String,
    orig: js.Array[ASTSymbolRef],
    references: js.Array[ASTSymbolRef],
    replaced: Double,
    scope: ASTScope,
    undeclared: Boolean
  ): SymbolDef = {
    val __obj = js.Dynamic.literal(eliminated = eliminated.asInstanceOf[js.Any], export = export.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], replaced = replaced.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], undeclared = undeclared.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolDef]
  }
  @scala.inline
  implicit class SymbolDefOps[Self <: SymbolDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEliminated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eliminated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: ASTSymbolRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrig(value: js.Array[ASTSymbolRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferences(value: js.Array[ASTSymbolRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaced(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: ASTScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndeclared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeclared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMangled_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangled_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMangled_nameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangled_name")(null)
        ret
    }
  }
  
}

