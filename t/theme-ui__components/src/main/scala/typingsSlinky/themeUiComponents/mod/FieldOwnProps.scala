package typingsSlinky.themeUiComponents.mod

import typingsSlinky.styledSystem.mod.MarginProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOwnProps extends MarginProps[RequiredTheme] {
  /**
    * Text for Label component
    */
  var label: String = js.native
  /**
    * Used for the for, id, and name attributes
    */
  var name: String = js.native
}

object FieldOwnProps {
  @scala.inline
  def apply(label: String, name: String): FieldOwnProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOwnProps]
  }
  @scala.inline
  implicit class FieldOwnPropsOps[Self <: FieldOwnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

