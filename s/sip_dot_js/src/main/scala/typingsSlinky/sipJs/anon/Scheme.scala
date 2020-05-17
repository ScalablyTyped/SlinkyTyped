package typingsSlinky.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scheme extends js.Object {
  var scheme: js.UndefOr[String] = js.native
  var sipUri: js.UndefOr[String] = js.native
}

object Scheme {
  @scala.inline
  def apply(): Scheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scheme]
  }
  @scala.inline
  implicit class SchemeOps[Self <: Scheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withSipUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSipUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipUri")(js.undefined)
        ret
    }
  }
  
}

