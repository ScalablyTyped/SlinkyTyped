package typingsSlinky.storybookComponents.tabsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsStateProps extends js.Object {
  var absolute: Boolean = js.native
  var backgroundColor: String = js.native
  var bordered: Boolean = js.native
  var children: js.Array[TagMod[Any] | FuncChilden] = js.native
  var initial: String = js.native
}

object TabsStateProps {
  @scala.inline
  def apply(
    absolute: Boolean,
    backgroundColor: String,
    bordered: Boolean,
    children: js.Array[TagMod[Any] | FuncChilden],
    initial: String
  ): TabsStateProps = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsStateProps]
  }
  @scala.inline
  implicit class TabsStatePropsOps[Self <: TabsStateProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[TagMod[Any] | FuncChilden]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

