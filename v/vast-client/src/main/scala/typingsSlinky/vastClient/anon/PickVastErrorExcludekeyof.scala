package typingsSlinky.vastClient.anon

import typingsSlinky.vastClient.mod.VastAdExtension
import typingsSlinky.vastClient.mod.VastSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<vast-client.vast-client.VastError, std.Exclude<keyof vast-client.vast-client.VastError, 'ERRORCODE'>> */
@js.native
trait PickVastErrorExcludekeyof extends js.Object {
  var ERRORMESSAGE: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.native
  var system: js.UndefOr[VastSystem | String] = js.native
}

object PickVastErrorExcludekeyof {
  @scala.inline
  def apply(): PickVastErrorExcludekeyof = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickVastErrorExcludekeyof]
  }
  @scala.inline
  implicit class PickVastErrorExcludekeyofOps[Self <: PickVastErrorExcludekeyof] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

