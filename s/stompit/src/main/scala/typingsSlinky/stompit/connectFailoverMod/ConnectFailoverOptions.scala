package typingsSlinky.stompit.connectFailoverMod

import typingsSlinky.stompit.connectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectFailoverOptions extends js.Object {
  // Override the connect function
  var connectFunction: js.UndefOr[
    js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[
        js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.clientMod.^, Unit]
      ], 
      typingsSlinky.stompit.clientMod.^
    ]
  ] = js.native
  // Milliseconds delay of the first reconnect
  var initialReconnectDelay: js.UndefOr[Double] = js.native
  // Maximum milliseconds delay of any reconnect
  var maxReconnectDelay: js.UndefOr[Double] = js.native
  // Maximum number of reconnects
  var maxReconnects: js.UndefOr[Double] = js.native
  // Randomly choose a server to use for reconnect
  var randomize: js.UndefOr[Boolean] = js.native
  // The exponent used in the exponential backoff attempts
  var reconnectDelayExponent: js.UndefOr[Double] = js.native
  // Exponential increase of the reconnect delay
  var useExponentialBackOff: js.UndefOr[Boolean] = js.native
}

object ConnectFailoverOptions {
  @scala.inline
  def apply(): ConnectFailoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailoverOptions]
  }
  @scala.inline
  implicit class ConnectFailoverOptionsOps[Self <: ConnectFailoverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectFunction(
      value: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[
          js.Function2[/* err */ js.Error | Null, /* client */ typingsSlinky.stompit.clientMod.^, Unit]
        ]) => typingsSlinky.stompit.clientMod.^
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConnectFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialReconnectDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialReconnectDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialReconnectDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialReconnectDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReconnectDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReconnectDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReconnects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReconnects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnects")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectDelayExponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectDelayExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectDelayExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectDelayExponent")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExponentialBackOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExponentialBackOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExponentialBackOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExponentialBackOff")(js.undefined)
        ret
    }
  }
  
}

