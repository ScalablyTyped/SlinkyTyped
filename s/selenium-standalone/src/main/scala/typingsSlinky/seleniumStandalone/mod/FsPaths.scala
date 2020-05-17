package typingsSlinky.seleniumStandalone.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.seleniumStandalone.anon.Dictx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsPaths
  extends /* x */ StringDictionary[js.Any] {
  var chrome: js.UndefOr[Dictx] = js.native
  var edge: js.UndefOr[Dictx] = js.native
  var firefox: js.UndefOr[Dictx] = js.native
  var ie: js.UndefOr[Dictx] = js.native
  var selenium: js.UndefOr[Dictx] = js.native
}

object FsPaths {
  @scala.inline
  def apply(): FsPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FsPaths]
  }
  @scala.inline
  implicit class FsPathsOps[Self <: FsPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome(value: Dictx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(js.undefined)
        ret
    }
    @scala.inline
    def withEdge(value: Dictx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(js.undefined)
        ret
    }
    @scala.inline
    def withFirefox(value: Dictx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirefox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(js.undefined)
        ret
    }
    @scala.inline
    def withIe(value: Dictx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(js.undefined)
        ret
    }
    @scala.inline
    def withSelenium(value: Dictx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelenium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium")(js.undefined)
        ret
    }
  }
  
}

