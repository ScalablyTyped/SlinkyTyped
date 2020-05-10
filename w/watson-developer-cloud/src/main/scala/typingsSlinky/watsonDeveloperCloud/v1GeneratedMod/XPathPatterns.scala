package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XPathPatterns. */
@js.native
trait XPathPatterns extends js.Object {
  /** An array to XPaths. */
  var xpaths: js.UndefOr[js.Array[String]] = js.native
}

object XPathPatterns {
  @scala.inline
  def apply(): XPathPatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XPathPatterns]
  }
  @scala.inline
  implicit class XPathPatternsOps[Self <: XPathPatterns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXpaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpaths")(js.undefined)
        ret
    }
  }
  
}

