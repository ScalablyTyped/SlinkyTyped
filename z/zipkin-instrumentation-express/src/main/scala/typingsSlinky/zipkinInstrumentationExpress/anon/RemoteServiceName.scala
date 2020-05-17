package typingsSlinky.zipkinInstrumentationExpress.anon

import typingsSlinky.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteServiceName extends js.Object {
  var remoteServiceName: js.UndefOr[String] = js.native
  var tracer: Tracer = js.native
}

object RemoteServiceName {
  @scala.inline
  def apply(tracer: Tracer): RemoteServiceName = {
    val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteServiceName]
  }
  @scala.inline
  implicit class RemoteServiceNameOps[Self <: RemoteServiceName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTracer(value: Tracer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteServiceName")(js.undefined)
        ret
    }
  }
  
}

