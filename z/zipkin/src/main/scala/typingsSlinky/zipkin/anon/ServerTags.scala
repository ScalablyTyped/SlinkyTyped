package typingsSlinky.zipkin.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerTags extends js.Object {
  var host: js.UndefOr[String] = js.native
  var port: Double = js.native
  var serverTags: js.UndefOr[StringDictionary[String]] = js.native
  var serviceName: js.UndefOr[String] = js.native
  var tracer: Tracer = js.native
}

object ServerTags {
  @scala.inline
  def apply(port: Double, tracer: Tracer): ServerTags = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTags]
  }
  @scala.inline
  implicit class ServerTagsOps[Self <: ServerTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracer(value: Tracer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withServerTags(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTags")(js.undefined)
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

