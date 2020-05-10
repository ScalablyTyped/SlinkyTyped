package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastError extends js.Object {
  /**
    * Whenever an error occurs during the VAST parsing, the parser will call on its own all related tracking error URLs. Reported errors are:
    *      no_ad: The VAST document is empty
    *      VAST error 101: VAST schema validation error.
    *      VAST error 301: Timeout of VAST URI provided in Wrapper element.
    *      VAST error 302: Wrapper limit reached.
    *      VAST error 303: No VAST response after one or more Wrappers.
    */
  var ERRORCODE: String | Double = js.native
  var ERRORMESSAGE: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.native
  var system: js.UndefOr[VastSystem | String | Null] = js.native
}

object VastError {
  @scala.inline
  def apply(ERRORCODE: String | Double): VastError = {
    val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastError]
  }
  @scala.inline
  implicit class VastErrorOps[Self <: VastError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withERRORCODE(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERRORCODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERRORMESSAGE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERRORMESSAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutERRORMESSAGE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERRORMESSAGE")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[VastAdExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: VastSystem | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(null)
        ret
    }
  }
  
}

