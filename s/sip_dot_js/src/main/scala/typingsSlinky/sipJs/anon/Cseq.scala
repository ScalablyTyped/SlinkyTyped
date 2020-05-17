package typingsSlinky.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cseq extends js.Object {
  var body: js.UndefOr[typingsSlinky.sipJs.bodyMod.Body] = js.native
  var cseq: js.UndefOr[Double] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
}

object Cseq {
  @scala.inline
  def apply(): Cseq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cseq]
  }
  @scala.inline
  implicit class CseqOps[Self <: Cseq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: typingsSlinky.sipJs.bodyMod.Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCseq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cseq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCseq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cseq")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
  }
  
}

