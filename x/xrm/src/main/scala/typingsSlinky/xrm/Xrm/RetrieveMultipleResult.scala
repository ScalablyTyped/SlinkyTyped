package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the WebAPI RetrieveMultiple request response
  */
@js.native
trait RetrieveMultipleResult extends js.Object {
  /**
    * An array of JSON objects, where each object represents the retrieved entity record containing attributes and their values as key: value pairs. The Id of the entity record is retrieved by default.
    */
  var entities: js.Array[_] = js.native
  /**
    * If the number of records being retrieved is more than the value specified in the maxPageSize parameter, this attribute returns the URL to return next set of records.
    */
  var nextLink: String = js.native
}

object RetrieveMultipleResult {
  @scala.inline
  def apply(entities: js.Array[_], nextLink: String): RetrieveMultipleResult = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMultipleResult]
  }
  @scala.inline
  implicit class RetrieveMultipleResultOps[Self <: RetrieveMultipleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

