package typingsSlinky.xstream.fromDiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromDiagramOptions extends js.Object {
  var errorValue: js.UndefOr[js.Any] = js.native
  var timeUnit: js.UndefOr[Double] = js.native
  var values: js.UndefOr[js.Object] = js.native
}

object FromDiagramOptions {
  @scala.inline
  def apply(): FromDiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromDiagramOptions]
  }
  @scala.inline
  implicit class FromDiagramOptionsOps[Self <: FromDiagramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

