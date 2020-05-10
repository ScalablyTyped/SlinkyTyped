package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Disambiguation information for the entity. */
@js.native
trait DisambiguationResult extends js.Object {
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.native
  /** Common entity name. */
  var name: js.UndefOr[String] = js.native
  /** Entity subtype information. */
  var subtype: js.UndefOr[js.Array[String]] = js.native
}

object DisambiguationResult {
  @scala.inline
  def apply(): DisambiguationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisambiguationResult]
  }
  @scala.inline
  implicit class DisambiguationResultOps[Self <: DisambiguationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbpedia_resource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbpedia_resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbpedia_resource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbpedia_resource")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtype(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(js.undefined)
        ret
    }
  }
  
}

