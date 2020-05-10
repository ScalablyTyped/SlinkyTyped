package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The analysis of objects returned by the **Element classification** method. */
@js.native
trait ClassifyReturn extends js.Object {
  /** The monetary amounts that identify the total amount of the contract that needs to be paid from one party to another. */
  var contract_amounts: js.UndefOr[js.Array[ContractAmts]] = js.native
  /** The document's contract type or types as declared in the document. */
  var contract_type: js.UndefOr[js.Array[ContractType]] = js.native
  /** Basic information about the input document. */
  var document: js.UndefOr[Document] = js.native
  /** The structure of the input document. */
  var document_structure: js.UndefOr[DocStructure] = js.native
  /** The date or dates on which the document becomes effective. */
  var effective_dates: js.UndefOr[js.Array[EffectiveDates]] = js.native
  /** Document elements identified by the service. */
  var elements: js.UndefOr[js.Array[Element]] = js.native
  /** The analysis model used to classify the input document. For the **Element classification** method, the only valid value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** The version of the analysis model identified by the value of the `model_id` key. */
  var model_version: js.UndefOr[String] = js.native
  /** Definitions of the parties identified in the input document. */
  var parties: js.UndefOr[js.Array[Parties]] = js.native
  /** Definition of tables identified in the input document. */
  var tables: js.UndefOr[js.Array[Tables]] = js.native
  /** The date or dates on which the document is to be terminated. */
  var termination_dates: js.UndefOr[js.Array[TerminationDates]] = js.native
}

object ClassifyReturn {
  @scala.inline
  def apply(): ClassifyReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyReturn]
  }
  @scala.inline
  implicit class ClassifyReturnOps[Self <: ClassifyReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContract_amounts(value: js.Array[ContractAmts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract_amounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContract_amounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract_amounts")(js.undefined)
        ret
    }
    @scala.inline
    def withContract_type(value: js.Array[ContractType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContract_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract_type")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument_structure(value: DocStructure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_structure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_structure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_structure")(js.undefined)
        ret
    }
    @scala.inline
    def withEffective_dates(value: js.Array[EffectiveDates]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective_dates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffective_dates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective_dates")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
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
    def withParties(value: js.Array[Parties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parties")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[Tables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
    @scala.inline
    def withTermination_dates(value: js.Array[TerminationDates]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termination_dates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermination_dates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termination_dates")(js.undefined)
        ret
    }
  }
  
}

