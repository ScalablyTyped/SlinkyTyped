package typingsSlinky.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconRecords
  extends /* key */ StringDictionary[IIconRecord | js.Object] {
  var __options: IIconOptions = js.native
  var __remapped: StringDictionary[String] = js.native
}

object IIconRecords {
  @scala.inline
  def apply(__options: IIconOptions, __remapped: StringDictionary[String]): IIconRecords = {
    val __obj = js.Dynamic.literal(__options = __options.asInstanceOf[js.Any], __remapped = __remapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconRecords]
  }
  @scala.inline
  implicit class IIconRecordsOps[Self <: IIconRecords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__options(value: IIconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__remapped(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__remapped")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

