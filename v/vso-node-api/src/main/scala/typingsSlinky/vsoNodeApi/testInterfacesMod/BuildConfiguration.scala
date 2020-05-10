package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildConfiguration extends js.Object {
  var branchName: String = js.native
  var buildDefinitionId: Double = js.native
  var flavor: String = js.native
  var id: Double = js.native
  var number: String = js.native
  var platform: String = js.native
  var project: ShallowReference = js.native
  var repositoryId: Double = js.native
  var sourceVersion: String = js.native
  var uri: String = js.native
}

object BuildConfiguration {
  @scala.inline
  def apply(
    branchName: String,
    buildDefinitionId: Double,
    flavor: String,
    id: Double,
    number: String,
    platform: String,
    project: ShallowReference,
    repositoryId: Double,
    sourceVersion: String,
    uri: String
  ): BuildConfiguration = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], buildDefinitionId = buildDefinitionId.asInstanceOf[js.Any], flavor = flavor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildConfiguration]
  }
  @scala.inline
  implicit class BuildConfigurationOps[Self <: BuildConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildDefinitionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlavor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flavor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

