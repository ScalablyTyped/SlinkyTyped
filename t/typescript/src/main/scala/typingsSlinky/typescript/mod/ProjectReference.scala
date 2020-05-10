package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectReference extends js.Object {
  /** True if it is intended that this reference form a circularity */
  var circular: js.UndefOr[Boolean] = js.native
  /** The path as the user originally wrote it */
  var originalPath: js.UndefOr[java.lang.String] = js.native
  /** A normalized path on disk */
  var path: java.lang.String = js.native
  /** True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations */
  var prepend: js.UndefOr[Boolean] = js.native
}

object ProjectReference {
  @scala.inline
  def apply(path: java.lang.String): ProjectReference = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
  @scala.inline
  implicit class ProjectReferenceOps[Self <: ProjectReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircular(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalPath(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
  }
  
}

