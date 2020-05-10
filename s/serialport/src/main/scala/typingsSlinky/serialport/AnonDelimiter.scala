package typingsSlinky.serialport

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelimiter extends js.Object {
  var delimiter: String | Buffer | js.Array[Double] = js.native
  var includeDelimiter: js.UndefOr[Boolean] = js.native
}

object AnonDelimiter {
  @scala.inline
  def apply(delimiter: String | Buffer | js.Array[Double]): AnonDelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelimiter]
  }
  @scala.inline
  implicit class AnonDelimiterOps[Self <: AnonDelimiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: String | Buffer | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDelimiter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDelimiter")(js.undefined)
        ret
    }
  }
  
}

