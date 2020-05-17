package typingsSlinky.sharp.mod

import typingsSlinky.sharp.anon.Current
import typingsSlinky.sharp.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheResult extends js.Object {
  var files: Max = js.native
  var items: Max = js.native
  var memory: Current = js.native
}

object CacheResult {
  @scala.inline
  def apply(files: Max, items: Max, memory: Current): CacheResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheResult]
  }
  @scala.inline
  implicit class CacheResultOps[Self <: CacheResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: Max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: Max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: Current): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

