package typingsSlinky.thrift.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.thrift.AnonHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServerOptions[TProcessor, THandler] extends js.Object {
  var services: StringDictionary[AnonHandler[TProcessor, THandler]] = js.native
}

object WebServerOptions {
  @scala.inline
  def apply[TProcessor, THandler](services: StringDictionary[AnonHandler[TProcessor, THandler]]): WebServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServerOptions[TProcessor, THandler]]
  }
  @scala.inline
  implicit class WebServerOptionsOps[Self[tprocessor, thandler] <: WebServerOptions[tprocessor, thandler], TProcessor, THandler] (val x: Self[TProcessor, THandler]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProcessor, THandler] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProcessor, THandler]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProcessor, THandler]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProcessor, THandler]) with Other]
    @scala.inline
    def withServices(value: StringDictionary[AnonHandler[TProcessor, THandler]]): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

