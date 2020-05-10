package typingsSlinky.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Units extends js.Object {
  var Gwei: String = js.native
  var Kwei: String = js.native
  var Mwei: String = js.native
  var babbage: String = js.native
  var ether: String = js.native
  var femtoether: String = js.native
  var finney: String = js.native
  var gether: String = js.native
  var grand: String = js.native
  var gwei: String = js.native
  var kether: String = js.native
  var kwei: String = js.native
  var lovelace: String = js.native
  var mether: String = js.native
  var micro: String = js.native
  var microether: String = js.native
  var milli: String = js.native
  var milliether: String = js.native
  var mwei: String = js.native
  var nano: String = js.native
  var nanoether: String = js.native
  var noether: String = js.native
  var picoether: String = js.native
  var shannon: String = js.native
  var szabo: String = js.native
  var tether: String = js.native
  var wei: String = js.native
}

object Units {
  @scala.inline
  def apply(
    Gwei: String,
    Kwei: String,
    Mwei: String,
    babbage: String,
    ether: String,
    femtoether: String,
    finney: String,
    gether: String,
    grand: String,
    gwei: String,
    kether: String,
    kwei: String,
    lovelace: String,
    mether: String,
    micro: String,
    microether: String,
    milli: String,
    milliether: String,
    mwei: String,
    nano: String,
    nanoether: String,
    noether: String,
    picoether: String,
    shannon: String,
    szabo: String,
    tether: String,
    wei: String
  ): Units = {
    val __obj = js.Dynamic.literal(Gwei = Gwei.asInstanceOf[js.Any], Kwei = Kwei.asInstanceOf[js.Any], Mwei = Mwei.asInstanceOf[js.Any], babbage = babbage.asInstanceOf[js.Any], ether = ether.asInstanceOf[js.Any], femtoether = femtoether.asInstanceOf[js.Any], finney = finney.asInstanceOf[js.Any], gether = gether.asInstanceOf[js.Any], grand = grand.asInstanceOf[js.Any], gwei = gwei.asInstanceOf[js.Any], kether = kether.asInstanceOf[js.Any], kwei = kwei.asInstanceOf[js.Any], lovelace = lovelace.asInstanceOf[js.Any], mether = mether.asInstanceOf[js.Any], micro = micro.asInstanceOf[js.Any], microether = microether.asInstanceOf[js.Any], milli = milli.asInstanceOf[js.Any], milliether = milliether.asInstanceOf[js.Any], mwei = mwei.asInstanceOf[js.Any], nano = nano.asInstanceOf[js.Any], nanoether = nanoether.asInstanceOf[js.Any], noether = noether.asInstanceOf[js.Any], picoether = picoether.asInstanceOf[js.Any], shannon = shannon.asInstanceOf[js.Any], szabo = szabo.asInstanceOf[js.Any], tether = tether.asInstanceOf[js.Any], wei = wei.asInstanceOf[js.Any])
    __obj.asInstanceOf[Units]
  }
  @scala.inline
  implicit class UnitsOps[Self <: Units] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGwei(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gwei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKwei(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Kwei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMwei(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mwei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBabbage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babbage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFemtoether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("femtoether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinney(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finney")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLovelace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lovelace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMicro(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMicroether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilli(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milli")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilliether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milliether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNano(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nano")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNanoether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanoether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicoether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picoether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShannon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shannon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSzabo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("szabo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTether(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWei(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wei")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

