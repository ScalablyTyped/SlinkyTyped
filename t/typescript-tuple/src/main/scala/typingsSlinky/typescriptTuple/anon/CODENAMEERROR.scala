package typingsSlinky.typescriptTuple.anon

import typingsSlinky.typescriptTuple.typescriptTupleStrings.InfiniteTupleSet
import typingsSlinky.typescriptTuple.typescriptTupleStrings.`TupleSet is not finite`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CODENAMEERROR extends js.Object {
  
  var CODENAME: InfiniteTupleSet with typingsSlinky.typescriptTuple.typescriptTupleStrings.Infinite = js.native
  
  var ERROR: `TupleSet is not finite` = js.native
}
object CODENAMEERROR {
  
  @scala.inline
  def apply(
    CODENAME: InfiniteTupleSet with typingsSlinky.typescriptTuple.typescriptTupleStrings.Infinite,
    ERROR: `TupleSet is not finite`
  ): CODENAMEERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CODENAMEERROR]
  }
  
  @scala.inline
  implicit class CODENAMEERROROps[Self <: CODENAMEERROR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCODENAME(value: InfiniteTupleSet with typingsSlinky.typescriptTuple.typescriptTupleStrings.Infinite): Self = this.set("CODENAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: `TupleSet is not finite`): Self = this.set("ERROR", value.asInstanceOf[js.Any])
  }
}
