package typingsSlinky.soap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.soap.elementsMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypes extends js.Object {
  var types: StringDictionary[Element] = js.native
}

object AnonTypes {
  @scala.inline
  def apply(types: StringDictionary[Element]): AnonTypes = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypes]
  }
  @scala.inline
  implicit class AnonTypesOps[Self <: AnonTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: StringDictionary[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

