package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferencedSymbolDefinitionInfo extends DefinitionInfo {
  var displayParts: js.Array[SymbolDisplayPart] = js.native
}

object ReferencedSymbolDefinitionInfo {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    displayParts: js.Array[SymbolDisplayPart],
    fileName: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    textSpan: TextSpan
  ): ReferencedSymbolDefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], displayParts = displayParts.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedSymbolDefinitionInfo]
  }
  @scala.inline
  implicit class ReferencedSymbolDefinitionInfoOps[Self <: ReferencedSymbolDefinitionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayParts(value: js.Array[SymbolDisplayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayParts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

