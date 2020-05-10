package typingsSlinky.webpackDevServer.mod

import typingsSlinky.webpackDevServer.AnonPort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListeningApp extends js.Object {
  def address(): AnonPort = js.native
}

object ListeningApp {
  @scala.inline
  def apply(address: () => AnonPort): ListeningApp = {
    val __obj = js.Dynamic.literal(address = js.Any.fromFunction0(address))
    __obj.asInstanceOf[ListeningApp]
  }
  @scala.inline
  implicit class ListeningAppOps[Self <: ListeningApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: () => AnonPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

