package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvnMappingDetails extends js.Object {
  /**
    * The depth.
    */
  var depth: Double = js.native
  /**
    * Indicates whether to ignore externals.
    */
  var ignoreExternals: Boolean = js.native
  /**
    * The local path.
    */
  var localPath: String = js.native
  /**
    * The revision.
    */
  var revision: String = js.native
  /**
    * The server path.
    */
  var serverPath: String = js.native
}

object SvnMappingDetails {
  @scala.inline
  def apply(depth: Double, ignoreExternals: Boolean, localPath: String, revision: String, serverPath: String): SvnMappingDetails = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], ignoreExternals = ignoreExternals.asInstanceOf[js.Any], localPath = localPath.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvnMappingDetails]
  }
  @scala.inline
  implicit class SvnMappingDetailsOps[Self <: SvnMappingDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreExternals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExternals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

