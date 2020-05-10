package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRequestConnectionInfo extends js.Object {
  var connection_bandwidth_received_last_minute_total: Double = js.native
  var connection_bandwidth_received_last_second_total: Double = js.native
  var connection_bandwidth_sent_last_minute_total: Double = js.native
  var connection_bandwidth_sent_last_second_total: Double = js.native
  var connection_bytes_received_total: Double = js.native
  var connection_bytes_sent_total: Double = js.native
  var connection_connected_time: Double = js.native
  var connection_filetransfer_bandwidth_received: Double = js.native
  var connection_filetransfer_bandwidth_sent: Double = js.native
  var connection_filetransfer_bytes_received_total: Double = js.native
  var connection_filetransfer_bytes_sent_total: Double = js.native
  var connection_packetloss_total: Double = js.native
  var connection_packets_received_total: Double = js.native
  var connection_packets_sent_total: Double = js.native
  var connection_ping: Double = js.native
}

object ServerRequestConnectionInfo {
  @scala.inline
  def apply(
    connection_bandwidth_received_last_minute_total: Double,
    connection_bandwidth_received_last_second_total: Double,
    connection_bandwidth_sent_last_minute_total: Double,
    connection_bandwidth_sent_last_second_total: Double,
    connection_bytes_received_total: Double,
    connection_bytes_sent_total: Double,
    connection_connected_time: Double,
    connection_filetransfer_bandwidth_received: Double,
    connection_filetransfer_bandwidth_sent: Double,
    connection_filetransfer_bytes_received_total: Double,
    connection_filetransfer_bytes_sent_total: Double,
    connection_packetloss_total: Double,
    connection_packets_received_total: Double,
    connection_packets_sent_total: Double,
    connection_ping: Double
  ): ServerRequestConnectionInfo = {
    val __obj = js.Dynamic.literal(connection_bandwidth_received_last_minute_total = connection_bandwidth_received_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_received_last_second_total = connection_bandwidth_received_last_second_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_minute_total = connection_bandwidth_sent_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_second_total = connection_bandwidth_sent_last_second_total.asInstanceOf[js.Any], connection_bytes_received_total = connection_bytes_received_total.asInstanceOf[js.Any], connection_bytes_sent_total = connection_bytes_sent_total.asInstanceOf[js.Any], connection_connected_time = connection_connected_time.asInstanceOf[js.Any], connection_filetransfer_bandwidth_received = connection_filetransfer_bandwidth_received.asInstanceOf[js.Any], connection_filetransfer_bandwidth_sent = connection_filetransfer_bandwidth_sent.asInstanceOf[js.Any], connection_filetransfer_bytes_received_total = connection_filetransfer_bytes_received_total.asInstanceOf[js.Any], connection_filetransfer_bytes_sent_total = connection_filetransfer_bytes_sent_total.asInstanceOf[js.Any], connection_packetloss_total = connection_packetloss_total.asInstanceOf[js.Any], connection_packets_received_total = connection_packets_received_total.asInstanceOf[js.Any], connection_packets_sent_total = connection_packets_sent_total.asInstanceOf[js.Any], connection_ping = connection_ping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRequestConnectionInfo]
  }
  @scala.inline
  implicit class ServerRequestConnectionInfoOps[Self <: ServerRequestConnectionInfo] (val x: Self) extends AnyVal {
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
    def withConnection_connected_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_connected_time")(value.asInstanceOf[js.Any])
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
    def withConnection_packetloss_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packetloss_total")(value.asInstanceOf[js.Any])
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
    def withConnection_ping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_ping")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

