package typingsSlinky.smtpServer.mod

import typingsSlinky.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerSession extends js.Object {
  /**
    * reverse resolved hostname for remoteAddress
    */
  var clientHostname: String = js.native
  /**
    * Envelope Object
    */
  var envelope: SMTPServerEnvelope = js.native
  /**
    * hostname the client provided with HELO/EHLO call
    */
  var hostNameAppearsAs: String = js.native
  /**
    * random string identificator generated when the client connected
    */
  var id: String = js.native
  /**
    * local IP address for the connected client
    */
  var localAddress: String = js.native
  /**
    * local port number for the connected client
    */
  var localPort: Double = js.native
  /**
    * the opening SMTP command (HELO/EHLO/LHLO)
    */
  var openingCommand: String = js.native
  /**
    * remote IP address for the connected client
    */
  var remoteAddress: String = js.native
  /**
    * remote port number for the connected client
    */
  var remotePort: Double = js.native
  /**
    *  If true, then the connection is using TLS
    */
  var secure: Boolean = js.native
  var tlsOptions: TlsOptions = js.native
  var transmissionType: String = js.native
}

object SMTPServerSession {
  @scala.inline
  def apply(
    clientHostname: String,
    envelope: SMTPServerEnvelope,
    hostNameAppearsAs: String,
    id: String,
    localAddress: String,
    localPort: Double,
    openingCommand: String,
    remoteAddress: String,
    remotePort: Double,
    secure: Boolean,
    tlsOptions: TlsOptions,
    transmissionType: String
  ): SMTPServerSession = {
    val __obj = js.Dynamic.literal(clientHostname = clientHostname.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], hostNameAppearsAs = hostNameAppearsAs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], openingCommand = openingCommand.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], tlsOptions = tlsOptions.asInstanceOf[js.Any], transmissionType = transmissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPServerSession]
  }
  @scala.inline
  implicit class SMTPServerSessionOps[Self <: SMTPServerSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvelope(value: SMTPServerEnvelope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostNameAppearsAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNameAppearsAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpeningCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotePort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTlsOptions(value: TlsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmissionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmissionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

