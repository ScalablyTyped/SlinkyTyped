package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUssdSessionStatics extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): UssdSession = js.native
  def createFromNetworkInterfaceId(networkInterfaceId: String): UssdSession = js.native
}

object IUssdSessionStatics {
  @scala.inline
  def apply(
    createFromNetworkAccountId: String => UssdSession,
    createFromNetworkInterfaceId: String => UssdSession
  ): IUssdSessionStatics = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId), createFromNetworkInterfaceId = js.Any.fromFunction1(createFromNetworkInterfaceId))
    __obj.asInstanceOf[IUssdSessionStatics]
  }
  @scala.inline
  implicit class IUssdSessionStaticsOps[Self <: IUssdSessionStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFromNetworkAccountId(value: String => UssdSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromNetworkAccountId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateFromNetworkInterfaceId(value: String => UssdSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromNetworkInterfaceId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

