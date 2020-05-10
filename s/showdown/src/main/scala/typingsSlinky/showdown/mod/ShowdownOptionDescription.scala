package typingsSlinky.showdown.mod

import typingsSlinky.showdown.showdownStrings.boolean
import typingsSlinky.showdown.showdownStrings.integer
import typingsSlinky.showdown.showdownStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown option description.
  */
@js.native
trait ShowdownOptionDescription extends js.Object {
  /**
    * The default value of option.
    */
  var defaultValue: js.UndefOr[Boolean] = js.native
  /**
    * The description of the option.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The type of the option value.
    */
  var `type`: js.UndefOr[boolean | string | integer] = js.native
}

object ShowdownOptionDescription {
  @scala.inline
  def apply(): ShowdownOptionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowdownOptionDescription]
  }
  @scala.inline
  implicit class ShowdownOptionDescriptionOps[Self <: ShowdownOptionDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: boolean | string | integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

