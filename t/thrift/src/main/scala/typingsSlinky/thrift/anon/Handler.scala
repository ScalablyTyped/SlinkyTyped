package typingsSlinky.thrift.anon

import typingsSlinky.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler[TProcessor, THandler] extends js.Object {
  var handler: THandler = js.native
  var processor: TProcessorConstructor[TProcessor, THandler] = js.native
}

object Handler {
  @scala.inline
  def apply[TProcessor, THandler](handler: THandler, processor: TProcessorConstructor[TProcessor, THandler]): Handler[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler[TProcessor, THandler]]
  }
  @scala.inline
  implicit class HandlerOps[Self[tprocessor, thandler] <: Handler[tprocessor, thandler], TProcessor, THandler] (val x: Self[TProcessor, THandler]) extends AnyVal {
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
    def withProcessor(value: TProcessorConstructor[TProcessor, THandler]): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

