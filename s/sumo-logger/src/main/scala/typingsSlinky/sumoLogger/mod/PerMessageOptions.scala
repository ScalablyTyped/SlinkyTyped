package typingsSlinky.sumoLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerMessageOptions extends js.Object {
  /** Override a session key set in the `config` call. */
  var sessionKey: String = js.native
  /**
    * Defaults to `new Date()` called when processing the log call.
    * Use this when the event being logged occurred
    * at a different time than when the log was sent.
    */
  var timestamp: js.Date = js.native
  /** Override client URL set in the config call. (Node version only) */
  var url: String = js.native
}

object PerMessageOptions {
  @scala.inline
  def apply(sessionKey: String, timestamp: js.Date, url: String): PerMessageOptions = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerMessageOptions]
  }
  @scala.inline
  implicit class PerMessageOptionsOps[Self <: PerMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

