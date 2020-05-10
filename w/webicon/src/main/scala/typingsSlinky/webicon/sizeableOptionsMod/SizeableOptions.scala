package typingsSlinky.webicon.sizeableOptionsMod

import typingsSlinky.webicon.sizeableMod.Sizeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeableOptions extends Sizeable {
  /**
    * An alias of the `iconSize`-property.
    */
  var size: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.native
  /**
    * An alias of the `iconSize`-property.
    */
  var svgIconSize: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.native
}

object SizeableOptions {
  @scala.inline
  def apply(): SizeableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeableOptions]
  }
  @scala.inline
  implicit class SizeableOptionsOps[Self <: SizeableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgIconSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgIconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgIconSize")(js.undefined)
        ret
    }
  }
  
}

