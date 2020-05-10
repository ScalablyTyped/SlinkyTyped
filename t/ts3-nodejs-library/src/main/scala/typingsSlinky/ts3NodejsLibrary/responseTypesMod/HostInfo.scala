package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostInfo extends js.Object {
  var connection_bandwidth_received_last_minute_total: Double = js.native
  var connection_bandwidth_received_last_second_total: Double = js.native
  var connection_bandwidth_sent_last_minute_total: Double = js.native
  var connection_bandwidth_sent_last_second_total: Double = js.native
  var connection_bytes_received_total: Double = js.native
  var connection_bytes_sent_total: Double = js.native
  var connection_filetransfer_bandwidth_received: Double = js.native
  var connection_filetransfer_bandwidth_sent: Double = js.native
  var connection_filetransfer_bytes_received_total: Double = js.native
  var connection_filetransfer_bytes_sent_total: Double = js.native
  var connection_packets_received_total: Double = js.native
  var connection_packets_sent_total: Double = js.native
  var host_timestamp_utc: Double = js.native
  var instance_uptime: Double = js.native
  var virtualservers_running_total: Double = js.native
  var virtualservers_total_channels_online: Double = js.native
  var virtualservers_total_clients_online: Double = js.native
  var virtualservers_total_maxclients: Double = js.native
}

object HostInfo {
  @scala.inline
  def apply(
    connection_bandwidth_received_last_minute_total: Double,
    connection_bandwidth_received_last_second_total: Double,
    connection_bandwidth_sent_last_minute_total: Double,
    connection_bandwidth_sent_last_second_total: Double,
    connection_bytes_received_total: Double,
    connection_bytes_sent_total: Double,
    connection_filetransfer_bandwidth_received: Double,
    connection_filetransfer_bandwidth_sent: Double,
    connection_filetransfer_bytes_received_total: Double,
    connection_filetransfer_bytes_sent_total: Double,
    connection_packets_received_total: Double,
    connection_packets_sent_total: Double,
    host_timestamp_utc: Double,
    instance_uptime: Double,
    virtualservers_running_total: Double,
    virtualservers_total_channels_online: Double,
    virtualservers_total_clients_online: Double,
    virtualservers_total_maxclients: Double
  ): HostInfo = {
    val __obj = js.Dynamic.literal(connection_bandwidth_received_last_minute_total = connection_bandwidth_received_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_received_last_second_total = connection_bandwidth_received_last_second_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_minute_total = connection_bandwidth_sent_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_second_total = connection_bandwidth_sent_last_second_total.asInstanceOf[js.Any], connection_bytes_received_total = connection_bytes_received_total.asInstanceOf[js.Any], connection_bytes_sent_total = connection_bytes_sent_total.asInstanceOf[js.Any], connection_filetransfer_bandwidth_received = connection_filetransfer_bandwidth_received.asInstanceOf[js.Any], connection_filetransfer_bandwidth_sent = connection_filetransfer_bandwidth_sent.asInstanceOf[js.Any], connection_filetransfer_bytes_received_total = connection_filetransfer_bytes_received_total.asInstanceOf[js.Any], connection_filetransfer_bytes_sent_total = connection_filetransfer_bytes_sent_total.asInstanceOf[js.Any], connection_packets_received_total = connection_packets_received_total.asInstanceOf[js.Any], connection_packets_sent_total = connection_packets_sent_total.asInstanceOf[js.Any], host_timestamp_utc = host_timestamp_utc.asInstanceOf[js.Any], instance_uptime = instance_uptime.asInstanceOf[js.Any], virtualservers_running_total = virtualservers_running_total.asInstanceOf[js.Any], virtualservers_total_channels_online = virtualservers_total_channels_online.asInstanceOf[js.Any], virtualservers_total_clients_online = virtualservers_total_clients_online.asInstanceOf[js.Any], virtualservers_total_maxclients = virtualservers_total_maxclients.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostInfo]
  }
  @scala.inline
  implicit class HostInfoOps[Self <: HostInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection_bandwidth_received_last_minute_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_received_last_minute_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bandwidth_received_last_second_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_received_last_second_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bandwidth_sent_last_minute_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_sent_last_minute_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bandwidth_sent_last_second_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_sent_last_second_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bandwidth_received(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bandwidth_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bandwidth_sent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bandwidth_sent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bytes_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bytes_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bytes_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bytes_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost_timestamp_utc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_timestamp_utc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance_uptime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_uptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualservers_running_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualservers_running_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualservers_total_channels_online(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualservers_total_channels_online")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualservers_total_clients_online(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualservers_total_clients_online")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualservers_total_maxclients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualservers_total_maxclients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

