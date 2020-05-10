package typingsSlinky.tensorflowTfjsConverter.compiledApiMod.MetaGraphDef

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.IAny
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.IOpList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MetaInfoDef. */
@js.native
trait IMetaInfoDef extends js.Object {
  /** MetaInfoDef anyInfo */
  var anyInfo: js.UndefOr[IAny | Null] = js.native
  /** MetaInfoDef metaGraphVersion */
  var metaGraphVersion: js.UndefOr[String | Null] = js.native
  /** MetaInfoDef strippedOpList */
  var strippedOpList: js.UndefOr[IOpList | Null] = js.native
  /** MetaInfoDef tags */
  var tags: js.UndefOr[js.Array[String] | Null] = js.native
  /** MetaInfoDef tensorflowGitVersion */
  var tensorflowGitVersion: js.UndefOr[String | Null] = js.native
  /** MetaInfoDef tensorflowVersion */
  var tensorflowVersion: js.UndefOr[String | Null] = js.native
}

object IMetaInfoDef {
  @scala.inline
  def apply(): IMetaInfoDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetaInfoDef]
  }
  @scala.inline
  implicit class IMetaInfoDefOps[Self <: IMetaInfoDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyInfo(value: IAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withAnyInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyInfo")(null)
        ret
    }
    @scala.inline
    def withMetaGraphVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaGraphVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaGraphVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaGraphVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaGraphVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaGraphVersion")(null)
        ret
    }
    @scala.inline
    def withStrippedOpList(value: IOpList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strippedOpList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrippedOpList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strippedOpList")(js.undefined)
        ret
    }
    @scala.inline
    def withStrippedOpListNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strippedOpList")(null)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(null)
        ret
    }
    @scala.inline
    def withTensorflowGitVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowGitVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorflowGitVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowGitVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTensorflowGitVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowGitVersion")(null)
        ret
    }
    @scala.inline
    def withTensorflowVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorflowVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTensorflowVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowVersion")(null)
        ret
    }
  }
  
}

