package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageMetadata extends js.Object {
  /**
    * The date the package was created
    */
  var createdOn: js.Date = js.native
  /**
    * A direct link to download the package.
    */
  var downloadUrl: String = js.native
  /**
    * The UI uses this to display instructions, i.e. "unzip MyAgent.zip"
    */
  var filename: String = js.native
  /**
    * MD5 hash as a base64 string
    */
  var hashValue: String = js.native
  /**
    * A link to documentation
    */
  var infoUrl: String = js.native
  /**
    * The platform (win7, linux, etc.)
    */
  var platform: String = js.native
  /**
    * The type of package (e.g. "agent")
    */
  var `type`: String = js.native
  /**
    * The package version.
    */
  var version: PackageVersion = js.native
}

object PackageMetadata {
  @scala.inline
  def apply(
    createdOn: js.Date,
    downloadUrl: String,
    filename: String,
    hashValue: String,
    infoUrl: String,
    platform: String,
    `type`: String,
    version: PackageVersion
  ): PackageMetadata = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any], infoUrl = infoUrl.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageMetadata]
  }
  @scala.inline
  implicit class PackageMetadataOps[Self <: PackageMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: PackageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

