package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleTypeDescription extends IDLTypeDescription {
  /** String indicating the generic type (e.g. "Promise", "sequence"). null otherwise. */
  var generic: String | Null = js.native
  /**
    * In most cases, this will just be a string with the type name.
    * If the type is a union, then this contains an array of the types it unites.
    * If it is a generic type, it contains the IDL type description for the type in the sequence,
    * the eventual value of the promise, etc.
    */
  var idlType: String = js.native
  /** Boolean indicating whether this is nullable or not. */
  var nullable: Boolean = js.native
  /** Boolean indicating if it is a sequence. Same as generic === "sequence" */
  var sequence: Boolean = js.native
  /** String indicating where this type is used. Can be null if not applicable. */
  var `type`: String | Null = js.native
  /** Boolean indicating whether this is a union type or not. */
  var union: `false` = js.native
}

object SingleTypeDescription {
  @scala.inline
  def apply(idlType: String, nullable: Boolean, sequence: Boolean, union: `false`): SingleTypeDescription = {
    val __obj = js.Dynamic.literal(idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleTypeDescription]
  }
  @scala.inline
  implicit class SingleTypeDescriptionOps[Self <: SingleTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdlType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnion(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenericNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(null)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

