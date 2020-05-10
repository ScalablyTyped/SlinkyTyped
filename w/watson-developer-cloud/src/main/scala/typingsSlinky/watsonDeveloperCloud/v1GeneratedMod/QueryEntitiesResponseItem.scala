package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing Entity query response information. */
@js.native
trait QueryEntitiesResponseItem extends js.Object {
  /** List of different evidentiary items to support the result. */
  var evidence: js.UndefOr[js.Array[QueryEvidence]] = js.native
  /** Entity text content. */
  var text: js.UndefOr[String] = js.native
  /** The type of the result entity. */
  var `type`: js.UndefOr[String] = js.native
}

object QueryEntitiesResponseItem {
  @scala.inline
  def apply(): QueryEntitiesResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesResponseItem]
  }
  @scala.inline
  implicit class QueryEntitiesResponseItemOps[Self <: QueryEntitiesResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvidence(value: js.Array[QueryEvidence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evidence")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

