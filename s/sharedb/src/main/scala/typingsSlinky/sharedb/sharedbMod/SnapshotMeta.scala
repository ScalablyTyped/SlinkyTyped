package typingsSlinky.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotMeta
  extends /* key */ StringDictionary[js.Any] {
  var ctime: Double = js.native
  var mtime: Double = js.native
}

object SnapshotMeta {
  @scala.inline
  def apply(ctime: Double, mtime: Double): SnapshotMeta = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotMeta]
  }
  @scala.inline
  implicit class SnapshotMetaOps[Self <: SnapshotMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

