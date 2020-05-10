package typingsSlinky.tarFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractOptions extends Options {
  @JSName("filter")
  var filter_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.native
  @JSName("ignore")
  var ignore_ExtractOptions: js.UndefOr[js.Function2[/* name */ String, /* header */ js.UndefOr[Headers], Boolean]] = js.native
}

object ExtractOptions {
  @scala.inline
  def apply(): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractOptions]
  }
  @scala.inline
  implicit class ExtractOptionsOps[Self <: ExtractOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: (/* name */ String, /* header */ js.UndefOr[Headers]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
  }
  
}

