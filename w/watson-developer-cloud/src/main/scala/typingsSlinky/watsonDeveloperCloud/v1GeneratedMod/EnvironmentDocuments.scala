package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Summary of the document usage statistics for the environment. */
@js.native
trait EnvironmentDocuments extends js.Object {
  /** Number of documents indexed for the environment. */
  var indexed: js.UndefOr[Double] = js.native
  /** Total number of documents allowed in the environment's capacity. */
  var maximum_allowed: js.UndefOr[Double] = js.native
}

object EnvironmentDocuments {
  @scala.inline
  def apply(): EnvironmentDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDocuments]
  }
  @scala.inline
  implicit class EnvironmentDocumentsOps[Self <: EnvironmentDocuments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexed")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum_allowed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum_allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum_allowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum_allowed")(js.undefined)
        ret
    }
  }
  
}

