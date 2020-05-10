package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.SaverDef.CheckpointFormatVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISaverDef extends js.Object {
  /** SaverDef filenameTensorName */
  var filenameTensorName: js.UndefOr[String | Null] = js.native
  /** SaverDef keepCheckpointEveryNHours */
  var keepCheckpointEveryNHours: js.UndefOr[Double | Null] = js.native
  /** SaverDef maxToKeep */
  var maxToKeep: js.UndefOr[Double | Null] = js.native
  /** SaverDef restoreOpName */
  var restoreOpName: js.UndefOr[String | Null] = js.native
  /** SaverDef saveTensorName */
  var saveTensorName: js.UndefOr[String | Null] = js.native
  /** SaverDef sharded */
  var sharded: js.UndefOr[Boolean | Null] = js.native
  /** SaverDef version */
  var version: js.UndefOr[CheckpointFormatVersion | Null] = js.native
}

object ISaverDef {
  @scala.inline
  def apply(): ISaverDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISaverDef]
  }
  @scala.inline
  implicit class ISaverDefOps[Self <: ISaverDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilenameTensorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameTensorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilenameTensorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameTensorName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameTensorNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameTensorName")(null)
        ret
    }
    @scala.inline
    def withKeepCheckpointEveryNHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCheckpointEveryNHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCheckpointEveryNHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCheckpointEveryNHours")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepCheckpointEveryNHoursNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCheckpointEveryNHours")(null)
        ret
    }
    @scala.inline
    def withMaxToKeep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxToKeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxToKeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxToKeep")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxToKeepNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxToKeep")(null)
        ret
    }
    @scala.inline
    def withRestoreOpName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreOpName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreOpName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreOpName")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreOpNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreOpName")(null)
        ret
    }
    @scala.inline
    def withSaveTensorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveTensorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveTensorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveTensorName")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveTensorNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveTensorName")(null)
        ret
    }
    @scala.inline
    def withSharded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharded")(js.undefined)
        ret
    }
    @scala.inline
    def withShardedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharded")(null)
        ret
    }
    @scala.inline
    def withVersion(value: CheckpointFormatVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(null)
        ret
    }
  }
  
}

