package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  /**
    * The name of the shard.
    */
  var name: String = js.native
  /**
    * Whether this shard belongs to the PTR.
    */
  var ptr: Boolean = js.native
  /**
    * Currently always equals to normal.
    */
  var `type`: normal = js.native
}

object Shard {
  @scala.inline
  def apply(name: String, ptr: Boolean, `type`: normal): Shard = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ptr = ptr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
  @scala.inline
  implicit class ShardOps[Self <: Shard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPtr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

