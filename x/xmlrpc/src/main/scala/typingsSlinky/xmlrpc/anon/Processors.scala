package typingsSlinky.xmlrpc.anon

import typingsSlinky.xmlrpc.mod.HeadersProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Processors extends js.Object {
  var processors: js.Array[HeadersProcessor] = js.native
}

object Processors {
  @scala.inline
  def apply(processors: js.Array[HeadersProcessor]): Processors = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processors]
  }
  @scala.inline
  implicit class ProcessorsOps[Self <: Processors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessors(value: js.Array[HeadersProcessor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

