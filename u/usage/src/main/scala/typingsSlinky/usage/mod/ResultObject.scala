package typingsSlinky.usage.mod

import typingsSlinky.usage.anon.Rss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultObject extends js.Object {
  var cpu: Double = js.native
  var memory: Double = js.native
  var memoryInfo: Rss = js.native
}

object ResultObject {
  @scala.inline
  def apply(cpu: Double, memory: Double, memoryInfo: Rss): ResultObject = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryInfo = memoryInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultObject]
  }
  @scala.inline
  implicit class ResultObjectOps[Self <: ResultObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoryInfo(value: Rss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

