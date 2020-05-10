package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISavedModel extends js.Object {
  /** SavedModel metaGraphs */
  var metaGraphs: js.UndefOr[js.Array[IMetaGraphDef] | Null] = js.native
  /** SavedModel savedModelSchemaVersion */
  var savedModelSchemaVersion: js.UndefOr[Double | String | Null] = js.native
}

object ISavedModel {
  @scala.inline
  def apply(): ISavedModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISavedModel]
  }
  @scala.inline
  implicit class ISavedModelOps[Self <: ISavedModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetaGraphs(value: js.Array[IMetaGraphDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaGraphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaGraphs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaGraphs")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaGraphsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaGraphs")(null)
        ret
    }
    @scala.inline
    def withSavedModelSchemaVersion(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedModelSchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedModelSchemaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedModelSchemaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedModelSchemaVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedModelSchemaVersion")(null)
        ret
    }
  }
  
}

