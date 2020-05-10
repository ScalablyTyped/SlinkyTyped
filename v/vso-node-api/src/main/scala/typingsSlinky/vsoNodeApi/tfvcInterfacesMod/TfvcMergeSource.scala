package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcMergeSource extends js.Object {
  /**
    * Indicates if this a rename source. If false, it is a merge source.
    */
  var isRename: Boolean = js.native
  /**
    * The server item of the merge source
    */
  var serverItem: String = js.native
  /**
    * Start of the version range
    */
  var versionFrom: Double = js.native
  /**
    * End of the version range
    */
  var versionTo: Double = js.native
}

object TfvcMergeSource {
  @scala.inline
  def apply(isRename: Boolean, serverItem: String, versionFrom: Double, versionTo: Double): TfvcMergeSource = {
    val __obj = js.Dynamic.literal(isRename = isRename.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any], versionFrom = versionFrom.asInstanceOf[js.Any], versionTo = versionTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcMergeSource]
  }
  @scala.inline
  implicit class TfvcMergeSourceOps[Self <: TfvcMergeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

