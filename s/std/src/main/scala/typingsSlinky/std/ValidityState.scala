package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid. */
@js.native
trait ValidityState extends js.Object {
  
  val badInput: scala.Boolean = js.native
  
  val customError: scala.Boolean = js.native
  
  val patternMismatch: scala.Boolean = js.native
  
  val rangeOverflow: scala.Boolean = js.native
  
  val rangeUnderflow: scala.Boolean = js.native
  
  val stepMismatch: scala.Boolean = js.native
  
  val tooLong: scala.Boolean = js.native
  
  val tooShort: scala.Boolean = js.native
  
  val typeMismatch: scala.Boolean = js.native
  
  val valid: scala.Boolean = js.native
  
  val valueMissing: scala.Boolean = js.native
}
object ValidityState {
  
  @scala.inline
  def apply(
    badInput: scala.Boolean,
    customError: scala.Boolean,
    patternMismatch: scala.Boolean,
    rangeOverflow: scala.Boolean,
    rangeUnderflow: scala.Boolean,
    stepMismatch: scala.Boolean,
    tooLong: scala.Boolean,
    tooShort: scala.Boolean,
    typeMismatch: scala.Boolean,
    valid: scala.Boolean,
    valueMissing: scala.Boolean
  ): ValidityState = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], customError = customError.asInstanceOf[js.Any], patternMismatch = patternMismatch.asInstanceOf[js.Any], rangeOverflow = rangeOverflow.asInstanceOf[js.Any], rangeUnderflow = rangeUnderflow.asInstanceOf[js.Any], stepMismatch = stepMismatch.asInstanceOf[js.Any], tooLong = tooLong.asInstanceOf[js.Any], tooShort = tooShort.asInstanceOf[js.Any], typeMismatch = typeMismatch.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], valueMissing = valueMissing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidityState]
  }
  
  @scala.inline
  implicit class ValidityStateOps[Self <: org.scalajs.dom.raw.ValidityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBadInput(value: scala.Boolean): Self = this.set("badInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomError(value: scala.Boolean): Self = this.set("customError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternMismatch(value: scala.Boolean): Self = this.set("patternMismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeOverflow(value: scala.Boolean): Self = this.set("rangeOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUnderflow(value: scala.Boolean): Self = this.set("rangeUnderflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMismatch(value: scala.Boolean): Self = this.set("stepMismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooLong(value: scala.Boolean): Self = this.set("tooLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooShort(value: scala.Boolean): Self = this.set("tooShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeMismatch(value: scala.Boolean): Self = this.set("typeMismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: scala.Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMissing(value: scala.Boolean): Self = this.set("valueMissing", value.asInstanceOf[js.Any])
  }
}
