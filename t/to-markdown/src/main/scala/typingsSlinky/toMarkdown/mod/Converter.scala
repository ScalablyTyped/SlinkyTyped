package typingsSlinky.toMarkdown.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  var filter: Filter = js.native
  def replacement(innerHTML: String, node: HTMLElement): String = js.native
}

object Converter {
  @scala.inline
  def apply(filter: Filter, replacement: (String, HTMLElement) => String): Converter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
    __obj.asInstanceOf[Converter]
  }
  @scala.inline
  implicit class ConverterOps[Self <: Converter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterFunction1(value: /* node */ HTMLElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacement(value: (String, HTMLElement) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

