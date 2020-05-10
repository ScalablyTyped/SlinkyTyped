package typingsSlinky.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamReadOptions extends js.Object {
  var closable: js.UndefOr[Boolean] = js.native
  var readChunks: js.UndefOr[Boolean] = js.native
  var readSize: js.UndefOr[Double] = js.native
}

object IStreamReadOptions {
  @scala.inline
  def apply(): IStreamReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamReadOptions]
  }
  @scala.inline
  implicit class IStreamReadOptionsOps[Self <: IStreamReadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withReadChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withReadSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSize")(js.undefined)
        ret
    }
  }
  
}

