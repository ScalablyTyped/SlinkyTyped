package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactContributionDefinition extends js.Object {
  var artifactType: String = js.native
  var artifactTypeStreamMapping: StringDictionary[String] = js.native
  var browsableArtifactTypeMapping: StringDictionary[String] = js.native
  var dataSourceBindings: js.Array[DataSourceBinding] = js.native
  var displayName: String = js.native
  var downloadTaskId: String = js.native
  var endpointTypeId: String = js.native
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  var name: String = js.native
  var uniqueSourceIdentifier: String = js.native
}

object ArtifactContributionDefinition {
  @scala.inline
  def apply(
    artifactType: String,
    artifactTypeStreamMapping: StringDictionary[String],
    browsableArtifactTypeMapping: StringDictionary[String],
    dataSourceBindings: js.Array[DataSourceBinding],
    displayName: String,
    downloadTaskId: String,
    endpointTypeId: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String,
    uniqueSourceIdentifier: String
  ): ArtifactContributionDefinition = {
    val __obj = js.Dynamic.literal(artifactType = artifactType.asInstanceOf[js.Any], artifactTypeStreamMapping = artifactTypeStreamMapping.asInstanceOf[js.Any], browsableArtifactTypeMapping = browsableArtifactTypeMapping.asInstanceOf[js.Any], dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], downloadTaskId = downloadTaskId.asInstanceOf[js.Any], endpointTypeId = endpointTypeId.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uniqueSourceIdentifier = uniqueSourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactContributionDefinition]
  }
  @scala.inline
  implicit class ArtifactContributionDefinitionOps[Self <: ArtifactContributionDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactTypeStreamMapping(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactTypeStreamMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowsableArtifactTypeMapping(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsableArtifactTypeMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSourceBindings(value: js.Array[DataSourceBinding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDescriptors(value: js.Array[InputDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueSourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueSourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

