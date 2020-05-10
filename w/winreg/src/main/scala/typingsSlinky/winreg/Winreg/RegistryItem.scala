package typingsSlinky.winreg.Winreg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryItem extends js.Object {
  /**
    * The hive architecture.
    * @readonly
    */
  var arch: String = js.native
  /**
    * The hive id.
    * @readonly
    */
  var hive: String = js.native
  /**
    * The hostname.
    * @readonly
    */
  var host: String = js.native
  /**
    * The registry key.
    * @readonly
    */
  var key: String = js.native
  /**
    * The value name.
    * @readonly
    */
  var name: String = js.native
  /**
    * The value type.
    * @readonly
    */
  var `type`: String = js.native
  /**
    * The value.
    * @readonly
    */
  var value: String = js.native
}

object RegistryItem {
  @scala.inline
  def apply(arch: String, hive: String, host: String, key: String, name: String, `type`: String, value: String): RegistryItem = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], hive = hive.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryItem]
  }
  @scala.inline
  implicit class RegistryItemOps[Self <: RegistryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

