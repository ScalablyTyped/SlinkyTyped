package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template that represents a view subcomponent of an <ItemTemplate>.
  */
@js.native
trait ViewTemplate extends js.Object {
  /**
  	 * View's ID (or set of IDs) used for data binding. This value must be unique.
  	 */
  var bindId: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Contains an array of subview templates to be added (in order) as children to this view.
  	 */
  var childTemplates: js.UndefOr[js.Array[ViewTemplate]] = js.native
  /**
  	 * Contains key-value pairs of view events and their listeners that are applied to this view component.
  	 */
  var events: js.UndefOr[js.Any] = js.native
  /**
  	 * Contains key-value pairs of view properties and their values that are applied to this view component.
  	 */
  var properties: js.UndefOr[js.Any] = js.native
  /**
  	 * View's class name, for example, `Ti.UI.Button`.
  	 */
  var `type`: java.lang.String = js.native
}

object ViewTemplate {
  @scala.inline
  def apply(`type`: java.lang.String): ViewTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewTemplate]
  }
  @scala.inline
  implicit class ViewTemplateOps[Self <: ViewTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindId")(js.undefined)
        ret
    }
    @scala.inline
    def withChildTemplates(value: js.Array[ViewTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

