package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactTypeDefinition extends js.Object {
  var displayName: String = js.native
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  var name: String = js.native
  var uniqueSourceIdentifier: String = js.native
}

object ArtifactTypeDefinition {
  @scala.inline
  def apply(
    displayName: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String,
    uniqueSourceIdentifier: String
  ): ArtifactTypeDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uniqueSourceIdentifier = uniqueSourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactTypeDefinition]
  }
  @scala.inline
  implicit class ArtifactTypeDefinitionOps[Self <: ArtifactTypeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
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

