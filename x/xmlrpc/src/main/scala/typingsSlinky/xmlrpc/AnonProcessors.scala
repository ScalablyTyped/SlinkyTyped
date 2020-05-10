package typingsSlinky.xmlrpc

import typingsSlinky.xmlrpc.mod.HeadersProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProcessors extends js.Object {
  var processors: js.Array[HeadersProcessor] = js.native
}

object AnonProcessors {
  @scala.inline
  def apply(processors: js.Array[HeadersProcessor]): AnonProcessors = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProcessors]
  }
  @scala.inline
  implicit class AnonProcessorsOps[Self <: AnonProcessors] (val x: Self) extends AnyVal {
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

