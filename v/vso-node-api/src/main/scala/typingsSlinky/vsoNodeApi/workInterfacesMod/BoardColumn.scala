package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoardColumn extends js.Object {
  var columnType: BoardColumnType = js.native
  var description: String = js.native
  var id: String = js.native
  var isSplit: Boolean = js.native
  var itemLimit: Double = js.native
  var name: String = js.native
  var stateMappings: StringDictionary[String] = js.native
}

object BoardColumn {
  @scala.inline
  def apply(
    columnType: BoardColumnType,
    description: String,
    id: String,
    isSplit: Boolean,
    itemLimit: Double,
    name: String,
    stateMappings: StringDictionary[String]
  ): BoardColumn = {
    val __obj = js.Dynamic.literal(columnType = columnType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSplit = isSplit.asInstanceOf[js.Any], itemLimit = itemLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stateMappings = stateMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardColumn]
  }
  @scala.inline
  implicit class BoardColumnOps[Self <: BoardColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnType(value: BoardColumnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSplit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateMappings(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMappings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

