package typingsSlinky.ts3NodejsLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<ts3-nodejs-library.ts3-nodejs-library/lib/transport/Command.Command.ParserArgument, 'raw'> */
@js.native
trait PickParserArgumentraw extends js.Object {
  var raw: String = js.native
}

object PickParserArgumentraw {
  @scala.inline
  def apply(raw: String): PickParserArgumentraw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickParserArgumentraw]
  }
  @scala.inline
  implicit class PickParserArgumentrawOps[Self <: PickParserArgumentraw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

