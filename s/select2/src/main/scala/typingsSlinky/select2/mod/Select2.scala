package typingsSlinky.select2.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.select2.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select2 extends js.Object {
  @JSName("$container")
  var $container: JQuery[HTMLElement] = js.native
  @JSName("$dropdown")
  var $dropdown: JQuery[HTMLElement] = js.native
  @JSName("$results")
  var $results: JQuery[HTMLElement] = js.native
  @JSName("$selection")
  var $selection: JQuery[HTMLElement] = js.native
  var dropdown: js.Any = js.native
  var id: String = js.native
  var options: typingsSlinky.select2.anon.Options = js.native
  var results: js.Any = js.native
  var selection: js.Any = js.native
}

object Select2 {
  @scala.inline
  def apply(
    $container: JQuery[HTMLElement],
    $dropdown: JQuery[HTMLElement],
    $results: JQuery[HTMLElement],
    $selection: JQuery[HTMLElement],
    dropdown: js.Any,
    id: String,
    options: typingsSlinky.select2.anon.Options,
    results: js.Any,
    selection: js.Any
  ): Select2 = {
    val __obj = js.Dynamic.literal($container = $container.asInstanceOf[js.Any], $dropdown = $dropdown.asInstanceOf[js.Any], $results = $results.asInstanceOf[js.Any], $selection = $selection.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select2]
  }
  @scala.inline
  implicit class Select2Ops[Self <: Select2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$container(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$dropdown(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$results(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$selection(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: typingsSlinky.select2.anon.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

