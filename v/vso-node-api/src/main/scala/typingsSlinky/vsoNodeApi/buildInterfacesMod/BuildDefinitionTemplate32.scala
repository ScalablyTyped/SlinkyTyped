package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildDefinitionTemplate32 extends js.Object {
  var canDelete: Boolean = js.native
  var category: String = js.native
  var description: String = js.native
  var iconTaskId: String = js.native
  var icons: StringDictionary[String] = js.native
  var id: String = js.native
  var name: String = js.native
  var template: BuildDefinition32 = js.native
}

object BuildDefinitionTemplate32 {
  @scala.inline
  def apply(
    canDelete: Boolean,
    category: String,
    description: String,
    iconTaskId: String,
    icons: StringDictionary[String],
    id: String,
    name: String,
    template: BuildDefinition32
  ): BuildDefinitionTemplate32 = {
    val __obj = js.Dynamic.literal(canDelete = canDelete.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconTaskId = iconTaskId.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionTemplate32]
  }
  @scala.inline
  implicit class BuildDefinitionTemplate32Ops[Self <: BuildDefinitionTemplate32] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcons(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: BuildDefinition32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

