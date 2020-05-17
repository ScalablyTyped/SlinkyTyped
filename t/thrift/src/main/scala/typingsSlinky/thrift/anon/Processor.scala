package typingsSlinky.thrift.anon

import typingsSlinky.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Processor[THandler, TProcessor] extends TProcessorConstructor[TProcessor, THandler] {
  var Processor: Instantiable[THandler, TProcessor] = js.native
}

object Processor {
  @scala.inline
  def apply[THandler, TProcessor](Processor: Instantiable[THandler, TProcessor]): Processor[THandler, TProcessor] = {
    val __obj = js.Dynamic.literal(Processor = Processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processor[THandler, TProcessor]]
  }
  @scala.inline
  implicit class ProcessorOps[Self[thandler, tprocessor] <: Processor[thandler, tprocessor], THandler, TProcessor] (val x: Self[THandler, TProcessor]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THandler, TProcessor] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THandler, TProcessor]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[THandler, TProcessor]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[THandler, TProcessor]) with Other]
    @scala.inline
    def withProcessor(value: Instantiable[THandler, TProcessor]): Self[THandler, TProcessor] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

