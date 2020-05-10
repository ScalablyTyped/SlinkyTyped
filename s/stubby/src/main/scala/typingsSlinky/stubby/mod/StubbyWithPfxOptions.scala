package typingsSlinky.stubby.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StubbyWithPfxOptions
  extends StubbyCommonOptions
     with StubbyOptions {
  /** pfx file contents (mutually exclusive with key/cert options) */
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.native
}

object StubbyWithPfxOptions {
  @scala.inline
  def apply(): StubbyWithPfxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StubbyWithPfxOptions]
  }
  @scala.inline
  implicit class StubbyWithPfxOptionsOps[Self <: StubbyWithPfxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPfx(value: String | Buffer | (js.Array[String | Buffer | js.Object])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
  }
  
}

