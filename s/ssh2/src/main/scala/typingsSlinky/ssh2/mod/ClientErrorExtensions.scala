package typingsSlinky.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientErrorExtensions extends js.Object {
  /** Additional detail for 'client-ssh' messages. */
  var description: js.UndefOr[String] = js.native
  /** Indicates 'client-socket' for socket-level errors and 'client-ssh' for SSH disconnection messages. */
  var level: js.UndefOr[String] = js.native
}

object ClientErrorExtensions {
  @scala.inline
  def apply(): ClientErrorExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientErrorExtensions]
  }
  @scala.inline
  implicit class ClientErrorExtensionsOps[Self <: ClientErrorExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

