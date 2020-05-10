package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSettingsIteration extends TeamSettingsDataContractBase {
  /**
    * Attributes such as start and end date
    */
  var attributes: TeamIterationAttributes = js.native
  /**
    * Id of the resource
    */
  var id: String = js.native
  /**
    * Name of the resource
    */
  var name: String = js.native
  /**
    * Relative path of the iteration
    */
  var path: String = js.native
}

object TeamSettingsIteration {
  @scala.inline
  def apply(
    _links: js.Any,
    attributes: TeamIterationAttributes,
    id: String,
    name: String,
    path: String,
    url: String
  ): TeamSettingsIteration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsIteration]
  }
  @scala.inline
  implicit class TeamSettingsIterationOps[Self <: TeamSettingsIteration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: TeamIterationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

