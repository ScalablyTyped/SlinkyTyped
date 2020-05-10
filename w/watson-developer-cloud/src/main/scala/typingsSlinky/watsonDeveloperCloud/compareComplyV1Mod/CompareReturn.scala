package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The comparison of the two submitted documents. */
@js.native
trait CompareReturn extends js.Object {
  /** A list of pairs of elements that semantically align between the compared documents. */
  var aligned_elements: js.UndefOr[js.Array[AlignedElement]] = js.native
  /** Information about the documents being compared. */
  var documents: js.UndefOr[js.Array[Document]] = js.native
  /** The analysis model used to compare the input documents. For the **Compare two documents** method, the only valid value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** The version of the analysis model identified by the value of the `model_id` key. */
  var model_version: js.UndefOr[String] = js.native
  /** A list of elements that do not semantically align between the compared documents. */
  var unaligned_elements: js.UndefOr[js.Array[UnalignedElement]] = js.native
}

object CompareReturn {
  @scala.inline
  def apply(): CompareReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareReturn]
  }
  @scala.inline
  implicit class CompareReturnOps[Self <: CompareReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAligned_elements(value: js.Array[AlignedElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aligned_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAligned_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aligned_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withDocuments(value: js.Array[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(js.undefined)
        ret
    }
    @scala.inline
    def withModel_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(js.undefined)
        ret
    }
    @scala.inline
    def withModel_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_version")(js.undefined)
        ret
    }
    @scala.inline
    def withUnaligned_elements(value: js.Array[UnalignedElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unaligned_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnaligned_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unaligned_elements")(js.undefined)
        ret
    }
  }
  
}

