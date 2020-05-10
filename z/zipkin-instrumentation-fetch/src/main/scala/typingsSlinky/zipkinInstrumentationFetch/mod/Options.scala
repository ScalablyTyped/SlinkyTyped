package typingsSlinky.zipkinInstrumentationFetch.mod

import typingsSlinky.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var remoteServiceName: String = js.native
  var tracer: Tracer = js.native
}

object Options {
  @scala.inline
  def apply(remoteServiceName: String, tracer: Tracer): Options = {
    val __obj = js.Dynamic.literal(remoteServiceName = remoteServiceName.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoteServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracer(value: Tracer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

