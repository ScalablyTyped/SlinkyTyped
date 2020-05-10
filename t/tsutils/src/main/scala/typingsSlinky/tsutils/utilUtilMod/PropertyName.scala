package typingsSlinky.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyName extends js.Object {
  var displayName: String = js.native
  var symbolName: typingsSlinky.typescript.mod.String = js.native
}

object PropertyName {
  @scala.inline
  def apply(displayName: String, symbolName: typingsSlinky.typescript.mod.String): PropertyName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  @scala.inline
  implicit class PropertyNameOps[Self <: PropertyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolName(value: typingsSlinky.typescript.mod.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

