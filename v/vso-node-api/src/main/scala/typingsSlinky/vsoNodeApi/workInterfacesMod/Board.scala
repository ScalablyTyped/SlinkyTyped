package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Board extends BoardReference {
  var _links: js.Any = js.native
  var allowedMappings: StringDictionary[StringDictionary[js.Array[String]]] = js.native
  var canEdit: Boolean = js.native
  var columns: js.Array[BoardColumn] = js.native
  var fields: BoardFields = js.native
  var isValid: Boolean = js.native
  var revision: Double = js.native
  var rows: js.Array[BoardRow] = js.native
}

object Board {
  @scala.inline
  def apply(
    _links: js.Any,
    allowedMappings: StringDictionary[StringDictionary[js.Array[String]]],
    canEdit: Boolean,
    columns: js.Array[BoardColumn],
    fields: BoardFields,
    id: String,
    isValid: Boolean,
    name: String,
    revision: Double,
    rows: js.Array[BoardRow],
    url: String
  ): Board = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], allowedMappings = allowedMappings.asInstanceOf[js.Any], canEdit = canEdit.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Board]
  }
  @scala.inline
  implicit class BoardOps[Self <: Board] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedMappings(value: StringDictionary[StringDictionary[js.Array[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[BoardColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: BoardFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[BoardRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

