package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferencedSymbol extends js.Object {
  var definition: ReferencedSymbolDefinitionInfo = js.native
  var references: js.Array[ReferenceEntry] = js.native
}

object ReferencedSymbol {
  @scala.inline
  def apply(definition: ReferencedSymbolDefinitionInfo, references: js.Array[ReferenceEntry]): ReferencedSymbol = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedSymbol]
  }
  @scala.inline
  implicit class ReferencedSymbolOps[Self <: ReferencedSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: ReferencedSymbolDefinitionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferences(value: js.Array[ReferenceEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

