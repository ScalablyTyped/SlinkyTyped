package typingsSlinky.webicon.svgIconOptionsMod

import typingsSlinky.webicon.sizeableOptionsMod.SizeableOptions
import typingsSlinky.webicon.storeableMod.Storeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.webicon.sizeableMod.Sizeable because Already inherited
- typingsSlinky.webicon.iconMod.Icon because Already inherited
- typingsSlinky.webicon.svgIconMod.SvgIcon because var conflicts: iconIdParser, iconSize. Inlined viewBox */ @js.native
trait SvgIconOptions
  extends Storeable
     with SizeableOptions {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[String] = js.native
}

object SvgIconOptions {
  @scala.inline
  def apply(): SvgIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgIconOptions]
  }
  @scala.inline
  implicit class SvgIconOptionsOps[Self <: SvgIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(js.undefined)
        ret
    }
  }
  
}

