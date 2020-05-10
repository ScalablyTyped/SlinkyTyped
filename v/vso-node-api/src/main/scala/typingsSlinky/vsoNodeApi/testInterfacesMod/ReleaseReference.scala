package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseReference extends js.Object {
  var definitionId: Double = js.native
  var environmentDefinitionId: Double = js.native
  var environmentDefinitionName: String = js.native
  var environmentId: Double = js.native
  var environmentName: String = js.native
  var id: Double = js.native
  var name: String = js.native
}

object ReleaseReference {
  @scala.inline
  def apply(
    definitionId: Double,
    environmentDefinitionId: Double,
    environmentDefinitionName: String,
    environmentId: Double,
    environmentName: String,
    id: Double,
    name: String
  ): ReleaseReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any], environmentDefinitionName = environmentDefinitionName.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseReference]
  }
  @scala.inline
  implicit class ReleaseReferenceOps[Self <: ReleaseReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentDefinitionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentDefinitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentDefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
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
  }
  
}

