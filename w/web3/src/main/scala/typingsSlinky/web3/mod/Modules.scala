package typingsSlinky.web3.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.node.netMod.Socket
import typingsSlinky.web3Bzz.mod.Bzz
import typingsSlinky.web3Core.mod.provider
import typingsSlinky.web3Eth.mod.Eth
import typingsSlinky.web3EthPersonal.mod.Personal
import typingsSlinky.web3Net.mod.Network
import typingsSlinky.web3Shh.mod.Shh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modules extends js.Object {
  var Bzz: Instantiable1[/* provider */ provider, typingsSlinky.web3Bzz.mod.Bzz] = js.native
  var Eth: Instantiable2[/* provider */ provider, /* net */ Socket, typingsSlinky.web3Eth.mod.Eth] = js.native
  var Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network] = js.native
  var Personal: Instantiable2[
    /* provider */ provider, 
    /* net */ Socket, 
    typingsSlinky.web3EthPersonal.mod.Personal
  ] = js.native
  var Shh: Instantiable2[/* provider */ provider, /* net */ Socket, typingsSlinky.web3Shh.mod.Shh] = js.native
}

object Modules {
  @scala.inline
  def apply(
    Bzz: Instantiable1[/* provider */ provider, Bzz],
    Eth: Instantiable2[/* provider */ provider, /* net */ Socket, Eth],
    Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network],
    Personal: Instantiable2[/* provider */ provider, /* net */ Socket, Personal],
    Shh: Instantiable2[/* provider */ provider, /* net */ Socket, Shh]
  ): Modules = {
    val __obj = js.Dynamic.literal(Bzz = Bzz.asInstanceOf[js.Any], Eth = Eth.asInstanceOf[js.Any], Net = Net.asInstanceOf[js.Any], Personal = Personal.asInstanceOf[js.Any], Shh = Shh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modules]
  }
  @scala.inline
  implicit class ModulesOps[Self <: Modules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBzz(value: Instantiable1[/* provider */ provider, Bzz]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bzz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEth(value: Instantiable2[/* provider */ provider, /* net */ Socket, Eth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNet(value: Instantiable2[/* provider */ provider, /* net */ Socket, Network]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Net")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonal(value: Instantiable2[/* provider */ provider, /* net */ Socket, Personal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Personal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShh(value: Instantiable2[/* provider */ provider, /* net */ Socket, Shh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shh")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

