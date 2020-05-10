package typingsSlinky.testingLibraryDom.queryHelpersMod

import typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorMatcherOptions extends MatcherOptions {
  var selector: js.UndefOr[String] = js.native
}

object SelectorMatcherOptions {
  @scala.inline
  def apply(): SelectorMatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectorMatcherOptions]
  }
  @scala.inline
  implicit class SelectorMatcherOptionsOps[Self <: SelectorMatcherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

