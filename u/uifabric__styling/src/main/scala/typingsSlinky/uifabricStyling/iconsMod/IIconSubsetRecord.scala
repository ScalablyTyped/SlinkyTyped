package typingsSlinky.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconSubsetRecord extends IIconSubset {
  var className: js.UndefOr[String] = js.native
  var isRegistered: js.UndefOr[Boolean] = js.native
}

object IIconSubsetRecord {
  @scala.inline
  def apply(icons: StringDictionary[String | ReactElement]): IIconSubsetRecord = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconSubsetRecord]
  }
  @scala.inline
  implicit class IIconSubsetRecordOps[Self <: IIconSubsetRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRegistered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegistered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegistered")(js.undefined)
        ret
    }
  }
  
}

