package typingsSlinky.selectize.Selectize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom rendering functions. Each function should accept two arguments: "data" and "escape" and return
  * HTML (string) with a single root element. The "escape" argument is a function that takes a string and
  * escapes all special HTML characters. This is very important to use to prevent XSS vulnerabilities.
  */
@js.native
trait ICustomRenderers[U] extends js.Object {
  // An item the user has selected.
  var item: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
  // The wrapper for an optgroup. The "html" property in the data will be the raw html of the optgroup's header
  // and options.
  var optgroup: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
  // The header of an option group.
  var optgroup_header: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
  // An option in the dropdown list of available options.
  var option: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
  // The "create new" option at the bottom of the dropdown. The data contains one property: "input"
  // (which is what the user has typed).
  var option_create: js.UndefOr[
    js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
  ] = js.native
}

object ICustomRenderers {
  @scala.inline
  def apply[U](): ICustomRenderers[U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomRenderers[U]]
  }
  @scala.inline
  implicit class ICustomRenderersOps[Self[u] <: ICustomRenderers[u], U] (val x: Self[U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[U] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[U] with Other]
    @scala.inline
    def withItem(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItem: Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withOptgroup(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOptgroup: Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOptgroup_header(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroup_header")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOptgroup_header: Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroup_header")(js.undefined)
        ret
    }
    @scala.inline
    def withOption(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOption: Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.undefined)
        ret
    }
    @scala.inline
    def withOption_create(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option_create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOption_create: Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option_create")(js.undefined)
        ret
    }
  }
  
}

