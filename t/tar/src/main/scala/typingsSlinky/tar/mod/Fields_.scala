package typingsSlinky.tar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields_ extends js.Object {
  var cksum: Double = js.native
  var devmaj: Double = js.native
  var devmin: Double = js.native
  var fill: Double = js.native
  var gid: Double = js.native
  var gname: Double = js.native
  var linkpath: Double = js.native
  var mode: Double = js.native
  var mtime: Double = js.native
  var path: Double = js.native
  var prefix: Double = js.native
  var size: Double = js.native
  var `type`: Double = js.native
  var uid: Double = js.native
  var uname: Double = js.native
  var ustar: Double = js.native
  var ustarvar: Double = js.native
}

object Fields_ {
  @scala.inline
  def apply(
    cksum: Double,
    devmaj: Double,
    devmin: Double,
    fill: Double,
    gid: Double,
    gname: Double,
    linkpath: Double,
    mode: Double,
    mtime: Double,
    path: Double,
    prefix: Double,
    size: Double,
    `type`: Double,
    uid: Double,
    uname: Double,
    ustar: Double,
    ustarvar: Double
  ): Fields_ = {
    val __obj = js.Dynamic.literal(cksum = cksum.asInstanceOf[js.Any], devmaj = devmaj.asInstanceOf[js.Any], devmin = devmin.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], gname = gname.asInstanceOf[js.Any], linkpath = linkpath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any], ustar = ustar.asInstanceOf[js.Any], ustarvar = ustarvar.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields_]
  }
  @scala.inline
  implicit class Fields_Ops[Self <: Fields_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCksum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevmaj(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devmaj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGname(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkpath(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUname(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUstar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ustar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUstarvar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ustarvar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

