package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceEdit extends js.Object {
  var serverinstance_filetransfer_port: js.UndefOr[Double] = js.native
  var serverinstance_max_download_total_bandwidth: js.UndefOr[Double] = js.native
  var serverinstance_max_upload_total_bandwidth: js.UndefOr[Double] = js.native
  var serverinstance_serverquery_flood_ban_time: js.UndefOr[Double] = js.native
  var serverinstance_serverquery_flood_commands: js.UndefOr[Double] = js.native
  var serverinstance_serverquery_flood_time: js.UndefOr[Double] = js.native
  var serverinstance_template_channeladmin_group: js.UndefOr[Double] = js.native
  var serverinstance_template_channeldefault_group: js.UndefOr[Double] = js.native
  var serverinstance_template_serveradmin_group: js.UndefOr[Double] = js.native
  var serverinstance_template_serverdefault_group: js.UndefOr[Double] = js.native
}

object InstanceEdit {
  @scala.inline
  def apply(): InstanceEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceEdit]
  }
  @scala.inline
  implicit class InstanceEditOps[Self <: InstanceEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerinstance_filetransfer_port(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_filetransfer_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_filetransfer_port: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_filetransfer_port")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_max_download_total_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_download_total_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_max_download_total_bandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_download_total_bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_max_upload_total_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_upload_total_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_max_upload_total_bandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_upload_total_bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_flood_ban_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_ban_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_serverquery_flood_ban_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_ban_time")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_flood_commands(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_serverquery_flood_commands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_commands")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_flood_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_serverquery_flood_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_time")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_template_channeladmin_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeladmin_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_template_channeladmin_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeladmin_group")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_template_channeldefault_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeldefault_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_template_channeldefault_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeldefault_group")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_template_serveradmin_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serveradmin_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_template_serveradmin_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serveradmin_group")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_template_serverdefault_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serverdefault_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_template_serverdefault_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serverdefault_group")(js.undefined)
        ret
    }
  }
  
}

