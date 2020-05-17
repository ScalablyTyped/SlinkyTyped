package typingsSlinky.sipJs.messagerOptionsMod

import typingsSlinky.sipJs.anon.FromDisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagerOptions extends js.Object {
  /** Array of extra headers added to the MESSAGE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[FromDisplayName] = js.native
}

object MessagerOptions {
  @scala.inline
  def apply(): MessagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagerOptions]
  }
  @scala.inline
  implicit class MessagerOptionsOps[Self <: MessagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withParams(value: FromDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

