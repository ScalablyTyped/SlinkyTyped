package typingsSlinky.secureJsonParse.mod

import typingsSlinky.secureJsonParse.secureJsonParseStrings.error
import typingsSlinky.secureJsonParse.secureJsonParseStrings.ignore
import typingsSlinky.secureJsonParse.secureJsonParseStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var constructorAction: js.UndefOr[error | remove] = js.native
  var protoAction: js.UndefOr[error | remove | ignore] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructorAction(value: error | remove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructorAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstructorAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructorAction")(js.undefined)
        ret
    }
    @scala.inline
    def withProtoAction(value: error | remove | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protoAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtoAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protoAction")(js.undefined)
        ret
    }
  }
  
}

