package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FTList extends js.Object {
  var average_speed: Double = js.native
  var clid: Double = js.native
  var clientftfid: Double = js.native
  var current_speed: Double = js.native
  var name: String = js.native
  var path: String = js.native
  var runtime: Double = js.native
  var sender: Double = js.native
  var serverftfid: Double = js.native
  var size: Double = js.native
  var sizedone: Double = js.native
  var status: Double = js.native
}

object FTList {
  @scala.inline
  def apply(
    average_speed: Double,
    clid: Double,
    clientftfid: Double,
    current_speed: Double,
    name: String,
    path: String,
    runtime: Double,
    sender: Double,
    serverftfid: Double,
    size: Double,
    sizedone: Double,
    status: Double
  ): FTList = {
    val __obj = js.Dynamic.literal(average_speed = average_speed.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], clientftfid = clientftfid.asInstanceOf[js.Any], current_speed = current_speed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], serverftfid = serverftfid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizedone = sizedone.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTList]
  }
  @scala.inline
  implicit class FTListOps[Self <: FTList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientftfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientftfid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerftfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverftfid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizedone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizedone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

