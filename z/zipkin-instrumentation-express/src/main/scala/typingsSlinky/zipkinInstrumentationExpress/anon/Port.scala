package typingsSlinky.zipkinInstrumentationExpress.anon

import typingsSlinky.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Port extends js.Object {
  var port: js.UndefOr[Double] = js.native
  var tracer: Tracer = js.native
}

object Port {
  @scala.inline
  def apply(tracer: Tracer): Port = {
    val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  @scala.inline
  implicit class PortOps[Self <: Port] (val x: Self) extends AnyVal {
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
  }
  
}

