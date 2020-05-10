package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object specifiying the semantic roles enrichment and related parameters. */
@js.native
trait NluEnrichmentSemanticRoles extends js.Object {
  /** When `true`, entities are extracted from the identified sentence parts. */
  var entities: js.UndefOr[Boolean] = js.native
  /** When `true`, keywords are extracted from the identified sentence parts. */
  var keywords: js.UndefOr[Boolean] = js.native
  /** The maximum number of semantic roles enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
}

object NluEnrichmentSemanticRoles {
  @scala.inline
  def apply(): NluEnrichmentSemanticRoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentSemanticRoles]
  }
  @scala.inline
  implicit class NluEnrichmentSemanticRolesOps[Self <: NluEnrichmentSemanticRoles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
  }
  
}

