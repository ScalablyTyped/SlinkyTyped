package typingsSlinky.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V1BaseOptions extends js.Object {
  var clockseq: js.UndefOr[Double] = js.native
  var msecs: js.UndefOr[Double | js.Date] = js.native
  var node: js.UndefOr[InputBuffer] = js.native
  var nsecs: js.UndefOr[Double] = js.native
}

object V1BaseOptions {
  @scala.inline
  def apply(): V1BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1BaseOptions]
  }
  @scala.inline
  implicit class V1BaseOptionsOps[Self <: V1BaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClockseq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockseq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockseq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockseq")(js.undefined)
        ret
    }
    @scala.inline
    def withMsecsDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsecs(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msecs")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: InputBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withNsecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsecs")(js.undefined)
        ret
    }
  }
  
}

