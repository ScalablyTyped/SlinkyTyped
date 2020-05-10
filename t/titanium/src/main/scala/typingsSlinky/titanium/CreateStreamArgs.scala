package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Blob
import typingsSlinky.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to [createStream](Titanium.Stream.createStream).
  */
@js.native
trait CreateStreamArgs extends js.Object {
  /**
  	 * Mode to open the stream in.
  	 */
  var mode: js.UndefOr[Double] = js.native
  /**
  	 * Object that the stream will read from or write to.
  	 */
  var source: js.UndefOr[Blob | Buffer] = js.native
}

object CreateStreamArgs {
  @scala.inline
  def apply(): CreateStreamArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamArgs]
  }
  @scala.inline
  implicit class CreateStreamArgsOps[Self <: CreateStreamArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Blob | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

