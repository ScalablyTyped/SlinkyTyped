package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoardCardSettings extends js.Object {
  var cards: StringDictionary[js.Array[FieldSetting]] = js.native
}

object BoardCardSettings {
  @scala.inline
  def apply(cards: StringDictionary[js.Array[FieldSetting]]): BoardCardSettings = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardCardSettings]
  }
  @scala.inline
  implicit class BoardCardSettingsOps[Self <: BoardCardSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCards(value: StringDictionary[js.Array[FieldSetting]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

