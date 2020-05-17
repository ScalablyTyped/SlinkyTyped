package typingsSlinky.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stripe.mod.IObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Previousattributes extends js.Object {
  /**
    * describes the object the event is about. For example, an
    * invoice.created event will have a full invoice object as the value of
    * the object key.
    */
  var `object`: IObject = js.native
  var previous_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Previousattributes {
  @scala.inline
  def apply(`object`: IObject): Previousattributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previousattributes]
  }
  @scala.inline
  implicit class PreviousattributesOps[Self <: Previousattributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: IObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious_attributes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_attributes")(js.undefined)
        ret
    }
  }
  
}

