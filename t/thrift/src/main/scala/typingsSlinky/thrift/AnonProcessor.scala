package typingsSlinky.thrift

import typingsSlinky.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProcessor[THandler, TProcessor] extends TProcessorConstructor[TProcessor, THandler] {
  var Processor: AnonInstantiable[THandler, TProcessor] = js.native
}

object AnonProcessor {
  @scala.inline
  def apply[THandler, TProcessor](Processor: AnonInstantiable[THandler, TProcessor]): AnonProcessor[THandler, TProcessor] = {
    val __obj = js.Dynamic.literal(Processor = Processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProcessor[THandler, TProcessor]]
  }
  @scala.inline
  implicit class AnonProcessorOps[Self[thandler, tprocessor] <: AnonProcessor[thandler, tprocessor], THandler, TProcessor] (val x: Self[THandler, TProcessor]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THandler, TProcessor] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THandler, TProcessor]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[THandler, TProcessor]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[THandler, TProcessor]) with Other]
    @scala.inline
    def withProcessor(value: AnonInstantiable[THandler, TProcessor]): Self[THandler, TProcessor] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

