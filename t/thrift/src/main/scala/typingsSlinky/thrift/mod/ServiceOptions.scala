package typingsSlinky.thrift.mod

import typingsSlinky.thrift.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOptions[TProcessor, THandler] extends js.Object {
  var handler: js.UndefOr[THandler] = js.native
  var processor: js.UndefOr[AnonInstantiable[THandler, TProcessor]] = js.native
  var protocol: js.UndefOr[TProtocolConstructor] = js.native
  var transport: js.UndefOr[TTransportConstructor] = js.native
}

object ServiceOptions {
  @scala.inline
  def apply[TProcessor, THandler](): ServiceOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceOptions[TProcessor, THandler]]
  }
  @scala.inline
  implicit class ServiceOptionsOps[Self[tprocessor, thandler] <: ServiceOptions[tprocessor, thandler], TProcessor, THandler] (val x: Self[TProcessor, THandler]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProcessor, THandler] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProcessor, THandler]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProcessor, THandler]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProcessor, THandler]) with Other]
    @scala.inline
    def withHandler(value: THandler): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessor(value: AnonInstantiable[THandler, TProcessor]): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessor: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: TProtocolConstructor): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: TTransportConstructor): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
  }
  
}

