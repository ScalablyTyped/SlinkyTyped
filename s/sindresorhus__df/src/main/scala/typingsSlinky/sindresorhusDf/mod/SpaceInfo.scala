package typingsSlinky.sindresorhusDf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpaceInfo extends js.Object {
  /**
  		 * Available size in bytes.
  		 */
  val available: Double = js.native
  /**
  		 * Capacity as a float from `0` to `1`.
  		 */
  val capacity: Double = js.native
  /**
  		 * Name of the filesystem.
  		 */
  val filesystem: String = js.native
  /**
  		 * Disk mount location.
  		 */
  val mountpoint: String = js.native
  /**
  		 * Total size in bytes.
  		 */
  val size: Double = js.native
  /**
  		 * Used size in bytes.
  		 */
  val used: Double = js.native
}

object SpaceInfo {
  @scala.inline
  def apply(
    available: Double,
    capacity: Double,
    filesystem: String,
    mountpoint: String,
    size: Double,
    used: Double
  ): SpaceInfo = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], mountpoint = mountpoint.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceInfo]
  }
  @scala.inline
  implicit class SpaceInfoOps[Self <: SpaceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

