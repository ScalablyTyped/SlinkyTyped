package typingsSlinky.umzug.mod

import typingsSlinky.umzug.umzugStrings.json
import typingsSlinky.umzug.umzugStrings.mongodb
import typingsSlinky.umzug.umzugStrings.sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UmzugOptions extends js.Object {
  /**
    * The name of the negative method in migrations.
    */
  var downName: js.UndefOr[String] = js.native
  /**
    * The logging function.
    * A function that gets executed everytime migrations start and have ended.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  /**
    * Options for defined migration
    */
  var migrations: js.UndefOr[MigrationOptions | js.Array[Migration]] = js.native
  /**
    * The storage.
    */
  var storage: js.UndefOr[json | sequelize | mongodb | Storage] = js.native
  /**
    * The options for the storage.
    */
  var storageOptions: js.UndefOr[JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object] = js.native
  /**
    * The name of the positive method in migrations.
    */
  var upName: js.UndefOr[String] = js.native
}

object UmzugOptions {
  @scala.inline
  def apply(): UmzugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UmzugOptions]
  }
  @scala.inline
  implicit class UmzugOptionsOps[Self <: UmzugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downName")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrations(value: MigrationOptions | js.Array[Migration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: json | sequelize | mongodb | Storage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageOptions(value: JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUpName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upName")(js.undefined)
        ret
    }
  }
  
}

