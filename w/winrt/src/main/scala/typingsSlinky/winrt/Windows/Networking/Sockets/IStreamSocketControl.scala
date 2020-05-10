package typingsSlinky.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamSocketControl extends js.Object {
  var keepAlive: Boolean = js.native
  var noDelay: Boolean = js.native
  var outboundBufferSizeInBytes: Double = js.native
  var outboundUnicastHopLimit: Double = js.native
  var qualityOfService: SocketQualityOfService = js.native
}

object IStreamSocketControl {
  @scala.inline
  def apply(
    keepAlive: Boolean,
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    outboundUnicastHopLimit: Double,
    qualityOfService: SocketQualityOfService
  ): IStreamSocketControl = {
    val __obj = js.Dynamic.literal(keepAlive = keepAlive.asInstanceOf[js.Any], noDelay = noDelay.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketControl]
  }
  @scala.inline
  implicit class IStreamSocketControlOps[Self <: IStreamSocketControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundBufferSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundBufferSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundUnicastHopLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundUnicastHopLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualityOfService(value: SocketQualityOfService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityOfService")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

