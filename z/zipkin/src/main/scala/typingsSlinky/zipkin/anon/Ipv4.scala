package typingsSlinky.zipkin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv4 extends js.Object {
  var ipv4: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var serviceName: js.UndefOr[String] = js.native
}

object Ipv4 {
  @scala.inline
  def apply(): Ipv4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv4]
  }
  @scala.inline
  implicit class Ipv4Ops[Self <: Ipv4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpv4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
  }
  
}

