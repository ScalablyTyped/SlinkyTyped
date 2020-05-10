package typingsSlinky.umzug.mod

import typingsSlinky.sequelize.mod.DataTypeAbstract
import typingsSlinky.sequelize.mod.Model
import typingsSlinky.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequelizeStorageOptions extends Storage {
  /**
    * The name of table column holding migration name.
    * Defaults to 'name'.
    */
  var columnName: String = js.native
  /**
    * The type of the column holding migration name.
    * Defaults to `Sequelize.STRING`
    */
  var columnType: DataTypeAbstract = js.native
  /**
    * The to be used Sequelize model.
    * Must have column name matching `columnName` option
    * Optional of `sequelize` is passed.
    */
  var model: js.UndefOr[Model[_, _, _]] = js.native
  /**
    * The name of the to be used model.
    * Defaults to 'SequelizeMeta'
    */
  var modelName: js.UndefOr[String] = js.native
  /**
    * The configured instance of Sequelize.
    * Optional if `model` is passed.
    */
  var sequelize: js.UndefOr[Sequelize] = js.native
  /**
    * The name of table to create if `model` option is not supplied
    * Defaults to `modelName`
    */
  var tableName: js.UndefOr[String] = js.native
}

object SequelizeStorageOptions {
  @scala.inline
  def apply(
    columnName: String,
    columnType: DataTypeAbstract,
    executed: () => js.Promise[js.Array[String]],
    logMigration: String => js.Promise[Unit],
    unlogMigration: String => js.Promise[Unit]
  ): SequelizeStorageOptions = {
    val __obj = js.Dynamic.literal(columnName = columnName.asInstanceOf[js.Any], columnType = columnType.asInstanceOf[js.Any], executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    __obj.asInstanceOf[SequelizeStorageOptions]
  }
  @scala.inline
  implicit class SequelizeStorageOptionsOps[Self <: SequelizeStorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnType(value: DataTypeAbstract): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: Model[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(js.undefined)
        ret
    }
    @scala.inline
    def withSequelize(value: Sequelize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequelize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequelize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequelize")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

