package typingsSlinky.stylefire.buildMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stylefire.anon.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAttrs
  extends /* key */ StringDictionary[js.Any] {
  var style: js.UndefOr[Transform] = js.native
}

object SVGAttrs {
  @scala.inline
  def apply(): SVGAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttrs]
  }
  @scala.inline
  implicit class SVGAttrsOps[Self <: SVGAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

