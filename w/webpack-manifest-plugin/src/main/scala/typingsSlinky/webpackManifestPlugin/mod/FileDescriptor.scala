package typingsSlinky.webpackManifestPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDescriptor extends js.Object {
  /** Only available is isChunk is true. */
  var chunk: js.UndefOr[Chunk] = js.native
  var isAsset: Boolean = js.native
  var isChunk: Boolean = js.native
  /** Is required to run you app. Cannot be true if isChunk is false. */
  var isInitial: Boolean = js.native
  /** Is required by a module. Cannot be true if isAsset is false. */
  var isModuleAsset: Boolean = js.native
  var name: String | Null = js.native
  var path: String = js.native
}

object FileDescriptor {
  @scala.inline
  def apply(isAsset: Boolean, isChunk: Boolean, isInitial: Boolean, isModuleAsset: Boolean, path: String): FileDescriptor = {
    val __obj = js.Dynamic.literal(isAsset = isAsset.asInstanceOf[js.Any], isChunk = isChunk.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isModuleAsset = isModuleAsset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptor]
  }
  @scala.inline
  implicit class FileDescriptorOps[Self <: FileDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAsset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChunk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInitial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsModuleAsset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModuleAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunk(value: Chunk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

