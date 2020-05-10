package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides arguments for the PlayReady-ND RegistrationCompleted event. */
@js.native
trait INDRegistrationCompletedEventArgs extends js.Object {
  /** Gets custom data from a registration response. */
  var responseCustomData: INDCustomData = js.native
  /** Gets or sets whether to accept or reject a transmitter's certificate. */
  var transmitterCertificateAccepted: Boolean = js.native
  /** Gets transmitter properties from the transmitter's certificate to verify the transmitter. */
  var transmitterProperties: INDTransmitterProperties = js.native
}

object INDRegistrationCompletedEventArgs {
  @scala.inline
  def apply(
    responseCustomData: INDCustomData,
    transmitterCertificateAccepted: Boolean,
    transmitterProperties: INDTransmitterProperties
  ): INDRegistrationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData.asInstanceOf[js.Any], transmitterCertificateAccepted = transmitterCertificateAccepted.asInstanceOf[js.Any], transmitterProperties = transmitterProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDRegistrationCompletedEventArgs]
  }
  @scala.inline
  implicit class INDRegistrationCompletedEventArgsOps[Self <: INDRegistrationCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseCustomData(value: INDCustomData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCustomData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmitterCertificateAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmitterCertificateAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmitterProperties(value: INDTransmitterProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmitterProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

