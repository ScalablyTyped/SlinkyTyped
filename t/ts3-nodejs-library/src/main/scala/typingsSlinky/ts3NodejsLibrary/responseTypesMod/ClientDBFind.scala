package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDBFind extends js.Object {
  var cldbid: Double = js.native
}

object ClientDBFind {
  @scala.inline
  def apply(cldbid: Double): ClientDBFind = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBFind]
  }
  @scala.inline
  implicit class ClientDBFindOps[Self <: ClientDBFind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

